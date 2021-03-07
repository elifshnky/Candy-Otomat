/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Logic.Actions;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public final class ekran extends JPanel {

    public ImageIcon buton;
    public Button bir, iki, uc, dort, bes, alti, yedi, sekiz, onay, ekleme, fg, odeme;// buton tanımlaması
    JLabel text, text1, text2, text3, text4, text5, text6, text7, uno, kg, fiyat, no, baslik;
    JLabel text01, text11, text21, text31, text41, text51, text61, text71;
    JLabel text02, text12, text22, text32, text42, text52, text62, text72, ucret, tucretb, tucret, topkazb, topkaz;
    JTextField noekle, fiekle, adekle, stekle;
    JLabel noek, fiek, adek, stek;
    JTextField kilo;
    private String labelfiyat2;
    private int labelno, istenenkilo, labelfiyat1, labelfiyat, labelucret, labeltucret;
    private String ekle1, ekle2, ekle3, ekle4;

    ArrayList stok = new ArrayList(9);
    ArrayList bfiyat = new ArrayList(9);
    List ad = new ArrayList(9);

    public ArrayList getStok() {
        return stok;
    }

    public ArrayList getBfiyat() {
        return bfiyat;
    }

    public List getAd() {
        return ad;
    }

    public void setAd(List ad) {
        this.ad = ad;
    }

    public ArrayList setStok(ArrayList stok) {
        this.stok = stok;
        return stok;

    }

    public void setBfiyat(ArrayList bfiyat) {
        this.bfiyat = bfiyat;
    }

    public Image arkaresim;
    public ImageIcon varmı;
    public Actions a = null;

    public ekran() {
        for (int i = 0; i < 9; i++) {

            stok.add((i), 0);
            bfiyat.add((i), 0);
            ad.add((i), null);

        }

        arkaresim = new ImageIcon(ekran.class.getResource("arkaplan.jpg")).getImage();

        add(getBir());
        add(getİki());
        add(getUc());
        add(getDort());
        add(getBes());
        add(getAlti());
        add(getYedi());
        add(getSekiz());
        add(getText());
        add(getText1());
        add(getText2());
        add(getText3());
        add(getText4());
        add(getText5());
        add(getText6());
        add(getText7());
        add(getText01());
        add(getText11());
        add(getText21());
        add(getText31());
        add(getText41());
        add(getText51());
        add(getText61());
        add(getText71());
        add(getText02());
        add(getText12());
        add(getText22());
        add(getText32());
        add(getText42());
        add(getText52());
        add(getText62());
        add(getText72());
        add(getTextek1());
        add(getTextek2());
        add(getTextek3());
        add(getTextek4());
        add(getucret());
        add(gettucretb());
        add(gettucret());
        add(gettoplamkazancb());
        add(gettoplamkazanc());
        add(getTextek4());
        add(getOnay());
        add(getFguncelle());
        add(getUno());
        add(getKg());
        add(getFiyat());
        add(getBaslik());
        add(getNo());
        add(getKilo());
        add(getodeme());
        add(getBaslik());
        add(getNo());
        add(getKilo());
        add(getnoekle());
        add(getisimekle());
        add(getstokekle());
        add(getfiyatekle());
        add(getekleme());

    }

    public class KeyList implements KeyListener {

        private ekran tb;

        @Override
        public void keyTyped(KeyEvent e) {
            char caracter = e.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b')) {
                e.consume();
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }

    }

    public JLabel getText() {
        if (text == null) {
            text = new JLabel((String) ad.get(1));

        }
        return text;
    }

    public JLabel getText1() {
        if (text1 == null) {
            text1 = new JLabel((String) ad.get(2));
        }
        return text1;
    }

    public JLabel getText2() {
        if (text2 == null) {
            text2 = new JLabel((String) ad.get(3));
        }
        return text2;
    }

    public JLabel getText3() {
        if (text3 == null) {
            text3 = new JLabel((String) ad.get(4));
        }
        return text3;
    }

    public JLabel getText4() {
        if (text4 == null) {
            text4 = new JLabel((String) ad.get(5));
        }
        return text4;
    }

    public JLabel getText5() {
        if (text5 == null) {
            text5 = new JLabel((String) ad.get(6));
        }
        return text5;
    }

    public JLabel getText6() {
        if (text6 == null) {
            text6 = new JLabel((String) ad.get(7));
        }
        return text6;
    }

    public JLabel getText7() {
        if (text7 == null) {
            text7 = new JLabel((String) ad.get(8));
        }
        return text7;
    }

    public JLabel getText01() {
        if (text01 == null) {
            text01 = new JLabel(Integer.toString((int) stok.get(1)));
        }
        return text01;
    }

    public JLabel getText11() {
        if (text11 == null) {
            text11 = new JLabel(Integer.toString((int) stok.get(2)));
        }
        return text11;
    }

    public JLabel getText21() {
        if (text21 == null) {
            text21 = new JLabel(Integer.toString((int) stok.get(3)));
        }
        return text21;
    }

    public JLabel getText31() {
        if (text31 == null) {
            text31 = new JLabel(Integer.toString((int) stok.get(4)));
        }
        return text31;
    }

    public JLabel getText41() {
        if (text41 == null) {
            text41 = new JLabel(Integer.toString((int) stok.get(5)));
        }
        return text41;
    }

    public JLabel getText51() {
        if (text51 == null) {
            text51 = new JLabel(Integer.toString((int) stok.get(6)));
        }
        return text51;
    }

    public JLabel getText61() {
        if (text61 == null) {
            text61 = new JLabel(Integer.toString((int) stok.get(7)));
        }
        return text61;
    }

    public JLabel getText71() {
        if (text71 == null) {
            text71 = new JLabel(Integer.toString((int) stok.get(8)));
        }
        return text71;
    }

    public JLabel getText02() {
        if (text02 == null) {
            text02 = new JLabel(Integer.toString((int) bfiyat.get(1)));
        }
        return text02;
    }

    public JLabel getText12() {
        if (text12 == null) {
            text12 = new JLabel(Integer.toString((int) bfiyat.get(2)));
        }
        return text12;
    }

    public JLabel getText22() {
        if (text22 == null) {
            text22 = new JLabel(Integer.toString((int) bfiyat.get(3)));
        }
        return text22;
    }

    public JLabel getText32() {
        if (text32 == null) {
            text32 = new JLabel(Integer.toString((int) bfiyat.get(4)));
        }
        return text32;
    }

    public JLabel getText42() {
        if (text42 == null) {
            text42 = new JLabel(Integer.toString((int) bfiyat.get(5)));
        }
        return text42;
    }

    public JLabel getText52() {
        if (text52 == null) {
            text52 = new JLabel(Integer.toString((int) bfiyat.get(6)));
        }
        return text52;
    }

    public JLabel getText62() {
        if (text62 == null) {
            text62 = new JLabel(Integer.toString((int) bfiyat.get(7)));
        }
        return text62;
    }

    public JLabel getText72() {
        if (text72 == null) {
            text72 = new JLabel(Integer.toString((int) bfiyat.get(8)));
        }
        return text72;
    }

    public JLabel getTextek1() {
        if (noek == null) {
            noek = new JLabel("No :");
        }
        return noek;
    }

    public JLabel getTextek2() {
        if (adek == null) {
            adek = new JLabel("İsim :");
        }
        return adek;
    }

    public JLabel getTextek3() {
        if (stek == null) {
            stek = new JLabel("Stok :");
        }
        return stek;
    }

    public JLabel getTextek4() {
        if (fiek == null) {
            fiek = new JLabel("B.Ücret :");
        }
        return fiek;
    }

    /*public int buttonbas(String cikti1, int cikti2) {
        getNo().setText(cikti1);
        getucret().setText(Integer.toString(cikti2) + " $");
        return 0;
    }*/
    public Button getBir() {
        if (bir == null) {
            bir = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            bir.setIcon(new ImageIcon(img1));
            bir.addActionListener(getA());
        

            /*(ActionEvent e) -> {
                // JOptionPane jop1=new JOptionPane();
                // JOptionPane.showMessageDialog(null,"NESNELLEŞTİK");
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                buttonbas("1", (int) bfiyat.get(1));
            });*/
        }
        return bir;
    }

    public Button getİki() {
        if (iki == null) {
            iki = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            iki.setIcon(new ImageIcon(img1));
            iki.addActionListener(getA());

        }
        return iki;
    }

    public Button getUc() {
        if (uc == null) {
            uc = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            uc.setIcon(new ImageIcon(img1));
            uc.addActionListener(getA());
        }
        return uc;
    }

    public Button getDort() {
        if (dort == null) {
            dort = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            dort.setIcon(new ImageIcon(img1));
            dort.addActionListener(getA());
        }
        return dort;
    }

    public Button getBes() {
        if (bes == null) {
            bes = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            bes.setIcon(new ImageIcon(img1));
            bes.addActionListener(getA());
        }
        return bes;
    }

    public Button getAlti() {
        if (alti == null) {
            alti = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            alti.setIcon(new ImageIcon(img1));
            alti.addActionListener(getA());
        }
        return alti;
    }

    public Button getYedi() {
        if (yedi == null) {
            yedi = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            yedi.setIcon(new ImageIcon(img1));
            yedi.addActionListener(getA());
        }
        return yedi;
    }

    public Button getSekiz() {
        if (sekiz == null) {
            sekiz = new Button();
            Image img1 = new ImageIcon(ekran.class.getResource("var.png")).getImage();
            sekiz.setIcon(new ImageIcon(img1));
            sekiz.addActionListener(getA());
        }
        return sekiz;
    }

    public JLabel getBaslik() {
        if (baslik == null) {
            baslik = new JLabel("ÖDEME EKRANI");
        }
        return baslik;
    }

    public Button getOnay() {
        if (onay == null) {
            onay = new Button();
            onay.setText("ONAY");
            onay.addActionListener(getA());
        }
        return onay;
    }

    public Button getFguncelle() {
        if (fg == null) {
            fg = new Button();
            fg.setText("GÜNCELLE");
            fg.addActionListener(getA());
        }
        return fg;
    }

    public Button getodeme() {
        if (odeme == null) {
            odeme = new Button();
            odeme.setText("ÖDEME");
            odeme.addActionListener(getA());
        }
        return odeme;
    }

    public JLabel getUno() {
        if (uno == null) {
            uno = new JLabel("ÜRÜN NO");
        }
        return uno;
    }

    public JLabel getNo() {

        if (no == null) {
            no = new JLabel();
        }
        return no;
    }

    public JLabel getKg() {
        if (kg == null) {
            kg = new JLabel("KİLO");
        }
        return kg;
    }

    public JTextField getKilo() {
        if (kilo == null) {
            kilo = new JTextField();
            KeyList kl = new KeyList();
            kl.tb = this;
            kilo.addKeyListener(kl);
        }
        return kilo;
    }

    public JLabel getFiyat() {
        if (fiyat == null) {
            fiyat = new JLabel("ÜCRET");
        }
        return fiyat;
    }

    public JLabel getucret() {
        if (ucret == null) {
            ucret = new JLabel("0");
        }
        return ucret;
    }

    public JLabel gettucretb() {
        if (tucretb == null) {
            tucretb = new JLabel(" Toplam ÜCRET");
        }
        return tucretb;
    }

    public JLabel gettucret() {
        if (tucret == null) {
            tucret = new JLabel("0");
        }
        return tucret;
    }

    public JLabel gettoplamkazancb() {
        if (topkazb == null) {
            topkazb = new JLabel("KASA :");
        }
        return topkazb;
    }

    public JLabel gettoplamkazanc() {
        if (topkaz == null) {
            topkaz = new JLabel("0");
        }
        return topkaz;
    }

    public JTextField getnoekle() {

        if (noekle == null) {
            noekle = new JTextField();
            KeyList kl = new KeyList();
            kl.tb = this;
            noekle.addKeyListener(kl);
        }
        return noekle;
    }

    public JTextField getisimekle() {

        if (adekle == null) {
            adekle = new JTextField();
        }
        return adekle;
    }

    public JTextField getstokekle() {

        if (stekle == null) {
            stekle = new JTextField();
            KeyList kl = new KeyList();
            kl.tb = this;
            stekle.addKeyListener(kl);

        }
        return stekle;
    }

    public JTextField getfiyatekle() {

        if (fiekle == null) {
            fiekle = new JTextField();
            KeyList kl = new KeyList();
            kl.tb = this;
            fiekle.addKeyListener(kl);
        }
        return fiekle;
    }

    public Button getekleme() {
        if (ekleme == null) {
            ekleme = new Button();
            ekleme.setText("Ürün Ekle");
            ekleme.addActionListener(getA());
        }
        return ekleme;
    }

    @Override
    protected void paintComponent(Graphics g) {//arkaplan gömme işlemi

        super.paintComponent(g);
        int baslangicx = 0;
        int baslangicy = 0;
        int bitisx = 1366;
        int bitisy = 768;
        g.drawImage(arkaresim, baslangicx, baslangicy, bitisx, bitisy, null);

    }

    public void paint(Graphics g) { //konumlandırma şekerleri
        super.paint(g);
        getBir().setBounds(25, 165, 70, 70);
        getText().setBounds(30, 245, 100, 20);
        getText01().setBounds(30, 260, 100, 20);
        getText02().setBounds(30, 275, 100, 20);

        getİki().setBounds(170, 165, 70, 70);
        getText1().setBounds(170, 245, 100, 20);
        getText11().setBounds(170, 260, 100, 20);
        getText12().setBounds(170, 275, 100, 20);

        getUc().setBounds(290, 165, 70, 70);
        getText2().setBounds(290, 245, 100, 20);
        getText21().setBounds(290, 260, 100, 20);
        getText22().setBounds(290, 275, 100, 20);

        getDort().setBounds(420, 168, 70, 70);
        getText3().setBounds(420, 245, 100, 20);
        getText31().setBounds(420, 260, 100, 20);
        getText32().setBounds(420, 275, 100, 20);

        getBes().setBounds(40, 345, 70, 70);
        getText4().setBounds(45, 425, 100, 20);
        getText41().setBounds(45, 440, 100, 20);
        getText42().setBounds(45, 455, 100, 20);

        getAlti().setBounds(185, 345, 70, 70);
        getText5().setBounds(190, 425, 100, 20);
        getText51().setBounds(190, 440, 100, 20);
        getText52().setBounds(190, 455, 100, 20);

        getYedi().setBounds(323, 350, 70, 70);
        getText6().setBounds(330, 425, 100, 20);
        getText61().setBounds(330, 440, 100, 20);
        getText62().setBounds(330, 455, 100, 20);

        getSekiz().setBounds(463, 350, 70, 70);
        getText7().setBounds(465, 425, 100, 20);
        getText71().setBounds(465, 440, 100, 20);
        getText72().setBounds(465, 455, 100, 20);

        getUno().setBounds(910, 300, 100, 30);
        getKg().setBounds(910, 330, 100, 30);
        getFiyat().setBounds(910, 360, 100, 30);
        getBaslik().setBounds(975, 260, 100, 30);

        getNo().setBounds(980, 300, 100, 30);
        getKilo().setBounds(980, 330, 100, 30);
        getucret().setBounds(980, 360, 100, 30);
        gettucretb().setBounds(1030, 450, 100, 30);
        gettucret().setBounds(1130, 450, 100, 30);
        getFguncelle().setBounds(885, 410, 100, 30);
        getOnay().setBounds(1035, 410, 100, 30);
        getodeme().setBounds(885, 460, 100, 30);

        getnoekle().setBounds(200, 635, 100, 30);
        getisimekle().setBounds(400, 635, 100, 30);
        getstokekle().setBounds(600, 635, 100, 30);
        getfiyatekle().setBounds(800, 635, 100, 30);
        getekleme().setBounds(1000, 625, 120, 40);

        getTextek1().setBounds(150, 635, 100, 20);
        getTextek2().setBounds(350, 635, 100, 20);
        getTextek3().setBounds(550, 635, 100, 20);
        getTextek4().setBounds(740, 635, 100, 20);

        gettoplamkazancb().setBounds(900, 145, 100, 20);
        gettoplamkazanc().setBounds(950, 145, 100, 20);

    }

  

    public Actions getA() {
        if (a == null) {
            a = new Actions(this);
        }
        return a;
    }

    public void setA(Actions a) {

        this.a = a;
    }

}
