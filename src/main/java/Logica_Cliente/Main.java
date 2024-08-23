/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

 package Logica_Cliente;

import Logica_Negocio.Perro;
import Logica_Negocio.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int num_pe;
        String nombre_pe, raza;
        String identificacion, nombre;
        ArrayList<Perro> lsperros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite el numero de perros");
        num_pe = scan.nextInt();

        for (int i = 0; i < num_pe; i++) {

            System.out.println("Digite el nombre del perro");
            nombre_pe = scan.next();

            System.out.println("Digite la raza del perro");
            raza = scan.next();

            Perro objPerro = new Perro(nombre_pe, raza);
            lsperros.add(objPerro);

        }
        System.out.println("Digite el nombre de la persona");
        nombre = scan.next();

        System.out.println("Digite la identificacion de la persona");
        identificacion = scan.next();

        Persona objPersona = new Persona(identificacion, nombre, lsperros); //Asociacion

        System.out.println("la identificacion de la persona es:" + "\t" + objPersona.getNombre());
        System.out.println("el nombre de la persona es:" + "\t" + objPersona.getIdentificacion());

        for (int i = 0; i < objPersona.getLsperros().size(); i++) {

            System.out.println("El nombre del perro es:" + "\t" + objPersona.getLsperros().get(i).getNombre());
            System.out.println("La raza del perro es:" + "\t" + objPersona.getLsperros().get(i).getRaza());
        }

    }

}

//farid estubo aqui
