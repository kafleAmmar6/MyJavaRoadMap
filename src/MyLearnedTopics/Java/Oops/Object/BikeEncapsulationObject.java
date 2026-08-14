package MyLearnedTopics.Java.Oops.Object;

import MyLearnedTopics.Java.Oops.Encapsulation.BikeEncapsulation;
import MyLearnedTopics.Java.Oops.Encapsulation.Getter.BikeGetter;
import MyLearnedTopics.Java.Oops.Encapsulation.Setter.BikeSetter;

public class BikeEncapsulationObject {

    public static void main(String[] args) {

        // Create encapsulation object
        BikeEncapsulation bike = new BikeEncapsulation();

        // Create Setter object
        BikeSetter setter = new BikeSetter();

        // Set bike information
        setter.setBikeDetails(bike);

        // Create Getter object
        BikeGetter getter = new BikeGetter();

        // Get bike information
        getter.getBikeDetails(bike);
    }
}
