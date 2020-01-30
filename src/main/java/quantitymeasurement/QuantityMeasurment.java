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
        conversionType.put("FeetToYard", (1 / 3.00));
        conversionType.put("InchToYard", (1 / 36.00));
        conversionType.put("YardToInch", (36.00));
        conversionType.put("YardToFeet", (3.00));
        conversionType.put("InchToCentimeter", 2.5);
        conversionType.put("InchToInch", 1.0);
        conversionType.put("CentimeterToInch",1/2.5);

    }

    public Length getConversionValue(String typeOfConversion) {
        System.out.println(typeOfConversion);
        this.length.value = this.length.value * this.conversionType.get(typeOfConversion);
        this.conversionStatus = true;
        this.length.unitType = UnitType.valueOf(typeOfConversion.toLowerCase().split("to")[0].toUpperCase());
        return length;
    }

    public Length add(QuantityMeasurment firstLength, QuantityMeasurment secondLength, UnitType resultantUnit) {
        Length length1 = firstLength.length;
        Length length2 = secondLength.length;
        if (!this.length.unitType.equals(resultantUnit)) {
            String conversionType = this.getConversionType(resultantUnit);
            length1 = this.getConversionValue(conversionType);
        }
        if (!secondLength.length.unitType.equals(resultantUnit)) {
            this.length = length2;
            String conversionType = this.getConversionType(resultantUnit);
            length2 = this.getConversionValue(conversionType);
        }
        return new Length(length1.value + length2.value, resultantUnit);
    }


    private String getConversionType(UnitType unitType) {
        return this.length.unitType.name().split("")[0] +
                this.length.unitType.name().substring(1, this.length.unitType.name().length()).toLowerCase()
                + "To" + unitType.name().split("")[0] + unitType.name().substring(1, unitType.name().length()).toLowerCase();
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