/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Febri TK
 */
public class koneksi {
        private static Connection koneksi;
        
        public static Connection getKoneksi() throws SQLException{
            if (koneksi == null) {
                try {
                    String url = new String();
                    String user = new String();
                    String password = new String();
                    url = "jdbc:mysql://localhost:3306/data_bank";  //nim = nama database di mysql bisa di sesuaikan
                    user = "root"; //user database bisa di sesuaikan
                    password = ""; //password database bisa di sesuaikan
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    koneksi = DriverManager.getConnection(url, user, password);
                } catch (Exception t) {
                    System.out.println("Error membuat koneksi");
                }
            }
            return koneksi;
        }
}
