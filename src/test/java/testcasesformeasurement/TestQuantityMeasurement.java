package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Length;
import quantitymeasurement.QuantityMeasurment;
import quantitymeasurement.UnitType;

public class TestQuantityMeasurement {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_shouldReturnEqualFeet(){
        Length length = new Length(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        double value =  quantityMeasurment.getConversionValue();
        Assert.assertEquals(0, value,0);
    }
}

//    @Test
//    public void whenGivenNullFeet_shouldReturnNull() {
//        try {
//            LengthConversion length = new LengthConversion(null, 0);
//        } catch (QuantityMeasurementException e) {
//            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
//        }
//    }
//
//    @Test
//    public void whenGivenFeet_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion lengthConversion1 = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        LengthConversion lengthConversion2 = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        Assert.assertTrue(lengthConversion1.equals(lengthConversion2));
//    }
//
//    @Test
//    public void whenGivenFeet_checkType_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        Assert.assertTrue(length1.getClass().equals(length2.getClass()));
//    }
//
//    @Test
//    public void whenGivenFeet_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        Assert.assertTrue(length1.equals(length2));
//    }
//
//    // Test Cases For Inch
//    @Test
//    public void whenGivenNullInch_shouldReturnNull() {
//        try {
//            LengthConversion length = new LengthConversion(null, 0);
//        } catch (QuantityMeasurementException e) {
//            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_VALUE, e.type);
//        }
//    }
//
//    @Test
//    public void whenGivenInch_checkReferenceType_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        Assert.assertTrue(length1.equals(length2));
//    }
//
//    @Test
//    public void whenGivenInch_checkValue_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        Assert.assertTrue(length1.equals(length2));
//    }
//
//    @Test
//    public void whenGivenInch_checkType_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        Assert.assertTrue(length1.getClass().equals(length2.getClass()));
//    }
//
//    // Test Cases For Inch And Feet To Return equals 0
//    @Test
//    public void whenGivenZeroInchAndZeroFeet_shouldReturnEqual() throws QuantityMeasurementException {
//        LengthConversion inch = new LengthConversion(LengthConversion.Unit.INCH, 0);
//        LengthConversion feet = new LengthConversion(LengthConversion.Unit.FEET, 0);
//        Assert.assertTrue(inch.equals(feet));
//    }
//
//    // Test Case For 1 Feet Is Not Equal To 1 Inch
//    @Test
//    public void whenGivenOneFeet_shouldNotReturnOneInch() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.FEET, 1);
//        int inch = length1.getConversionValue();
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.INCH,1);
//        int feet = length2.getConversionValue();
//        Assert.assertTrue(feet!=inch);
//    }
//
//    // Test Case For 1 Inch Is Not Equal to 1 Feet
//    @Test
//    public void whenGivenOneInch_shouldNotReturnOneFeet() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 1);
//        int inch = length1.getConversionValue();
//        LengthConversion length2 = new LengthConversion(LengthConversion.Unit.FEET, 1);
//        int feet = length2.getConversionValue();
//        Assert.assertTrue(inch != feet);
//    }
//
//    // Test Case For 1 Feet Is Equal to 12 Inch
//    @Test
//    public void whenGivenOneFeet_shouldReturnTwelveInch() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.FEET,1 );
//        int inch = length1.getConversionValue();
//        Assert.assertTrue(12 == inch);
//    }
//
//    // Test Case For 12 Inch Is Equal to 1 Feet
//    @Test
//    public void whenGivenTwelveInch_shouldReturnOneFeet() throws QuantityMeasurementException {
//        LengthConversion length1 = new LengthConversion(LengthConversion.Unit.INCH, 12);
//        int feet = length1.getConversionValue();
//        Assert.assertTrue(1 == feet);
//    }
//
//    //Test case for 3 Feet Is Equal To 1 Yard
//    @Test
//    public void whenGivenThreeFeet_shouldReturnOneYard() throws QuantityMeasurementException {
//        LengthConversion length1=new LengthConversion(LengthConversion.Unit.FEET_TO_YARD,3);
//        int yard=length1.getConversionValue();
//        Assert.assertTrue(1 == yard);
//    }
//}
