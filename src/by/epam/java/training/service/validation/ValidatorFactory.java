package by.epam.java.training.service.validation;

import by.epam.java.training.printer.PrinterLog;
import org.apache.log4j.Logger;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ValidatorFactory {

    private static final Logger LOGGER = Logger.getLogger(ValidatorFactory.class);

    private static ValidatorFactory instance = new ValidatorFactory();
    private static Lock lock = new ReentrantLock();

    private final CriteriaValidatorManager validatorManager = new CriteriaValidatorManager();

    private ValidatorFactory() {}

    public CriteriaValidatorManager getValidatorManager() {
        return validatorManager;
    }

    public static ValidatorFactory getInstance() {
        try {
            lock.lock();
            if (instance == null){
                instance = new ValidatorFactory();
            }
        } catch (Exception e) {
            PrinterLog.printLogError(e.toString(), LOGGER);
        } finally {
            lock.unlock();
        }
        return instance;
    }


}
