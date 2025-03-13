/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author marie
 */
public class MainPolimorfismoConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(converter(25));
        System.out.println(converter(98.6, "F"));
        
    }
    //converte a temperatura de Celsius para Fahrenheit
    public static double converter(double celsius) {
        return (celsius * 9 / 5 ) +32;
        
    }
    //converte de Fahrenheit para Celsius
    public static double converter(double temperatura, String tipo) {
        if(tipo.equalsIgnoreCase("F")) {
            return (temperatura - 32) * 5 / 9;
        }
        return temperatura;
    }
}
