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
        Assert.assertEquals(expectedLength, quantityMeasurment);
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
        Assert.assertEquals(quantityMeasurment, quantityMeasurment1);
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
        QuantityMeasurment lengthToBeConvert = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInFeet);
        lengthToBeConvert.getConversionValue("InchToFeet");
        Assert.assertEquals(expectedLength, lengthToBeConvert);
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
        Assert.assertEquals(expectedLength, convertedLength);


    }

    // Test Case For 12 Inch Is Equal to 1 Feet
    @Test
    public void whenGivenTwelveInch_ShouldReturnOneFeet() {
        Length lengthInInch = new Length(12, UnitType.INCH);
        Length lengthInFeet = new Length(1, UnitType.FEET);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInFeet);
        convertedLength.getConversionValue("InchToFeet");
        Assert.assertEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenThreeFeetLength_ShouldReturnOneYard() {
        Length lengthInFeet = new Length(3, UnitType.FEET);
        Length lengthInYard = new Length(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        convertedLength.getConversionValue("FeetToYard");
        Assert.assertEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenOneFeetLength_ShouldNotReturnOneYard() {
        Length lengthInFeet = new Length(1, UnitType.FEET);
        Length lengthInYard = new Length(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        convertedLength.getConversionValue("FeetToYard");
        Assert.assertNotEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenOneInchLength_ShouldNotReturnOneYard() {
        Length lengthInFeet = new Length(1, UnitType.INCH);
        Length lengthInYard = new Length(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        convertedLength.getConversionValue("InchToYard");
        Assert.assertNotEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenOneYardLength_ShouldNotReturnOneInch() {
        Length lengthInYard = new Length(1, UnitType.YARD);
        Length lengthInInch = new Length(36, UnitType.INCH);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInYard);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInInch);
        convertedLength.getConversionValue("YardToInch");
        Assert.assertEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenTwoInch_ShouldReturnFiveCentiMeter() {
        Length lengthInInch = new Length(2, UnitType.INCH);
        Length lengthInCM = new Length(5, UnitType.CENTIMETER);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInCM);
        convertedLength.getConversionValue("InchToCentimeter");
        Assert.assertEquals(expectedLength, convertedLength);
    }

    //Test case for Two inch Plus Two inch Equal to 4 inch
    @Test
    public void whenGivenTwoInchlength_PlusTwoInchLength_ShouldReturnAdditionOfLength() {
        Length value1 = new Length(2, UnitType.INCH);
        Length value2 = new Length(2, UnitType.INCH);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Length add = legth1.add(legth1, length2, UnitType.INCH);
        Assert.assertEquals(4.0, add.value, 0.0);
    }

    //Test case for one Feet plus Two inch Is Equal to 14 inch

    @Test
    public void whenGivenOneFeetlength_PlusTwoInchLength_ShouldReturnAdditionOfLength() {
        Length value1 = new Length(1, UnitType.FEET);
        Length value2 = new Length(2, UnitType.INCH);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Length add = legth1.add(legth1, length2, UnitType.INCH);
        Assert.assertEquals(14.0, add.value, 0.0);
    }

    //Test case for one feet plus one feet Is Equal To 24 Inch
    @Test
    public void whenGivenOneFeetlength_PlusOneFeetLength_ShouldReturnAdditionOfLength() {
        Length value1 = new Length(1, UnitType.FEET);
        Length value2 = new Length(1, UnitType.FEET);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Length add = legth1.add(legth1, length2, UnitType.INCH);
        Assert.assertEquals(24.0, add.value, 0.0);
    }


    //Test case for Two Inch plus 2.5 CM Is Equal To Three Inch
    @Test
    public void whenGivenTwoInchLength_PlusCentiMeterLength_ShouldReturnAdditionOfLength() {
        Length value1 = new Length(2, UnitType.INCH);
        Length value2 = new Length(2.5, UnitType.CENTIMETER);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Length add = legth1.add(legth1, length2, UnitType.INCH);
        System.out.println(add);
        Assert.assertEquals(3.0, add.value, 0.0);
    }
    //Test case for 1 litre equals to 1000 Mililiter
    @Test
    public void whenGivenLitre_ShouldReturnMilitre() {
        Length value1 = new Length(1, UnitType.LITRE);
        Length value2 = new Length(1000.0, UnitType.MILILITRE);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(value1);
        QuantityMeasurment expected=new QuantityMeasurment(value2);
        quantityMeasurment.getConversionValue("LitreToMiliLitre");
        Assert.assertTrue(quantityMeasurment.equals(expected));

    }
    //Test case for 1 gallon equals to 3.78 litres
    @Test
    public void whenGivenOneGallon_ShouldReturnLitres() {
        Length value1 = new Length(1, UnitType.GALLON);
        Length value2 = new Length(3.78, UnitType.LITRE);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(value1);
        QuantityMeasurment expected=new QuantityMeasurment(value2);
        quantityMeasurment.getConversionValue("LitresToGallon");
        Assert.assertTrue(quantityMeasurment.equals(expected));

    }

    //Add volumes in Litres
    @Test
    public void whenGivenOneLitre_PlusHundredMilliLiter_ShouldReturnAdditionOflitres() {
        Length value1 = new Length(1, UnitType.LITRE);
        Length value2 = new Length(1000, UnitType.MILILITRE);
        QuantityMeasurment length1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Length add = length1.add(length1, length2, UnitType.LITRE);
        System.out.println(add);
        Assert.assertEquals(2.0, add.value, 0.0);
    }

}
