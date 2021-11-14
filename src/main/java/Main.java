
import hashcode.HashCodeOverrideExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
//        (new LazyMapExample()).showLazyMapExample();
            (new HashCodeOverrideExample()).showHashCodeOverrideExample();
        } catch (final Exception e) {
            System.err.println(e);
            Arrays.stream(e.getStackTrace())
                    .forEach(element -> System.err.println("    at " + element));
        }
    }
}
