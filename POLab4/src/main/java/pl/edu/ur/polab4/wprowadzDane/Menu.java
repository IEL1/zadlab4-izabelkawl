/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 * @author Izabela
 */
import pl.edu.ur.polab4.Main;
import java.util.Scanner;

public class Menu {

    public static void sMenu() {
        int w;
        Studenci stud = new Studenci();
        stud.tabadd();
        Scanner s = new Scanner(System.in);
        System.out.println("Wybierz operację");
        do {
            System.out.println("1.Dodaj\n2.Edytuj\n3.Usun\n4.Wyswietl\n5.Wyswietl wszystkich"
                    + "\n6.Wyswietl zakres\n7.Koniec Zadania");
            w = s.nextInt();
            switch (w) {
                case 1:
                    stud.addStud();
                    break;
                case 2:
                    stud.editStud();
                    break;
                case 3:
                    stud.delete();
                    break;
                case 4:
                    stud.showStud();
                    break;
                case 5:
                    stud.showall();
                    break;
                case 6:
                    stud.zakres();
                    break;
                case 7:
                    Main.main(new String[0]);
                    break;
                default:
                    break;
            }
        } while (w != 7);
    }
}
