package ro.itschool.Magazin;

public class Main {
    public static void main(String[] args) {

        Magazin magazinulMeu = new Magazin("Tudor's Shop");

        magazinulMeu.deschideMagazin();
        magazinulMeu.vinde();

        magazinulMeu.inchideMagazin();
        magazinulMeu.vinde();

    }
}
