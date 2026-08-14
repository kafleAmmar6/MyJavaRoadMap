package MyLearnedTopics.Java.Oops.Object;

import MyLearnedTopics.Java.Oops.Constructor.DefaultConstructor;

public class DefaultConstructorObject {
    public static void main(String[] args) {
        DefaultConstructor def = new DefaultConstructor();

        System.out.println(def.firstUserName);
        System.out.println(def.firstUserAddress);
        System.out.println(def.firstUserAlive);
        System.out.println(def.firstUserAge);
        System.out.println("The Default Constructor is Succesfully Called.");

    }
}
