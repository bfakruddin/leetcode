package lambdapractices.unit3;

import lambdapractices.unit2.ThisReferenceExample;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceExample::printMessage); // MethodReferenceExample::printMessage same as () -> printMessage()
        thread.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }
}
