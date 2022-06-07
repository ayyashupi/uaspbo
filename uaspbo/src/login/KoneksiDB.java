package login;

import java.sql.*;
import javax.swing.JOptionPane;

public class KoneksiDB {
    private static Connection mysqlconfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/rental_pbo"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);
//            JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
            
        } catch(Exception e){
           JOptionPane.showMessageDialog(null, "Gagal Koneksi");
           System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        
        return mysqlconfig;
    }
   
    
//   public static void main(String args[]) throws SQLException {
//   
//       java.sql.Connection Vconn = (Connection)KoneksiDB.configDB(); //memanggil fungsi koneksi dikelas lainnya
//   }
   
}
