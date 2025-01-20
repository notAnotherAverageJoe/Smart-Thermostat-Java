public class Thermostat {
    private String homeName;
    private int currentTemp;
    private int targetTemp;

    public Thermostat(String name, int initialTemp, int targetTemp) {
        this.homeName = name;
        this.currentTemp = initialTemp;
        this.targetTemp = targetTemp;
    }

    public void status() {
        System.out.println("Name: " + homeName);
        System.out.println("Current Temp: " + currentTemp);
        System.out.println("Target Temp: " + targetTemp);
        System.out.println("\n\n");
    }

    public void setCurrentTemp(int newTemp) {
        this.currentTemp = newTemp;
    }

    public int getCurrentTemp() {
        return this.currentTemp;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public void setTargetTemp(int targetTemp) {
        this.targetTemp = targetTemp;
    }

    public int getTargetTemp() {
        return this.targetTemp;
    }
}
