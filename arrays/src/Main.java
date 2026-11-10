import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        String[] fruits ={"apple", "orange", "banana", "coconut"};

//        fruits[1] = "pinapple";
//        int numOfFruits = fruits.length;

//        for(int i = 0; i < fruits.length; i++){
//            System.out.println(fruits[i]);
//        }

//        Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }
}