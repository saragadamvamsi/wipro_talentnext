package Abstract;

abstract class BaseVehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero1 extends BaseVehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Hero1(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is turned ON in Hero bike.");
    }
}

class Honda1 extends BaseVehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Honda1(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return 100;
    }

    public void cdplayer() {
        System.out.println("CD Player is playing in Honda bike.");
    }
}

class Logan extends BaseVehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Logan(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return 120;
    }

    public void gps() {
        System.out.println("GPS is active in Logan car.");
    }
}

class Ford extends BaseVehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Ford(String modelName, String registrationNumber, String ownerName) {
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getSpeed() {
        return 140;
    }

    public void tempControl() {
        System.out.println("Temperature control is active in Ford car.");
    }
}

public class Abstract5 {
    public static void main(String[] args) {
        Hero1 hero = new Hero1("Hero Splendor", "AP01AB1234", "Vamsi");
        System.out.println("Hero Bike:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();
        System.out.println();

        Honda1 honda = new Honda1("Honda Shine", "AP02XY5678", "Sita");
        System.out.println("Honda Bike:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
        System.out.println();

        Logan logan = new Logan("Logan Sedan", "TS10CD9988", "Ravi");
        System.out.println("Logan Car:");
        System.out.println("Model: " + logan.getModelName());
        System.out.println("Reg No: " + logan.getRegistrationNumber());
        System.out.println("Owner: " + logan.getOwnerName());
        System.out.println("Speed: " + logan.getSpeed());
        logan.gps();
        System.out.println();

        Ford ford = new Ford("Ford Endeavour", "KA03MN4567", "Priya");
        System.out.println("Ford Car:");
        System.out.println("Model: " + ford.getModelName());
        System.out.println("Reg No: " + ford.getRegistrationNumber());
        System.out.println("Owner: " + ford.getOwnerName());
        System.out.println("Speed: " + ford.getSpeed());
        ford.tempControl();
    }
}
