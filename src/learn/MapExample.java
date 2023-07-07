package learn;

import java.util.HashMap;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String,Integer> courses = new HashMap<>();

        //Add Elements

        courses.put("Core Java", 4000);
        courses.put("Basic python", 5000);
        courses.put("Spring", 6000);
        System.out.println(courses);
    }
}
