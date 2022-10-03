/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner (System.in);
    private static Menu menu = new Menu();
    
    public Menu(){};
    
    public static Menu getInstance(){
        return menu;
    }

    public int mainMenu(){
        System.out.println("\n\nSelamat Datang Di ATM Yutra!"); 
        System.out.println("|1. Cek Saldo   |");
        System.out.println("|2. Tarik Tunai |");
        System.out.println("|3. Setor Tunai |");
        System.out.println("|4. Keluar      |");
        System.out.print("|Pilih Menu : ");
        return input.nextInt();
    }
    
    
    
}
