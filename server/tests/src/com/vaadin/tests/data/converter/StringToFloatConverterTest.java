package com.vaadin.tests.data.converter;

import com.vaadin.data.util.converter.StringToFloatConverter;

import junit.framework.TestCase;

public class StringToFloatConverterTest extends TestCase {

    StringToFloatConverter converter = new StringToFloatConverter();

    public void testNullConversion() {
        assertEquals(null, converter.convertToModel(null, Float.class, null));
    }

    public void testEmptyStringConversion() {
        assertEquals(null, converter.convertToModel("", Float.class, null));
    }

    public void testValueConversion() {
        assertEquals(Float.valueOf(10),
                converter.convertToModel("10", Float.class, null));
    }
}
