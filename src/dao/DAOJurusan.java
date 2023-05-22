package dao;

import dbconnect.DBConnect;
import model.ModelJurusan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOJurusan implements InterfaceJurusan {

    DBConnect connection = new DBConnect();
    Connection koneksi;

    final String insert = "INSERT INTO jurusan (kd_jurusan,nm_jurusan) VALUES (?, ?);";
    final String update = "UPDATE jurusan SET kd_jurusan=?, nm_jurusan=? WHERE kd_jurusan=? ;";
    final String delete = "DELETE FROM jurusan WHERE kd_jurusan=? ;";
    final String select = "SELECT * FROM jurusan;";
    final String search = "SELECT * FROM jurusan WHERE kd_jurusan like ?";

    public DAOJurusan() {
        koneksi = connection.getConnection();
    }

    @Override
    public void insert(ModelJurusan jurusan) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert);
            statement.setString(1, jurusan.getKd_jurusan());
            statement.setString(2, jurusan.getNm_jurusan());
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
    public void update(ModelJurusan jurusan) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, jurusan.getKd_jurusan());
            statement.setString(2, jurusan.getNm_jurusan());
            statement.setString(3, jurusan.getKd_jurusan());
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
    public void delete(ModelJurusan jurusan) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(delete);
            statement.setString(1, jurusan.getKd_jurusan());
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
    public List<ModelJurusan> getData() {
        List<ModelJurusan> listJurusan = null;
        try {
            listJurusan = new ArrayList<ModelJurusan>();
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelJurusan jurusan = new ModelJurusan();
                jurusan.setKd_jurusan(rs.getString("kd_jurusan"));
                jurusan.setNm_jurusan(rs.getString("nm_jurusan"));
                listJurusan.add(jurusan);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOJurusan.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listJurusan;
    }

    @Override
    public List<ModelJurusan> search(String keyword) {
        List<ModelJurusan> listJurusan = new ArrayList<>();
        try {
            PreparedStatement statement = koneksi.prepareStatement(search);
            statement.setString(1, "%" + keyword + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelJurusan jurusan = new ModelJurusan();
                jurusan.setKd_jurusan(rs.getString("kd_jurusan"));
                jurusan.setNm_jurusan(rs.getString("nm_jurusan"));
                listJurusan.add(jurusan);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listJurusan;
    }

}
