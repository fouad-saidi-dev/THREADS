package com.fouadev.execrice2;

public class Sommeur implements Runnable{

    private int[] tab ;

    @Override
    public void run() {

    }

    public Sommeur(int[] tab) {
        this.tab=tab;
    }

    public void getSomme(){
        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            sum+=tab[i];
        }
        System.out.println("La somme est: "+sum);
    }
}
