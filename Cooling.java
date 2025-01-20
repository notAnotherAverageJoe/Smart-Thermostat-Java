public class Cooling {

    private Thermostat thermostat;
    private boolean isCooling;

    public boolean isCooling() {
        return isCooling;
    }

    public Cooling(Thermostat thermostat) {
        this.thermostat = thermostat;
        this.isCooling = false;
    }

    public void startCooling() {
        int currentTemp = thermostat.getCurrentTemp();
        int targetTemp = thermostat.getTargetTemp();

        if (currentTemp > targetTemp) {
            isCooling = true;
            System.out.println("Cooling activated!");
            while (currentTemp > targetTemp) {
                currentTemp--;
                thermostat.setCurrentTemp(currentTemp);
                System.out.println("Current temp: " + currentTemp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Cooling interrupted!");
                }
            }
            isCooling = false;
            System.out.println("Target temp reached, A/C turning off.");
        } else {
            System.out.println("No Cooling needed.");
        }
    }
}
