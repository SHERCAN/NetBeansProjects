package modelo;
//package clases.Cliente;

import clases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Datos {

    public static void main(String[] args) {
        int e = 0;
        BD_DATA db=new BD_DATA();
        try (Connection conn = DriverManager.getConnection(db.getUrl(),
                db.getUser(), db.getPassword())) {
            String query = "SELECT * FROM " + "cliente WHERE 1" ;
            Statement statementPlan = conn.prepareStatement(query);
            ResultSet result = statementPlan.executeQuery(query);
            
            int columnas = result.getMetaData().getColumnCount();
            System.out.println(result.getRow());
            ArrayList[] table = new ArrayList[10];
            while (result.next()) {
                table[e] = new ArrayList();
                int i = 1;
                while (i <= columnas-1) {
                    table[e].add(result.getString(i++));
                    System.out.println(result.getString(i));
                }
                e += 1;
            }
        } catch (Exception exce) {
            System.out.println("hola" + exce);
        }
    }
}
/*
    Mascota cl=null;
    public static void main(String[] args) {
        BD_DATA data = new BD_DATA();
        try (Connection conn = DriverManager.getConnection(data.getUrl(), data.getUser(), 
                data.getPassword())) {
            String consulta = "DELETE FROM cliente WHERE  idCliente= ?";
            PreparedStatement estado = conn.prepareStatement(consulta);
            estado.setString(1, "16");
            int row = estado.executeUpdate();
            if (row>0){
                System.out.println("Se borro con exito");
            }
            
        } catch (Exception e) {
            System.out.println("error"+e);
            
        }      
    }
}

        
        int id = 1;
        Mascota cl=null;
        List lista = new ArrayList();
        List lista1 = new ArrayList();
        BD_DATA data = new BD_DATA();
        ArrayList[] table = new ArrayList[100];
         // add another ArrayList object to [0,0]
        
            int e=0;
        try (Connection conn = DriverManager.getConnection(data.getUrl(), 
                data.getUser(), data.getPassword())) {
            String consulta = "SELECT * FROM mascota WHERE idCliente = ?";
            PreparedStatement statementPlan = conn.prepareStatement(consulta);
            statementPlan.setInt(1, id);
            ResultSet result = statementPlan.executeQuery();
            int columnas = result.getMetaData().getColumnCount();
            
            while (result.next()) {
                table[e] = new ArrayList();
                lista.add(new ArrayList());
                cl = new Mascota(result.getInt(2), result.getString(3), result.getInt(4),
                        result.getInt(5), result.getString(6));
                //int codigo, String nombre, int edad, int peso, String especie
                System.out.println(result.getMetaData().getColumnCount());
                System.out.println(lista.toString());
                int i =1;
                while (i<=columnas){
                    table[e].add(result.getString(i++));
                    //table[e].add();
                    //lista.get(0).add();
                }
                //System.out.println(lista.get(0).getClass());
                //lista.add(lista);
                //System.out.println(lista.get(0).toString());
                //System.out.println(table[e].toString());
                System.out.println(table[e].toString());
                
                //System.out.println(lista1.toString());
                e+=1;
            }
            System.out.println("e"+e);
            System.out.println(table[1].toString());
            System.out.println(table[0].toString());
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < table[i].size(); j++) {
                System.out.println("0"+table[0].toString());
                System.out.println(table[i].get(j));
            }
            }
            
        } catch (Exception a) {
            System.out.println(a);
        }
    }

 */
