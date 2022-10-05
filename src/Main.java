import javax.swing.*;

public class Main {

    public static JFrame fr = new JFrame("Quiz");
    public static Otazka[] otazky = new Otazka[10];
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
        
    }
}