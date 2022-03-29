package com.mocktest.fetchapi.utils;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Field;

/**
 * @author SuongNguyen
 * @created 3/29/2022
 */

public class XmlUtils {

    public static String REQUEST_XSD = "request.xsd";

    public static Boolean isXml(String xml, String xsdName) {
        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            InputStream resourceAsStream = XmlUtils.class.getClassLoader().getResourceAsStream(xsdName);
            Schema schema = factory.newSchema(new StreamSource(resourceAsStream));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new StringReader(xml)));
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
