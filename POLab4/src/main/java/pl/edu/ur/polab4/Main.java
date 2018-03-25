package pl.edu.ur.polab4;

import java.util.Scanner;
import pl.edu.ur.polab4.obliczanieFigur.*;
import pl.edu.ur.polab4.wprowadzDane.Menu;

public class Main {

    /**
     * @author Izabela
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x;
        Scanner s = new Scanner(System.in);
        //zadanie 4 i 5
        System.out.println("Wybierz zadanie");
        System.out.print("zad4 - wciśnij 4\nzad5 - wciśnij 5\nKoniec działania programu - wciśnij 6");
        System.out.println();
        x = s.nextInt();
        switch (x) {
            case 4:
                Figury.figury();
                break;
            case 5:
                Menu.sMenu();
                break;
            case 6:
                System.out.println("Koniec");
                break;
            default:
                System.err.println("Błędna liczba");
                break;
        }
    }
}
