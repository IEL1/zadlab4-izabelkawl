/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;
import pl.edu.ur.polab4.Main;

import java.util.Scanner;
/**
 *
 * @author Izabela
 */
public class Figury {
    public static void figury(){

        int w2 =0 ;
        Scanner s = new Scanner(System.in);
        while (w2!=8){
            System.out.println("1.Kolo 2.Kwadrat, 3.Prostokat, 4.Szescian,"
                    + " 5.Prostopadloscian, 6.Kula, 7.Stozek, 8.Koniec Zadania");
            System.out.print("Wybierz figure: ");
            w2 = s.nextInt();

            switch (w2) {
                case 1:

                    double r;
                    System.out.println("Podaj r: ");
                    r = s.nextDouble();
                    Kolo kolo = new Kolo(r);
                    kolo.wyswietlDane();
                    break;
                case 2:

                    double a;
                    System.out.print("Podaj a: ");
                    a = s.nextDouble();
                    Kwadrat kwadrat = new Kwadrat(a);
                    kwadrat.wyswietlDane();
                    break;
                case 3:

                    double a1, b;
                    System.out.print("Podaj a: ");
                    a1 = s.nextDouble();
                    System.out.print("Podaj b: ");
                    b = s.nextDouble();
                    Prostokat prostokat = new Prostokat(a1, b);
                    prostokat.wyswietlDane();
                    break;
                case 4:
                    double a2;
                    System.out.print("Podaj a: ");
                    a2 = s.nextDouble();
                    Szescian szescian = new Szescian(a2);
                    szescian.wyswietlDane();
                    break;
                case 5:
                    double a3, b2, c;
                    System.out.print("Podaj a: ");
                    a3 = s.nextDouble();
                    System.out.print("Podaj b: ");
                    b2 = s.nextDouble();
                    System.out.print("Podaj c: ");
                    c = s.nextDouble();
                    Prostopadloscian prostopadloscian = new Prostopadloscian(a3, b2, c);
                    prostopadloscian.wyswietlDane();
                    break;
                case 6:
                    double r2;
                    System.out.println("Podaj r: ");
                    r2 = s.nextDouble();
                    Kula kula = new Kula(r2);
                    kula.wyswietlDane();
                    break;
                case 7:
                    double r3, l;
                    System.out.println("Podaj r: ");
                    r3 = s.nextDouble();
                    System.out.println("Podaj l: ");
                    l = s.nextDouble();
                    Stozek stozek = new Stozek(r3, l);
                    stozek.wyswietlDane();
                    break;
                case 8:
                    Main.main(new String[0]);
                    System.out.println("Powrot do glownego menu!");
                    break;
            }
        }
}
}