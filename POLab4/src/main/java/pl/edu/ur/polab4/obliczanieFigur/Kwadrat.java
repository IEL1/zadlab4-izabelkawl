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
public class Kwadrat implements Plaska {

    private double a;


    public Kwadrat(double a) {
        this.setA(a);
    }

    public double getA() {
        return a;
    }

    private void setA(double a) {
        if (a > 0) this.a = a;
        else this.a = 0;
    }

    @Override
    public double pole() {
        return a*a;
    }

    @Override
    public double obw() {
        return a*4;
    }

    @Override
    public void wyswietlDane() {
        System.out.println("Rodzaj figury: Plaska");
        System.out.println("Figura: Kwadrat");
        System.out.println("Dlugosc boku: " + a);
        System.out.println("Obowd: " + obw());
        System.out.println("Pole: " + pole());
    }
}