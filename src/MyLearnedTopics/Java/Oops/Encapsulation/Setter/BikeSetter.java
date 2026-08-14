package MyLearnedTopics.Java.Oops.Encapsulation.Setter;

import MyLearnedTopics.Java.Oops.Encapsulation.BikeEncapsulation;

public class BikeSetter {
    public void setBikeDetails(BikeEncapsulation bike) {

        bike.setBikeName("Yamaha");
        bike.setBikeModel("MT-15");
        bike.setBikeCc(155);
        bike.setBikeAvailable(true);
    }
}
