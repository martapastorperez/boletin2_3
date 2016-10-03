
package boletin2_3;

import javax.swing.JOptionPane;


public class Boletin2_3 {

    
    public static void main(String[] args) {
      float dolares,euros,cambio;
      cambio=Float.parseFloat(JOptionPane.showInputDialog("cambio"));
      euros=Float.parseFloat(JOptionPane.showInputDialog("euros"));
      dolares=euros*cambio;
      JOptionPane.showMessageDialog(null, "dolares= " +dolares);
    }
    
}
