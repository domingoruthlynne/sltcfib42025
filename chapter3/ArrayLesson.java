package chapter3;
import java.util.*;  // import whole package including Arrays
import java.util.Arrays; //import just arrays


public class ArrayLesson {
    public static void main(String[] args) {
        int [] i = new int[3]; //or
        int[] numbers2 = new int[]{1,54,75}; //or
        int[] numbers3 = {1,54,75}; //alin sa tatlo pwedeng array

        Student[] batch2 = {new Student(), new Student(), new Student()};

        for(int j = 0; j < numbers3.length; j++){
            System.out.println(numbers3[j]);
        }

        //sort
        int[] numbers4 = {1,54,57,5,76,34,7,3,8,10,34};
        Arrays.sort(numbers4);
        for(int number4: numbers4)
            System.out.print(number4+", ");
        System.out.println();

        String[] numbersString = {"1","54","57","5","76","34","7","3","8","10","34"};
        Arrays.sort(numbersString);
        for(String number5: numbersString)
            System.out.print(number5+", ");
        System.out.println();

        
    }
}

class Student {
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;


}