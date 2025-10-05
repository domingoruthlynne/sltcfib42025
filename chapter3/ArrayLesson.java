package chapter3;

public class ArrayLesson {
    public static void main(String[] args) {
        int[] i = new int[3]; //or
        int [] numbers2 = new int[]{1,54,75}; //or
        int [] numbers3 = {1,54,75}; //alin sa tatlo pwedeng array

        Student[] batch2 = {new Student(), new Student(), new Student()};

    }
}

class Student {
    String fullname;
    int age;
    String address;
    String course;
    int yearLevel;


}