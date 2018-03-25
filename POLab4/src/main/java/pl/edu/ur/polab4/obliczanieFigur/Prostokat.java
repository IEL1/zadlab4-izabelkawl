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
public class Prostokat implements Plaska {
    private double a;
    private double b;


    public Prostokat(double a, double b) {
        this.setA(a);
        this.setB(b);
    }

    public double getA() {
        return a;
    }
    public double getB()
    {
        return b;
    }

    private void setA(double a) {
        if (a > 0) this.a = a;
        else this.a = 0;
    }
    private void setB(double b) {
        if (b > 0) this.b = b;
        else this.b = 0;
    }

    public double pole() {
        return a*b;
    }

    @Override
    public double obw() {
        return (2*a)+(2*b);
    }

    /**
     *
     */
    @Override
    public void wyswietlDane() {
        System.out.println("Rodzaj figury: Plaska");
        System.out.println("Figura: Prostokat");
        System.out.println("Dlugosc boku: a=" + a+" b="+b);
        System.out.println("Obowd: " + obw());
        System.out.println("Pole: " + pole());
    }

}