package ro.itschool;

import ro.itschool.House;

public class Main {

    public static void main(String[] args) {

        House casaMea = new House("Tudor's house");
        casaMea.color = "Verde";
        casaMea.numberOfDoors = 10;

        System.out.println("Metri patrati" + casaMea.meters);


        House casaVecinului = new House("Gheorghe's house");
        casaVecinului.color = "Albastru";
        casaVecinului.numberOfDoors = 12;


        User tudor = new User("Duca", "Tudor", 28);
        User andrei = new User("Popescu", "Andrei");

        System.out.println("Varsta lui Andrei este:" + andrei.varsta);

        User anonim = new User();
        System.out.println("Nume user:" + anonim.nume + " " + anonim.prenume);

        Sticla apa = new Sticla("Dorna", "Plata", 1);
        System.out.println("Sticla este:" + apa.nume);
    }
}
