/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class AutomaticDCT extends Transmission{
    private int forwardGears;


    public AutomaticDCT(String transmissionType, String transmissionModelNumber, int forwardGears) {
        super(transmissionType, transmissionModelNumber);
        this.forwardGears = forwardGears;
    }

    public String showSpecs(){

        if(getTransmissionModelNumber().equals("DCT8")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 4.714");
            System.out.println("SecondGear= 3.143");
            System.out.println("ThirdGear= 2.106");
            System.out.println("ForthGear= 1.667");
            System.out.println("FifthGear= 1.285");
            System.out.println("SixthGear= 1.000");
            System.out.println("SeventhGear= 0.839");
            System.out.println("EighthGear= 0.667");


        }
        return "";
        }
}
