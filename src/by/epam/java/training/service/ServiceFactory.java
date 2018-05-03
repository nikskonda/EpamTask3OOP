package by.epam.java.training.service;

import by.epam.java.training.service.impl.PlaneServiceImpl;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ServiceFactory {

    private static ServiceFactory instance = new ServiceFactory();
    private static Lock lock = new ReentrantLock();

    private final PlaneService planeService = new PlaneServiceImpl();

    private ServiceFactory() {}

    public PlaneService getProductService() {
        return planeService;
    }

    public static ServiceFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new ServiceFactory();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            lock.unlock();
        }
        return instance;
    }
}
