/*
-crear
-guardar info
-eliminar info
-eliminar archivo
Los creamos de forma estatica
 */
package manejoarchivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoArchivos {

    /*CREAR*/
    public static void CrearArchivo(String nombreArchivo) {
        //1. Declaro variable de tipo FILE
        //2. Importamos la clase io
        File archivo = new File(nombreArchivo);
        //3. TRYCATCH
        //Error: Puede producir una excepcion que tengo que incluir en una estructura try catch
        try {
            //Operacion que queramos hacer
            PrintWriter salida = new PrintWriter(archivo);
            salida.close(); //Cerrar el archivo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException e) {
            //Operacion erronea
            e.printStackTrace(System.out);
        }

    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        //1. Declaracion del objeto de tipo FILE
        File archivo = new File(nombreArchivo);
        //2. Declarar variable
        try {
            PrintWriter salida = new PrintWriter(archivo);
            //Escribir contenido dentro del fichero
            salida.println(contenido);
            salida.close(); //Cerrar el fichero
        } catch (FileNotFoundException e) {
            //El archivo no existe
            e.printStackTrace(System.out);
        }
    }

    //AGREGAR
    public static void agregarArchivo(String nombreArchivo, String contenido) {
        //1. Declaracion del objeto de tipo FILE
        File archivo = new File(nombreArchivo);
        //2. Declarar variable
        try {
            //Invocamos al FileWriter para anexar la informacion y no sobreescribirla
            PrintWriter salida = new PrintWriter(new FileWriter(nombreArchivo, true));
            salida.println(contenido);
            salida.close();
        } catch (FileNotFoundException e) {
            //Fichero no existe 
            e.printStackTrace(); //Imprime el stack de excepciones
        } catch (IOException e) {
            //Excepcion de entrada-salida
            e.printStackTrace(); //Imprime el stack de excepciones
        }
    }

    //LEER ARCHIVO
    public static void leerArchivo(String nombreArchivo) {
        //1. Declaracion del objeto de tipo FILE
        File archivo = new File(nombreArchivo);
        //2. Declarar variable
        try {
            //Invocamos al BufferedReader para leer un conjunto de lineas
            var entrada = new BufferedReader(new FileReader(archivo));
            //Nos devuelve una linea de nuestro archivo
            //Recorremos las filas, null es que no hay mas filas
            //Inicializamos la entrada
            var lectura = entrada.readLine();
            while (lectura != null) {
                //Mostrar cada linea
                System.out.println("Lectura: " + lectura);
                lectura=entrada.readLine(); //Pasa a la siguiente linea
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) { //Excepcion del readLine
            e.printStackTrace(System.out);
        }
    }
}
