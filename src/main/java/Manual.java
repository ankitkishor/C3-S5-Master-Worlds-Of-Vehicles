/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Manual extends Transmission {
    private int forwardGears;


    public Manual(String transmissionType,
                  String transmissionModelNumber,
                  int forwardGears
    ) {
        super(transmissionType, transmissionModelNumber);
        this.forwardGears = forwardGears;

    }

    public String showSpecs() {

        if (getTransmissionModelNumber().equals("MP4")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 2.540");
            System.out.println("SecondGear= 1.920");
            System.out.println("ThirdGear= 1.510");
            System.out.println("ForthGear= 1.000");
        }
        if (getTransmissionModelNumber().equals("MP5")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 3.545");
            System.out.println("SecondGear= 1.904");
            System.out.println("ThirdGear= 1.280");
            System.out.println("ForthGear= 0.914");
            System.out.println("FifthGear= 0.757");
        }
        if (getTransmissionModelNumber().equals("MP6")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 3.010");
            System.out.println("SecondGear= 2.070");
            System.out.println("ThirdGear= 1.430");
            System.out.println("ForthGear= 1.000");
            System.out.println("FifthGear= 0.710");
            System.out.println("SixthGear= 0.570");
        }
        if (getTransmissionModelNumber().equals("MD5")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 3.545");
            System.out.println("SecondGear= 1.904");
            System.out.println("ThirdGear= 1.233");
            System.out.println("ForthGear= 0.911");
            System.out.println("fifthGear= 0.725");
        }
        if (getTransmissionModelNumber().equals("MD6")) {
            System.out.println(forwardGears);
            System.out.println("FirstGear= 3.640");
            System.out.println("SecondGear= 2.150");
            System.out.println("ThirdGear= 1.360");
            System.out.println("ForthGear= 1.000");
            System.out.println("fifthGear= 0.750");
            System.out.println("SixthGear= 0.630");
        }
return "";
    }
}
