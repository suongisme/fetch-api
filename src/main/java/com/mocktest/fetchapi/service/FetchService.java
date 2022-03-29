package com.mocktest.fetchapi.service;

import com.mocktest.fetchapi.model.OTAAirLowFareSearchRQ;
import com.mocktest.fetchapi.model.ResultModel;
import com.mocktest.fetchapi.utils.ConvertUtils;
import com.mocktest.fetchapi.utils.XmlUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author SuongNguyen
 * @created 3/26/2022
 */

@Service
@Slf4j
public class FetchService {

    @Value("${config.api}")
    private String api;

    @Value("${config.host}")
    private String host;

    @Value("${config.X-XML-Booking-Session}")
    private String bookingSession;

    @Value("${config.X-XML-Booking-PCC}")
    private String bookingPcc;

    @Value("${config.X-XML-Booking-Host}")
    private String bookingHost;

    @Value("${config.X-XML-Booking-SWSCONFIG}")
    private String bookingSWSConfig;

    public ResultModel search(OTAAirLowFareSearchRQ otaAirLowFareSearchRQ) {
        try {
            String xml = ConvertUtils.objectToXml(otaAirLowFareSearchRQ);
            log.info("xml: {}", xml);
            log.info("validate xml");
            if (!XmlUtils.isXml(xml, XmlUtils.REQUEST_XSD)) {
                log.error("xml is invalid");
                return new ResultModel(null, HttpStatus.BAD_REQUEST);
            }
            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders headers = new HttpHeaders();
            headers.add("X-XML-Booking-Session", this.bookingSession);
            headers.add("X-XML-Booking-PCC", this.bookingPcc);
            headers.add("X-XML-Booking-Host", this.bookingHost);
            headers.add("X-XML-Booking-SWSCONFIG", this.bookingSWSConfig);
            headers.add("Host", this.host);

            HttpEntity<String> httpEntity = new HttpEntity<String>(xml, headers);

            String xmlResult = restTemplate.postForObject(this.api, httpEntity, String.class);
            log.info("result: {}", xmlResult);
            return new ResultModel( ConvertUtils.xmlToMap(xmlResult), HttpStatus.OK);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
            return new ResultModel(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
