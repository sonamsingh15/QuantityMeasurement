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
        QuantityMeasurment expectedLength = new QuantityMeasurment(length1);
        Assert.assertEquals(expectedLength,quantityMeasurment);
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
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Length length1 = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment1 = new QuantityMeasurment(length1);
        Assert.assertEquals(quantityMeasurment,quantityMeasurment1);
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
        QuantityMeasurment lengthToBeConvert  = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInFeet);
        lengthToBeConvert.getConversionValue("InchToFeet");
        Assert.assertEquals(expectedLength,lengthToBeConvert);
    }

    // Test Case For 1 Feet Is Not Equal To 1 Inch
    @Test
    public void whenGivenOneFeet_ShouldNotReturnOneInch() {
        Length lengthInFeet = new Length(1, UnitType.FEET);
        Length lengthInInch = new Length(1, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInFeet);
        quantityMeasurment.getConversionValue("FeetToInch");
        Assert.assertFalse(quantityMeasurment.equals(lengthInInch));

    }
    //Test case For 1 Inch Is Not Equal To 1 Feet

    @Test
    public void whenGivenOneInch_ShouldNotReturnOneFeet() {
        Length lengthInInch = new Length(1, UnitType.INCH);
        Length lengthInFeet = new Length(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInInch);
        quantityMeasurment.getConversionValue("InchToFeet");
        Assert.assertFalse(quantityMeasurment.equals(lengthInFeet));

    }
    // Test Case For 1 Feet Is  Equal to 12 Inch
    @Test
    public void whenGivenOneFeet_ShouldReturnTwelveInch() {
        Length lengthInFeet = new Length(1, UnitType.FEET);
        Length lengthInInch = new Length(12, UnitType.INCH);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInInch);
        convertedLength.getConversionValue("FeetToInch");
        Assert.assertEquals(expectedLength , convertedLength);


    }
    // Test Case For 12 Inch Is Equal to 1 Feet
    @Test
    public void whenGivenTwelveInch_ShouldReturnOneFeet() {
        Length lengthInInch = new Length(12, UnitType.INCH);
        Length lengthInFeet = new Length(1, UnitType.FEET);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInFeet);
        convertedLength.getConversionValue("InchToFeet");
        Assert.assertEquals(expectedLength , convertedLength);
    }

    @Test
    public void whenGivenThreeFeetLength_ShouldReturnOneYard() {
        Length lengthInFeet = new Length(3, UnitType.FEET);
        Length lengthInYard = new Length(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        convertedLength.getConversionValue("FeetToYard");
        Assert.assertEquals(expectedLength,convertedLength);
    }

    @Test
    public void whenGivenOneFeetLength_ShouldNotReturnOneYard() {
        Length lengthInFeet = new Length(1, UnitType.FEET);
        Length lengthInYard = new Length(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        convertedLength.getConversionValue("FeetToYard");
        Assert.assertNotEquals(expectedLength,convertedLength);
    }

    @Test
    public void whenGivenOneInchLength_ShouldNotReturnOneYard() {
        Length lengthInFeet = new Length(1, UnitType.INCH);
        Length lengthInYard = new Length(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        convertedLength.getConversionValue("InchToYard");
        Assert.assertNotEquals(expectedLength,convertedLength);
    }
    @Test
    public void whenGivenOneYardLength_ShouldNotReturnOneInch() {
        Length lengthInYard = new Length(1, UnitType.YARD);
        Length lengthInInch = new Length(36, UnitType.INCH);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInYard);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInInch);
        convertedLength.getConversionValue("YardToInch");
        Assert.assertEquals(expectedLength,convertedLength);
    }

}