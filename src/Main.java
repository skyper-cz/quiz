import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main {

    public static JFrame fr = new JFrame("Quiz");
    public static Otazka[] otazky = new Otazka[10];

    public static JLabel otazka = new JLabel();
    public static JLabel bodovac = new JLabel("Body: 0");

    public static JLabel gratulace = new JLabel("Gratuluji");
    public static JLabel vysledek = new JLabel("Získal jste: ");

    public static JButton prva = new JButton();
    public static JButton druha = new JButton();
    public static JButton treti = new JButton();
    public static JButton ctvrta = new JButton();

    public static int kolikata = 0;
    public static int body = 0;

    public static String[] otazicky = new String[]{"Kdo koupil niHao?", "Kdo nás opustil v roce 2021?",
            "Která značka chytrých mobilních telefonů jako první představila sateletní komunikaci?",
            "Jak se jmenuje vozídko podle něhož Láďa a Zdeněk staví své?",
            "Které letectvo sundavalo led z letadel pomocí kladiv?",
            "Odkud je televize naší třídy?", "Jakou barvu vlasů měl Vítek na začátku Druháku?",
            "Jakého tanku bylo vyrobeno nejvíce?", "Kolik Linux zařízení máme ve třídě?",
            "Jaký je nejlepší tank AČR?"};
    public static String[] odpovede1 = new String[]{"Karel", "Barrack Obama", "Huawei", "Josif", "USAF", "Ze Znojma", "Růžovou", "T-72", "1", "T-72 Scarab"};
    public static String[] odpovede2 = new String[]{"Vítek", "Karel Gott", "Apple", "Zeman", "SSRAF", "Z Číny", "Modrou", "T-34", "3", "T-72M4CZ"};
    public static String[] odpovede3 = new String[]{"Mikuláš", "Gorbačov", "Samsung", "Miloš", "RAF", "Z Japonska", "Červenou", "T-54/55", "4", "T-72M5"};
    public static String[] odpovede4 = new String[]{"Mikoláš", "Fabián", "Motorola", "Rommel", "ČSLL", "Z Polska", "Oranžovou", "M4 Sherman", "5", "T-90"};
    public static String[] spravnaOdpoved = new String[]{"Vítek", "Fabián", "Huawei", "Miloš", "SSRAF", "Z Polska", "Červenou", "T-54/55", "5", "T-72M4CZ"};
    public static void main(String[] args) {
        for (int i = 0; i < otazky.length; i++){
            Otazka vlozit = new Otazka();
            vlozit.setQuestion(otazicky[i]);
            vlozit.setMoznost1(odpovede1[i]);
            vlozit.setMoznost2(odpovede2[i]);
            vlozit.setMoznost3(odpovede3[i]);
            vlozit.setMoznost4(odpovede4[i]);
            vlozit.setSpravnaOdpoved(spravnaOdpoved[i]);
            otazky[i] = vlozit;
        }

        randomizer();

        fr.setBounds(200,100,1010,650);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setLayout(null);
        fr.getContentPane().setBackground(Color.gray);
        fr.setVisible(true);
        fr.setResizable(false);

        prva.setBounds(10, 460, 490, 75);
        prva.setVisible(true);
        prva.addActionListener(Main::Prvy);
        fr.add(prva);
        druha.setBounds(510, 460, 490, 75);
        druha.setVisible(true);
        druha.addActionListener(Main::Druhy);
        fr.add(druha);
        treti.setBounds(10, 545, 490, 75);
        treti.setVisible(true);
        treti.addActionListener(Main::Tretii);
        fr.add(treti);
        ctvrta.setBounds(510, 545, 490, 75);
        ctvrta.setVisible(true);
        ctvrta.addActionListener(Main::Ctvrty);
        fr.add(ctvrta);

        otazka.setBounds(50, -50, 970, 200);
        otazka.setFont(new Font("Verdana", Font.PLAIN, 20));
        otazka.setVisible(true);
        fr.add(otazka);

        bodovac.setBounds(840, 280, 400, 200);
        bodovac.setFont(new Font("Verdana", Font.PLAIN, 30));
        bodovac.setVisible(true);
        fr.add(bodovac);

        gratulace.setBounds(50, 0, 900, 200);
        gratulace.setFont(new Font("Verdana", Font.PLAIN, 30));
        gratulace.setVisible(false);
        fr.add(gratulace);

        vysledek.setBounds(50, 0, 900, 200);
        vysledek.setFont(new Font("Verdana", Font.PLAIN, 30));
        vysledek.setVisible(false);
        fr.add(vysledek);

        fr.update(fr.getGraphics());
    }

    public static void randomizer(){
        Random random = new Random();
        boolean dokola = true;
        int[] zvolene = new int[]{5,5,5,5};
        int kolik = 0;
        while (dokola){
            if (kolik < 4){
                if (kolik == 0){
                    int zvolen = random.nextInt(4);
                    boolean nachaziSe = false;
                    for (int j : zvolene) {
                        if (j == zvolen) {
                            nachaziSe = true;
                            break;
                        }
                    }

                    if (!nachaziSe){
                        zvolene[0] = zvolen;
                        kolik++;
                    }
                }
                else if (kolik == 1) {
                    int zvolen = random.nextInt(4);
                    boolean nachaziSe = false;
                    for (int j : zvolene) {
                        if (j == zvolen) {
                            nachaziSe = true;
                            break;
                        }
                    }

                    if (!nachaziSe){
                        zvolene[1] = zvolen;
                        kolik++;
                    }
                }
                else if (kolik == 2) {
                    int zvolen = random.nextInt(4);
                    boolean nachaziSe = false;
                    for (int j : zvolene) {
                        if (j == zvolen) {
                            nachaziSe = true;
                            break;
                        }
                    }

                    if (!nachaziSe){
                        zvolene[2] = zvolen;
                        kolik++;
                    }
                }
                else if (kolik == 3) {
                    int zvolen = random.nextInt(4);
                    boolean nachaziSe = false;
                    for (int j : zvolene) {
                        if (j == zvolen) {
                            nachaziSe = true;
                            break;
                        }
                    }

                    if (!nachaziSe){
                        zvolene[3] = zvolen;
                        kolik++;
                    }
                }
            }
            else {
               dokola = false;
            }
        }
        for (int i = 0; i < 4; i++){
            if (i == 0){
                if (zvolene[i] == 0){
                    prva = new JButton(otazky[kolikata].moznost1);
                }
                else if(zvolene[i] == 1){
                    prva = new JButton(otazky[kolikata].moznost2);
                }
                else if(zvolene[i] == 2){
                    prva = new JButton(otazky[kolikata].moznost3);
                }
                else if(zvolene[i] == 3){
                    prva = new JButton(otazky[kolikata].moznost4);
                }
                prva.setVisible(true);
                fr.add(prva);
            }

            else if (i == 1){
                if (zvolene[i] == 0){
                    druha = new JButton(otazky[kolikata].moznost1);
                }
                else if(zvolene[i] == 1){
                    druha = new JButton(otazky[kolikata].moznost2);
                }
                else if(zvolene[i] == 2){
                    druha = new JButton(otazky[kolikata].moznost3);
                }
                else if(zvolene[i] == 3){
                    druha = new JButton(otazky[kolikata].moznost4);
                }
                druha.setVisible(true);
                fr.add(druha);
            }

            else if (i == 2){
                if (zvolene[i] == 0){
                    treti = new JButton(otazky[kolikata].moznost1);
                }
                else if(zvolene[i] == 1){
                    treti = new JButton(otazky[kolikata].moznost2);
                }
                else if(zvolene[i] == 2){
                    treti = new JButton(otazky[kolikata].moznost3);
                }
                else if(zvolene[i] == 3){
                    treti = new JButton(otazky[kolikata].moznost4);
                }
                treti.setVisible(true);
                fr.add(treti);
            }

            else if (i == 3){
                if (zvolene[i] == 0){
                    ctvrta = new JButton(otazky[kolikata].moznost1);
                }
                else if(zvolene[i] == 1){
                    ctvrta = new JButton(otazky[kolikata].moznost2);
                }
                else if(zvolene[i] == 2){
                    ctvrta = new JButton(otazky[kolikata].moznost3);
                }
                else if(zvolene[i] == 3){
                    ctvrta = new JButton(otazky[kolikata].moznost4);
                }
                ctvrta.setVisible(true);
                fr.add(ctvrta);
            }

        }
        otazka = new JLabel(otazky[kolikata].question);
        fr.add(otazka);
        fr.update(fr.getGraphics());
    }

    public static void Prvy(ActionEvent e){
        if (kolikata == 9) {
            if (prva.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            prva.setEnabled(false);
            druha.setEnabled(false);
            treti.setEnabled(false);
            ctvrta.setEnabled(false);

            bodovac.setVisible(false);
            prva.setVisible(false);
            druha.setVisible(false);
            treti.setVisible(false);
            ctvrta.setVisible(false);
            otazka.setVisible(false);

            gratulace.setVisible(true);
            vysledek = new JLabel("Získal jste: " + body);
            vysledek.setVisible(true);

            fr.add(gratulace);
            fr.add(vysledek);

            fr.update(fr.getGraphics());
        }
        else {
            if (prva.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            bodovac = new JLabel("Body: " + body);
            bodovac.setVisible(true);
            fr.add(bodovac);
            fr.update(fr.getGraphics());
            kolikata++;
            randomizer();
        }
        System.out.println(body);
    }
    public static void Druhy(ActionEvent e){
        if (kolikata == 9) {
            if (druha.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            prva.setEnabled(false);
            druha.setEnabled(false);
            treti.setEnabled(false);
            ctvrta.setEnabled(false);

            bodovac.setVisible(false);
            prva.setVisible(false);
            druha.setVisible(false);
            treti.setVisible(false);
            ctvrta.setVisible(false);
            otazka.setVisible(false);

            gratulace.setVisible(true);
            vysledek = new JLabel("Získal jste: " + body);
            vysledek.setVisible(true);

            fr.add(gratulace);
            fr.add(vysledek);

            fr.update(fr.getGraphics());
        }
        else {
            if (druha.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            bodovac = new JLabel("Body: " + body);
            bodovac.setVisible(true);
            fr.add(bodovac);
            fr.update(fr.getGraphics());
            kolikata++;
            randomizer();
        }
        System.out.println(body);
    }
    public static void Tretii(ActionEvent e){
        if (kolikata == 9) {
            if (treti.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            prva.setEnabled(false);
            druha.setEnabled(false);
            treti.setEnabled(false);
            ctvrta.setEnabled(false);

            bodovac.setVisible(false);
            prva.setVisible(false);
            druha.setVisible(false);
            treti.setVisible(false);
            ctvrta.setVisible(false);
            otazka.setVisible(false);

            gratulace.setVisible(true);
            vysledek = new JLabel("Získal jste: " + body);
            vysledek.setVisible(true);

            fr.add(gratulace);
            fr.add(vysledek);

            fr.update(fr.getGraphics());
        }
        else {
            if (treti.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            bodovac = new JLabel("Body: " + body);
            bodovac.setVisible(true);
            fr.add(bodovac);
            fr.update(fr.getGraphics());
            kolikata++;
            randomizer();
        }
        System.out.println(body);
    }
    public static void Ctvrty(ActionEvent e){
        if (kolikata == 9) {
            if (ctvrta.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            prva.setEnabled(false);
            druha.setEnabled(false);
            treti.setEnabled(false);
            ctvrta.setEnabled(false);

            bodovac.setVisible(false);
            prva.setVisible(false);
            druha.setVisible(false);
            treti.setVisible(false);
            ctvrta.setVisible(false);
            otazka.setVisible(false);

            gratulace.setVisible(true);
            vysledek = new JLabel("Získal jste: " + body);
            vysledek.setVisible(true);

            fr.add(gratulace);
            fr.add(vysledek);

            fr.update(fr.getGraphics());
        }
        else {
            if (ctvrta.getText().equals(otazky[kolikata].spravnaOdpoved)) {
                body++;
            } else {
                body--;
            }
            bodovac = new JLabel("Body: " + body);
            bodovac.setVisible(true);
            fr.add(bodovac);
            fr.update(fr.getGraphics());
            kolikata++;
            randomizer();
        }
        System.out.println(body);
    }
}
