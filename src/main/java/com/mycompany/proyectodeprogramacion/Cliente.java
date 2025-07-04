package com.mycompany.proyectodeprogramacion;

import java.util.Scanner;
public class Cliente {
    private String Nombre, Correo ;
    private int edad;
    static Scanner sc=new Scanner (System.in);
    public Cliente (String nombre, String correo , int edad){
        this.Nombre=nombre;
        this.edad=edad;
        this.Correo=correo;
    }
        public static void llenadoFormulario(){
            String nombre;
            int edad;
            String correo;
            System.out.println("ingrese su nombre completo : ");
            nombre=sc.nextLine();
            System.out.println("ingrese su edad : ");
            edad=sc.nextInt();
            System.out.println("ingrese su correo electronico : ");
            correo=sc.nextLine();
            sc.nextLine();
            System.out.println(" !TE REGISTRASTE CON EXITO! ");

    }
}
