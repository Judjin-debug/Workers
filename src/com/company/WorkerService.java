package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WorkerService implements WorkerServiceInterface {

    private List<Worker> workers = new ArrayList<>();

    public WorkerService() {

    };

    public WorkerService(List<Worker> workers) {
        this.workers = workers;
    }

    public void showWorkers () {
        System.out.println("Workers: ");
        System.out.println(workers);
    };

    public void removeWorker (int index) {
        this.workers.remove(index);
    };

    public void addWorker (Worker worker) {
        this.workers.add(worker);
    };

    public List<Worker> getWorkers () {
        return this.workers;
    };

    public Worker getWorker (int index) {
        return this.workers.get(index);
    };

    private List<Worker> filterByDepartment (int index) {
        List<Worker> result = new ArrayList<>();
        for (int i = 0; i < this.workers.size(); i++) {
            if (this.workers.get(i).getDepartment().equals(Department.departmentByNumber(index))) {
                result.add(this.workers.get(i));
            };
        };
        return result;
    };

    public void avgSalaryByDepartment () {
        List<Worker> token;
        Double length;
        for (int i = 0; i < 7; i++) {
            System.out.println(Department.departmentByNumber(i+1).name() + " department: ");
            token = filterByDepartment(i+1);
            length = (double) token.size();
            if (length > 0) {
                System.out.println(token.stream().map(e -> e.getSalaryInUSD()).reduce((e1, e2) -> e1 + e2).orElse(0) / length + " USD");
            } else {
                System.out.println("---");
            }
        }

    };


}
