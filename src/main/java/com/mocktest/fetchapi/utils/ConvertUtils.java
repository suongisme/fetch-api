package com.mocktest.fetchapi.utils;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author SuongNguyen
 * @created 3/26/2022
 */

public class ConvertUtils {

    public static String objectToXml(Object object) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        return xmlMapper.writeValueAsString(object);
    }

    public static  <T> T xmlToObject(String xml, Class<T> clazz) throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        return xmlMapper.readValue(xml, clazz);
    }

    public static Map xmlToMap(String xmlResult) {
        JSONObject jsonObject = XML.toJSONObject(xmlResult);
        JacksonJsonParser jacksonJsonParser = new JacksonJsonParser();
        return jacksonJsonParser.parseMap(jsonObject.toString());
    }
}
