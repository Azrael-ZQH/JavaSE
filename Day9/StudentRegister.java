package Day9;

import Day7.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentRegister {
    public static void register(ArrayList al) {
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher();
        System.out.println("请输入老师姓名");
        t.setName(sc.nextLine());
        System.out.println("请输入老师年龄");
        t.setAge(sc.nextInt());
        al.add(t);
        System.out.println(al);
    }

    public static void main(String[] args) {
        ArrayList<Teacher> al = new ArrayList<>();
        while (true) {
            System.out.println("是否需要录入老师信息？1/0");
            Scanner sc = new Scanner(System.in);
            if (sc.nextInt() == 0) {
                if (al.size() == 0) {
                    System.out.println("当前库中无信息");
                    break;
                }
                for (int i = 0; i < al.size(); i++) {
                    System.out.println(al.get(i).getName()+"---"+al.get(i).getAge());
                }
                break;
            } else {
                register(al);
            }
        }
    }
}
