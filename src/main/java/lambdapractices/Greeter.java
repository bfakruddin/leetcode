package lambdapractices;

public class Greeter {
    public void greeter(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greeter(new GreetingImpl());
//        greeter.greeter("Hello world!!!");
    }
}
