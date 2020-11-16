/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carro;

/**
 *
 * @author Cairilo
 */
public class Carro {
    
    float tanque = 0;
    float odometro = 0;
    float consumoMedio = 0;
    
    public Carro() { // Construtor padrão
    
    }
    
    public Carro(float consumo, float tank){ // Construtor, instancia o objeto "Carro"
        this.consumoMedio = consumo; // "this" se refere ao atributo da classe
        this.odometro = 0; // "this" se refere ao atributo da classe
        this.tanque = tank; // "this" se refere ao atributo da classe
    }
    
    public void setarVelocidade(float vm, float tempo){
        float distancia = vm * tempo;
        float litros = distancia / this.consumoMedio;
        this.odometro += distancia;
        this.tanque -= litros;
    }
    
}
