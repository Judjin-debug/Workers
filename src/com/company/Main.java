package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {



    public static void main(String[] args) {
	    WorkerService workerService = workersGenerate2();
	    workerService.showWorkers();
        List<Worker> token;
	    token = workerService.getWorkers().stream().sorted(Comparator.comparing(Worker::getSurname)).collect(Collectors.toList());
        System.out.println("Sorted by surname: ");
        System.out.println(token);
        token = workerService.getWorkers().stream().sorted(Comparator.comparing(Worker::getSalaryInUSD)).collect(Collectors.toList());
        System.out.println("Sorted by salary: ");
        System.out.println(token);
        System.out.println("Average salary by departments: ");
        workerService.avgSalaryByDepartment();
    };

    public static WorkerService workersGenerate () {
        WorkerService workerService = new WorkerService();
        Worker token;
        List<Worker> token2;
        for (int i = 0; i < 5; i++) {
            token = new Worker("Name" + String.valueOf(i+1), "Surname" + String.valueOf(i+1), 500, Department.Accounting);
            workerService.addWorker(token);
        };
        for (int i = 0; i < 2; i++) {
            token = new Manager("Name" + String.valueOf(i+6), "Surname" + String.valueOf(i+6), 1000, Department.Management);
            workerService.addWorker(token);
        };
        return workerService;
    };

    public static WorkerService workersGenerate2 () {
        WorkerService workerService = new WorkerService();
        Worker token;
        Manager token2;
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            token = new Worker(StringGenerator.generateString(4,12), StringGenerator.generateString(4, 12), rand.nextInt(501) + 500, Department.Accounting);
            workerService.addWorker(token);
        };
        for (int i = 0; i < 2; i++) {
            token2 = new Manager(StringGenerator.generateString(4,12), StringGenerator.generateString(4, 12), rand.nextInt(501) + 500, Department.Management);
            token2.addWorker(workerService.getWorker(0+i*3));
            token2.addWorker(workerService.getWorker(1+i*3));
            token2.addWorker(workerService.getWorker(2+i*3));

            token = token2;
            workerService.addWorker(token);
        };
        return workerService;
    };





}
