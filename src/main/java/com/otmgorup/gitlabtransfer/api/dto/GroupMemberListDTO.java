package com.otmgorup.gitlabtransfer.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class GroupMemberListDTO {

    /**
     * id : 1
     * username : raymond_smith
     * name : Raymond Smith
     * state : active
     * avatar_url : https://www.gravatar.com/avatar/c2525a7f58ae3776070e44c106c48e15?s=80&d=identicon
     * web_url : http://192.168.1.8:3000/root
     * expires_at : 2012-10-22T14:13:35Z
     * access_level : 30
     * group_saml_identity : null
     */

    @SerializedName("id")
    private Integer id;
    @SerializedName("username")
    private String username;
    @SerializedName("name")
    private String name;
    @SerializedName("state")
    private String state;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("web_url")
    private String webUrl;
    @SerializedName("expires_at")
    private String expiresAt;
    @SerializedName("access_level")
    private Integer accessLevel;
    @SerializedName("group_saml_identity")
    private Object groupSamlIdentity;
}

