/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Franco
 */
public class conexion {
    
    public Connection conection;
    
    public Connection getConection() {

    try {
        
        Driver driver = new com.mysql.jdbc.Driver();
        DriverManager.registerDriver(driver);
        conection = DriverManager.getConnection("jdbc:mysql://179.27.156.47:33061/emprendedores?characterEncoding=utf-8&useConfigs=maxPerformance", "linkit", "Gamer_4321_");

        //conection = DriverManager.getConnection("jdbc:mysql://localhost/linkit_proyecto?characterEncoding=utf-8&useConfigs=maxPerformance", "root", "root");
       
    } catch (SQLException ex) {
        
            ex.printStackTrace();
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    

        return conection;
    }
    
    
}
