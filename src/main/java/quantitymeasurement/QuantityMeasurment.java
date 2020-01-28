package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurment {
Length unit;

    public QuantityMeasurment(Length unit) {
        this.unit = unit;
    }

    public double getConversionValue() {

        if (UnitType.FEET.equals(unit.unitType))
            return unit.value * 12;
        if (UnitType.INCH.equals(unit))
            return unit.value / 12;

        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurment that = (QuantityMeasurment) o;
        return Objects.equals(unit, that.unit);
    }


}
