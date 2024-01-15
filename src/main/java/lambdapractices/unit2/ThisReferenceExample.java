package lambdapractices.unit2;

public class ThisReferenceExample {

    // This reference would be overridden in anonymous class
    // This reference will not override in lambda expressions
    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, (i) -> {
            System.out.println("Value of i : "+ i);
//            System.out.println(this); This will not work in lambdas but in anonymous class
        });
    }

    public void execute(){
        // this here reference to the calling instance i.e., thisReferenceExample in main
        doProcess(10, i -> {
            System.out.println("Value of i : "+ i);
            System.out.println(this);
        });
    }

    public void doProcess(int i, Process p){
        p.process(i);
    }
}
