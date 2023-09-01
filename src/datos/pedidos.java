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
public class pedidos {
    
    private int idPedido;
    private int idComprador;
    private String fecha;
    private String hora;
    private boolean entregado;
    private int precioTotal;

    public void pedidos(int idPedido, int idComprador, String fecha, String hora, boolean entregado, int precioTotal) {
        this.idPedido = idPedido;
        this.idComprador = idComprador;
        this.fecha = fecha;
        this.hora = hora;
        this.entregado = entregado;
        this.precioTotal = precioTotal;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    
    
    public ArrayList<pedidos> getPedidos (int idEmprendimiento) {
    
        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        ArrayList<pedidos> array = new ArrayList<>();

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT pedido.idPedido, idComprador, fecha, hora, entregado, precioTotal FROM pedido INNER JOIN pe_ar on pe_ar.idPedido = pedido.idPedido and pe_ar.idEmprendimiento = " + idEmprendimiento + ";");

            while (result.next()) {

               pedidos miPedido = new pedidos();
               miPedido.pedidos(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4), result.getBoolean(5), result.getInt(6));
               array.add(miPedido);

            }

            return array;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;

        }
    
    }
    
    
    
        
    
    
}
