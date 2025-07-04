package com.mycompany.proyectodeprogramacion;
import java.util.Scanner;
public class Sistema {
    private String formulario;
    private String DatosAdmi;

    public Sistema(String datosAdmi, String formulario) {
        DatosAdmi = datosAdmi;
        this.formulario = formulario;
    }
    //menu que se le mostrara al cliente
    public static void menuCliente(){
            int opcion ;
             do{ 
                System.out.print("""
                                 [1] Registrarce
                                 [2] Solicitar catalogo
                                 [3] Seleccionar producto
                                 [4] Ver carrito
                                 [5] Procesar boleta
                                 [6] Salir
                                 Ingrese una opcion: 
                                 """);
                Scanner lector = new Scanner(System.in);
                opcion = lector.nextInt();        
                switch(opcion){
                    case 1 :
                            Cliente.llenadoFormulario();
                         
                            break;
                    case 2 : 
                }
             }while(opcion != 6);
                   
        }
    //Menu para los trabajadores
    public static void menuAdmi() {
        int opcion;
        do {
            System.out.print("""
                    [1] Vendedor
                    [2] Administrador
                    [2] Salir
                    Ingrese una opcion: 
                    """);
            Scanner lector = new Scanner(System.in);
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    Vendedor.ingresarVendedor();
                    break;
                case 2:
                    Administrador.ingresarAdmin();
                    break;
            }
        } while (opcion != 3);
    }
}
