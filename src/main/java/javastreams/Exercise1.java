package javastreams;

public class Exercise1 {
    public static void main(String[] args){
        // print all the numbers of intNumberStream
        StreamSources.intNumberStream().forEach(e -> System.out.println(e));

        //printl numbers from intNumberStream that are less than five
        StreamSources.intNumberStream().filter(number -> number < 5)
                .forEach(System.out::println);

        // print the second and the third numbers in intNumberStream that is greater than 5
        StreamSources.intNumberStream().filter(number -> number > 5)
                .skip(1)
                .limit(2);
        //print first name of all the user in userStream

        // one way
        StreamSources.userStream().forEach(user -> System.out.println(user.getFirstName()));
        // 2nd way
        StreamSources.userStream()
                .map(User::getFirstName)
                .forEach(System.out::println);
    }
}
