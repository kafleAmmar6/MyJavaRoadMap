package MyLearnedTopics.Java.StaticAndNonStaticMethod;

public class NonStaticMethod {
// Non-Static Function or Method
    void nonStaticMethod(){
        System.out.println("This is non static method.");
    }
    public static void main(String[] args) {
// Creating Object for non-static method
        NonStaticMethod obj = new NonStaticMethod();
        obj.nonStaticMethod();
    }
}
