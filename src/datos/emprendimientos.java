/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

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
public class emprendimientos {

    private int idEmprendimiento;
    private String nombreEmprendimiento;

    public void emprendimientos(int idEmprendimiento, String nombreEmprendimiento) {

        this.idEmprendimiento = idEmprendimiento;
        this.nombreEmprendimiento = nombreEmprendimiento;

    }

    public int getidEmprendimiento() {
        return idEmprendimiento;
    }

    public String getnombreEmprendimiento() {
        return nombreEmprendimiento;
    }

    public ArrayList<emprendimientos> getEmprendimientos() {

        conexion cone = new conexion();
        Statement statement;
        ResultSet result;

        ArrayList<emprendimientos> array = new ArrayList<>();

        try {

            Connection conn = cone.getConection();
            statement = conn.createStatement();
            result = statement.executeQuery("SELECT * FROM emprendimiento");

            while (result.next()) {

               emprendimientos miEmprendimiento = new emprendimientos();
               miEmprendimiento.emprendimientos(result.getInt(1), result.getString(2));
               array.add(miEmprendimiento);

            }

            return array;

        } catch (SQLException ex) {

            ex.printStackTrace();
            return null;

        }

    }

}
