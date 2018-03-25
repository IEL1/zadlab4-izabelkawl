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
public final class Stozek implements Przestrzenna{
    private double r;
    private double l;
    private final double pi=Math.PI;

    public Stozek(double r, double l) {
        setR(r);
        setL(l);
    }

    public double setR(double r) {
        if(r>0) return this.r = r;
        else return this.r=0;
    }
    public double setL(double l) {
        if(l>0) return this.l = l;
        else return this.l=0;
    }
    public double getR() {
        return r;
    }
    public double getL() {
        return l;
    }

    @Override
    public double pole() {
        return pi*r*(r+l);
    }

    @Override
    public double obj() {
        return (pi*r*r*(Math.sqrt((l*l)-(r*r))))/3;
    }

    @Override
    public void wyswietlDane() {
        System.out.println("Rodzaj figury: Przestrzenna");
        System.out.println("Figura: Stozek");
        System.out.println("Wymiary: r="+r+" l= "+l);
        System.out.println("Objetosc: "+obj());
        System.out.println("Pole: "+pole());
    }
}
