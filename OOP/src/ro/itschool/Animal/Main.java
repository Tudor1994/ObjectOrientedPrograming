package ro.itschool.Animal;

public class Main {
    public static void main(String[] args) {
        Animal pisicileMele = new Animal("Alba", "Birmaneza", 10);
        Animal[] pisica = new Animal[5];
        for (int i = 0; i < 5 ; i++){
           pisica[i] = new Animal("Pisica cu culoarea" + i, "Rasa:" + i , i);
        }
    }
}
