package com.eastwoo.socketkeyapi.api.dto;

import lombok.Data;

/**
 * packageName    : com.eastwoo.socketkeyapi.api.dto
 * fileName       : LoginResponse
 * author         : dongwoo
 * date           : 2024-09-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-09-05        dongwoo       최초 생성
 */
@Data
public class LoginResponse {
    private String apiKey;

    public LoginResponse(String apiKey) {
        this.apiKey = apiKey;
    }
}