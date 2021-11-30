/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamerentalimprove;

/**
 *
 * @author Lenovo
 */
public class gold extends dataMember {
    private int jmlcashback;
    
    dataMember data2 = new dataMember();
//    Contractor
    public int cashback(String x){
        if (null == x){
            this.jmlcashback = 0;
        } else switch (x) {
            case "M002":
                this.jmlcashback = 5000;
                System.out.println("Jumlah Cashback : "+this.jmlcashback);
                break;
            case "M003":
                this.jmlcashback = 10000;
                System.out.println("Jumlah Cashback : "+this.jmlcashback);
                break;
            default:
                this.jmlcashback = 0;
                break;
        }
        return this.jmlcashback;
        
    }
    
    
    
}
