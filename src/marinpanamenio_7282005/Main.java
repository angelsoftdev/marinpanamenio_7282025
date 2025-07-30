/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marinpanamenio_7282005;

/**
 *
 * @author angel
 */
public class Main {

    
    //variables locales: fuera
    public static String nombres = "Angel Adiel";
    public static String apellidos = "Marin Panamenio";
    public static int anioNacimiento = 2005;
    public static int mesNacimiento = 3;
    public static float estatura = 1.72f;
    public static float peso = 140.6f;
    public static char genero = 'M';
    public static String estadoFamiliar = "Ocupado";
    public static double salarioMensual = 365.43d;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double imc = 0.0d;
        float tasaKilogramos = 0.453593f; //formula
        int diasLaborales = 22; //mes
        int horasLaborales = 8; //dia
        
        //conversion el peso a kilogramos
        
        float pesoKilogramos = Main.peso * tasaKilogramos;
        
        //elevar valor de estatura al cuadrado
        float estaturaCuadrado = Main.estatura * Main.estatura;
        
        //calcular indice de masa corporal
        imc = pesoKilogramos/estaturaCuadrado;
        
        //salario diario
        double salarioDiario = Main.salarioMensual/diasLaborales;
        
        //salario por hora
        double salarioHora = salarioDiario/horasLaborales;
        
        
        //salida de datos
        
        
        System.out.println("Saludos, "+Main.nombres+" "+Main.apellidos);
        System.out.println("Su peso en libras es:  "+Main.peso+", pero en kilogramos es: "+pesoKilogramos);
        System.out.println("Su indice de Masa Corporal:  "+imc);
        System.out.println("Su salario mensual es: "+Main.salarioMensual);
        System.out.println("Su salario diario es: "+salarioDiario);
        System.out.println("Su salario por horas es: "+salarioHora);
        
    }
    
}
