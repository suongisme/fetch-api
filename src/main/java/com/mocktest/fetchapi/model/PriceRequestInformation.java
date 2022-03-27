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
public class PriceRequestInformation {

    @JacksonXmlProperty(isAttribute = true, localName = "NegotiatedFaresOnly")
    private Boolean negotiatedFaresOnly;

    @JacksonXmlProperty(localName = "TPA_Extensions", namespace = "http://www.opentravel.org/OTA/2003/05")
    private TPAExtensions tpaExtensions;
}
