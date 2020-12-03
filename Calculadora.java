/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.numberaddition;

import java.util.*;

/**
 *
 * @author Cairilo
 */
public class Calculadora {
    
   private float num1;
   private float resultado;
   private char oper;
    
    private ArrayList<String> atributos;
  
    public Calculadora(float num){
        this.num1 = num;
        this.resultado = num;
        this.atributos = new ArrayList<String>();
    }
    
    public void adicionarAtributos(String s){
        this.atributos.add(s);
    }

  
    public float Calcular() { // Método que vai verificar o tipo de operação e vai resolver quando identificar um =
        
        while(oper != '='){
            
        }
    
        return 0f;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public char getOper() {
        return oper;
    }

    public void setOper(char oper) {
        this.oper = oper;
    }   
    
}
