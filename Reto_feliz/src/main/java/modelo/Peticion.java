package modelo;

import clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Peticion {

    BD_DATA data;

    public Peticion() {
        this.data = new BD_DATA();
    }

    public int crear_cliente(Cliente cl) {
        int id = 0;
        try (Connection conn = DriverManager.getConnection(data.getUrl(), data.getUser(), data.getPassword())) {
            String consulta = "INSERT INTO cliente (identificacion,nombres,apellidos,direccion,telefono) VALUES (?,?,?,?,?)";
            PreparedStatement state = conn.prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            state.setString(1, cl.getIdentificacion());
            System.out.println(cl.getIdentificacion() + "");
            state.setString(2, cl.getNombres());
            state.setString(3, cl.getApellidos());
            state.setString(4, cl.getDireccion());
            state.setString(5, cl.getTelefono());
            int inserto = state.executeUpdate();
            if (inserto > 0) {
                ResultSet keys = state.getGeneratedKeys();
                if (keys.next()) {
                    id = keys.getInt(1);
                }
            } 
            return id;
        } catch (Exception e) {
            System.out.println(e);
            return id;
        }
    }

    public Cliente buscar_cliente(String id) {
        Cliente cl = null;
        try (Connection conn = DriverManager.getConnection(data.getUrl(), data.getUser(), data.getPassword())) {
            String consulta = "SELECT * FROM cliente WHERE identificacion = ?";
            PreparedStatement statementPlan = conn.prepareStatement(consulta);
            statementPlan.setString(1, id);
            ResultSet result = statementPlan.executeQuery();
            while (result.next()) {
                cl = new Cliente(result.getString(2), result.getString(3), result.getString(4),
                        result.getString(5), result.getString(6));
            }
            return cl;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public int crear_mascota(Mascota mc) {
        try (Connection conn = DriverManager.getConnection(data.getUrl(), data.getUser(), data.getPassword())) {
            String consulta = "INSERT INTO mascota (codigo,nombre,edad,peso,"
                    + "especie,idCliente) VALUES (?,?,?,?,?,?)";
            PreparedStatement statementPlan = conn.prepareStatement(consulta);
            statementPlan.setInt(1, mc.getCodigo());
            //System.out.println(cl.getIdentificacion()+"");
            statementPlan.setString(2, mc.getNombre());
            statementPlan.setInt(3, mc.getEdad());
            statementPlan.setInt(4, mc.getPeso());
            statementPlan.setString(5, mc.getEspecie());
            statementPlan.setInt(6, mc.getIdCliente());
            return statementPlan.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }

    }
}
