package HomeWork7;

public class Cat {
    String name;
    int appetite;
    int satiety;
    int foodeat;


    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eating (Plate plate) {
        satietyCat();
        if(satiety <= plate.getFood()) {
            plate.decreaseFood(satiety);
            foodeat += appetite;
            satiety -= appetite;
            System.out.println(name + " насытился");
        } else if(satiety > plate.getFood()) {
            System.out.println(name + " не хватило еды для полного насыщения\n");
        }
        plate.increaseFood(2);
    }

    public boolean satietyCat () {
        if(appetite==foodeat){
            return true;
        } else {
            return false;
        }
    }
}
