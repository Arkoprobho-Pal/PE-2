package com.stackroute.main;

public class Member{

    public String getName;
    public String getFirstName;
    public String getLastName;
    public String getAge;
    public String getSalary;
    public String setLastName;
    public String setFirstName;
    public String setName;

    String Name,FirstName,LastName;
    int Age;
    double Salary;
    //getter and setter

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public void setFirstName(String name) {
        this.FirstName = name;
    }
    public void setLastName(String name) {
        this.LastName = name;
    }
    String FullName;
    public String getFullName(){
        FullName=FirstName+" "+LastName;
        return FullName;
    }
    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
