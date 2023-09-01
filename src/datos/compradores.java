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
 * @author buena
 */
public class compradores {
    private int idComprador;
    private String nombre;
    private String apellido;
    private String mail;
    private String usuario;
    private String telefono;
    private String fechanacimiento;
    private String password;
    
    private conexion cone = new conexion();
    private Statement statement;
    private ResultSet result;

    public void compradores(int idComprador, String nombre, String apellido, String mail, String usuario, String telefono, String fechanacimiento, String password) {
        this.idComprador = idComprador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.usuario = usuario;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.password = password;
    }
    
        public int getIdComprador() {
        return idComprador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public String getPassword() {
        return password;
    }
    
    
     public ArrayList<datos.compradores> getCompradores() {



        ArrayList<datos.compradores> array = new ArrayList<>();

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT * FROM comprador");

            while (result.next()) {

               datos.compradores miComprador = new datos.compradores();
               miComprador.compradores(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getString(5), result.getString(6), result.getString(7), result.getString(8));
               array.add(miComprador);

            }

            return array;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;

        }
    
    
    }
     
    public boolean modificarcompradoresBD(int codigo,String nombre,String apeliido,String nacimiento,String mail,String telefono){
        
     boolean error=true;
     try {
        Connection conn=cone.getConection();
        statement=conn.createStatement();
        
        String sql = "UPDATE comprador SET Apellido='"+apeliido+"' ,Nombre='"+nombre+"',  tel='"+telefono+"',Fechanacimiento='"+nacimiento+"',mail='"+mail+"' WHERE idComprador = "+codigo+" ;";
        statement.executeUpdate(sql);
    } catch (SQLException ex){
        ex.printStackTrace();
        return false;
        }
     return error; 
        
       
        
    }
}
