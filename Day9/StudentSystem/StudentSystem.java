package Day9_StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void listAdd(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("请输入添加学生工号：");
        boolean i = true;
        do {
            stu.setNumber(sc.next());
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (stu.getNumber().equals(list.get(i1).getNumber())) {
                    System.out.println("学号已被占用");
                    System.out.println("请重新输入学生学号");
                    break;
                } else if (i1 == list.size() - 1) {
                    i = false;
                }
            }
            if (list.size() == 0) {
                i = false;
            }
        } while (i);
        System.out.println("请输入添加学生姓名：");
        stu.setName(sc.next());
        System.out.println("请输入学生年龄：");
        stu.setAge(sc.nextInt());
        System.out.println("请输入添加学生生日：");
        stu.setBirthday(sc.next());
        list.add(stu);
        System.out.println("添加学生信息成功！");
    }

    public static void listDeleted(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("信息库暂无数据");
        } else {
            System.out.println("请输入删除的学号");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (s.equals(list.get(i).getNumber())) {
                    list.remove(i);
                    System.out.println("删除该学生信息成功！");
                    break;
                } else if (i == list.size() - 1) {
                    System.out.println("不存在该学生信息");
                }
            }
        }
    }

    public static void listChange(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("信息库暂无数据");
        } else {
            System.out.println("请输入需要修改的学号");
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            for (int i = 0; i < list.size(); i++) {
                if (s.equals(list.get(i).getNumber())) {
                    boolean j = true;
                    list.remove(i);
                    Student stu = new Student();
                    list.add(i, stu);
                    do {
                        System.out.println("请输入修改后该学生学号");
                        String ss = sc.next();
                        for (int i1 = 0; i1 < list.size(); i1++) {
                            if (ss.equals(list.get(i1).getNumber())) {
                                System.out.println("学号已被占用");
                                break;
                            } else if (i1 == list.size() - 1) {
                                j = false;
                                list.get(i).setNumber(ss);
                            }
                        }
                        if (list.size() == 0) {
                            j = false;
                        }
                    } while (j);
                    System.out.println("请输入添加学生姓名：");
                    list.get(i).setName(sc.next());
                    System.out.println("请输入学生年龄：");
                    list.get(i).setAge(sc.nextInt());
                    System.out.println("请输入添加学生生日：");
                    list.get(i).setBirthday(sc.next());
                    System.out.println("修改该学生信息成功！");
                    break;
                } else if (i == list.size() - 1) {
                    System.out.println("不存在该学生信息");
                }
            }
        }
    }

    public static void listLook(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("无学生信息");
        } else {
            System.out.println("学生学号\t姓名\t年龄\t生日");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getNumber() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + "\t" + list.get(i).getBirthday());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        lo:
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入您的选择:");
            switch (sc.nextInt()) {
                case 1:
                    listAdd(list);
                    break;
                case 2:
                    listDeleted(list);
                    break;
                case 3:
                    listChange(list);
                    break;
                case 4:
                    listLook(list);
                    break;
                case 5:
                    System.out.println("感谢您的使用");
                    break lo;
                default:
                    System.out.println("操作有误！");
            }
        }
    }
}
