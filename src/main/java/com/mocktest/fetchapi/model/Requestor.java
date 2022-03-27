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
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Requestor {

    @JacksonXmlProperty(isAttribute = true, localName = "ID")
    private Long id;

    @JacksonXmlProperty(isAttribute = true, localName = "Type")
    private Long type;

    @JacksonXmlProperty(localName = "CompanyName", namespace = "http://www.opentravel.org/OTA/2003/05")
    private Company companyName;
}
