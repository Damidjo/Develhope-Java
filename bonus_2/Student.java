package javaoop.exercises._2;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        System.out.println("Constructing...");
        this.name = name;
        this.age = age;
        System.out.println("...Constructed!");
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
         //   a Constructor that takes only a student's age
    public Student(Integer age) {
        this.age = age;
        System.out.println("Student age: " + age);
    }
  //  a Constructor that takes only a student's name
    public Student(String name) {
        this.name = name;
        System.out.println("Student name: " + name);
    }
    //a Constructor that does not take any parameters
    public Student() {
    }
 }

