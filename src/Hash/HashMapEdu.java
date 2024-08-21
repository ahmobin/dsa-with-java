package Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEdu {
    public static void main(String[] args) {
        // roll (key), student name (value)
        HashMap<Integer, String> students = new HashMap<>();

        // Inserting
        students.put(101,"John");
        students.put(102,"Joe");
        students.put(103,"Doe");
        students.put(104,"John");
        students.put(105,"Ole");
        students.put(106,"Marius");

        System.out.println(students);

        students.put(101,"Smith"); // this will update 101 roll numbers student name with Smith

        System.out.println(students);


        // Searching
        // checking key is existing or not in the map
        if(students.containsKey(101)){
            System.out.println("Key found in map");
        }else{
            System.out.println("Key not found in map");
        }

        // fetch value by key
        System.out.println(students.get(102));

        // iterating
        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " -> " + student.getValue());
        }

        Set<Integer> keys = students.keySet();
        for (Integer key : keys){
            System.out.println(key + " -> " + students.get(key));
        }


        // Removing
        students.remove(104);
        if(students.containsKey(104)){
            System.out.println("Key found in map");
        }else{
            System.out.println("Key not found in map");
        }
    }
}
