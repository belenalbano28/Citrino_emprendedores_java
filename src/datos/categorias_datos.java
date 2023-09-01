/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author belu
 */
public class categorias_datos {
    
     private int idcategoria;
    private String nombrecategoria;
   

    public void categorias(int idcategoria, String nombre) {
        
        this.idcategoria = idcategoria;
        this. nombrecategoria = nombre;
       
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getnombrecategoria() {
        return nombrecategoria;
    }

    public void setnombrecategoria(String nombrecat) {
        this.nombrecategoria = nombrecat;
    }
    
    conexion cone=new conexion();
    Statement statement;
    ResultSet result;
    
      public boolean categoriaBD(int codigocat, String nombrecat) {
        //graba las categorias
        boolean error=true;
     try {
        Connection conn=cone.getConection();
        statement=conn.createStatement();
        
        String sql = "INSERT INTO categoria(codigocat, nombrecat) VALUES ("+codigocat+", '"+nombrecat+"');";
        statement.executeUpdate(sql);
    } catch (SQLException ex){
        ex.printStackTrace();
        return false;
        }
     return error;
    } 
    
    
     public ArrayList<categorias_datos> listacategorias() {
         //trae los empleados
        ArrayList<categorias_datos> arraycategorias = new ArrayList<>();
        
        try {
        Connection conn=cone.getConection();
        statement=conn.createStatement();
        result=statement.executeQuery("SELECT * FROM categoria");
        while (result.next()){
            categorias_datos micategoria=new categorias_datos();
            
            
            
            micategoria.categorias(result.getInt(1),result.getString(2));
            arraycategorias.add(micategoria);
            
            
        }
        return arraycategorias;
    } catch (SQLException ex){
        ex.printStackTrace();
        return null;
    }
    }
    
}
