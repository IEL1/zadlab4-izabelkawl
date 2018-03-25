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
public class Kolo implements Plaska {
    private double r;
    private final double pi = Math.PI;

    public Kolo(double r) {
        this.setR(r);
    }

    private double setR(double r)
    {
        if(r>0) return this.r = r;
        else return this.r = 0;
    }

    @Override
    public double pole() {
        return pi*Math.pow(r,2);
    }

    @Override
    public double obw() {
        return 2*pi*r;
    }

    /**
     *
     */
    @Override
    public void wyswietlDane()
    {
        System.out.println("Rodzaj figury: Plaska");
        System.out.println("Figura: Kolo");
        System.out.println("Promien: "+r);
        System.out.println("Obowd: "+pole());
        System.out.println("Pole: "+obw());
    }

}
