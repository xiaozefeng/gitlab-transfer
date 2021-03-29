package com.otmgorup.gitlabtransfer.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author mickey
 * @date 3/24/21 08:31
 */
@NoArgsConstructor
@Data
public class GroupListDTO {

    /**
     * id : 45
     * web_url : http://139.9.33.210/groups/common
     * name : common
     * path : common
     * description : 公共组件
     * visibility : private
     * share_with_group_lock : false
     * require_two_factor_authentication : false
     * two_factor_grace_period : 48
     * project_creation_level : developer
     * auto_devops_enabled : null
     * subgroup_creation_level : maintainer
     * emails_disabled : null
     * mentions_disabled : null
     * lfs_enabled : true
     * avatar_url : null
     * request_access_enabled : true
     * full_name : common
     * full_path : common
     * parent_id : null
     */

    @SerializedName("id")
    private Integer id;
    @SerializedName("web_url")
    private String webUrl;
    @SerializedName("name")
    private String name;
    @SerializedName("path")
    private String path;
    @SerializedName("description")
    private String description;
    @SerializedName("visibility")
    private String visibility;
    @SerializedName("share_with_group_lock")
    private Boolean shareWithGroupLock;
    @SerializedName("require_two_factor_authentication")
    private Boolean requireTwoFactorAuthentication;
    @SerializedName("two_factor_grace_period")
    private Integer twoFactorGracePeriod;
    @SerializedName("project_creation_level")
    private String projectCreationLevel;
    @SerializedName("auto_devops_enabled")
    private Object autoDevopsEnabled;
    @SerializedName("subgroup_creation_level")
    private String subgroupCreationLevel;
    @SerializedName("emails_disabled")
    private Object emailsDisabled;
    @SerializedName("mentions_disabled")
    private Object mentionsDisabled;
    @SerializedName("lfs_enabled")
    private Boolean lfsEnabled;
    @SerializedName("avatar_url")
    private Object avatarUrl;
    @SerializedName("request_access_enabled")
    private Boolean requestAccessEnabled;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("full_path")
    private String fullPath;
    @SerializedName("parent_id")
    private Object parentId;
}
