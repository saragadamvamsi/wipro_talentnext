package Abstract;

abstract class Vehicle {
    public abstract String getModelName();
    public abstract String getRegistrationNumber();
    public abstract String getOwnerName();
}

class Hero extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Hero(String modelName, String registrationNumber, String ownerName) {
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

class Honda extends Vehicle {
    private String modelName;
    private String registrationNumber;
    private String ownerName;

    public Honda(String modelName, String registrationNumber, String ownerName) {
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

    public void cdplayer() {
        System.out.println("CD Player is turned ON in Honda car.");
    }
}

public class Abstract4 {
    public static void main(String[] args) {
        Hero hero = new Hero("Hero Splendor", "AP01AB1234", "Vamsi");
        System.out.println("Hero Bike:");
        System.out.println("Model: " + hero.getModelName());
        System.out.println("Reg No: " + hero.getRegistrationNumber());
        System.out.println("Owner: " + hero.getOwnerName());
        System.out.println("Speed: " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda("Honda City", "TS09XY5678", "Sita");
        System.out.println("Honda Car:");
        System.out.println("Model: " + honda.getModelName());
        System.out.println("Reg No: " + honda.getRegistrationNumber());
        System.out.println("Owner: " + honda.getOwnerName());
        System.out.println("Speed: " + honda.getSpeed());
        honda.cdplayer();
    }
}
