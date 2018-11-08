/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarsipan;

/**
 *
 * @author RIjhal-PC
 */
import java.sql.Statement;
import java.sql.Connection;  
 import java.sql.DriverManager;    
public class koneksi {
    public static Connection con;
    public static Statement stm;
    public void config(){
        try {
            String url ="jdbc:mysql://localhost/laporanku";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
}
