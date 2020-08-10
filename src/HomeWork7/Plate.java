package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
//        food += food;
        return food;
    }

    public void decreaseFood(int amount) {
        food -= amount;
    }

    public void increaseFood(int add){
        food += add;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
