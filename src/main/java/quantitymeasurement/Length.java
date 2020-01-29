package quantitymeasurement;

import java.util.Objects;

public class Length {

    public double value;
     UnitType unitType;

    public Length(double value, UnitType unitType) {
        this.value = value;
        this.unitType = unitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unitType == length.unitType;
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                ", unitType=" + unitType +
                '}';
    }
}
