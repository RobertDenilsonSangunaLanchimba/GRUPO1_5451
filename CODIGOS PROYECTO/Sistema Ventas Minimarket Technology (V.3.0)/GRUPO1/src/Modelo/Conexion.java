package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

public class Conexion {

    Connection con;

    public Connection getConnection() {
        try {
            
            //String myBD = "jdbc:mysql://localhost:3306/dbventas?serverTimezone=UTC";
            con = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10503641", "sql10503641", "Cd3LmqnBBn");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

}
