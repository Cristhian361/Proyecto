package com.mycompany.proyectodeprogramacion;
import java.util.Scanner;
public class Vendedor {
    private String Nombre ;
    private String Credencial ;
    private  int Contraseña;
    static Scanner sc =new Scanner(System.in);
    public static void  ingresarVendedor(){
        String Nombre;
        System.out.println("Ingrese su Nombre: " );
        Nombre=sc.nextLine();

        String credencial;
        System.out.println("Ingrese su credencial: ");
        credencial=sc.nextLine();

        int contrasena;
        System.out.println("Ingrese su contraseña: ");
        contrasena= sc.nextInt();
        sc.nextLine();

    }


}
