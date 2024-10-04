package java8;
import  java.util.stream.Stream;

public class StreamTest {

    Stream.Builder<String> streamBuilder = Stream.builder();
    Stream<String> stream1 = streamBuilder.add("uma").add("bhanu").build();
}
