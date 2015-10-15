/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistencias;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rup
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect() {
        /**utiliza el driver "jdbc" para conectarse a la base de datos en la computadora, 
         * en la direccion que se da, con el usurario y contraseña que se dan.
         **/
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        }
        catch (ClassNotFoundException cnfe) {
            System.out.println("Connection Failed" + cnfe);
        }
        String url = "jdbc:mysql://localhost:8888/asistenciasrobot";
        try {
            DBConnection = (Connection) DriverManager.getConnection(url, "root", "ruperto98");
            System.out.println("Database Connected");
        }
        catch (SQLException se) {
            System.out.println("No Database" + se);
        }
        return DBConnection;
    }
}
