/*
CLASE PRINCIPAL
 */
package test;

import static manejoarchivos.ManejoArchivos.*;

public class Test {

    public static void main(String[] args) {
        //1. Declaramos variable
        var nombreArchivo = "Asignatura.txt";
        var contenido1 = "DESARROLLO APLICACIONES MULTIPLATAFORMA";
        //2. Llamamos al metodo estatico e importamos el paquete
        CrearArchivo(nombreArchivo); //PODEMOS VER EL ARCHIVO EN LA PESTAÑA FILES

        escribirArchivo(nombreArchivo, contenido1);
        agregarArchivo(nombreArchivo, "EMPRESA");  

        leerArchivo(nombreArchivo);
    }

}
