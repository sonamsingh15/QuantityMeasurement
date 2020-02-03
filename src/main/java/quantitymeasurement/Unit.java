package quantitymeasurement;

import java.util.Objects;

public class Unit {

    public double value;
    public UnitType unitType;

    public Unit(double value, UnitType unitType) {
        this.value = value;
        this.unitType = unitType;
    }
    @Override
    public String toString() {
        return "Unit{" +
                "value=" + value +
                ", unitType=" + unitType +
                '}';
    }


}
