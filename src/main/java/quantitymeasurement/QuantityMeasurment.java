package quantitymeasurement;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class QuantityMeasurment {
    public Unit length;
    public UnitType unitType;
    private boolean conversionStatus;
    Map<String, Double> conversionType;

    public QuantityMeasurment(Unit length) {
        this.length = length;
        conversionStatus = false;
        conversionType = new TreeMap<>();
        conversionType.put("FeetToInch", 12.00);
        conversionType.put("InchToFeet", 1 / 12.00);
        conversionType.put("FeetToYard", (1 / 3.00));
        conversionType.put("InchToYard", (1 / 36.00));
        conversionType.put("YardToInch", (36.00));
        conversionType.put("YardToFeet", (3.00));
        conversionType.put("InchToCentimeter", 2.5);
        conversionType.put("InchToInch", 1.0);
        conversionType.put("MililitreToLitre", (1 / 1000.00));
        conversionType.put("CentimeterToInch", 1 / 2.5);
        conversionType.put("GallonToLitre", 3.78);
        conversionType.put("LitreToMiliLitre", 1000.00);
        conversionType.put("KilogramToGram", 1000.00);
        conversionType.put("TonneToKilogram", 1000.00);
        conversionType.put("FahrenheitToCelsius", 5.00 / 9.00);
    }

    public Unit getConversionValue(String typeOfConversion) {
        String unitType = this.length.unitType.name().toLowerCase();
        if(!unitType.substring(1,unitType.length()).equals
                (typeOfConversion.substring(1,unitType.length()).split("to")[0])){
            throw new RuntimeException("Invalid Type");

        }
        if (typeOfConversion.equals("FahrenheitToCelsius")) {
            this.length.value = this.length.value - 32;
        }
        this.length.value = this.length.value * this.conversionType.get(typeOfConversion);
        this.conversionStatus = true;
        this.length.unitType = UnitType.valueOf(typeOfConversion.substring(1, typeOfConversion.length())
                                .toLowerCase().split("to")[1]
                                .toUpperCase());
        System.out.println(length);
        return length;
    }

    public Unit add(QuantityMeasurment firstLength, QuantityMeasurment secondLength, UnitType resultantUnit) {
        Unit length1 = firstLength.length;
        Unit length2 = secondLength.length;
        if (!this.length.unitType.equals(resultantUnit)) {
            String conversionType = this.getConversionType(resultantUnit);
            length1 = this.getConversionValue(conversionType);
        }
        if (!secondLength.length.unitType.equals(resultantUnit)) {
            this.length = length2;
            String conversionType = this.getConversionType(resultantUnit);
            length2 = this.getConversionValue(conversionType);
        }
        return new Unit(length1.value + length2.value, resultantUnit);
    }


    private String getConversionType(UnitType unitType) {
        System.out.println(this.length.unitType.name()+":"+unitType.name());
        return this.length.unitType.name().split("")[0] +
                this.length.unitType.name().substring(1, this.length.unitType.name().length())
                        .toLowerCase() + "To" + unitType.name().split("")[0]
                        + unitType.name().substring(1, unitType.name().length()).toLowerCase();
    }


    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        QuantityMeasurment that = (QuantityMeasurment) o;

        if (!that.length.unitType.equals(this.length.unitType)) {
            String conversionType = this.getConversionType(that.length.unitType);
            this.length = this.getConversionValue(conversionType);
        }

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