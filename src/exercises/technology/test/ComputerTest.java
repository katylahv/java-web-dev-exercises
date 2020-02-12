package exercises.technology.test;
import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {
    @Test
    public void LaptopInheritsSuperInFirstConstructor() {
        Laptop macBook = new Laptop(12.57, 45.7, 2018);
        assertEquals(45.7, macBook.getMemoryCapacity(), .001);
    }
    @Test
    public void getBatteryLifeWorks(){
        Laptop macBook = new Laptop(12.57, 45.7, 2018);
        assertEquals(95,macBook.getBatteryLife());
    }
    @Test
    public void laptopSoftwareUpdateWorks(){
        Laptop macBook = new Laptop(12.57, 45.7, 2018);
        assertEquals(false,macBook.softwareUpdate());
    }
    @Test
    public void SmartPhoneInheritsSuperInFirstConstructor(){
        SmartPhone iPhone = new SmartPhone("AT&T",12.7,2019);
        assertEquals("Apple", iPhone.getCompany());
    }
    @Test
    public void hasSignalWorks(){
        SmartPhone iPhone = new SmartPhone("AT&T",12.7,2019);
        assertEquals(true,iPhone.hasSignal());
    }
    @Test
    public void availableMemoryWorks(){
        SmartPhone iPhone = new SmartPhone("AT&T",12.7,2019);
        assertEquals(2.7,iPhone.availableMemory(),.001);
    }
    @Test
    public void softwareUpdateWorks(){
        Computer iMac = new Computer(57.7,2015);
        assertEquals(true,iMac.softwareUpdate());
    }
    @Test
    public void model(){
        SmartPhone iPhone = new SmartPhone("AT&T",12.7,2019);
        assertEquals("AT&T",iPhone.getCarrier());
    }
}

