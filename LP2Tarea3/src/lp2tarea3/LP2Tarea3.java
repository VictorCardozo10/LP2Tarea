/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp2tarea3;

import java.util.Scanner;

public class LP2Tarea3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese la cantidad de personas: ");
        int cant= scan.nextInt();
        double[] edades= new double[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese una edad");
            edades[i] = scan.nextDouble();}
        CalculadoraEdades prom = new CalculadoraEdades(edades);
        prom.calcularPromedioMayoresEdad(edades,cant);
        prom.calcularPromedioMenoresEdad(edades,cant);
    scan.close();}}
