/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Gui.ekran;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Actions implements ActionListener {

    ekran e1;

    public Actions(ekran a) {
        setE1(a);
    }

    public ekran getE() throws IOException {
        ekran ekran1 = new ekran();
        return ekran1;
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == getE1().getekleme()) {
            int a;
            a = (Integer.valueOf((String) getE1().getnoekle().getText()));

            String b;
            b = ((String) getE1().getisimekle().getText());

            int c;
            c = (Integer.valueOf((String) getE1().getstokekle().getText()));

            int d;
            d = (Integer.valueOf((String) getE1().getfiyatekle().getText()));

            switch (a) {
                case 1:
                    getE1().getText().setText(b);
                    getE1().getText01().setText(Integer.toString(c) + " kg");
                    getE1().getText02().setText(Integer.toString(d) + " $");
                    break;
                case 2:
                    getE1().getText1().setText(b);
                    getE1().getText11().setText(Integer.toString(c) + " kg");
                    getE1().getText12().setText(Integer.toString(d) + " $");
                    break;
                case 3:
                    getE1().getText2().setText(b);
                    getE1().getText21().setText(Integer.toString(c) + " kg");
                    getE1().getText22().setText(Integer.toString(d) + " $");
                    break;
                case 4:
                    getE1().getText3().setText(b);
                    getE1().getText31().setText(Integer.toString(c) + " kg");
                    getE1().getText32().setText(Integer.toString(d) + " $");
                    break;
                case 5:
                    getE1().getText4().setText(b);
                    getE1().getText41().setText(Integer.toString(c) + " kg");
                    getE1().getText42().setText(Integer.toString(d) + " $");
                    break;
                case 6:
                    getE1().getText5().setText(b);
                    getE1().getText51().setText(Integer.toString(c) + " kg");
                    getE1().getText52().setText(Integer.toString(d) + " $");
                    break;
                case 7:
                    getE1().getText6().setText(b);
                    getE1().getText61().setText(Integer.toString(c) + " kg");
                    getE1().getText62().setText(Integer.toString(d) + " $");
                    break;
                case 8:
                    getE1().getText7().setText(b);
                    getE1().getText71().setText(Integer.toString(c) + " kg");
                    getE1().getText72().setText(Integer.toString(d) + " $");
                    break;
                default:
                    JOptionPane jop1 = new JOptionPane();
                    JOptionPane.showMessageDialog(null, "Geçerli bir kutu numarası giriniz :D");
                    break;
            }

            getE1().getAd().set((a), b);
            getE1().getStok().set((a), c);
            getE1().getBfiyat().set((a), d);

            System.out.println(getE1().getAd().get(a));
            getE1().getnoekle().setText("");
            getE1().getisimekle().setText("");
            getE1().getstokekle().setText("");
            getE1().getfiyatekle().setText("");
        }

        if (e.getSource() == getE1().getOnay()) {
            int labelno = (Integer.valueOf(getE1().getNo().getText()));
            int istenenkilo = (Integer.valueOf(getE1().getKilo().getText()));
            int stokdeger = (int) getE1().getStok().get(labelno);
            if (stokdeger == istenenkilo || stokdeger > istenenkilo) {
                int labelucret = (Integer.valueOf(getE1().getucret().getText()));
                int labeltucret = (Integer.valueOf(getE1().gettucret().getText()));
                labeltucret = labelucret + labeltucret;
                getE1().gettucret().setText(Integer.toString(labeltucret));
                stokdeger = stokdeger - istenenkilo;
                getE1().getStok().set(labelno, stokdeger);
                switch (labelno) {
                    case 1:
                        getE1().getText01().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 2:
                        getE1().getText11().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 3:
                        getE1().getText21().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 4:
                        getE1().getText31().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 5:
                        getE1().getText41().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 6:
                        getE1().getText51().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 7:
                        getE1().getText61().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    case 8:
                        getE1().getText71().setText(Integer.toString((int) getE1().getStok().get(labelno)) + " kg");
                        break;
                    default:
                        break;
                }
                getE1().getNo().setText("0");
                getE1().getKilo().setText("0");
                getE1().getucret().setText("0");
            } else {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Stokta bu  miktarda ürün bulunmamaktadır.");
            }

            /*labelno=(Integer.valueOf(getucret().getText()));
            istenenkilo=(Integer.valueOf(gettucret().getText()));
            
            labelfiyat1=istenenkilo+labelno;
            gettucret().setText(Integer.toString(labelfiyat1)+" $");*/
        }

        if (e.getSource() == getE1().getFguncelle()) {
            int labelno = (Integer.valueOf(getE1().getNo().getText()));
            int istenenkilo = (Integer.valueOf(getE1().getKilo().getText()));
            int stokdeger = (int) getE1().getStok().get(labelno);
            if (stokdeger == istenenkilo || stokdeger > istenenkilo) {
                int labelfiyat = (int) getE1().getBfiyat().get(labelno);
                int labelfiyat1 = istenenkilo * labelfiyat;
                getE1().getucret().setText(Integer.toString(labelfiyat1));

            } else {
                JOptionPane jop1 = new JOptionPane();
                JOptionPane.showMessageDialog(null, "Stokta bu  miktarda ürün bulunmamaktadır.");

            }

        }

        if (e.getSource() == getE1().getodeme()) {
            int tttoplam = (Integer.valueOf(getE1().gettucret().getText()));
            int tktoplam = (Integer.valueOf(getE1().gettoplamkazanc().getText()));
            tktoplam = tktoplam + tttoplam;
            getE1().gettoplamkazanc().setText(Integer.toString(tktoplam));

            getE1().gettucret().setText("0");
        }

        if (e.getSource() == getE1().getBir()) {
            buttonbas("1", (int) getE1().getBfiyat().get(1));
        }

        if (e.getSource() == getE1().getİki()) {
            buttonbas("2", (int) getE1().getBfiyat().get(2));
        }

        if (e.getSource() == getE1().getUc()) {
            buttonbas("3", (int) getE1().getBfiyat().get(3));
        }

        if (e.getSource() == getE1().getDort()) {
            buttonbas("4", (int) getE1().getBfiyat().get(4));
        }

        if (e.getSource() == getE1().getBes()) {
            buttonbas("5", (int) getE1().getBfiyat().get(5));
        }

        if (e.getSource() == getE1().getAlti()) {
            buttonbas("6", (int) getE1().getBfiyat().get(6));
        }

        if (e.getSource() == getE1().getYedi()) {
            buttonbas("7", (int) getE1().getBfiyat().get(7));
        }

        if (e.getSource() == getE1().getSekiz()) {
            buttonbas("8", (int) getE1().getBfiyat().get(8));
        }

    }

    public int buttonbas(String cikti1, int cikti2) {
        getE1().getNo().setText(cikti1);
        getE1().getucret().setText(Integer.toString(cikti2) + " $");
        return 0;
    }

    public ekran getE1() {
        return e1;
    }

    public void setE1(ekran e1) {
        this.e1 = e1;
    }

  
}