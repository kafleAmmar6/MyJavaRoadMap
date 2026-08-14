package MyLearnedTopics.Java.Oops.Object;

import MyLearnedTopics.Java.Oops.Constructor.ArgumentConstructor;

public class ArgumentConstructorObject {
    public static void main(String[] args) {
        ArgumentConstructor arg = new ArgumentConstructor("Bhushan Sunar", "Tilottama", true,19);
        System.out.println(arg.thirdUserName);
        System.out.println(arg.thirdUserAddress);
        System.out.println(arg.thirdUserAlive);
        System.out.println(arg.thirdUserAge);
        System.out.println("The Argument Constructor is Succesfully Called.");
    }
}
