package looping;

import java.util.*;

public class LoopingThruCollectionsAndMaps {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
//        mapDemo();

    }
    public static void setDemo(){
        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Lemon");
        System.out.println(fruit.size());
        System.out.println(fruit);
        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        for (String items : fruit){
            System.out.println(items);
        }

        fruit.forEach(x -> System.out.println(x));
    }
    public static void listDemo(){
        List fruit1 = new ArrayList();
        fruit1.add("Apple");
        fruit1.add("Lemon");
        fruit1.add("Banana");
        fruit1.add("Orange");
        fruit1.add("Lemon");
        System.out.println(fruit1.get(2)); //Banana
        System.out.println(fruit1.size()); //5
        System.out.println(fruit1); //Prints all fruits
    }
    public static void queueDemo(){
        Queue fruit2 = new LinkedList();
        fruit2.add("Apple");
        fruit2.add("Lemon");
        fruit2.add("Banana");
        fruit2.add("Orange");
        fruit2.add("Lemon");
        fruit2.remove("Apple");
        System.out.println(fruit2);
        System.out.println(fruit2.peek());
    }
    public static void mapDemo(){
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("Apple", 95);
        fruitCalories.put("Lemon", 20);
        fruitCalories.put("Banana", 105);
        fruitCalories.put("Orange", 45);
        fruitCalories.put("Lemon", 17);
//        System.out.println(fruitCalories.size()); //4
//        System.out.println(fruitCalories);
//        System.out.println(fruitCalories.get("Lemon"));
//        System.out.println(fruitCalories.entrySet());
//        fruitCalories.remove("Orange");
//        System.out.println(fruitCalories);
        for (var entry : fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }
        fruitCalories.forEach(
                (k,v) -> System.out.println("Fruit: " + k + ", Calories: " + v));
    }

}


