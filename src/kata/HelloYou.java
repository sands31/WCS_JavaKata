public class HelloYou {

    public static String sayHello(String firstName) {
        if (firstName == null || firstName.equals("")) {
            firstName = "World";
        }
        return "Hello " + firstName;
    }
}
