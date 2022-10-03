/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import java.util.Scanner;

public class MVC2 {
    public Menu menu;
    public DAO2 dao2,saldo;
    int pilih,jumlah;
    Scanner input = new Scanner (System.in);
    
    MVC2(){
        this.menu = new Menu();
        this.dao2 = new DAO2();
        
        while(pilih !=4){
            pilih = menu.mainMenu();
            
            switch (pilih){
                case 1: 
                    cek(this.dao2); break;
                case 2:
                    tarik(this.dao2);break;
                case 3:
                    setor(this.dao2);break;
                case 4:
                    System.out.println("Terimakasih Sudah Menggunakan Bank Yutra...");break;
                default : 
                    System.out.println("Mohon Maaf Menu Tidak Ada");break;
            }
        }
    }
    
    public void cek(DAO2 saldo){
        System.out.print("\n|Saldo Anda : Rp."+saldo.saldo1.getsaldoawal());
    }
    
    public void tarik(DAO2 saldo){
        System.out.print("\n|Masukkan Jumlah Penarikan : Rp.");
        jumlah = input.nextInt();
        
        if(saldo.limitsaldo()){
            System.out.print("\n|Saldo Anda Mencapai Limit");
        }else if(saldo.jumlahsaldo() - jumlah < saldo.limit()){
            System.out.print("\n|Jumlah Penarikan Melebihi Limit Saldo Anda|");
        }else if(saldo.jumlahsaldo() > jumlah && (saldo.kelipatan (jumlah) == 0)){
            saldo.tariksaldo(jumlah);
            System.out.print("\n|Uang Yang Anda Tarik : Rp."+jumlah);
        }else{
            System.out.print("|Mohon Maaf, Harus Kelipatan 50000 ( Lima Puluh Ribu )");
        }
    }
    
    public void setor(DAO2 saldo){
        System.out.print("\n|Masukkan Jumlah Setoran : Rp.");
        jumlah = input.nextInt();
        
        if(saldo.kelipatan(jumlah) == 0){
            saldo.setorsaldo(jumlah);
            System.out.print("\n|Uang Anda Bertambah : Rp"+jumlah);
        }else{
            System.out.print("|Mohon Maaf, Harus Kelipatan 50000 ( Lima Puluh Ribu )");
        }
        
    }

}
