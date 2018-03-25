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
public final class Prostopadloscian implements Przestrzenna {
    private double a;
    private double b;
    private double c;

    public Prostopadloscian(double a, double b, double c) {

        setA(a);
        setB(b);
        setC(c);
    }

    public double setA(double a) {
        if(a>0) return this.a = a;
        else return this.a = 0;
    }

    public double setB(double b) {
        if(b>0) return this.b = b;
        else return this.b = 0;
    }

    public double setC(double c) {
        if(c>0) return this.c = c;
        else return this.c = 0;
    }

    public double getC() {

        return c;
    }

    public double getB() {

        return b;
    }

    public double getA() {

        return a;
    }

    @Override
    public double pole() {
        return 2*(a*b+a*c+b*c);
    }

    @Override
    public double obj() {
        return a*b*c;
    }

    @Override
    public void wyswietlDane() {
        System.out.println("Rodzaj figury: Prestrzenna");
        System.out.println("Figura: Prostopadloscian");
        System.out.println("Dlugosc boku: a=" + a+" b="+b+" c="+c);
        System.out.println("Obowd: " + obj());
        System.out.println("Pole: " + pole());
    }
}