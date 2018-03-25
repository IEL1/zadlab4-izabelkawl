/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Izabela
 */
public final class Szescian implements Przestrzenna {
    private double a;

    public Szescian(double a) {
        setA(a);
    }

    public double getA() {
        return a;
    }

    public double setA(double a) {
        if(a>0) return this.a = a;
        else return this.a = 0;
    }

    @Override
    public double obj() {
        return a*a*a;
    }

    @Override
    public double pole() {
        return 6*(a*a);
    }

    @Override
    public void wyswietlDane() {
        System.out.println("Rodzaj figury: Przestrzenna");
        System.out.println("Figura: Szescian");
        System.out.println("Dlugosc boku: " +a);
        System.out.println("Objetosc: "+obj());
        System.out.println("Pole: "+pole());
    }
}