/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;
import Logica_Negocio.CuentaBancaria;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author 1061688186
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, num_cuentas;
        String titular,tipo;
        double saldo;
        
        Scanner scan = new Scanner(System.in);
        ArrayList<CuentaBancaria> listacuentas = new ArrayList<>();
        
        System.out.println("Digite el numero de cuentas a crear");
        num_cuentas = scan.nextInt();
        for(int i = 0; i < num_cuentas; i++) {
        
        System.out.println("Digite el numero"+(i+1)+" de la cuenta");
        numero= scan.nextInt();
        
        System.out.println("Digite el titular"+(i+1)+" de la cuenta");
        titular=scan.next();
        
        System.out.println("Digite el tipo"+(i+1)+" de la cuenta");
        tipo=scan.next();
        
        System.out.println("Digite el saldo"+(i+1)+" de la cuenta");
        saldo=scan.nextDouble();
        
       
        
            CuentaBancaria objBancaria = new CuentaBancaria(numero,
                    titular,
                    tipo,
                    saldo);
            listacuentas.add(objBancaria);
        }
        
        for (int i = 0; i < listacuentas.size(); i++) {
            System.out.println("El numero de la cuenta es"+"\t"+listacuentas.get(i).getNumero());
            System.out.println("El Titular de la cuenta es"+"\t"+listacuentas.get(i).getTitular());
            System.out.println("El tipo de la cuenta es"+"\t"+listacuentas.get(i).getTipo());
            System.out.println("El saldo de la cuenta es"+"\t"+listacuentas.get(i).getSaldo());
              
        }   
    }
    
}

