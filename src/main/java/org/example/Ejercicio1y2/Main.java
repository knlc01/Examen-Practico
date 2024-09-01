package org.example.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int resultado;
        String operacion;
        Calculadora calculadora = new Calculadora();
        int ejecucion = 0;

        while (ejecucion < 5){
            System.out.println("Primer Valor:");
            calculadora.setNro1(in.nextInt());
            System.out.println("Segundo Valor:");
            calculadora.setNro2(in.nextInt());

            System.out.print("Operación:");
            operacion = in.next();
            switch (operacion){
                case "+":
                    resultado = calculadora.suma();
                    System.out.println("Resultado: " + resultado);
                    calculadora.EvaluarResultado(resultado);
                    break;
                case "-":
                    resultado = calculadora.resta();
                    System.out.println("Resultado: " + resultado);
                    calculadora.EvaluarResultado(resultado);
                    break;
                case "*":
                    resultado = calculadora.multiplicacion();
                    System.out.println("Resultado: " + resultado);
                    calculadora.EvaluarResultado(resultado);
                    break;
                case "/":
                    try {
                        resultado = calculadora.division();
                        System.out.println("Resultado: " + resultado);
                        calculadora.EvaluarResultado(resultado);
                    }catch (ArithmeticException ex){
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                default:
                    System.out.println("Operación no valida");
            }
            ejecucion++;
        }
    }
}
