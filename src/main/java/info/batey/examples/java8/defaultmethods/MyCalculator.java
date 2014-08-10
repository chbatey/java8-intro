package info.batey.examples.java8.defaultmethods;

/**
 * Created by chbatey on 03/08/2014.
 */
public class MyCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return 0;
    }
}
