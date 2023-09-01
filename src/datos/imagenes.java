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

import java.io.File;

import com.jcraft.jsch.Channel;

import com.jcraft.jsch.ChannelSftp;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;

import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;





/**
 *
 * @author buena
 */

public class imagenes {
    String server = "179.27.156.47";
    int port = 2222;
    String user = "linkit";
    String pass = "Gamer_4321_";
      
    private int idImagen;
    private int idArticulo;
    private String url;

    public void imagenes(int idImagen, int idArticulo, String url) {
        this.idImagen = idImagen;
        this.idArticulo = idArticulo;
        this.url = url;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public String getUrl() {
        return url;
    }


    
    
    
    public boolean ingresarImagen(String url, int idarticulo) {
        
        String[] resultado = url.split("\\\\");
        String SFTPWORKINGDIR="";
        for(int x=0; x<resultado.length-1; x++){
             SFTPWORKINGDIR+=resultado[x]+"\\";
        }
        System.out.println("url"+url);
        System.out.println("ld"+SFTPWORKINGDIR);
        String name = resultado[resultado.length-1];
        System.out.println(name);
        
       String SFTPHOST="179.27.156.47";
       int SFTPPORT=2222;
        String SFTPUSER="linkit";
        String SFTPPASS="Gamer_4321_";
        SFTPWORKINGDIR="/C:/inetpub/wwwroot/linkit/img/fotos";

        
        String fullurl = "/C:/inetpub/wwwroot/linkit/img/fotos/"+resultado[resultado.length-1];
        String fullurl2 = "img/fotos/"+resultado[resultado.length-1];
        
        Session session = null;

        Channel channel = null;

        ChannelSftp channelSftp = null;

        System.out.println("preparing the host information for sftp.");
        
        //
        try {

            JSch jsch = new JSch();

            session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);

            session.setPassword(SFTPPASS);

            java.util.Properties config = new java.util.Properties();

            config.put("StrictHostKeyChecking", "no");

            session.setConfig(config);

            session.connect();

            System.out.println("Host connected.");

            channel = session.openChannel("sftp");

            channel.connect();

            System.out.println("sftp channel opened and connected.");

            channelSftp = (ChannelSftp) channel;

            channelSftp.cd(SFTPWORKINGDIR);

            File f = new File(url);

            channelSftp.put(new FileInputStream(f), f.getName());

             System.out.println("todo ok");

} catch (Exception ex) {

System.out.println("Exception "+ex);

} finally {

channelSftp.exit();

System.out.println("completado con exito");

channel.disconnect();


session.disconnect();

}
        
        
        
        boolean error = false;         
        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            String sql = "INSERT INTO fotos(idArticulos, Url) VALUES ('" + idarticulo + "' , '" + fullurl2 + "');";
            statement.executeUpdate(sql);
            error = false;

        } catch (SQLException ex) {
            error = true;
            ex.printStackTrace();

        }

        return error;
    }

    public ArrayList<datos.imagenes> getImagenes(int idArticulo) {
        
        conexion cone = new conexion();
        Statement statement;
        ResultSet result;
        
        ArrayList<datos.imagenes> array = new ArrayList<>();

        try {
            
            Connection conn = cone.getConection();
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT * FROM fotos where fotos.idArticulos = " + idArticulo + ";");

            while (result.next()) {

               datos.imagenes miImagen = new datos.imagenes();
               miImagen.imagenes(result.getInt(1), result.getInt(2), result.getString(3));
               array.add(miImagen);

            }

            return array;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;

        }
        
    }

    public boolean borrarImagen(int idImagen) throws JSchException, SftpException {
        boolean error = false;

        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        
 
        
        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            String sql0 = "SELECT Url FROM fotos where idFotos = '" + idImagen + "';";
            result = statement.executeQuery(sql0);
            
            if (result.next()) {
                borrarImagenFileZilla(result.getString(1));
            }
            
            String sql = "DELETE FROM fotos where idFotos = '" + idImagen + "';";
            statement.executeUpdate(sql);
            error = false;

            
            
        } catch (SQLException ex) {
            error = true;
            ex.printStackTrace();

        }

        return error;
    }

    public InputStream getImagenesFileZilla(String url) throws IOException, JSchException, SftpException {
       URL url2;
       String SFTPHOST="179.27.156.47";
       int SFTPPORT=2222;
       String SFTPUSER="linkit";
       String SFTPPASS="Gamer_4321_";
       String SFTPWORKINGDIR="/C:/inetpub/wwwroot/linkit";
            
        Session session = null;

        Channel channel = null;

        ChannelSftp channelSftp = null;
        
        JSch jsch = new JSch();

        session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);

            session.setPassword(SFTPPASS);

            java.util.Properties config = new java.util.Properties();

            config.put("StrictHostKeyChecking", "no");

            session.setConfig(config);

            session.connect();

            System.out.println("Conectado al host");

            channel = session.openChannel("sftp");

            channel.connect();

            System.out.println("Conectado al channel");

            channelSftp = (ChannelSftp) channel;

            channelSftp.cd(SFTPWORKINGDIR);
            
            InputStream image = channelSftp.get(url);
            
            return image;
            
        
    }

    private void borrarImagenFileZilla(String url) throws JSchException, SftpException {
     
       System.out.println("Entra");
       String SFTPHOST="179.27.156.47";
       int SFTPPORT=2222;
       String SFTPUSER="linkit";
       String SFTPPASS="Gamer_4321_";
       String SFTPWORKINGDIR="/C:/inetpub/wwwroot/linkit";
       Session session = null;
       Channel channel = null;
       ChannelSftp channelSftp = null;
       JSch jsch = new JSch();

       session = jsch.getSession(SFTPUSER, SFTPHOST, SFTPPORT);

       session.setPassword(SFTPPASS);

       java.util.Properties config = new java.util.Properties();

       config.put("StrictHostKeyChecking", "no");

       session.setConfig(config);

       session.connect();

       System.out.println("Conectado al host elimiinar");

       channel = session.openChannel("sftp");

       channel.connect();

       System.out.println("Conectado al channel eliminar");

       channelSftp = (ChannelSftp) channel;

       channelSftp.cd(SFTPWORKINGDIR);
            
       
       try {
           channelSftp.rm(url);
      } catch (SftpException e) {
            System.out.println(e.getMessage().toString());
            e.printStackTrace();
    }

        
    }
    
}
