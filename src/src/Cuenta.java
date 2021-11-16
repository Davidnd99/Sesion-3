/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author David
 */
public class Cuenta{
    
    private int saldo;
    
    Cuenta(int saldo){
        this.saldo = saldo;
    }
    
    public int Reintegro(int dinero){
        
        if(saldo > -500){
            saldo = saldo - dinero;
        }
        
        return saldo;
    }
    
    public int deposito(int ingreso){
        
        saldo = saldo + ingreso;
        
        return saldo;
    }

    Object getSaldo() {
        
        return saldo;
    }

}
