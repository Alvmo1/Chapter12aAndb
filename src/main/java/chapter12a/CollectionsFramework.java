package chapter12a;
import java.util.*;
import java.util.Stack;
import java.util.stream.StreamSupport;

public class CollectionsFramework {
    public static void main(String[] args) {
        List fruit1 = new ArrayList();
        fruit1.add("Apple");
        fruit1.add("Lemon");
        fruit1.add("Banana");
        fruit1.add("Orange");
        fruit1.add("Lemon");
        System.out.println(fruit1.get(2)); //Banana
        System.out.println(fruit1.size()); //5
        System.out.println(fruit1); //Prints all fruits
        System.out.println("=============");

        Queue fruit2 = new LinkedList();
        fruit2.add("Apple");
        fruit2.add("Lemon");
        fruit2.add("Banana");
        fruit2.add("Orange");
        fruit2.add("Lemon");
        fruit2.remove("Apple");
        System.out.println(fruit2);
        System.out.println(fruit2.peek());
        System.out.println("=============");

        Map fruitCalories = new HashMap<>();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("Lemon", 20);
        fruitCalories.put("Banana", 105);
        fruitCalories.put("Orange", 45);
        fruitCalories.put("Lemon", 17);
        System.out.println(fruitCalories.size()); //4
        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("Lemon"));
        System.out.println(fruitCalories.entrySet());
        fruitCalories.remove("Orange");
        System.out.println(fruitCalories);
    }
}
