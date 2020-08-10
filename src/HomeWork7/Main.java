package HomeWork7;


import javax.swing.text.AttributeSet;

public class Main {

    public static void main(String[] args) {

//        Cat cat = new Cat("Belyash", 15, 30);
//        Plate plate = new Plate(70);
//
//        cat.eating(plate);
//        System.out.println(plate);


        Cat[] cats = {
                new Cat ("Murzik", 5, 15),
                new Cat("Pushok", 4, 12),
                new Cat("Ryzik", 3, 12),
        };
        Plate plate = new Plate(10);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eating(plate);

        }
    }
}
