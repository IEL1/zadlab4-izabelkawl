/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Izabela
 */
public class Studenci {

    Student st[] = new Student[100];

    public void tabadd() {
        for (int i = 0; i < st.length; i++) {
            st[i] = new Student(" ", " ", i, " ", 0, false);
        }
    }

    //dodanie studenta
    public void addStud() {
        Scanner s = new Scanner(System.in);
        int id;
        System.out.println("Podaj numer indeksu(0-99): ");
        id = s.nextInt();
        st[id].setNr_indeksu(id);
        if (st[id].isExists() != true) {
            System.out.println("Wprowadzanie studenta o indeksie: " + st[id].getNr_indeksu());
            System.out.print("Podaj imie: ");
            st[id].setImie(s.next());
            System.out.print("Podaj Nazwisko: ");
            st[id].setNazwisko(s.next());
            System.out.print("Nazwa specjalnosci: ");
            st[id].setNazwa_specjalnosci(s.next());
            System.out.print("Rok Stduiow: ");
            st[id].setRok_studiow(s.nextInt());
            st[id].setExists(true);
        } else {
            System.out.println("Podany indeks zawiera dane!");
        }
    }

    //edycja studenta
    public void editStud() {
        Scanner s = new Scanner(System.in);
        int id;
        System.out.println("Podaj numer indeksu(0-99): ");
        id = s.nextInt();
        if (st[id].isExists() != false) {
            System.out.println("Imie: " + st[id].getImie());
            System.out.print(" Imie: ");
            st[id].setImie(s.next());
            System.out.println(" Aktualne nazwisko: " + st[id].getNazwisko());
            System.out.print(" Nazwisko: ");
            st[id].setNazwisko(s.next());
            System.out.println(" Aktualna nazwa specjalnosci: " + st[id].getNazwa_specjalnosci());
            System.out.print(" Nazwa specjalnosci: ");
            st[id].setNazwa_specjalnosci(s.next());
            System.out.println(" Aktualny rok studiow: " + st[id].getRok_studiow());
            System.out.print(" Rok studiow: ");
            st[id].setRok_studiow(s.nextInt());
        } else {
            System.out.println("Pusty rekord");
        }

    }

    //wyświetlenie studenta
    public void showStud() {
        Scanner s = new Scanner(System.in);
        int id;
        System.out.println("Podaj numer indeksu(0-99): ");
        id = s.nextInt();
        st[id].pokazDane();
    }

    //usunięcie studenta
    public void delete() {
        Scanner s = new Scanner(System.in);
        int id;
        System.out.println("Podaj numer indeksu od0 do99: ");
        id = s.nextInt();
        st[id].setImie("");
        st[id].setNazwisko("");
        st[id].setNazwa_specjalnosci("");
        st[id].setRok_studiow(id);
        st[id].setExists(false);
        System.out.println("Student zostal usuniety!");
    }

    //wyświetlenie zakresu
    public void zakres() {
        int start, stop;
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj poczatkowy indeks tablicy(0-99): ");
        start = s.nextInt();
        System.out.println("Podaj koncowy indeks tablicy: ");
        stop = s.nextInt();

        for (int i = start; i < stop; i++) {
            st[i].pokazDane();
        }
    }

    //wyświetlenie wszystkich studentów
    public void showall() {
        for (int i = 0; i < 100; i++) {
            st[i].pokazDane();
        }
    }
}
