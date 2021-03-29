package com.otmgorup.gitlabtransfer.api.dto;

import lombok.Data;

@Data
public class AddProjectDTO {


    private Integer id;

    private String name;

    private String path;

    private String import_url;

    private Integer namespace_id;

}
