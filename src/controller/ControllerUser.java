package controller;

//import com.mysql.cj.xdevapi.Statement;
import dbconnect.DBConnect;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.ViewHomePage;
import view.ViewLogin;

public class ControllerUser {

    private ViewLogin view;

    DBConnect connection = new DBConnect();
    Connection koneksi;

    final String login = "SELECT * FROM user WHERE username = ? AND password = ?";

    public ControllerUser(ViewLogin view) {

        this.view = view;
    }

    public void login() {
        String username = view.getTextUsername().getText();
        String password = view.getTextPassword().getText();

        koneksi = connection.getConnection();

        PreparedStatement statement = null;
        try {
            statement = koneksi.prepareStatement(login);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Sukses !!");
                view.dispose();
                ViewHomePage hp = new ViewHomePage();
                hp.setVisible(true);
            }
            rs.close();
            statement.close();
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
}
