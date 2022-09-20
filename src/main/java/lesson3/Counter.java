package lesson3;

import javax.naming.OperationNotSupportedException;

public class Counter implements AutoCloseable {
    private static int count = 0;

    public void add() throws OperationNotSupportedException {
        if (Counter.count>10)
            throw new OperationNotSupportedException();
        Counter.count++;
    }

    @Override
    public void close() throws OperationNotSupportedException {

    }
}
