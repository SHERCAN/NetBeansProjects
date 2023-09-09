/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class BD_DATA {
        private final String driver = "com.mysql.jdbc.Driver";
        private final String user = "root";
        private final String password = "";
        private final String url = "jdbc:mysql://localhost:3306/reto 5";

    public String getDriver() {
        return driver;
    }
    public String getUser() {
        return user;
    }
    public String getPassword() {
        return password;
    }
    public String getUrl() {
        return url;
    }
}
