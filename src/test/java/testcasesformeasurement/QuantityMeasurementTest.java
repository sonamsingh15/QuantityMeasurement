package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Length;
import quantitymeasurement.QuantityMeasurment;
import quantitymeasurement.UnitType;

public class QuantityMeasurementTest {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_ShouldReturnZeroFeet() {
        Length length = new Length(0, UnitType.FEET);
        Length length1 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
       Assert.assertTrue(quantityMeasurment.equals(length1));
    }

    @Test
    public void whenGivenNullFeet_ShouldReturnFalse() {
        Length nullLength = null;
        Length length1 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length1);
        Assert.assertEquals(false, quantityMeasurment.equals(nullLength));
    }


    @Test
    public void whenGivenFeet_CheckReferenceType_ShouldReturnEqual() {
        Length length = new Length(0, UnitType.FEET);
        Length length1 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Assert.assertEquals(true, quantityMeasurment.length.getClass().equals(length1.getClass()));
    }

    //
    @Test
    public void whenGivenLength_CheckType_ShouldReturnEqualType() {
        Length length = new Length(0, UnitType.FEET);
        System.out.println(length);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Length length1 = new Length(0, UnitType.FEET);
        Assert.assertTrue(quantityMeasurment.equals(length));
    }

    // Test Case For Inch
    @Test
    public void whenGivenNullInch_ShouldReturnFalse() {
        Length length = null;
        Length length1 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length1);
        Assert.assertEquals(false, quantityMeasurment.equals(length));
    }


    @Test
    public void whenGivenInch_CheckReferenceType_ShouldReturnEqual() {
        Length length = new Length(0, UnitType.INCH);
        Length length2 = new Length(0, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Assert.assertEquals(true, quantityMeasurment.length.getClass().equals(length2.getClass()));
    }

    // Test Cases For Inch And Feet To Return equals 0
    @Test
    public void whenGivenZeroInch_ShouldReturnZeroFeet() {
        Length lengthInInch = new Length(0, UnitType.INCH);
        Length lengthInFeet = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInInch);
        quantityMeasurment.getConversionValue();
        Assert.assertTrue(quantityMeasurment.equals(lengthInFeet));
    }

    // Test Case For 1 Feet Is Not Equal To 1 Inch
    @Test
    public void whenGivenOneFeet_ShouldNotReturnOneInch() {
        Length lengthInFeet = new Length(1, UnitType.FEET);
        Length lengthInInch = new Length(1, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInFeet);
        quantityMeasurment.getConversionValue();
        Assert.assertFalse(quantityMeasurment.equals(lengthInInch));

    }
    //Test case For 1 Inch Is Not Equal To 1 Feet

    @Test
    public void whenGivenOneInch_ShouldNotReturnOneFeet() {
        Length lengthInInch = new Length(1, UnitType.INCH);
        Length lengthInFeet = new Length(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInInch);
        quantityMeasurment.getConversionValue();
        Assert.assertFalse(quantityMeasurment.equals(lengthInFeet));

    }
        // Test Case For 1 Feet Is  Equal to 12 Inch
    @Test
    public void whenGivenOneFeet_ShouldReturnTwelveInch() {
        Length lengthInFeet = new Length(1, UnitType.FEET);
        Length lengthInInch = new Length(12, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInFeet);
        quantityMeasurment.getConversionValue();
        Assert.assertTrue(quantityMeasurment.equals(lengthInInch));


    }
    // Test Case For 12 Inch Is Equal to 1 Feet
    @Test
    public void whenGivenTwelveInch_ShouldReturnOneFeet() {
        Length lengthInInch = new Length(12, UnitType.INCH);
        Length lengthInFeet = new Length(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInInch);
        quantityMeasurment.getConversionValue();
        Assert.assertTrue(quantityMeasurment.equals(lengthInFeet));


    }
}
