package Principal;

import Vistas.*;
import Modelo.*;

public class Main {

    public static void main(String[] args) {
        //1. Creación de la instancia de la vista Login
        Login login = new Login();

        //2. Mediante el método setVisible se hace visible la ventana de login
        login.setVisible(true);

        //17. Instanciar la clase Conexion
        Conexion conexion = new Conexion();
        conexion.getConnection();
    }

}
