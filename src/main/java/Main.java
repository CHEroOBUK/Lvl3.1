import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String[] strArray = {"apple", "banana", "potato", "orange", "carrot"};
        System.out.println(Arrays.toString(strArray));
        switchWith(strArray, 1,3);
        ArrayList<Object> strArrayList= new ArrayList<Object>(buildToArrayList(strArray));
        System.out.println(Arrays.toString(strArray));
        printCollection(strArrayList);

        Integer[] intArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(intArray));
        switchWith(intArray, 3,1);
        ArrayList<Object> intArrayList= new ArrayList<Object>(buildToArrayList(intArray));
        System.out.println(Arrays.toString(intArray));
        printCollection(intArrayList);

        Double[] dblArray = {1.2,2.3,3.4,4.5,5.6};
        System.out.println(Arrays.toString(dblArray));
        switchWith(dblArray, 0,4);
        ArrayList<Object> dblArrayList= new ArrayList<Object>(buildToArrayList(dblArray));
        System.out.println(Arrays.toString(dblArray));
        printCollection(dblArrayList);

        Apple[] apples = new Apple[]{new Apple(), new Apple(), new Apple(), new Apple(), new Apple()};
        Box<Apple> boxApples1 = new Box<Apple>(apples);
        Orange[] oranges = new Orange[]{new Orange(), new Orange(), new Orange(), new Orange()};
        Box<Orange> boxOranges1 = new Box<Orange>(oranges);

        System.out.println("Вес коробки с яблоками: " + boxApples1.getWeight());
        System.out.println("Вес коробки с апельсинами: " + boxOranges1.getWeight());
        boxApples1.addFruits(new Apple());
        System.out.println("Вес коробки с яблоками после добавления: " + boxApples1.getWeight());
        System.out.println(boxApples1.compare(boxOranges1));

        Box<Orange> boxOranges2 = new Box<Orange>(new Orange(), new Orange());
        System.out.println("Вес второй коробки с апельсинами: " + boxOranges2.getWeight());
        boxOranges2.transferTo(boxOranges1);
        System.out.println("Вес первой коробки с апельсинами после пересыпания: " + boxOranges1.getWeight());
        System.out.println("Вес второй коробки с апельсинами после пересыпания: " + boxOranges2.getWeight());

    }

    public static void switchWith(Object[] array, int firstPos, int secondPos){
        Object temp = array[secondPos];
        array[secondPos] = array[firstPos];
        array[firstPos] = temp;
    }

    public static ArrayList<?> buildToArrayList(Object[] array){
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Collections.addAll(arrayList, array);
        return arrayList;
    }

    public static void printCollection (ArrayList<?> array){
        System.out.print("Печать коллекции:\t");
        for (Object o : array) {
            System.out.print(o + "\t");
        }
        System.out.println();
    }

}
