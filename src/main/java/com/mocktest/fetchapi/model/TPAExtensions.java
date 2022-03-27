package com.mocktest.fetchapi.model;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TPAExtensions {

    @JacksonXmlProperty(localName = "OnlineIndicator", namespace = "http://www.opentravel.org/OTA/2003/05")
    private OnlineIndicator onlineIndicator;

    @JacksonXmlProperty(localName = "LongConnectTime", namespace = "http://www.opentravel.org/OTA/2003/05")
    private LongConnectTime longConnectTime;

    @JacksonXmlProperty(localName = "JumpCabinLogic", namespace = "http://www.opentravel.org/OTA/2003/05")
    private JumpCabinLogic jumpCabinLogic;

    @JacksonXmlProperty(localName = "Priority", namespace = "http://www.opentravel.org/OTA/2003/05")
    private Priority priority;

    @JacksonXmlProperty(localName = "IntelliSellTransaction", namespace = "http://www.opentravel.org/OTA/2003/05")
    private IntelliSellTransaction intelliSellTransaction;
}
