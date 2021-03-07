/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.JFrame;
import Gui.ekran;
import javax.swing.WindowConstants;

public class main extends JFrame {

    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);//butonlara görünüm verme

        main ekran1 = new main();
        ekran1.setResizable(true);// ekranın sabit boyutu
        //ekran1.setFocusable(true);
        ekran1.setSize(1366, 800);// ekran boyutu

        ekran1.setLocationRelativeTo(null);
        ekran1.setTitle("Candy Shop Otomat");
        ekran1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//çarpı ile kapat

        ekran e = new ekran();

        e.setFocusable(true);

        ekran1.add(e);
        ekran1.setVisible(true);
    }

}
