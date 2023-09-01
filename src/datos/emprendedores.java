/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import datos.conexion;
import datos.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author buena
 */
public class emprendedores {
    
    private int idEmprendedor;
    private String apellido;
    private String password;
    private String bachillerato;
    private boolean es_del_iep;
    private String usuario;
    private String telefono;
    private String direccion;
    private String nombre;
    private String grado;
    private int idEmprendimiento;
    private String mail;
    
    private conexion cone = new conexion();
    private Statement statement;
    private ResultSet result;

    public void emprendedores(int idEmprendedor, String apellido, String password, String bachillerato, boolean es_del_iep, String usuario, String telefono, String direccion, String nombre, String grado, int idEmprendimiento, String mail) {
        this.idEmprendedor = idEmprendedor;
        this.apellido = apellido;
        this.password = password;
        this.bachillerato = bachillerato;
        this.es_del_iep = es_del_iep;
        this.usuario = usuario;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombre = nombre;
        this.grado = grado;
        this.idEmprendimiento = idEmprendimiento;
        this.mail = mail;
    }

    public int getIdEmprendedor() {
        return idEmprendedor;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPassword() {
        return password;
    }

    public String getBachillerato() {
        return bachillerato;
    }

    public boolean isEs_del_iep() {
        return es_del_iep;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGrado() {
        return grado;
    }

    public int getIdEmprendimiento() {
        return idEmprendimiento;
    }
    
    public String getMail() {
        return mail;
    }
    
    public ArrayList<emprendedores> getEmprendedores() {



        ArrayList<emprendedores> array = new ArrayList<>();

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT * FROM emprendedores");

            while (result.next()) {

               emprendedores miEmprendedor = new emprendedores();
               miEmprendedor.emprendedores(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getBoolean(5), result.getString(6), result.getString(7), result.getString(8), result.getString(9) , result.getString(10), result.getInt(11), result.getString(12));
               array.add(miEmprendedor);

            }

            return array;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;

        }
    
    
    }
    
    public boolean modificaremprendedoresBD(int codigo,String nombre,String apeliido,String direccion,String mail,String bach,String grado,String telefono){
        
       boolean error=true;
     try {
        Connection conn=cone.getConection();
        statement=conn.createStatement();
        
        String sql = "UPDATE emprendedores SET Apellido='"+apeliido+"',Nombre='"+nombre+"' , bachillerato='"+bach+"', Telefono='"+telefono+"',Direccion='"+direccion+"',grado='"+grado+"',mail='"+mail+"' WHERE idEmprendedores = "+codigo+" ;";
        statement.executeUpdate(sql);
    } catch (SQLException ex){
        ex.printStackTrace();
        return false;
        }
     return error; 
        
       
        
    }
    
}

