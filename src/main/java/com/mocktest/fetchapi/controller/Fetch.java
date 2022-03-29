package com.mocktest.fetchapi.controller;

import com.mocktest.fetchapi.model.OTAAirLowFareSearchRQ;
import com.mocktest.fetchapi.model.ResultModel;
import com.mocktest.fetchapi.service.FetchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SuongNguyen
 * @created 3/25/2022
 */

@RestController
@RequestMapping("/fetch")
@RequiredArgsConstructor
public class Fetch {

    private final FetchService fetchService;

    @PostMapping(consumes = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE
    }, produces = {
            MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE
    })
    public ResponseEntity fetchApi(@RequestBody OTAAirLowFareSearchRQ otaAirLowFareSearchRQ) {
        ResultModel result = this.fetchService.search(otaAirLowFareSearchRQ);
        return ResponseEntity.status(result.getStatus()).body(result.getData());
    }
}
