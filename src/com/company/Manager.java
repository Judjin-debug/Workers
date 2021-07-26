package com.company;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Worker {

    protected List<Worker> workers = new ArrayList<>();

    public Manager () {

    };

    public Manager(String name, String surname, int salaryInUSD, Department department, List<Worker> workers) {
        super(name, surname, salaryInUSD, department);
        this.workers = workers;
    };

    public Manager(String name, String surname, int salaryInUSD, Department department) {
        super(name, surname, salaryInUSD, department);
    };

    public List<Worker> getWorkers() {
        return workers;
    };

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    };

    public void addWorker (Worker worker) {
        this.workers.add(worker);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salaryInUSD=" + salaryInUSD +
                ", department=" + department +
                ", workers=" + workers +
                '}';
    };


}
