package com.otmgorup.gitlabtransfer.api.dto;

import lombok.Data;

@Data
public class UserCreateDTO {
    private Integer id;

    private boolean admin;

    private  boolean can_create_group;

    private String email;

    private String name;

    private String password;

    private String username;

    private Boolean skip_confirmation;
}
