package com.cht.rdp.dto;

import lombok.Data;

@Data
public class ApiResponseModel {
    /** Api錯誤訊息 */
    private String error_message;

    public ApiResponseModel(String errorMessage){
        this.error_message = errorMessage;
    }
}
