package javastreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamSources {
    public static Stream<String> stringNumberStream() {
        return Stream.of("one", "two", "three", "four", "five");
    }

    public static Stream<Integer> intNumberStream() {
        return Stream.iterate(0, i -> i + 2)
                .limit(10);
    }

    public static Stream<User> userStream() {
        return Stream.of(
                new User(1, "asif", "iqbal"),
                new User(1, "amit", "kumar"),
                new User(1, "santosh", "kumar"),
                new User(1, "manish", "roy"),
                new User(1, "sahid", "hasan"),
                new User(1, "saif", "khan")
        );
    }
}
