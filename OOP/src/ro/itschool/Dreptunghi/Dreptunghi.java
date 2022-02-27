package ro.itschool.Dreptunghi;

import java.util.Scanner;

public class Dreptunghi {

    private double lungime = 1;
    private double latime = 1;

    public Dreptunghi() {
        this.lungime = getLungime();
        this.latime = getLatime();

    }

    public Dreptunghi(double lungimeData, double latimeData) {

        lungime = lungimeData;
        latime = latimeData;


    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public double getLatime() {
        return latime;
    }

}
