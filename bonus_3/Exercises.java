package javaoop.exercises._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("John");
        s1.setAge(0);
        s1.setGender("Male");
        s1.setStudentID(1);
        s1.setCourse("Course 1");
        s1.setStudentID(1);
        s1.setCourse("Python");
        System.out.println("Student 1: " + s1);
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here

        Student s = new Student();
        s.setCourse("Kotlin");
        s.setCourse("Java");
        s.setCourse("Javascript");

        System.out.println("Student: " + s.toString());
    }

}
