public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        var sensors = new TempSensor[] {
            new TempSensor(37),
            new TempSensor(28),
            new TempSensor(44),
            new TempSensor(25),
            new TempSensor(24)
        };

        ExternalThermometer[] therms = new ExternalThermometer[]{
            new ExternalThermometer(37),
            new ExternalThermometer(28),
            new ExternalThermometer(44),
            new ExternalThermometer(25),
            new ExternalThermometer(24)
        };

        CarSensor[] carSensors = new CarSensor[]{
            new CarSensor(37),
            new CarSensor(28),
            new CarSensor(44),
            new CarSensor(25),
            new CarSensor(24)
        };

        // double sum = 0;
        // for (TempSensor sensor : sensors) {
        //     sum += sensor.getTemperature();
        // }

        // System.out.println("La temperatura media dei sensori è di " + (sum / sensors.length) + " gradi!");

        // System.out.println("La temperatura media dei sensori è di " + averageTemp(sensors , new SensorTempGetter()) + " gradi!");

        // System.out.println("La temperatura media dei sensori esterni è di " + averageTemp(therms , new ThermometerExternalTempGetter()) + " gradi!");

        // PropertyGetter getter = (Object o) -> ((TempSensor) o).getTemperature();
        // PropertyGetter exGetter = (Object o) -> ((ExternalThermometer) o).getExternalTemp();

        // System.out.println("La temperatura media dei sensori è di " + averageTemp(sensors , getter) + " gradi!");

        // System.out.println("La temperatura media dei sensori esterni è di " + averageTemp(therms , exGetter) + " gradi!");

        System.out.println("La temperatura media dei sensori è di " + averageTemp(sensors , (Object o) -> ((TempSensor) o).getTemperature()) + " gradi!");

        System.out.println("La temperatura media dei sensori esterni è di " + averageTemp(therms , (Object o) -> ((ExternalThermometer) o).getExternalTemp()) + " gradi!");

        System.out.println("La temperatura media dei sensori della macchina è di " + averageTemp(carSensors , (Object o) -> ((CarSensor) o).getTemperature()) + " gradi!");

    }

    // public static double averageTemp(TempSensor[] sensors) {
    //     double sum = 0;
    //     for (TempSensor tempSensor : sensors) {
    //         sum += tempSensor.getTemperature();
    //     }

    //     return (sum / sensors.length);
    // }

    // public static double averageTemp(TempSensor[] sensors, PropertyGetter pGetter) {

    //     //return as soon as possible
    //     if(sensors.length == 0) {
    //         return 0;
    //     }

    //     double sum = 0;
    //     for (TempSensor tempSensor : sensors) {
    //         sum += pGetter.getDoubleProperty(tempSensor);
    //     }

    //     return (sum / sensors.length);
    // }

    // public static double averageTemp(ExternalThermometer[] sensors, PropertyGetter pGetter) {

    //     //return as soon as possible
    //     if(sensors.length == 0) {
    //         return 0;
    //     }

    //     double sum = 0;
    //     for (ExternalThermometer ExternalTempSensor : sensors) {
    //         sum += pGetter.getDoubleProperty(ExternalTempSensor);
    //     }

    //     return (sum / sensors.length);
    // }

    public static <T> double averageTemp(T[] sensors, PropertyGetter pGetter) {

        //return as soon as possible
        if(sensors.length == 0) {
            return 0;
        }

        double sum = 0;
        for (T sensor : sensors) {
            sum += pGetter.getDoubleProperty(sensor);
        }

        return (sum / sensors.length);
    }
}
