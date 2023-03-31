package javaoop.exercises._3;

public class Student {

    private String name;
    private int age;
    private String gender;
    private int studentID;
    private String course;

    private int courseCount;

    public Student() {
        this.courseCount = 0;
    }



    //GEtters and Setters

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
        if (age >= 0) {
            this.age = age;
        }else{
            System.out.println("Age must be greater than 0");
        }
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        if (studentID >= 0) {
            this.studentID = studentID;
        }else {
            System.out.println("Student ID must be greater than 0");
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
        this.courseCount++;
    }
public int getCourseCount() {
        return courseCount;
}
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", studentID=" + studentID + ", course=" + course + "]";
    }
}
