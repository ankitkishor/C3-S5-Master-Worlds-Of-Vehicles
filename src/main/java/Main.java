/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Main {
    public static void main(String[] args) {
Transmission transmission=new Manual("Manual","MP4",6);
        transmission.setTransmissionModelNumber("MP4");

        System.out.println("Transmission Type= "+transmission.getTransmissionType());
        System.out.println("Transmission Model Number= "+transmission.getTransmissionModelNumber());
        System.out.println(transmission.showSpecs());
    }
}
