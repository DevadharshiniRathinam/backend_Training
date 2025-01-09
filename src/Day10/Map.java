package Day10;

import java.util.LinkedHashMap;
/*
Map:
Create a program that uses a Map to store and manage student names and their corresponding grades. Implement the following features:
Add a student's name and grade to the map.
Update a student's grade if the student already exists in the map.
Retrieve a student's grade by their name.
Display all students and their grades.
Input Example:
Add: {"Alice": 85, "Bob": 90, "Charlie": 88}
Update: {"Bob": 92}
Retrieve: "Alice"


Output Example:
Alice's grade: 85
All students and grades:
Alice: 85
Bob: 92
Charlie: 88

 */
import java.util.Scanner;

public class Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();

        while(true)
        {
           String input=sc.nextLine();
            if(input.equals("end"))
            {
                break;
            }

            int value=sc.nextInt();
            sc.nextLine();
                map.put(input,value);

        }
        System.out.println("enter update value:");
        String updatestr=sc.nextLine();
        int update=sc.nextInt();
        map.put(updatestr,update);
        System.out.println("enter Retrieve data:");
        String retrievestr=sc.nextLine();
        System.out.println(retrievestr+"'s grade:"+ map.get(retrievestr));
        System.out.println("All student data:");
        System.out.println(map);

    }
}
