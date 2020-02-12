package exercises.technology;

public class Laptop extends Computer{
    private double displaySize;

    public Laptop(double aDisplaySize, double aMemoryCapacity, int aYearMade){
        super( aMemoryCapacity, aYearMade);
        displaySize = aDisplaySize;
    }
    public double getDisplaySize(){
        return displaySize;
    }
   public int getBatteryLife(){
        return 95;
   }
}
