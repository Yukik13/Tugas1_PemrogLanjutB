/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

public class DAO2 implements DAO {
    MVC1 saldo1;
    
    public DAO2(){
        this.saldo1 = new MVC1();
    }
    
    public int limit(){
        return this.saldo1.saldoakhir;
    }

    @Override
    public int jumlahsaldo() {
        return this.saldo1.getsaldoawal();
    }

    @Override
    public void setorsaldo(int i) {
        saldo1.setsaldoawal(saldo1.getsaldoawal()+i);
    }

    @Override
    public void tariksaldo(int i) {
        saldo1.setsaldoawal
        (saldo1.getsaldoawal()-i);
    }

    @Override
    public boolean limitsaldo() {
        if(this.saldo1.getsaldoawal() <= this.saldo1.saldoakhir){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int kelipatan(int i) {
        if(i % 50000 != 0 ){
            return 1;
        }else{
            return 0;
        }
    }
    
}
