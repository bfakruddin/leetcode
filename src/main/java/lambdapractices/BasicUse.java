package lambdapractices;

public class BasicUse {

    public static void main(String[] args) {
        BasicUse basicUse = new BasicUse();
        // Interface Greeting or any using interface must be having a method signature same how we're using in lambda expression
        Greeting greetingFunction = () -> System.out.println("Hello world!!");

        // Anonymous Class - Code implemented same as lambda expression
        // But the purpose of Anonymous class and Lambda expressions are different
        Greeting greetingAnonymounsClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello world !!!");
            }
        };

        basicUse.greet(greetingFunction);
        basicUse.greet(greetingAnonymounsClass);

    }

    public void greet(Greeting greeting){
        greeting.perform();
    }


    /**
     * Syntaxes we use for lambda expressions
     * */
    /*public void testLambda(){
        //Sample Lambda syntax 1
        Callable<String> output = () -> {
            return "baba";
        };

        doubleNumberFunction = (int a) -> {
            return a*2;
        };

        doubleNumberFunction1 = (int a) -> a*2;  // return is not need as it's one line and braces too

        addFunction = (int a, int b) -> a+b;

        safeDivisionFunction = (int a, int b) -> {
            if (b==0){
                return 0;
            }else {
                return a / b;
            }
        };

        stringLengthCountFunction = (String s) -> s.length();
    }*/
}
