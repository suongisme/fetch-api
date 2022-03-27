package com.mocktest.fetchapi.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author SuongNguyen
 * @created 3/25/2022
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(namespace = "http://www.opentravel.org/OTA/2003/05", localName = "OTA_AirLowFareSearchRQ")
public class OTAAirLowFareSearchRQ {

    @JacksonXmlProperty(isAttribute = true, localName = "Version")
    private String version;

    @JacksonXmlProperty(isAttribute = true, localName = "ResponseType")
    private String responseType;

    @JacksonXmlProperty(localName = "POS", namespace = "http://www.opentravel.org/OTA/2003/05")
    private POS pos;

    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "OriginDestinationInformation", namespace = "http://www.opentravel.org/OTA/2003/05")
    private List<OriginDestinationInformation> originDestinationInformation;

    @JacksonXmlProperty(localName = "TravelPreferences", namespace = "http://www.opentravel.org/OTA/2003/05")
    private TravelPreferences travelPreferences;

    @JacksonXmlProperty(localName = "TravelerInfoSummary", namespace = "http://www.opentravel.org/OTA/2003/05")
    private TravelerInfoSummary travelerInfoSummary;

    @JacksonXmlProperty(localName = "TPA_Extensions", namespace = "http://www.opentravel.org/OTA/2003/05")
    private TPAExtensions tpaExtensions;
}
