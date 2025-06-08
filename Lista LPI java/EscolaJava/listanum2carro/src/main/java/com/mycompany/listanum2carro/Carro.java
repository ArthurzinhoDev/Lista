package com.mycompany.listanum2carro;

public class Carro {
    // Atributos privados (encapsulados)
    private String modelo;
    private String cor;
    private int ano;
    private String marca;
    private int velocidade;

    // Construtor
    public Carro(String modelo, String cor, int ano, String marca) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.velocidade = 0; // Inicia parado
    }

    // Métodos getters e setters (encapsulamento)
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // Método para acelerar ou reduzir velocidade
    public void acelera(int valor) {
        if (valor == 1) {
            this.velocidade += 5;
        } else if (valor == -1) {
            this.velocidade = Math.max(0, this.velocidade - 5); // Não permite velocidade negativa
        }
    }

    // Método para frear o carro completamente
    public void freia() {
        this.velocidade = 0;
    }

    // Método para exibir informações do carro
    public String exibirInfo() {
        return "Carro: " + marca + " " + modelo + 
               "\nCor: " + cor + 
               "\nAno: " + ano + 
               "\nVelocidade atual: " + velocidade + " km/h";
    }
}