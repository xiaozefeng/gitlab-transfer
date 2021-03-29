package com.otmgorup.gitlabtransfer.api.dto;

import lombok.Data;

@Data
public class AddUserToGroupDTO {

    private Integer user_id;

    private Integer access_level;
}
