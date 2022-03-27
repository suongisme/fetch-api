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
public class CabinPref {

    @JacksonXmlProperty(isAttribute = true, localName = "Cabin")
    private String cabin;
}
