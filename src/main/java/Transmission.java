/*
 * Author : Ankit Kishor
 * Date: 09-11-2022
 * Created with :Intellij IDEA Community Edition
 */


public class Transmission {
    private String transmissionType;
    private String transmissionModelNumber;

    public Transmission() {
    }

    public Transmission(String transmissionType, String transmissionModelNumber) {
        this.transmissionType = transmissionType;
        this.transmissionModelNumber = transmissionModelNumber;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTransmissionModelNumber() {
        return transmissionModelNumber;
    }

    public void setTransmissionModelNumber(String transmissionModelNumber) {
        this.transmissionModelNumber = transmissionModelNumber;
    }
    public String showSpecs(){
return "";
    }
}
