package quantitymeasurement;

import java.util.Objects;

public class Length {

    public double value;
    public UnitType unitType;

    public Length(double value, UnitType unitType) {
        this.value = value;
        this.unitType = unitType;
    }
    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unitType=" + unitType +
                '}';
    }
}
