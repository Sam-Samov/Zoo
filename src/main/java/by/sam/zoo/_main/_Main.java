package by.sam.zoo._main;

import by.sam.zoo.entity.Tiger;
import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        Tiger pet1 = new Tiger();
        pet1.name = "Персик";
        pet1.animalType = "Кот";
        pet1.age = 3;


        int[] testarray = new int[10];
        testarray[0] = 99999;
        int x = testarray[0];
        System.out.println(Arrays.toString(testarray));
        System.out.println(testarray[0]);
    }
}