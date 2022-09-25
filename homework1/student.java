package homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class student {
    private String name;
    private String email;
    private String address;
    private int age;

    private List<Integer> grades;


    public student(String name, String email, String address, int age, List<Integer> grades) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.grades = grades;
    }

    public int avgGrades(){
        int c = 0;

        for(int i = 0; i < grades.size(); i++){
            c += grades.get(i);
        }
        return c/grades.size();
    }

    public List<Integer> getGrade(){
        return grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, address, age);
    }

    @Override
    public String toString() {
        return "homework1.student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
