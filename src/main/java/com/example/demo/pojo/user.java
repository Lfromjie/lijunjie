package com.example.demo.pojo;


import lombok.*;
import lombok.experimental.Accessors;

@ToString
@Accessors(chain = true)
@AllArgsConstructor

public class user {
    @Setter
    private String host;

    @Getter
    private String user;

    @Getter
    @Setter
    private String password;


}