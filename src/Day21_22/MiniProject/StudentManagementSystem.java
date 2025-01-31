package MiniProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
    int id;
    String name;
    int age;
    char grade;
    String email;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int id, String name, int age, char grade, String email )
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.email=email;
    }
    @Override
    public String toString() {
        return("ID:" + getId() + ", NAME:" + getName() + ", AGE:" + getAge() + ", GRADE:" +getGrade() + ", EMAIL:" + getEmail());
    }
    public String toCSV()
    {
        return getId() + "," + getName() + "," + getAge() + "," + getGrade() + "," + getEmail();
    }

}
public  class StudentManagementSystem
{   // store data in csv file
    private static final String FILE_PATH = "students.csv";
    public static void saveData(List<Student> studentDetails) {
        try (FileWriter writer = new FileWriter(FILE_PATH, false);
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("ID,NAME,AGE,GRADE,EMAIL\n");
            for (Student student : studentDetails) {
                bufferedWriter.write(student.toCSV() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
    //load data
    public static void loadData(List<Student> studentDetails) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            br.readLine(); // Skip header line
            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(",");
                int id = Integer.parseInt(studentData[0]);
                String name = studentData[1];
                int age = Integer.parseInt(studentData[2]);
                char grade = studentData[3].charAt(0);
                String email = studentData[4];

                Student student = new Student(id, name, age, grade, email);
                studentDetails.add(student);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        StudentManagementSystem studentManagementSystem=new StudentManagementSystem();
        Scanner s=new Scanner(System.in);
        List<Student> studentDetails=new ArrayList<Student>();
        loadData(studentDetails);
        System.out.println("\nChoose an option:");
        System.out.println("1= Add Student");
        System.out.println("2= View Students");
        System.out.println("3=Search Student by ID");
        System.out.println("4= Update Student");
        System.out.println("5= Delete Student");
        System.out.println("6= Sort by  NAME or AGE");
        System.out.println("7= Exit");
        boolean exitvalue=true;
        while(exitvalue) {
            System.out.println("\nChoose an option:");
            int value = s.nextInt();
            switch (value) {
                //Search
                case 1:
                    System.out.println("Enter the value od ID, NAME,AGE,GRADE,EMAIL:");
                    boolean id_unique=true;
                    int id1=0;
                    while(id_unique)
                    {id1 = s.nextInt();
                        int idnew=id1;
                    s.nextLine();
                    Predicate<Student> p=(val)->val.getId()==idnew;
                    boolean present=studentDetails.stream().anyMatch(p);
                    if(present)
                    {
                        System.out.println("The Id is already present.Enter the valid ID");
                    }
                    else {
                        id_unique=false;
                    }
                    }
                    String name1 = s.nextLine();
                    int age1=0;
                   boolean validAge=false;
                    while (!validAge) {
                        age1 = s.nextInt();
                        s.nextLine();
                        try {
                            if (age1 < 18 || age1 > 60) {
                                throw new IllegalArgumentException("Age must be between 18 and 60! and enter the valid age");
                            }
                            validAge = true;
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    char grade1 = s.next().charAt(0);
                    s.nextLine();
                    String emailRegex1 = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
                    boolean emailvalue = true;
                    String email1 = null;
                    while (emailvalue) {
                        email1 = s.nextLine();
                        if (email1.matches(emailRegex1)) {
                            emailvalue = false;
                        } else {
                            System.out.println(": Invalid ,enter the valid Email");
                        }
                    }
                    String emailFinal = email1;
                    Student s1 = new Student(id1, name1, age1, grade1, emailFinal);
                    studentDetails.add(s1);
                    saveData(studentDetails);
                    System.out.println("Student data saved successfully.");
                    break;
                //view
                case 2:
                    System.out.println("view all student details in order:");
                    studentDetails.stream()
                            .sorted(Comparator.comparingInt(Student::getId))
                            .forEach(student -> System.out.println("ID: " + student.getId() +
                                    ", NAME: " + student.getName() +
                                    ", AGE: " + student.getAge() +
                                    ", GRADE: " + student.getGrade() +
                                    ", EMAIL: " + student.getEmail()));

                    break;
                //Search
                case 3:
                    System.out.println("Enter the id to search:");
                    int idvalue = s.nextInt();
                    List<Student> search = studentDetails.stream().filter((id2) -> id2.getId()==(idvalue)).collect(Collectors.toList());
                    if (search.isEmpty()) {
                        System.out.println("Student not found!");
                    } else {
                        for (Student s2 : search) {
                            System.out.println("ID: " + s2.getId() + ", NAME: " + s2.getName() +
                                    ", AGE: " + s2.getAge() + ", GRADE: " + s2.getGrade() + ", EMAIL: " + s2.getEmail());
                        }
                    }
                    break;
                //Update
                case 4:
                    System.out.println("Enter the ID to update:");
                    int id_search = s.nextInt();
                    //Optional
                    Optional<Student> studentobj = studentDetails.stream().filter((id3) -> id3.getId()==(id_search)).findFirst();
                    if (studentobj.isPresent()) {
                        System.out.println("Enter the place to update NAME,AGE,GRADE,EMAIL:");
                        s.nextLine();
                        String value_update = s.nextLine();
                        Student object = studentobj.get();
                        switch (value_update) {
                            case "NAME":
                                System.out.println("Enter the name:");
                                String name2 = s.nextLine();
                                object.setName(name2);
                                System.out.println("Sccessfully updated");
                                break;
                            case "AGE":
                                System.out.println("Enter the age:");
                                int age2 = s.nextInt();
                                object.setAge(age2);
                                System.out.println("Sccessfully updated");
                                break;
                            case "GRADE":
                                System.out.println("Enter the grade:");
                                char grade2 = s.next().charAt(0);
                                object.setGrade(grade2);
                                System.out.println("Sccessfully updated");
                                break;
                            case "EMAIL":
                                System.out.println("Enter the email:");
                                String email2 = null;
                                String emailRegex = "^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$";
                                boolean emailvalue1 = true;
                                while (emailvalue1) {
                                    email2 = s.nextLine();
                                    if (email2.matches(emailRegex)) {
                                        emailvalue1 = false;
                                    } else {
                                        System.out.println(": Invalid ,enter the valid Email");
                                    }
                                }
                                saveData(studentDetails);object.setEmail(email2);
                                saveData(studentDetails);
                                System.out.println("Sccessfully updated");
                                break;

                        }
                    } else {
                        System.out.println("There is no such ID");
                    }
                    break;
                // delete
                case 5:
                    System.out.println("Enter a Id to delete:");
                    int id_delete = s.nextInt();
                    Optional<Student> object_delete = studentDetails.stream().filter((student -> student.getId()==(id_delete))).findFirst();
                    if (object_delete.isPresent()) {
                        Student objectValue = object_delete.get();
                        studentDetails.remove(objectValue);
                        saveData(studentDetails);
                        System.out.println("Successfully Delete");
                    } else {
                        System.out.println("there is no such ID");
                    }

                    break;
                // sort by name or age
                case 6:
                    System.out.println("Enter value to sort by \"NAME\" OR \"AGE\":");
                    s.nextLine();
                    String value_sort = s.nextLine().toUpperCase();

                    List<Student> sortedStudents;
                    if (value_sort.equals("NAME")) {
                        sortedStudents = studentDetails.stream()
                                .sorted(Comparator.comparing(Student::getName))
                                .collect(Collectors.toList());
                    } else if (value_sort.equals("AGE")) {
                        sortedStudents = studentDetails.stream()
                                .sorted(Comparator.comparingInt(Student::getAge))
                                .collect(Collectors.toList());
                    } else {
                        System.out.println("Invalid choice! Enter either NAME or AGE.");
                        break;
                    }

                    sortedStudents.forEach(System.out::println);
                    break;
                //Exit
                case 7:
                    System.out.println("Exit...");
                    exitvalue = false;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + value);
            }
        }
        


    }
}
