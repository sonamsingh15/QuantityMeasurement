package quantitymeasurement;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class QuantityMeasurment {
    public Length length;
    public UnitType unitType;
    private boolean conversionStatus;
    Map<String, Double> conversionType;

    public QuantityMeasurment(Length length) {

        this.length = length;
        conversionStatus = false;
        conversionType = new HashMap<>();
        conversionType.put("FeetToInch", 12.00);
        conversionType.put("InchToFeet", 1 / 12.00);
        conversionType.put("FeetToYard",  (1/3.00));
        conversionType.put("FeetToYard",  (1/3.00));
        conversionType.put("InchToYard",  (1/36.00));
        conversionType.put("YardToInch",(36.00));
        conversionType.put("YardToFeet",(3.00));


    }

    public Length getConversionValue(String typeOfConversion) {
        this.length.value = this.length.value * this.conversionType.get(typeOfConversion);
        this.conversionStatus = true;
        this.length.unitType = UnitType.valueOf(typeOfConversion.split("To")[1].toUpperCase());
        return length;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        QuantityMeasurment that = (QuantityMeasurment) o;
        return Objects.equals(length.value, that.length.value);

    }

    @Override
    public String toString() {
        return "QuantityMeasurment{" +
                "length=" + length +
                ", unitType=" + unitType +
                ", conversionStatus=" + conversionStatus +
                '}';
    }
}