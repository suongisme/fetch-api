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
public class LongConnectTime {

    @JacksonXmlProperty(isAttribute = true, localName = "Enable")
    private Boolean enable;

    @JacksonXmlProperty(isAttribute = true, localName = "Min")
    private Long min;

    @JacksonXmlProperty(isAttribute = true, localName = "Max")
    private Long max;
}
