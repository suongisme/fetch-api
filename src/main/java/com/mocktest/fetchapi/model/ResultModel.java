package com.mocktest.fetchapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * @author SuongNguyen
 * @created 3/27/2022
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResultModel {
    private Object data;
    private HttpStatus status;
}
