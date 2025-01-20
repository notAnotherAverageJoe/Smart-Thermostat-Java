public class Heating {
    private Thermostat thermostat;
    private boolean isHeating;

    public boolean isHeating() {
        return isHeating;
    }

    public Heating(Thermostat thermostat) {
        this.thermostat = thermostat;
        this.isHeating = false;
    }

    public void startHeating() {
        int currentTemp = thermostat.getCurrentTemp();
        int targetTemp = thermostat.getTargetTemp();

        if (currentTemp < targetTemp) {
            isHeating = true;
            System.out.println("Heating activated.");
            while (currentTemp < targetTemp) {
                currentTemp++;
                thermostat.setCurrentTemp(currentTemp);
                System.out.println("Current temp: " + currentTemp);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Heating interrupted!");
                }
            }

        }

    }

}
