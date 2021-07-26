package com.company;

public class Worker {

    protected String name;
    protected String surname;
    protected int salaryInUSD;
    protected Department department;

    public Worker () {

    };

    public Worker(String name, String surname, int salaryInUSD, Department department) {
        this.name = name;
        this.surname = surname;
        this.salaryInUSD = salaryInUSD;
        this.department = department;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalaryInUSD() {
        return salaryInUSD;
    }

    public void setSalaryInUSD(int salaryInUSD) {
        this.salaryInUSD = salaryInUSD;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salaryInUSD=" + salaryInUSD +
                ", department=" + department +
                '}';
    };

}
