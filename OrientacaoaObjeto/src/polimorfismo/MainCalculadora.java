/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;



class Calculadora {
    //método para somar dois números inteiros
    int somar(int a, int b) {
        return a + b;
    }
    
    //método para somar três números inteiros
    int somar(int a, int b, int c) {
        return a + b + c;
    }
    
    //método para somar dois números de ponto flutuante
    double somar (double a, double b) {
        return a + b;
    }
}
        
public class MainCalculadora {


    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.somar(2, 3));              // saída: 5
        System.out.println(calc.somar(2, 3, 4));           // saída: 9
        System.out.println(calc.somar(2.5, 3.7));          // saída: 6.2
    }
    
}
