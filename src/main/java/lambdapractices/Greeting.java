package lambdapractices;

// Annotation @FunctionalInterface provide you information that this interface should not be added by any more method signatures
@FunctionalInterface
public interface Greeting {
    public void perform();
}
