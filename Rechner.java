/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rechner;
import java.util.Scanner;
/**
 *
 * @author eliad
 */
public class Rechner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Bitte geben Sie die erste Ganzzahl zwischen 1 und 100 ein:");
       int zahl1 = scanner.nextInt();
       System.out.println("Bitte geben Sie die zweiteGanzzahl zwischen 1 und 100 ein:");
       int zahl2 = scanner.nextInt();
       
       System.out.println("Welche Operation möchtest du ausführen?");
        System.out.println("[1] Addieren");
         System.out.println("[2] Subtrahieren");
          System.out.println("[3] Multiplizieren");
           System.out.println("[4] Dividieren");
           int menu = scanner.nextInt();
        
  switch (menu) {
  case 1:
    System.out.println(zahl1+zahl2);
    break;
  case 2:
    System.out.println(zahl1-zahl2);
    break;
  case 3:
    System.out.println(zahl1*zahl2);
    break;
  case 4:
    System.out.println(zahl1/zahl2);
    break;
       }
    }
    
}
