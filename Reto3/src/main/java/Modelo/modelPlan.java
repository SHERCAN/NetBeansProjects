
package Modelo;

import Clases.Cliente;
import Clases.Plan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class modelPlan {
    dBData dbdata;
    
    public modelPlan(){
        this.dbdata = new dBData();
    }
    
    public boolean crearPlan(Plan p){
        try (Connection conn = DriverManager.getConnection(dbdata.getUrl(),dbdata.getUser(),dbdata.getPassword())){
            String consulta = "INSERT INTO plan (nombre,descripcion,precio) VALUES (?,?,?)";
            PreparedStatement statementPlan = conn.prepareStatement(consulta); 
            statementPlan.setString(1,p.getNombre());
            statementPlan.setString(2,p.getDescripcion());
            statementPlan.setInt(3,p.getPrecio());
            int rowsInserted = statementPlan.executeUpdate();
            if (rowsInserted > 0){
                return true;
            }else return false;
            
        }catch (Exception e){
            return false;
        }
    }
    
    public Plan buscarPlan(String nombre){
        Plan p = null;
        
        try (Connection conn = DriverManager.getConnection(dbdata.getUrl(),dbdata.getUser(),dbdata.getPassword())){
            String consulta = "SELECT * FROM plan WHERE nombre = ?";
            
            PreparedStatement statementPlan = conn.prepareStatement(consulta); 
            statementPlan.setString(1,nombre);
            ResultSet result = statementPlan.executeQuery();
            while (result.next()){
                int idPlan = result.getInt(1);
                String nombrePlan = result.getString(2);
                String descripcionPlan = result.getString(3);
                int precio = result.getInt(4);
                p = new Plan(nombrePlan, descripcionPlan, precio);
            }
            return p;
            
        }catch (Exception e){
            return p;
        }
        
        
    }
    
    public boolean modificarPlan(Plan p){
        try (Connection conn = DriverManager.getConnection(dbdata.getUrl(),dbdata.getUser(),dbdata.getPassword())){
            String queryPlan = "UPDATE plan SET descripcion = ?, precio = ? WHERE nombre = ?";
            PreparedStatement statementPlan = conn.prepareStatement(queryPlan);
           
            statementPlan.setString(1, p.getDescripcion());
            statementPlan.setInt(2, p.getPrecio());
            statementPlan.setString(3,p.getNombre());
            

            int rowsUpdatedPlan = statementPlan.executeUpdate();
            return rowsUpdatedPlan > 0; 
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean borrarPlan(String nombre){
        try (Connection conn = DriverManager.getConnection(dbdata.getUrl(),dbdata.getUser(),dbdata.getPassword())){
            conn.setAutoCommit(false);
            Savepoint savePoint = conn.setSavepoint("deletePoint");
            try {
                
                String queryPlan = "DELETE FROM plan WHERE nombre = ?";
                PreparedStatement statementPlan = conn.prepareStatement(queryPlan);
                statementPlan.setString(1, nombre);
                int rowsUpdatedPlan = statementPlan.executeUpdate();
                conn.commit();

               
                return rowsUpdatedPlan > 0;
            } catch (Exception e) {
                conn.rollback(savePoint);
            }
        } catch (SQLException e) {
            return false;
        }
        return false;
        
    }
}
   