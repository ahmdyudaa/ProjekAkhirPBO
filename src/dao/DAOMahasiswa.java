package dao;

import dbconnect.DBConnect;
import model.ModelMahasiswa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOMahasiswa implements InterfaceMahasiswa {

    DBConnect connection = new DBConnect();
    Connection koneksi;

    final String insert = "INSERT INTO mahasiswa (nim,nama,jurusan,alamat) VALUES (?, ?, ?, ?);";
    final String update = "UPDATE mahasiswa SET nim=?, nama=?, jurusan=?, alamat=? WHERE nim=? ;";
    final String delete = "DELETE FROM mahasiswa WHERE nim=? ;";
    final String select = "SELECT * FROM mahasiswa;";
    final String search = "SELECT * FROM mahasiswa WHERE nim like ?";

    public DAOMahasiswa() {
        koneksi = connection.getConnection();
    }

    @Override
    public void insert(ModelMahasiswa mahasiswa) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(insert);
            statement.setString(1, mahasiswa.getNim());
            statement.setString(2, mahasiswa.getNama());
            statement.setString(3, mahasiswa.getJurusan());
            statement.setString(4, mahasiswa.getAlamat());
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
    public void update(ModelMahasiswa mahasiswa) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(update);
            statement.setString(1, mahasiswa.getNim());
            statement.setString(2, mahasiswa.getNama());
            statement.setString(3, mahasiswa.getJurusan());
            statement.setString(4, mahasiswa.getAlamat());
            statement.setString(5, mahasiswa.getNim());
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
    public void delete(ModelMahasiswa mahasiswa) {
        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(delete);
            statement.setString(1, mahasiswa.getNim());
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
    public List<ModelMahasiswa> getData() {
        List<ModelMahasiswa> listMahasiswa = null;
        try {
            listMahasiswa = new ArrayList<ModelMahasiswa>();
            Statement st = koneksi.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {
                ModelMahasiswa mahasiswa = new ModelMahasiswa();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswa.setJurusan(rs.getString("jurusan"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                listMahasiswa.add(mahasiswa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listMahasiswa;
    }

    @Override
    public List<ModelMahasiswa> search(String keyword) {
        List<ModelMahasiswa> listMahasiswa = new ArrayList<>();
        try {
            PreparedStatement statement = koneksi.prepareStatement(search);
            statement.setString(1, "%" + keyword + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                ModelMahasiswa mahasiswa = new ModelMahasiswa();
                mahasiswa.setNim(rs.getString("nim"));
                mahasiswa.setNama(rs.getString("nama"));
                 mahasiswa.setJurusan(rs.getString("jurusan"));
                mahasiswa.setAlamat(rs.getString("alamat"));
                listMahasiswa.add(mahasiswa);
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return listMahasiswa;
    }

}
