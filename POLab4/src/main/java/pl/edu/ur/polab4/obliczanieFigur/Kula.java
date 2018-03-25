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
public class Kula implements Przestrzenna {
    private double r;
    private final double pi = Math.PI;

    public Kula(double r) {
        setR(r);
    }

    private double setR(double r)
    {
        if(r>0) return this.r = r;
        else return this.r = 0;
    }

    @Override
    public double pole() {
        return 4*pi*Math.pow(r,2);
    }

    @Override
    public double obj() {
        return (4*pi*r*r*r)/3;
    }

    /**
     *
     */
    @Override
    public void wyswietlDane()
    {
        System.out.println("Rodzaj figury: Przestrzenna");
        System.out.println("Figura: Kula");
        System.out.println("Promien: "+r);
        System.out.println("Objetosc: "+obj());
        System.out.println("Pole: "+pole());
    }

}