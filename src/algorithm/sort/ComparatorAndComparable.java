package algorithm.sort;

import java.util.*;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        Student a = new Student(17, 2);
        Student b = new Student(18, 1);
        Student c = new Student(15, 3);

        int isBig = comp.compare(b, c);

        if (isBig > 0) {
            System.out.println("b객체가 c객체보다 큽니다.");
        }
        else if (isBig == 0) {
            System.out.println("b객체가 c객체와 크기가 같습니다.");
        }
        else {
            System.out.println("b객체가 c객체보다 작습니다.");
        }
    }


    // 익명 클래스
    public static Comparator<Student> comp = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.classNumber - o2.classNumber;
        }
    };
}

class Student {
    int age;
    int classNumber;

    Student(int age, int classNumber) {
        this.age = age;
        this.classNumber = classNumber;
    }
}
