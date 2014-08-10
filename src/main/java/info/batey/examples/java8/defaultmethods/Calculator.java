package info.batey.examples.java8.defaultmethods;

/**
 * Created by chbatey on 03/08/2014.
 */
public interface Calculator {
    int add(int a, int b);
    int subtract(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }
}
