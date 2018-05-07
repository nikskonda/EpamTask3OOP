package by.epam.java.training.service.impl.sort;

import by.epam.java.training.printer.PrinterLog;
import org.apache.log4j.Logger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SortFactory {
    private static final Logger LOGGER = Logger.getLogger(SortFactory.class);

    private static SortFactory instance = new SortFactory();
    private static Lock lock = new ReentrantLock();

    private final SortManager sortManager = new SortManager();

    private SortFactory() {}

    public SortManager getSortManager() {
        return sortManager;
    }

    public static SortFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new SortFactory();
            }
        } catch (Exception e) {
            PrinterLog.printLogError(e.toString(), LOGGER);
        } finally {
            lock.unlock();
        }
        return instance;
    }
}
