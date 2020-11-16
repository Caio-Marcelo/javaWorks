/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

import java.util.Scanner;

/**
 *
 * @author Cairilo
 */
public class mainEstudos1 {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in); // Istancia o objeto "sc"
        
        System.out.print("Informe a litragem de tanque do carro 1 : ");
        float tanque1 = sc.nextFloat(); 
        System.out.print("Entre com o consumo do carro 1: ");
        float consumo1 = sc.nextFloat();
        
        System.out.print("Informe a litragem de tanque do carro 2 : ");
        float tanque2 = sc.nextFloat(); 
        System.out.print("Entre com o consumo do carro 2: ");
        float consumo2 = sc.nextFloat();
    
        Carro carro1 = new Carro(consumo1, tanque1); // inicia o objeto carro1 para o construtor personalizado
        Carro carro2 = new Carro(consumo2, tanque2); // inicia o objeto carro2 para o construtor personalizado
        
        System.out.println("Carro 1 tanque: " + carro1.tanque);
        System.out.println("Carro 1 consumo medio: " + carro1.consumoMedio);
        System.out.println("Carro 2 tanque: " + carro2.tanque);
        System.out.println("Carro 2 consumo medio: " + carro2.consumoMedio);
        
        
        for(int i = 0; carro1.tanque > 0 && carro2.tanque > 0  ; i++){
            System.out.print("Informe a velocidade media dos carros: ");
            float vm = sc.nextFloat();
        
            System.out.print("Entre com o tempo da viagem: ");
            float t = sc.nextFloat();
            
            carro1.setarVelocidade(vm, t); // inicia o metodo setarVelocidade para carro1
            carro2.setarVelocidade(vm, t); // inicia o metodo setarVelocidade para carro2
            
            System.out.println("Carro 1 tanque: " + carro1.tanque);
            System.out.println("Carro 1 odometro: " + carro1.odometro);
            System.out.println("Carro 2 tanque: " + carro2.tanque);
            System.out.println("Carro 2 odometro: " + carro2.odometro);

        }
      

    }
    
}
