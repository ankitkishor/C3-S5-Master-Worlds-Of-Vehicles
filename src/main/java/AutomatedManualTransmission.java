/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class AutomatedManualTransmission extends Transmission{
    private int forwardGears;



    public AutomatedManualTransmission(String transmissionType, String transmissionModelNumber, int forwardGears) {
        super(transmissionType, transmissionModelNumber);
        this.forwardGears = forwardGears;
    }
    public String showSpecs() {

        if (getTransmissionModelNumber().equals("AMTP4")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 2.540");
            System.out.println("SecondGear= 1.920");
            System.out.println("ThirdGear= 1.510");
            System.out.println("ForthGear= 1.000");
        }
        if (getTransmissionModelNumber().equals("AMTD5")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 2.950");
            System.out.println("SecondGear= 1.940");
            System.out.println("ThirdGear= 1.340");
            System.out.println("ForthGear= 1.000");
            System.out.println("FifthGear= 0.630");
        }
        return "";

    }
}
