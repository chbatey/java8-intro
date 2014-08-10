package info.batey.examples.java8.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by chbatey on 10/08/2014.
 */
public class Lambdas {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chris", "Alexandra", "Trevor", "");

        Stream<String> namesBeginningWithC = names.stream().filter(name -> name.startsWith("C"));

        List<String> collect = namesBeginningWithC.filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(collect);

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> notEmpty = isEmpty.negate();
        System.out.println(names.stream().filter(notEmpty).collect(Collectors.toList()));
    }
}
