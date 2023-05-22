package dao;

import dbconnect.DBConnect;
import model.ModelDosen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAODosen implements InterfaceDosen {

    DBConnect connection = new DBConnect();
    Connection koneksi;

    final String insert = "INSERT INTO dosen (nip,nama,no_telp,alamat) VALUES (?, ?, ?, ?);";
    final String update = "UPDATE dosen SET nip=?, nama=?, no_telp=?, alamat=? WHERE nip=? ;";
    final String delete = "DELETE FROM dosen WHERE nip=? ;";
    final String select = "SELECT * FROM dosen;";
    final String search = "SELECT * FROM dosen WHERE nip like ?";

    public DAODosen() {
        koneksi = connection.getConnection();
    }

    @Override
    public void insert(ModelDosen dosen) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert);
            statement.setString(1, dosen.getNip());
            statement.setString(2, dosen.getNama());
            statement.setString(3, dosen.getTlp());
            statement.setString(4, dosen.getAlamat());
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
    public void update(ModelDosen dosen) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, dosen.getNip());
            statement.setString(2, dosen.getNama());
            statement.setString(3, dosen.getTlp());
            statement.setString(4, dosen.getAlamat());
            statement.setString(5, dosen.getNip());
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
    public void delete(ModelDosen dosen) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(delete);
            statement.setString(1, dosen.getNip());
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
    public List<ModelDosen> getData() {
        List<ModelDosen> listDosen = null;
        try {
            listDosen = new ArrayList<ModelDosen>();
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelDosen dosen = new ModelDosen();
                dosen.setNip(rs.getString("nip"));
                dosen.setNama(rs.getString("nama"));
                dosen.setTlp(rs.getString("no_telp"));
                dosen.setAlamat(rs.getString("alamat"));
                listDosen.add(dosen);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAODosen.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listDosen;
    }

    @Override
    public List<ModelDosen> search(String keyword) {
        List<ModelDosen> listDosen = new ArrayList<>();
        try {
            PreparedStatement statement = koneksi.prepareStatement(search);
            statement.setString(1, "%" + keyword + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelDosen dosen = new ModelDosen();
                dosen.setNip(rs.getString("nip"));
                dosen.setNama(rs.getString("nama"));
                 dosen.setTlp(rs.getString("no_telp"));
                dosen.setAlamat(rs.getString("alamat"));
                listDosen.add(dosen);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listDosen;
    }


}
