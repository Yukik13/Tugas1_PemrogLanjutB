/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package atm;

public interface DAO {
    int jumlahsaldo();
    int kelipatan(int i);
    void tariksaldo(int i);
    void setorsaldo(int i);
    boolean limitsaldo();
}
