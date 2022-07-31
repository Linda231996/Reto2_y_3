package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    //12.Instancia de la clase Connection
    Connection connection;
    //Atributos
    String driver = "com.mysql.cj.jdbc.Driver";
    String cadenaConexion = "jdbc:mysql://localhost:3306/reto1_semana4";
    String usuario = "root"; //Administrador 
    String contraseña = "";

    //13.Añadir el constructor (sin args) de la clase
    public Conexion() {
        //14. Intentar conectar con la base de datos 
        try {
            Class.forName(driver); //Esto lo que hace es ir a buscar la clase "com.mysql.cj.jdbc.Driver"
            connection = DriverManager.getConnection(cadenaConexion, usuario, contraseña);
            //Lo de arriba son los parámetros necesaris para establecer conexión
            //15. Verificar si hubo o no conexión con la base de datos
            if (connection != null) {
                System.out.println("Conexión exitosa con la base de datos");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se pudo establecer conexión con la base de datos");
        }

    }

    //16. Crear función que retorna la clase Connection
    public Connection getConnection() {
        return connection;
    }

}
