package com.example.javacase.dtos.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class UserInfoResponse {

    private Integer id;

    private String username;

    private String email;

    private List<String> roles;


    public UserInfoResponse(Integer id, String username, String email, List<String> roles) {
    }
}
