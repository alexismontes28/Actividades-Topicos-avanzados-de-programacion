/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_15_semana_9;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.*;
/**
 *
 * @author laex2
 */
public class Conector {
 private Connection conexion;
 public Conector()
 {
 
}

public boolean connectToAccess(String accessFilePath){
//get connection to database
try{
    Class.forName("sun.jdbc.odbc.Jdbc0dbcDriver");
conexion = DriverManager.getConnection("jdbc:odbc:driver={Microsoft Excel Driver (*.mdb, *.accdb)};DBQ=" + accessFilePath);
}catch(Exception ex){
    ex.printStackTrace();
    return false;
}
return true;
}

public Vector ejecutarQuery(String sql){ 
    Vector rows = new Vector();
    
    try{
        Statement stmt = conexion.createStatement();
        stmt.executeQuery(sql);
        ResultSet rs = stmt.getResultSet();
        if(rs!=null){
            while(rs.next())
            {
                Vector ctemp = new Vector();
                for(int i = 1 ; i < rs.getMetaData().getColumnCount();i++) //for que cuenta las columnas en un registro
                {
                    ctemp.add(rs.getString(i));
                    System.out.println(ctemp.get(i-1));
                    }
                rows.add(ctemp); //anado ese registro a una fila
                }
            rs.close();
            stmt.close();
            return rows;
            
            }
        else{
            System.out.println("No hay datos");
        }
        
    }catch(SQLException e ){System.out.println("Hubo un error");};
    return null;
}
public void cerrarConexion()
{
    try{
        this.conexion.close();
    }catch(SQLException e){};
}
}
