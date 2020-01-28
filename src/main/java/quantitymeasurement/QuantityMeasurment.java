package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurment {
public Length length;
public  UnitType unitType;

    public QuantityMeasurment(Length unit) {
        this.length = unit;
    }

    public QuantityMeasurment() {
    }

    public double getConversionValue() {

        if (UnitType.FEET.equals(length.unitType))
            return length.value * 12;
        if (UnitType.INCH.equals(length))
            return length.value / 12;

        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        QuantityMeasurment that = (QuantityMeasurment) o;
        return Objects.equals(length.value, that.length.value) ;
    }


}
