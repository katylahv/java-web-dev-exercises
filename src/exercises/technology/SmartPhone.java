package exercises.technology;

public class SmartPhone extends Computer{
    private String carrier;

    public SmartPhone(String aCarrier, double aMemoryCapacity, int aYearMade){
        super( aMemoryCapacity, aYearMade);
        carrier = aCarrier;
    }
    public String getCarrier(){
        return carrier;
    }
    public boolean hasSignal(){
        return true;
    }
}
