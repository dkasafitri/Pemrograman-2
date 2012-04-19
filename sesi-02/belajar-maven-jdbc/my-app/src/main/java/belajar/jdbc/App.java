package belajar.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try
		{//parameter yang dikirim adalah host, port, dbname, dbuser, dbpaswd
			Connection conn = DriverManager.getConnection("jbdc:mysql://localhost:3306/belajar","root","admin");
			String query = "INSERT INTO mahasiswa (nim, nama) VALUES (?, ?)";
			PreparedStatement st =  conn.prepareStatement(query);
			st.setString(1, "4510210005");
			st.setString(2, "DikaAyuSafitri");
			st.executeUpdate();
		}
		
		catch(SQLException ex)
		{
			Logger.getLogger(App.class.getName()).log(Level.SEVERE,null,ex);
		}
    }
}
