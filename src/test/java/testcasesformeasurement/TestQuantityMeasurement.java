package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Length;
import quantitymeasurement.QuantityMeasurment;
import quantitymeasurement.UnitType;

public class TestQuantityMeasurement {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_shouldReturnEqualFeet() {
        Length length = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        double value = quantityMeasurment.getConversionValue();
        Assert.assertEquals(0, value, 0);
    }

    @Test
    public void whenGivenNullFeet_shouldReturnNull() {
        Length length = null;
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment();
        Assert.assertEquals(false, quantityMeasurment.equals(length));
    }


    @Test
    public void whenGivenFeet_checkReferenceType_shouldReturnEqual() {
        Length length = new Length(0, UnitType.FEET);
        Length length1 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Assert.assertEquals(true, quantityMeasurment.length.getClass().equals(length1.getClass()));
    }

    //
    @Test
    public void whenGivenValue_shouldReturnEqualFeet() {
        Length length = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        double value = quantityMeasurment.getConversionValue();
        Assert.assertEquals(0, value, 0);
    }

    // Test Case For Inch
    @Test
    public void whenGivenNullInch_shouldReturnNull() {
        Length length = null;
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment();
        Assert.assertEquals(false, quantityMeasurment.equals(length));
    }


    @Test
    public void whenGivenInch_checkReferenceType_shouldReturnEqual() {
        Length length = new Length(0, UnitType.INCH);
        Length length2 = new Length(0, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Assert.assertEquals(true, quantityMeasurment.length.getClass().equals(length2.getClass()));
    }


    @Test
    public void whenGivenZero_shouldReturnEqualFeet() {
        Length length = new Length(0, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        double value = quantityMeasurment.getConversionValue();
        Assert.assertEquals(0, value, 0);
    }

    // Test Cases For Inch And Feet To Return equals 0
    @Test
    public void whenGivenZeroInchAndZeroFeet_shouldReturnEqual() {
        Length length1 = new Length(0, UnitType.INCH);
        QuantityMeasurment quantityMeasurment1 = new QuantityMeasurment(length1);
        double inch = quantityMeasurment1.getConversionValue();
        Length length2 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length2);
        double feet = quantityMeasurment.getConversionValue();
        Assert.assertTrue(inch == feet);
    }


    // Test Case For 1 Feet Is Not Equal To 1 Inch
    @Test
    public void whenGivenOneFeet_shouldNotReturnOneInch() {
        Length length1 = new Length(1, UnitType.FEET);
        QuantityMeasurment qm = new QuantityMeasurment(length1);
        double first = qm.getConversionValue();
        Length feet = new Length(1, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(feet);
        double second = quantityMeasurment.getConversionValue();
        Assert.assertTrue(first != second);

    }
    //Test case For 1 Inch Is Not Equal To 1 Feet

    @Test
    public void whenGivenOneInch_shouldNotReturnOneFeet() {
        Length length1 = new Length(1, UnitType.INCH);
        QuantityMeasurment qm = new QuantityMeasurment(length1);
        double inch = qm.getConversionValue();
        Length length2 = new Length(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length2);
        double feet = quantityMeasurment.getConversionValue();
        Assert.assertTrue(inch != feet);

    }
        // Test Case For 1 Feet Is  Equal to 12 Inch
    @Test
    public void whenGivenOneFeet_shouldReturnTwelveInch() {
        Length length1 = new Length(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment1 = new QuantityMeasurment(length1);
        double feet = quantityMeasurment1.getConversionValue();
        Length length2 = new Length(12, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length2);
        double inch = quantityMeasurment.getConversionValue();
        Assert.assertTrue(feet == inch);
    }
    // Test Case For 12 Inch Is Equal to 1 Feet
    @Test
    public void whenGivenTwelveInch_shouldOneFeet() {
        Length length2 = new Length(12, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length2);
        double inch = quantityMeasurment.getConversionValue();
        Length length1 = new Length(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment1 = new QuantityMeasurment(length1);
        double feet = quantityMeasurment1.getConversionValue();
        Assert.assertTrue(inch == feet);
    }

}

//
//    //Test case for 3 Feet Is Equal To 1 Yard
//    @Test
//    public void whenGivenThreeFeet_shouldReturnOneYard() throws QuantityMeasurementException {
//        LengthConversion length1=new LengthConversion(LengthConversion.Unit.FEET_TO_YARD,3);
//        int yard=length1.getConversionValue();
//        Assert.assertTrue(1 == yard);
//    }
//}
