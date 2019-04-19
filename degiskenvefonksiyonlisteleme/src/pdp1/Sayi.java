/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdp1;

/**    
 * <p>  
 * Ornek program 
 * </p>  */


public class Sayi {
    private int deger;     
    private boolean eksimi;          
    public Sayi(int deger){         
        this.deger = deger;         
        eksimi = deger < 0;     
    }    
    public void setDeger(int value){         
        this.deger = value;         
        eksimi = this.deger < 0;     
    } 
    public boolean Eksimi(){         
        return eksimi;     
    }  
    @Override     
    public String toString() {         
        return String.valueOf(deger);     
    }
    
}
