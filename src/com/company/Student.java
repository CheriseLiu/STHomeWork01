package com.company;

/**
 * @Author: Liulq
 * @Description:
 * @Date: 21:45 2021/4/24
 */
public class Student {
    private int ID;

    private  String name;

    private String birDate;

    private boolean gender;

    public Student(){
        super();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
