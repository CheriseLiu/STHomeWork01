package com.company;
import java.util.*;

import java.util.Scanner;

/**
 * @Author: Liulq
 * @Description:
 * @Date: 22:35 2021/4/24
 */
public class StudentManager {
    static Student[] Stu = new Student[100];
    static int number=0;
    static Scanner scanner = new Scanner(System.in);

    public static void app(){
        int choice;
        while(true){
            System.out.println("请选择操作:");
            System.out.println("***********************************");
            System.out.println("*             1  插入             *");
            System.out.println("*             2  查找             *");
            System.out.println("*             3  删除             *");
            System.out.println("*             4  修改             *");
            System.out.println("*             5  输出             *");
            System.out.println("*             6  退出             *");
            System.out.println("***********************************");
            choice=scanner.nextInt();
            if (choice>6)break;
            switch (choice){
                case 1: add();break;
                case 2: query();break;
                case 3: delete();break;
                case 4: update();break;
                case 5: findAll();break;
                case 6: break;
            }
        }
        System.out.println("感谢您对本系统的使用，欢迎下次继续使用");
    }

    static void add(){
        while(true){
            System.out.println("点击任意键继续添加学生信息，停止添加输入0");
            if (scanner.nextInt()==0)break;
            System.out.println("请输入该学生的学号，姓名，出生日期，性别(女性为true，男性为false)");
            Stu[number] = new Student();
            Stu[number].setID(scanner.nextInt());
            Stu[number].setName(scanner.next());
            Stu[number].setBirDate(scanner.next());
            Stu[number].setGender(scanner.nextBoolean());
            number++;
            System.out.println("添加成功");
        }
    }

    static void query(){
        System.out.println("请输入要修改信息的学生姓名");
        String name = scanner.next();
        for(int i=0;i<number;i++){
            if (name.equals(Stu[i].getName())){
                System.out.println("*******************************************");
                System.out.println("学号  姓名       出生日期     性别(女性为true，男性为false)");
                System.out.println(Stu[i].getID()+"\t"+Stu[i].getName()+"\t"+Stu[i].getBirDate()+"\t"+Stu[i].isGender());
                System.out.println("*******************************************");
            }
            if (number==i)System.out.println("对不起查无此人");
        }
    }

    static void delete(){
        System.out.println("请输入要删除信息的学生姓名");
        String name=scanner.next();
        int i;
        for (i=0;i<number;i++){
            if (name.equals(Stu[i].getName()))break;;
            if (number==i)System.out.println("对不起查无此人");
        }
        for (;i<number-1;i++){
            Stu[i]=Stu[i+1];
            number--;
        }
        System.out.println("删除完成");
    }

    static void update(){
        System.out.println("请输入要修改信息的学生姓名");
        String name = scanner.next();
        for (int i=0;i<number;i++){
            if (name.equals(Stu[i].getName())){
                System.out.println("请输入要修改的学生的信息:学号，姓名，出生日期，性别(女性为true，男性为false)");
                Stu[i].setID(scanner.nextInt());
                Stu[i].setName(scanner.next());
                Stu[i].setBirDate(scanner.next());
                Stu[i].setGender(scanner.nextBoolean());
                break;
            }
            if (number==i)System.out.println("对不起查无此人");
        }
    }

    static void findAll() {
        System.out.println("*******************************************");
        System.out.println("学号  姓名       出生日期     性别(女性为true，男性为false)");
        for (int i = 0; i < number; i++)
            System.out.println(Stu[i].getID() + "\t" + Stu[i].getName() + "\t" + Stu[i].getBirDate() + "\t" + Stu[i].isGender());
        System.out.println("*******************************************");
        System.out.println();
    }
}
