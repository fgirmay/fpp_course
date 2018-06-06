package problem6.clonedeep;

/**
 * Created by fissehaye on 6/5/18.
 */
public class Computer implements Cloneable {

    private String manufacturer;
    private String processor;
    private  int ramSize;
    private  double processorSpeed;

    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {

        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }

    public double getProcessorSpeed() {
        return this.processorSpeed;
    }

    // return ramSize multiplied by processorSpeed
    public double computePower() {

        return this.ramSize * this.processorSpeed;
    }
    // Override the toString() method to display the current status

    @Override
    public String toString() {
        return "Computer Info: " + "manufacturer: " + manufacturer + ", processor: " + processorSpeed + ", ram size: " + ramSize + ", processor speed: " + processorSpeed;
    }

    @Override
    public boolean equals(Object obj) {

        boolean isEqual = false;

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Computer)) {
            return false;
        }

        Computer computer = (Computer)obj;
        if (this.manufacturer.equals(computer.manufacturer)
                && this.processor.equals(computer.processor)
                && this.ramSize == computer.ramSize
                && this.processorSpeed == computer.processorSpeed) {
            isEqual =  true;
        }

        return isEqual;
    }

    @Override
    public int hashCode() {

        int result = 23;

        result = 29 * result + manufacturer.hashCode();
        result = 29 * result + processor.hashCode();
        result = 29 * result + ramSize;
        long processorSpeedLong = Double.doubleToLongBits(processorSpeed);
        result = 29 * result + (int) (processorSpeedLong ^ (processorSpeedLong >>> 32));

        return result;
    }

    @Override
    public Object clone()        {
        Computer computerClone = null;
        try {
            computerClone = (Computer) super.clone();
        } catch (CloneNotSupportedException cnse) {
            // Otherwise return new object
            return new Computer(this.manufacturer, this.processor, this.ramSize, this.processorSpeed);
        }
        return computerClone;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

}

