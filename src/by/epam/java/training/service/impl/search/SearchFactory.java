package by.epam.java.training.service.impl.search;

import by.epam.java.training.printer.PrinterLog;
import org.apache.log4j.Logger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SearchFactory {

    private static final Logger LOGGER = Logger.getLogger(SearchFactory.class);

    private static SearchFactory instance = new SearchFactory();
    private static Lock lock = new ReentrantLock();

    private final SearchManager searchManager = new SearchManager();

    private SearchFactory() {}

    public SearchManager getValidatorManager() {
        return searchManager;
    }

    public static SearchFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new SearchFactory();
            }
        } catch (Exception e) {
            PrinterLog.printLogError(e.toString(), LOGGER);
        } finally {
            lock.unlock();
        }
        return instance;
    }

}
