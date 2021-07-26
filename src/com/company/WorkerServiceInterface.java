package com.company;

public interface WorkerServiceInterface {
    abstract void showWorkers();
    abstract void addWorker(Worker worker);
    abstract void removeWorker(int index);
}
