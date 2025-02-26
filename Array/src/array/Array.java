/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author Defolt
 */
public class Array {

    public static void main(String[] args) {
    int k=0;
    double num[]={1,2,3,4,5,6,7,8,9,57};
    for(double i:num){
    System.out.println("tabla del numero "+i);
    do{
    k++;
    System.out.println(i+"*"+k+"="+(i*k));
    }while(k<10);
    k=0;}
    
    
    }
}
    