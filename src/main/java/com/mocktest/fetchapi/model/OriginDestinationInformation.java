package com.mocktest.fetchapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

/**
 * @author SuongNguyen
 * @created 3/25/2022
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OriginDestinationInformation {

    @JacksonXmlProperty(isAttribute = true)
    private Long RPH;

    @JacksonXmlProperty(localName = "DepartureDateTime", namespace = "http://www.opentravel.org/OTA/2003/05")
    private String departureDateTime;

    @JacksonXmlProperty(localName = "OriginLocation", namespace = "http://www.opentravel.org/OTA/2003/05")
    private Location originLocation;

    @JacksonXmlProperty(localName = "DestinationLocation", namespace = "http://www.opentravel.org/OTA/2003/05")
    private Location destinationLocation;
}
