package lambdapractices;

public class TypeInterfaceExample {
    public static void main(String[] args) {
        StringLenLambda stringLenLambda = s -> s.length();
        System.out.println(stringLenLambda.getLength("Baba"));

        // typeinterface usage
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLenLambda s){
        System.out.println(s.getLength("Baba"));
    }

    interface StringLenLambda{
        int getLength(String s);
    }
}
