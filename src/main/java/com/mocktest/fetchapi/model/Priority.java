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
public class Priority {

    @JacksonXmlProperty(localName = "Price", namespace = "http://www.opentravel.org/OTA/2003/05")
    private PriorityDetail price;

    @JacksonXmlProperty(localName = "DirectFlights", namespace = "http://www.opentravel.org/OTA/2003/05")
    private PriorityDetail directFlights;

    @JacksonXmlProperty(localName = "Time", namespace = "http://www.opentravel.org/OTA/2003/05")
    private PriorityDetail time;

    @JacksonXmlProperty(localName = "Vendor", namespace = "http://www.opentravel.org/OTA/2003/05")
    private PriorityDetail vendor;
}
