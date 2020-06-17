
package main;

import form.FormAwal;
import database.Koneksi;
public class ClassUtama {
    public static void main(String args[]){  
           java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new FormAwal().setVisible(true);
            }
        });
        control.ControlDiary koneksi = new control.ControlDiary();
        koneksi.koneksiDatabase();
    }
    
    
}
