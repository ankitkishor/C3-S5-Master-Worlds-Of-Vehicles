/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class AutomaticCVT extends Transmission{
    private int forwardGears;



    public AutomaticCVT(String transmissionType, String transmissionModelNumber, int forwardGears) {
        super(transmissionType, transmissionModelNumber);
        this.forwardGears = forwardGears;
    }
    public String showSpecs()
    {

        if (getTransmissionModelNumber().equals("CVT6")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 2.631");
            System.out.println("SecondGear= 1.440");
            System.out.println("ThirdGear= 1.165");
            System.out.println("ForthGear= 0.906");
            System.out.println("FifthGear= 0.680");
            System.out.println("SixthGear= 0.499");
        }
        return "";
    }
}
