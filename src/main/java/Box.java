import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits;

    public Box(T... fruits){
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void addFruits(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    private void addFruits(ArrayList<T> fruits){
        this.fruits.addAll(fruits);
    }
    
    public float getWeight(){
        if (fruits.size() == 0){
            return 0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public void clearBox(){
        fruits.clear();
    }

    public boolean compare(Box<?> anotherBox){
        return getWeight() == anotherBox.getWeight();
    }

    public void transferTo(Box<T> anotherBox){
        anotherBox.addFruits(getFruits());
        clearBox();
    }
}
