/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.categorias_datos;
import datos.emprendimientos;
import datos.emprendedores;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author buena
 */
public class milogica {
    
    //objetos
   datos.articulos articulosobj = new datos.articulos();
   
   datos.compradores datosCompradores = new datos.compradores();
   datos.emprendedores datosEmprendedores = new datos.emprendedores();

    //articulos
    public ComboBoxModel<String> cargarEmprendimientos() {

        ArrayList<datos.emprendimientos> array = new ArrayList<>();
        
        datos.emprendimientos datosEmprendimientos = new datos.emprendimientos();
        
        array = datosEmprendimientos.getEmprendimientos();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        
        emprendimientos miEmprendimiento = new emprendimientos();

        for (int i = 0; i < array.size(); i++) {
         
            miEmprendimiento = array.get(i);
            modelo.addElement(miEmprendimiento.getidEmprendimiento() + "-" +miEmprendimiento.getnombreEmprendimiento());
        }
   
        
        return modelo;
    }

    public TableModel cargarArticulos() {
        
        ArrayList<datos.articulos> array = new ArrayList<>();
        
        datos.articulos datosArticulos = new datos.articulos();
        
        array = datosArticulos.getArticulos();
      
        datos.articulos miArticulo = new datos.articulos();
        
        String[] columnNames = {
            "ID",
            "Nombre",
            "Precio",
            "Stock",
            "Desc.L",
            "Desc.C",
            "ID Emprendimiento",
            "Categoria"
        };
        
         Object[][] data = {};
         
         DefaultTableModel modelo = new DefaultTableModel(data, columnNames);

        for (int i = 0; i < array.size(); i++) {
         
            modelo.insertRow(i, new Object[]{"", "", "", "", "", "", "", ""});
            miArticulo = array.get(i);
           
            modelo.setValueAt(miArticulo.getIdArticulo(), i, 0);
            modelo.setValueAt(miArticulo.getNombreArticulo(), i, 1);
            modelo.setValueAt(miArticulo.getPrecio(), i, 2);
            modelo.setValueAt(miArticulo.getStock(), i, 3);
            modelo.setValueAt(miArticulo.getDescL(), i, 4);
            modelo.setValueAt(miArticulo.getDescC(), i, 5);
            modelo.setValueAt(miArticulo.getIdEmprendimiento(), i, 6);
            modelo.setValueAt(miArticulo.getCategoria(), i, 7);

            
            
            
           
        }
   
        
        return modelo;  
    
    }

   
    public boolean verificarIngresoArticulo(String nombreArticulo, String descCorta, String descLarga, int precio, int idEmprendimiento, int stock, String categoria) {

        if (nombreArticulo.isEmpty() || descCorta.isEmpty() || descLarga.isEmpty() ||categoria.isEmpty() )   {
            return false;
        } 
        
        try {
        
            if(precio <= 0 || stock <= 0 || idEmprendimiento <= 0) {
                return false;
            }
            
        } catch (Exception ex) {
            return false;
        }
       
        return true;
    }
    
    public boolean modificararticulos(String codigo,String precio,String stock,String descL,String descC,int idemp,String nombre, String categoria) {

        int precioI = Integer.parseInt(precio);
        int stockI = Integer.parseInt(stock);
        int codigoint = Integer.parseInt(codigo);
        

        boolean error = articulosobj.modificararticulosBD(codigoint,stockI, precioI, descL, descC, idemp, nombre, categoria);

        

        return error;

    }

    
    //compradpres/emprendedores
    
     public TableModel cargarEmprendedores() {
        
        ArrayList<datos.emprendedores> array = new ArrayList<>();
        datos.emprendedores datosEmprendedores = new datos.emprendedores();
        
        array = datosEmprendedores.getEmprendedores();
      
        emprendedores miEmprendedor = new emprendedores();
        
        String[] columnNames = {
            "ID",
            "Apellido",
            "Password",
            "Bachillerato",
            "IEP?",
            "Usuario",
            "Telefono",
            "Direccion",
            "Nombre",
            "Grado",
            "Mail", 
            "ID Emprendimiento"
        };
        
         Object[][] data = {};
         
         DefaultTableModel modelo = new DefaultTableModel(data, columnNames);

        for (int i = 0; i < array.size(); i++) {
         
            modelo.insertRow(i, new Object[]{"", "", "", "", "", "", "", "", "", "", "", ""});
            miEmprendedor = array.get(i);
           
            modelo.setValueAt(miEmprendedor.getIdEmprendedor(), i, 0);
            modelo.setValueAt(miEmprendedor.getApellido(), i, 1);
            modelo.setValueAt(miEmprendedor.getPassword(), i, 2);
            modelo.setValueAt(miEmprendedor.getBachillerato(), i, 3);
            modelo.setValueAt(miEmprendedor.isEs_del_iep(), i, 4);
            modelo.setValueAt(miEmprendedor.getUsuario(), i, 5);
            modelo.setValueAt(miEmprendedor.getTelefono(), i, 6);
            modelo.setValueAt(miEmprendedor.getDireccion(), i, 7);
            modelo.setValueAt(miEmprendedor.getNombre(), i, 8);
            modelo.setValueAt(miEmprendedor.getGrado(), i, 9);
            modelo.setValueAt(miEmprendedor.getMail(), i, 10);
            modelo.setValueAt(miEmprendedor.getIdEmprendimiento(), i, 11);
            
        }
   
        
        return modelo;     }

     public TableModel cargarCompradores() {
        
        ArrayList<datos.compradores> array = new ArrayList<>();
        datos.compradores datosCompradores = new datos.compradores();
        
        array = datosCompradores.getCompradores();
        
        datos.compradores miComprador = new datos.compradores();
        
        String[] columnNames = {
            "ID",
            "Nombre",
            "Apellido",
            "Mail",
            "Usuario",
            "Telefono",
            "FechaNac",
            "Password"
        };
        
         Object[][] data = {};
         
         DefaultTableModel modelo = new DefaultTableModel(data, columnNames);

        for (int i = 0; i < array.size(); i++) {
         
            modelo.insertRow(i, new Object[]{"", "", "", "", "", "", "", "", "", "", ""});
            miComprador = array.get(i);
           
            modelo.setValueAt(miComprador.getIdComprador(), i, 0);
            modelo.setValueAt(miComprador.getNombre(), i, 1);
            modelo.setValueAt(miComprador.getApellido(), i, 2);
            modelo.setValueAt(miComprador.getMail(), i, 3);
            modelo.setValueAt(miComprador.getUsuario(), i, 4);
            modelo.setValueAt(miComprador.getTelefono(), i, 5);
            modelo.setValueAt(miComprador.getFechanacimiento(), i, 6);
            modelo.setValueAt(miComprador.getPassword(), i, 7);
            
        }
        return modelo;
    }
 
     public boolean modificaremprendedores(String codigo,String nombre,String apeliido,String direccion,String mail,String bach,String grado,String telefono) {

        int codigoint = Integer.parseInt(codigo);

        boolean error = datosEmprendedores.modificaremprendedoresBD(codigoint,nombre, apeliido, direccion, mail, bach, grado,telefono);

        return error;

    }

     public boolean modificarcompradores(String codigo,String nombre,String apeliido,String nacimiento,String mail,String telefono) {

        int codigoint = Integer.parseInt(codigo);
        
        boolean error = datosCompradores.modificarcompradoresBD(codigoint,nombre, apeliido, nacimiento, mail,telefono);

        return error;

    }
     
     
     public TableModel cargarPedidos(int idEmprendimiento) {
         
        ArrayList<datos.pedidos> array = new ArrayList<>();
        datos.pedidos datosPedidos = new datos.pedidos();
        
        array = datosPedidos.getPedidos(idEmprendimiento);
        
        datos.pedidos miPedido = new datos.pedidos();
        
        String[] columnNames = {
            "ID",
            "ID-Comprador",
            "Fecha",
            "Hora",
            "Entregado",
            "Precio Total"
        };
        
         Object[][] data = {};
         
         DefaultTableModel modelo = new DefaultTableModel(data, columnNames);

        for (int i = 0; i < array.size(); i++) {
         
            modelo.insertRow(i, new Object[]{"", "", "", "", "", ""});
            miPedido = array.get(i);
           
            modelo.setValueAt(miPedido.getIdPedido(), i, 0);
            modelo.setValueAt(miPedido.getIdComprador(), i, 1);
            modelo.setValueAt(miPedido.getFecha(), i, 2);
            modelo.setValueAt(miPedido.getHora(), i, 3);
            modelo.setValueAt(miPedido.isEntregado(), i, 4);
            modelo.setValueAt(miPedido.getPrecioTotal(), i, 5);

            
        }
        return modelo;
         
     }

    public TableModel cargarImagenes(int idArticulo) {

        ArrayList<datos.imagenes> array = new ArrayList<>();
        datos.imagenes datosImagenes = new datos.imagenes();
        
        array = datosImagenes.getImagenes(idArticulo);
        
        datos.imagenes miImagen = new datos.imagenes();
        
        String[] columnNames = {
            "ID",
            "ID-Articulo",
            "Url"
        };
        
         Object[][] data = {};
         
         DefaultTableModel modelo = new DefaultTableModel(data, columnNames);

        for (int i = 0; i < array.size(); i++) {
         
            modelo.insertRow(i, new Object[]{"", "", ""});
            miImagen = array.get(i);
           
            modelo.setValueAt(miImagen.getIdImagen(), i, 0);
            modelo.setValueAt(miImagen.getIdArticulo(), i, 1);
            modelo.setValueAt(miImagen.getUrl(), i, 2);


            
        }
        return modelo;
        
    }

    

    
}
