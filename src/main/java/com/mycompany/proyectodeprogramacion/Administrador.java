package com.mycompany.proyectodeprogramacion;

import java.util.Scanner;
import java.util.ArrayList;        
public class Administrador {
    private final String Nombre  ;
    private final String Credencial ;
    private final  int Contrasena;
    private final String catalogo[];
    static Scanner sc= new Scanner (System.in);
    public Administrador(String nombre, String credencial, int contrasena, String[] catalogo) {
        Nombre = nombre;
        Credencial = credencial;
        Contrasena = contrasena;
        this.catalogo = catalogo;
    }
    public static void  ingresarAdmin(){
        String Nombre;
        System.out.println("Ingrese su Nombre: " );
        Nombre=sc.nextLine();

        String credencial;
        System.out.println("Ingrese su credencial: ");
        credencial=sc.nextLine();

        int contrasena;
        System.out.println("Ingrese su contraseña: ");
        contrasena= sc.nextInt();

    }

    public static void  gestionProducto() {
        //Colocacion de Productos y precios
        System.out.println("Ingrese el producto");
        ArrayList<String> Productos = new ArrayList<>();
        String Producto;
        while (true){
            Producto = sc.nextLine();
            if (Producto.equalsIgnoreCase("fin")) break;
            Productos.add(Producto);
        }
        System.out.println("ingrese el precio");
        ArrayList<Integer> Precios = new ArrayList<>();
        while (sc.hasNextInt())  {
            Precios.add(sc.nextInt());
        }
        System.out.printf("%-6s  %-10s \n" ,
                        "Producto","Precio" );
        for (String s : Productos) {
            for (int i : Precios) {
                System.out.printf("%-6s %-10s\n",
                        s, i);
            }
        }
    }
}
