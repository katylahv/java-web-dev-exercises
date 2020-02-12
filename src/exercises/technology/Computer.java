package exercises.technology;

public class Computer {
    private double memoryCapacity;
    private int yearMade;
    private String company;

    public Computer(double aMemoryCapacity, int aYearMade){
        memoryCapacity = aMemoryCapacity;
        yearMade = aYearMade;
        company = "Apple";
    }
    public double getMemoryCapacity(){
        return memoryCapacity;
    }
    public int getYearMade(){
        return yearMade;
    }
    public String getCompany(){
        return company;
    }
    public boolean softwareUpdate(){
        if (this.yearMade <= 2017){
            return true;
        } else {
            return false;
        }
    }
    public double availableMemory(){
        return this.memoryCapacity - 10;
    }

}
