package Daoconnx;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Connexion {
    private Connection con;
    private Statement stm;
    
    public void connect() throws ClassNotFoundException, SQLException {
    	Class.forName("com.mysql.jdbc.Driver");
    	String url="jdbc:mysql://localhost/tp1";
    	con=(Connection) DriverManager.getConnection(url, "root", "");
    	stm=(Statement) con.createStatement();
    }
    public void Disconnect() throws SQLException {
    	stm.close();
    	con.close();
    }
    public int Maj(String sql) throws SQLException {
    	return stm.executeUpdate(sql);
    }
    public ResultSet select(String sql) throws SQLException {
    	return stm.executeQuery(sql);
    } 
}
