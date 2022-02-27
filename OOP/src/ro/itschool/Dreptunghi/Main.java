package ro.itschool.Dreptunghi;

public class Main {

    public static void main(String[] args) {

        Dreptunghi dreptunghiulMeu = new Dreptunghi();
        System.out.println("Dreptunghiul meu are lungimea: " + dreptunghiulMeu.getLungime() + " si latimea: " + dreptunghiulMeu.getLatime());


        Dreptunghi dreptunghiSetat = new Dreptunghi( 4, 3);
        System.out.println("Dreptunghiule meu are lungimea: " + dreptunghiSetat.getLungime() + " si latimea " + dreptunghiSetat.getLatime());

        dreptunghiSetat.setLatime(5);
        dreptunghiSetat.setLungime(7);

        double lungimeDreptunghi = dreptunghiSetat.getLungime();
        System.out.println("Lungimea dreptunghiului este: " + lungimeDreptunghi);
        double latimeDreptunghi = dreptunghiSetat.getLatime();
        System.out.println("Latmea dreptunghiului este: " + latimeDreptunghi);
    }

}

