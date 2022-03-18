/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Carcamo
 */
public class conectar {
    
    
        Connection ccn=null;
                
                
                
     
     File Ruta= new File("Universidad.accdb");
    //C://Users/Diego Carcamo/Documents/NetBeansProjects/TrabajoConBase/MiPrimeraBase.accdb";    
//Holajj
     
     //''
   String url="jdbc:ucanaccess://"+Ruta.getAbsolutePath();
    public Connection getCcn() {
        return ccn;
    }
    
   
   
   
   
    public  Connection conectar() {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            
            ccn=DriverManager.getConnection(url);
   
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
    
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        }
        
        return ccn;
        
        
    
    
    
    }
    
    
    
    
    
    
    
}
