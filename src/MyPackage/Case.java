package MyPackage;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSuplay;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSuplay, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSuplay = powerSuplay;
        this.dimensions = dimensions;
    }

    public void preddPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSuplay() {
        return powerSuplay;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
