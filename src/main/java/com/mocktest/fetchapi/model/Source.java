package com.mocktest.fetchapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author SuongNguyen
 * @created 3/25/2022
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Source {

    @JacksonXmlProperty(isAttribute = true, localName = "PseudoCityCode")
    private String pseudoCityCode;

    @JacksonXmlProperty(localName = "RequestorID", namespace = "http://www.opentravel.org/OTA/2003/05")
    private Requestor requestorId;
}
