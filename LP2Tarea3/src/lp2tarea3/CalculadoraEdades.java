/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lp2tarea3;

public class CalculadoraEdades {
    public double[] edades;
    public double sumaMayores=0;
    public double sumaMenores=0;
    public int cantMayores=0;
    public int cantMenores=0;
    public double promMayores;
    public double promMenores;
    
    public CalculadoraEdades(double edades[]){
    this.edades= edades;}
    
    public void calcularPromedioMayoresEdad(double edades[], int cant){
        for(int i = 0; i<cant; i++){
        if(edades[i]>17){
        sumaMayores= sumaMayores+edades[i];
        cantMayores++;}
        }
        promMayores=  sumaMayores/cantMayores;
        System.out.println("El promediode edad de entre los mayores de edad es: "+ promMayores);}
    
    public void calcularPromedioMenoresEdad(double edades[],int cant){
        for(int i = 0; i<cant; i++){
        if(edades[i]<18){
        sumaMenores= sumaMenores+edades[i];cantMenores++;}
        }
        promMenores=  sumaMenores/cantMenores;
        System.out.println("El promediode edad de entre los menores de edad es: "+ promMenores);}}
