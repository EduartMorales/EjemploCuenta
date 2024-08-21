/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1061688186
 */
public class CuentaBancaria {
    //Atributos
    private int Numero;
    private String Titular;
    private String Tipo;
    private double Saldo;
    //Cosntructor no parametrizado
    public CuentaBancaria () {
    }
    //Constructor parametrizado
    public CuentaBancaria (int Numero, String Titular, String Tipo, double Saldo) {
        this.Numero=Numero;
        this.Titular=Titular;
        this.Tipo=Tipo;
        this.Saldo=Saldo;
        
    }
    //Setters and Getters

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
}
