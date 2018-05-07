package by.epam.java.training.service;

import by.epam.java.training.printer.PrinterLog;
import by.epam.java.training.service.impl.PlaneServiceImpl;
import org.apache.log4j.Logger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ServiceFactory {

    private static final Logger LOGGER = Logger.getLogger(ServiceFactory.class);

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
            PrinterLog.printLogError(e.toString(), LOGGER);
        } finally {
            lock.unlock();
        }
        return instance;
    }
}
