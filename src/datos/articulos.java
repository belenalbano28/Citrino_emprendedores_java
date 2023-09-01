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
public class articulos {
    
    private int idArticulo;
    private int stock;
    private int precio;
    private String descC;
    private String descL;
    private int idEmprendimiento;
    private String nombreArticulo;
    private String categoria;

    public void articulos(int idArticulo, int stock, int precio, String descL, String descC, int idEmprendimiento, String nombreArticulo, String categoria) {
        
        this.idArticulo = idArticulo;
        this.stock = stock;
        this.precio = precio;
        this.descC = descC;
        this.descL = descL;
        this.idEmprendimiento = idEmprendimiento;
        this.nombreArticulo = nombreArticulo;
        this.categoria = categoria;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescC() {
        return descC;
    }

    public void setDescC(String descC) {
        this.descC = descC;
    }

    public String getDescL() {
        return descL;
    }

    public void setDescL(String descL) {
        this.descL = descL;
    }

    public int getIdEmprendimiento() {
        return idEmprendimiento;
    }

    public void setIdEmprendimiento(int idEmprendimiento) {
        this.idEmprendimiento = idEmprendimiento;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }
    
    public String getCategoria() {
        return categoria;
    }
    

    public boolean ingresarArticulos(String nombreArticulo, String descLarga, String descCorta, int precio, int idEmprendimiento, int stock, String categoria) {
       
        boolean error = false;

        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            String sql = "INSERT INTO articulos(nombreArticulo, cantStock, preciounitario, descL, descC, idemprendimiento, categoria) VALUES ('" + nombreArticulo + "', '" + stock + "', '" + precio + "', '" + descLarga + "' , '" + descCorta + "' , '" + idEmprendimiento + "' , '" + categoria + "');";
            statement.executeUpdate(sql);
            error = false;

        } catch (SQLException ex) {
            error = true;
            ex.printStackTrace();

        }

        return error;
        
    }
    
 
    
    public ArrayList<articulos> getArticulos() {

        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        ArrayList<articulos> array = new ArrayList<>();

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT * FROM articulos");

            while (result.next()) {

               articulos miArticulo = new articulos();
               miArticulo.articulos(result.getInt(1), result.getInt(2), result.getInt(3), result.getString(4), result.getString(5), result.getInt(6), result.getString(7), result.getString(8));
               array.add(miArticulo);

            }

            return array;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;

        }
    
    
    }

    public boolean borrarArticulo(int idarticulo) {
     
        boolean error = false;

        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            String sql = "DELETE FROM articulos where idArticulos = '" + idarticulo + "';";
            statement.executeUpdate(sql);
            error = false;

        } catch (SQLException ex) {
            error = true;
            ex.printStackTrace();

        }

        return error;
        
    }
    
    conexion cone=new conexion();
    Statement statement;
    ResultSet result;
    
    public boolean modificararticulosBD(int codigo, int stock,int precio, String descL, String descC, int idemp, String nombre, String categoria){
        
     
        boolean error=true;
     try {
        Connection conn=cone.getConection();
        statement=conn.createStatement();
        
        String sql = "UPDATE articulos SET idArticulos="+codigo+" ,cantStock="+stock+" , preciounitario="+precio+", descL='"+descL+"',descC='"+descC+"',idEmprendimiento="+idemp+",nombreArticulo='"+nombre+"', categoria='"+categoria+"' WHERE idArticulos = "+codigo+" ;";
        statement.executeUpdate(sql);
    } catch (SQLException ex){
        ex.printStackTrace();
        return false;
        }
     return error; 
        
       
        
    }
    
    
}
