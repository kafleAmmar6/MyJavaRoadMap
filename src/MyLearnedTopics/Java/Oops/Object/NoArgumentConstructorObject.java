package MyLearnedTopics.Java.Oops.Object;

import MyLearnedTopics.Java.Oops.Constructor.NoArgumentConstructor;

public class NoArgumentConstructorObject {
    public static void main(String[] args) {
        NoArgumentConstructor noArg= new NoArgumentConstructor();
        System.out.println(noArg.secondUserName);
        System.out.println(noArg.secondUserAddress);
        System.out.println(noArg.secondUserAlive);
        System.out.println(noArg.secondUserAge);
        System.out.println("The No Argument Constructor is Succesfully Called.");
    }
}
