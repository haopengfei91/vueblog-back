package com.faymax.shiro;

import lombok.Data;

import java.io.Serializable;

@Data
public class AccountProfile implements Serializable {

    private Long id;
    private String username;
    private String avater;
    private String email;
}
