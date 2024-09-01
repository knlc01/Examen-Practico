package org.example.Ejercicio1;

public class Calculadora {
    private int nro1, nro2;


    public void setNro1(int nro1) {
        this.nro1 = nro1;
    }

    public void setNro2(int nro2) {
        this.nro2 = nro2;
    }

    public int suma(){
        return this.nro1+this.nro2;
    }
    public int resta(){
        return this.nro1-this.nro2;
    }
    public int multiplicacion(){
        return this.nro1*this.nro2;
    }
    public int division(){
        return this.nro1/this.nro2;
    }

    public void EvaluarResultado(int resultado) {
        if(resultado<0){
            System.out.println("Tené cuidado, el resultado es negativo!");
        }
        else if (resultado >= 0 && resultado < 10000) {
            System.out.println("Resultado dentro de los limites");
        }
        else {
            System.out.println("Error, resultado muy grande");
        }
    }
}
