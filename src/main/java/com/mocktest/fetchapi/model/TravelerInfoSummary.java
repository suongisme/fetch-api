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
public class TravelerInfoSummary {

    @JacksonXmlProperty(localName = "SeatsRequested", namespace = "http://www.opentravel.org/OTA/2003/05")
    private Long seatsRequested;

    @JacksonXmlProperty(localName = "AirTravelerAvail", namespace = "http://www.opentravel.org/OTA/2003/05")
    private AirTravelerAvail airTravelerAvail;

    @JacksonXmlProperty(localName = "PriceRequestInformation", namespace = "http://www.opentravel.org/OTA/2003/05")
    private PriceRequestInformation priceRequestInformation;
}
