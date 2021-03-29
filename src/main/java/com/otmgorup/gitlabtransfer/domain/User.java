package com.otmgorup.gitlabtransfer.domain;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class User {

    /**
     * id : 37
     * name : mickey
     * username : mickey.xiao
     * state : active
     * avatar_url : https://www.gravatar.com/avatar/d219af79b45e5891507fda4c4c2139a0?s=80&d=identicon
     * web_url : http://139.9.33.210/mickey.xiao
     * created_at : 2020-04-01T03:10:14.334Z
     * bio :
     * location :
     * public_email :
     * skype :
     * linkedin :
     * twitter :
     * website_url :
     * organization :
     * last_sign_in_at : 2021-03-22T08:29:25.203Z
     * confirmed_at : 2020-04-01T03:10:14.138Z
     * last_activity_on : 2021-03-23
     * email : 1@1.com
     * theme_id : 1
     * color_scheme_id : 1
     * projects_limit : 100000
     * current_sign_in_at : 2021-03-23T08:03:05.618Z
     * identities : []
     * can_create_group : true
     * can_create_project : true
     * two_factor_enabled : false
     * external : false
     * private_profile : false
     * is_admin : true
     * highest_role : 50
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
    private String bio;
    @SerializedName("location")
    private String location;
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
    private String organization;
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
    @SerializedName("highest_role")
    private Integer highestRole;
}
