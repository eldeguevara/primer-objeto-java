package org.example;

public class Auto {

    private String marca;
    private String color;
    private String tipo;
    private String modelo;
    private String cantidadPasajeros;

    //constructor
    public Auto(String marca, String color, String tipo, String modelo, String cantidadPasajeros) {
        this.marca = marca;
        this.color = color;
        this.tipo = tipo;
        this.modelo = modelo;
        this.cantidadPasajeros = cantidadPasajeros;
    }

    //funcion para mostrar informacion del auto
    public void infoAuto(){
        System.out.println("Marca: "+getMarca());
        System.out.println("Color: "+getColor());
        System.out.println("Tipo: "+getTipo());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cantidad Pasajeros: "+getCantidadPasajeros());
    }

    //getter and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(String cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }
}
