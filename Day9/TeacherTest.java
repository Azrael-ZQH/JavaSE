package Day9_train;

import Day4.Array;

import java.util.ArrayList;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");
        ArrayList<Teacher> list = new ArrayList<>();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("name:" + list.get(i).getName() + ",profess:" + list.get(i).getProfess());
        }
    }
}
