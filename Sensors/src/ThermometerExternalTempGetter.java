public class ThermometerExternalTempGetter implements PropertyGetter{

    @Override
    public double getDoubleProperty(Object o) {
        ExternalThermometer thermometer = (ExternalThermometer) o;
        return thermometer.getExternalTemp();
    }

}
