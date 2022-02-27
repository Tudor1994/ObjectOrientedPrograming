package ro.itschool.Incapsulare;

public class Main {

    public static void main(String[] args) {
        // Un obiect calculator cu 4 procesoare 4Gb ram si 256 Gb HDD

        PC pculMeu = new PC();

        pculMeu.setMemorieRam(4);
        pculMeu.setCapacitateHDD(256);
        pculMeu.setNumarProcesoare(4);

        int ramPC = pculMeu.getMemorieRam();
        System.out.println("Pcul meu are:" + ramPC);

    }
}
