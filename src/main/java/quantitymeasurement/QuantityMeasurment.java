package quantitymeasurement;

import java.util.Objects;

public class QuantityMeasurment {
public Length length;
public  UnitType unitType;
private boolean conversionStatus;

    public QuantityMeasurment(Length length) {

        this.length = length;
        conversionStatus = false;

    }



    public Length getConversionValue() {

        if (UnitType.FEET.equals(length.unitType)){

            this.length.value = length.value * 12;
            this.length.unitType = UnitType.INCH;
            conversionStatus = true ;

        }
        if (UnitType.INCH.equals(length.unitType) && conversionStatus == false) {

            this.length.value = length.value / 12;
            this.length.unitType = UnitType.FEET;

        }
            this.conversionStatus = true;
            return length;

    }


    @Override
    public boolean equals(Object o) {

        if (this.length == o && this.conversionStatus == false){
            return true;}
        if (o == null || length.getClass() != o.getClass())
        { return false;}
        Length that = (Length) o;
        return Objects.equals(length.value, that.value);

    }
}
