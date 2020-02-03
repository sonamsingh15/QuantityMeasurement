package testcasesformeasurement;

import org.junit.Assert;
import org.junit.Test;
import quantitymeasurement.Unit;
import quantitymeasurement.QuantityMeasurment;
import quantitymeasurement.UnitType;

public class QuantityMeasurementTest {

    // Test Cases For Feet
    @Test
    public void whenGivenZeroFeet_ShouldReturnZeroFeet() {
        Unit length = new Unit(0, UnitType.FEET);
        Unit length1 = new Unit(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        QuantityMeasurment expectedLength = new QuantityMeasurment(length1);
        Assert.assertEquals(expectedLength, quantityMeasurment);
    }

    @Test
    public void whenGivenNullFeet_ShouldReturnFalse() {
        Unit nullLength = null;
        Unit length1 = new Unit(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length1);
        Assert.assertEquals(false, quantityMeasurment.equals(nullLength));
    }


    @Test
    public void whenGivenFeet_CheckReferenceType_ShouldReturnEqual() {
        Unit length = new Unit(0, UnitType.FEET);
        Unit length1 = new Unit(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Assert.assertEquals(true, quantityMeasurment.length.getClass().
                equals(length1.getClass()));
    }

    //
    @Test
    public void whenGivenLength_CheckType_ShouldReturnEqualType() {
        Unit length = new Unit(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Unit length1 = new Unit(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment1 = new QuantityMeasurment(length1);
        Assert.assertEquals(quantityMeasurment, quantityMeasurment1);
    }

    // Test Case For Inch
    @Test
    public void whenGivenNullInch_ShouldReturnFalse() {
        Unit length = null;
        Unit length1 = new Unit(0, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length1);
        Assert.assertEquals(false, quantityMeasurment.equals(length));
    }


    @Test
    public void whenGivenInch_CheckReferenceType_ShouldReturnEqual() {
        Unit length = new Unit(0, UnitType.INCH);
        Unit length2 = new Unit(0, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(length);
        Assert.assertEquals(true, quantityMeasurment.length.getClass().equals(length2.getClass()));
    }

    // Test Cases For Inch And Feet To Return equals 0
    @Test
    public void whenGivenZeroInch_ShouldEqualToZeroFeet() {
        Unit lengthInInch = new Unit(0, UnitType.INCH);
        Unit lengthInFeet = new Unit(0, UnitType.FEET);
        QuantityMeasurment lengthToBeConvert = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInFeet);
        Assert.assertEquals(expectedLength, lengthToBeConvert);
    }

    // Test Case For 1 Feet Is Not Equal To 1 Inch
    @Test
    public void whenGivenOneFeet_ShouldNotEqualToOneInch() {
        Unit lengthInFeet = new Unit(1, UnitType.FEET);
        Unit lengthInInch = new Unit(1, UnitType.INCH);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInFeet);
        Assert.assertFalse(quantityMeasurment.equals(lengthInInch));

    }
    //Test case For 1 Inch Is Not Equal To 1 Feet

    @Test
    public void whenGivenOneInch_ShouldNotEqualToOneFeet() {
        Unit lengthInInch = new Unit(1, UnitType.INCH);
        Unit lengthInFeet = new Unit(1, UnitType.FEET);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(lengthInInch);
        Assert.assertFalse(quantityMeasurment.equals(lengthInFeet));

    }

    // Test Case For 1 Feet Is  Equal to 12 Inch
    @Test
    public void whenGivenOneFeet_ShouldEqualsToTwelveInch() {
        Unit lengthInFeet = new Unit(1, UnitType.FEET);
        Unit lengthInInch = new Unit(12, UnitType.INCH);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInInch);
        Assert.assertEquals(expectedLength, convertedLength);


    }

    // Test Case For 12 Inch Is Equal to 1 Feet
    @Test
    public void whenGivenTwelveInch_ShouldEqualToOneFeet() {
        Unit lengthInInch = new Unit(12, UnitType.INCH);
        Unit lengthInFeet = new Unit(1, UnitType.FEET);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInFeet);
        Assert.assertEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenThreeFeetLength_ShouldEqualToOneYard() {
        Unit lengthInFeet = new Unit(3, UnitType.FEET);
        Unit lengthInYard = new Unit(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        Assert.assertEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenOneFeetLength_ShouldNotEqualToOneYard() {
        Unit lengthInFeet = new Unit(1, UnitType.FEET);
        Unit lengthInYard = new Unit(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        Assert.assertNotEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenOneInchLength_ShouldNotEqualToOneYard() {
        Unit lengthInFeet = new Unit(1, UnitType.INCH);
        Unit lengthInYard = new Unit(1, UnitType.YARD);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInFeet);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInYard);
        Assert.assertNotEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenOneYardLength_ShouldNotEqualToOneInch() {
        Unit lengthInYard = new Unit(1, UnitType.YARD);
        Unit lengthInInch = new Unit(36, UnitType.INCH);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInYard);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInInch);
        Assert.assertEquals(expectedLength, convertedLength);
    }

    @Test
    public void whenGivenTwoInch_ShouldEqualToFiveCentiMeter() {
        Unit lengthInInch = new Unit(2, UnitType.INCH);
        Unit lengthInCM = new Unit(5, UnitType.CENTIMETER);
        QuantityMeasurment convertedLength = new QuantityMeasurment(lengthInInch);
        QuantityMeasurment expectedLength = new QuantityMeasurment(lengthInCM);
        Assert.assertEquals(expectedLength, convertedLength);
    }

    //Test case for Two inch Plus Two inch Equal to 4 inch
    @Test
    public void whenGivenTwoInchlength_PlusTwoInchLength_ShouldReturnAdditionOfLength() {
        Unit value1 = new Unit(2, UnitType.INCH);
        Unit value2 = new Unit(2, UnitType.INCH);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Unit add = legth1.add(legth1, length2, UnitType.INCH);
        Assert.assertEquals(4.0, add.value, 0.0);
    }

    //Test case for one Feet plus Two inch Is Equal to 14 inch

    @Test
    public void whenGivenOneFeetlength_PlusTwoInchLength_ShouldReturnAdditionOfLength() {
        Unit value1 = new Unit(1, UnitType.FEET);
        Unit value2 = new Unit(2, UnitType.INCH);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Unit add = legth1.add(legth1, length2, UnitType.INCH);
        Assert.assertEquals(14.0, add.value, 0.0);
    }

    //Test case for one feet plus one feet Is Equal To 24 Inch
    @Test
    public void whenGivenOneFeetlength_PlusOneFeetLength_ShouldReturnAdditionOfLength() {
        Unit value1 = new Unit(1, UnitType.FEET);
        Unit value2 = new Unit(1, UnitType.FEET);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Unit add = legth1.add(legth1, length2, UnitType.INCH);
        Assert.assertEquals(24.0, add.value, 0.0);
    }


    //Test case for Two Inch plus 2.5 CM Is Equal To Three Inch
    @Test
    public void whenGivenTwoInchLength_PlusCentiMeterLength_ShouldReturnAdditionOfLength() {
        Unit value1 = new Unit(2, UnitType.INCH);
        Unit value2 = new Unit(2.5, UnitType.CENTIMETER);
        QuantityMeasurment legth1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Unit add = legth1.add(legth1, length2, UnitType.INCH);
        System.out.println(add);
        Assert.assertEquals(3.0, add.value, 0.0);
    }
    //Test case for 1 litre equals to 1000 Mililiter
    @Test
    public void whenGivenLitre_ShouldEqualToMilitre() {
        Unit value1 = new Unit(1.0, UnitType.LITRE);
        Unit value2 = new Unit(1000.0, UnitType.MILILITRE);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(value1);
        QuantityMeasurment expected=new QuantityMeasurment(value2);
        Assert.assertTrue(quantityMeasurment.equals(expected));

    }
    //Test case for 1 gallon equals to 3.78 litres
    @Test
    public void whenGivenOneGallon_ShouldEqualToLitres() {
        Unit value1 = new Unit(1, UnitType.GALLON);
        Unit value2 = new Unit(3.78, UnitType.LITRE);
        QuantityMeasurment quantityMeasurment = new QuantityMeasurment(value1);
        QuantityMeasurment expected=new QuantityMeasurment(value2);
        Assert.assertTrue(quantityMeasurment.equals(expected));

    }

    //Add volumes in Litres
    @Test
    public void whenGivenOneLitre_PlusHundredMilliLiter_ShouldReturnAdditionOflitres() {
        Unit value1 = new Unit(1, UnitType.LITRE);
        Unit value2 = new Unit(1000, UnitType.MILILITRE);
        QuantityMeasurment length1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Unit add = length1.add(length1, length2, UnitType.LITRE);
        Assert.assertEquals(2.0, add.value, 0.0);
    }
    //Add volumes in Litres
    @Test
    public void whenGivenOneGallonAndOneLiter_AddedInLiter_ShouldReturnProperResultInLiter() {
        Unit value1 = new Unit(1, UnitType.GALLON);
        Unit value2 = new Unit(3.78, UnitType.LITRE);
        QuantityMeasurment length1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Unit add = length1.add(length1, length2, UnitType.LITRE);
        Assert.assertEquals(7.56, add.value, 0.0);
    }

    @Test
    public void whenGiven1LengtOneKg_ShouldQualToThousandGrams() {
        Unit value1 = new Unit(1, UnitType.KILOGRAM);
        Unit value2 = new Unit(1000, UnitType.GRAM);
        QuantityMeasurment length1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Assert.assertEquals(length1,length2);
    }

    @Test
    public void whenGivenOneTones_ShouldEqualToThousandKg() {

        Unit value1 = new Unit(1, UnitType.TONNE);
        Unit value2 = new Unit(1000, UnitType.KILOGRAM);
        QuantityMeasurment length1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Assert.assertEquals(length1,length2);

    }

    @Test
    public void whenGivenOneTonneAndThousandGram_PerformAddition() {
        Unit value1 = new Unit(1, UnitType.TONNE);
        Unit value2 = new Unit(1000, UnitType.KILOGRAM);
        QuantityMeasurment length1 = new QuantityMeasurment(value1);
        QuantityMeasurment length2 = new QuantityMeasurment(value2);
        Assert.assertEquals(length1,length2);
    }


    @Test
    public void whenGivenFahrenheit_ShouldEqualTonCelusius() {
        Unit value1 = new Unit(212, UnitType.FAHRENHEIT);
        Unit value2 = new Unit(100, UnitType.CELSIUS);
        QuantityMeasurment convertedValue = new QuantityMeasurment(value1);
        QuantityMeasurment expectedValue = new QuantityMeasurment(value2);
        Assert.assertEquals(convertedValue,expectedValue);
    }
}
