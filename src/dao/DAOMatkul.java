package dao;

import dbconnect.DBConnect;
import model.ModelMatkul;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOMatkul implements InterfaceMatkul {

    DBConnect connection = new DBConnect();
    Connection koneksi;

    final String insert = "INSERT INTO mata_kuliah (kd_matkul,nm_matkul) VALUES (?, ?);";
    final String update = "UPDATE mata_kuliah SET kd_matkul=?, nm_matkul=? WHERE kd_matkul=? ;";
    final String delete = "DELETE FROM mata_kuliah WHERE kd_matkul=? ;";
    final String select = "SELECT * FROM mata_kuliah;";
    final String search = "SELECT * FROM mata_kuliah WHERE kd_matkul like ?";

    public DAOMatkul() {
        koneksi = connection.getConnection();
    }

    @Override
    public void insert(ModelMatkul matkul) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert);
            statement.setString(1, matkul.getKd_matkul());
            statement.setString(2, matkul.getNm_matkul());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void update(ModelMatkul matkul) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, matkul.getKd_matkul());
            statement.setString(2, matkul.getNm_matkul());
            statement.setString(3, matkul.getKd_matkul());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(ModelMatkul matkul) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(delete);
            statement.setString(1, matkul.getKd_matkul());
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public List<ModelMatkul> getData() {
        List<ModelMatkul> listMatkul = null;
        try {
            listMatkul = new ArrayList<ModelMatkul>();
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelMatkul matkul = new ModelMatkul();
                matkul.setKd_matkul(rs.getString("kd_matkul"));
                matkul.setNm_matkul(rs.getString("nm_matkul"));
                listMatkul.add(matkul);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMatkul.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listMatkul;
    }

    @Override
    public List<ModelMatkul> search(String keyword) {
        List<ModelMatkul> listMatkul = new ArrayList<>();
        try {
            PreparedStatement statement = koneksi.prepareStatement(search);
            statement.setString(1, "%" + keyword + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelMatkul matkul = new ModelMatkul();
                matkul.setKd_matkul(rs.getString("kd_matkul"));
                matkul.setNm_matkul(rs.getString("nm_matkul"));
                listMatkul.add(matkul);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listMatkul;
    }

}
