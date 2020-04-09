package collections.queue;

import java.rmi.StubNotFoundException;

public class Student implements Comparable<Student> {
    private String name;
    private int score;
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }


    @Override
    public int compareTo(Student o) {
        // pos: 'this' is greater than Object Student o
        // 0: 'this' object is equal to Student o
        // neg: 'this' is less than Student o
        return o.score - this.score;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
