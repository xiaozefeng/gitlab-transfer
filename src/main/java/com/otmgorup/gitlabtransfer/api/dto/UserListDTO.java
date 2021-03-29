package com.otmgorup.gitlabtransfer.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class UserListDTO {

    /**
     * id : 59
     * name : 杨志龙
     * username : langlang
     * state : active
     * avatar_url : https://www.gravatar.com/avatar/daf3655bb86dc30a94c89adca7b5318a?s=80&d=identicon
     * web_url : http://139.9.33.210/langlang
     * created_at : 2021-03-22T02:31:06.234Z
     * bio : null
     * location : null
     * public_email :
     * skype :
     * linkedin :
     * twitter :
     * website_url :
     * organization : null
     * last_sign_in_at : 2021-03-22T04:05:41.356Z
     * confirmed_at : 2021-03-22T02:31:05.975Z
     * last_activity_on : 2021-03-23
     * email : zhilong.yang@otmgroup.cn
     * theme_id : 1
     * color_scheme_id : 1
     * projects_limit : 100000
     * current_sign_in_at : 2021-03-22T12:48:58.379Z
     * identities : []
     * can_create_group : false
     * can_create_project : true
     * two_factor_enabled : false
     * external : false
     * private_profile : false
     * is_admin : false
     */

    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("state")
    private String state;
    @SerializedName("avatar_url")
    private String avatarUrl;
    @SerializedName("web_url")
    private String webUrl;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("bio")
    private Object bio;
    @SerializedName("location")
    private Object location;
    @SerializedName("public_email")
    private String publicEmail;
    @SerializedName("skype")
    private String skype;
    @SerializedName("linkedin")
    private String linkedin;
    @SerializedName("twitter")
    private String twitter;
    @SerializedName("website_url")
    private String websiteUrl;
    @SerializedName("organization")
    private Object organization;
    @SerializedName("last_sign_in_at")
    private String lastSignInAt;
    @SerializedName("confirmed_at")
    private String confirmedAt;
    @SerializedName("last_activity_on")
    private String lastActivityOn;
    @SerializedName("email")
    private String email;
    @SerializedName("theme_id")
    private Integer themeId;
    @SerializedName("color_scheme_id")
    private Integer colorSchemeId;
    @SerializedName("projects_limit")
    private Integer projectsLimit;
    @SerializedName("current_sign_in_at")
    private String currentSignInAt;
    @SerializedName("identities")
    private List<?> identities;
    @SerializedName("can_create_group")
    private Boolean canCreateGroup;
    @SerializedName("can_create_project")
    private Boolean canCreateProject;
    @SerializedName("two_factor_enabled")
    private Boolean twoFactorEnabled;
    @SerializedName("external")
    private Boolean external;
    @SerializedName("private_profile")
    private Boolean privateProfile;
    @SerializedName("is_admin")
    private Boolean isAdmin;
}
