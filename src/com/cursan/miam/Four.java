package com.cursan.miam;

public class Four    {
    private int puissance;
    private int capacite;

    private Resistance resistance;
    private Soufflerie soufflerie;

    public void cuire(Aliment aliment) {
        System.out.println("Je cuis un aliment");
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        aliment.estCuit = true;
    }

    private void maintenir (){

    }

    public int getPuissance() {
        return puissance;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Soufflerie getSoufflerie() {
        return soufflerie;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
}

