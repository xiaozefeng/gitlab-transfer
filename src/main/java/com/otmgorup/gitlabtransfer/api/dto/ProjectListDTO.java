package com.otmgorup.gitlabtransfer.api.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class ProjectListDTO {

    /**
     * id : 112
     * description :
     * name : distributionall
     * name_with_namespace : ota / distributionall
     * path : distributionall
     * path_with_namespace : ota/distributionall
     * created_at : 2021-03-16T01:31:58.733Z
     * default_branch : master
     * tag_list : []
     * ssh_url_to_repo : git@139.9.33.210:ota/distributionall.git
     * http_url_to_repo : http://139.9.33.210/ota/distributionall.git
     * web_url : http://139.9.33.210/ota/distributionall
     * readme_url : http://139.9.33.210/ota/distributionall/blob/master/README.md
     * avatar_url : null
     * star_count : 0
     * forks_count : 0
     * last_activity_at : 2021-03-16T01:31:58.733Z
     * namespace : {"id":69,"name":"ota","path":"ota","kind":"group","full_path":"ota","parent_id":null,"avatar_url":null,"web_url":"http://139.9.33.210/groups/ota"}
     * _links : {"self":"http://139.9.33.210/api/v4/projects/112","issues":"http://139.9.33.210/api/v4/projects/112/issues","merge_requests":"http://139.9.33.210/api/v4/projects/112/merge_requests","repo_branches":"http://139.9.33.210/api/v4/projects/112/repository/branches","labels":"http://139.9.33.210/api/v4/projects/112/labels","events":"http://139.9.33.210/api/v4/projects/112/events","members":"http://139.9.33.210/api/v4/projects/112/members"}
     * empty_repo : false
     * archived : false
     * visibility : private
     * resolve_outdated_diff_discussions : false
     * container_registry_enabled : true
     * container_expiration_policy : {"cadence":"7d","enabled":false,"keep_n":null,"older_than":null,"name_regex":null,"next_run_at":"2021-03-23T01:31:58.742Z"}
     * issues_enabled : true
     * merge_requests_enabled : true
     * wiki_enabled : true
     * jobs_enabled : true
     * snippets_enabled : true
     * issues_access_level : enabled
     * repository_access_level : enabled
     * merge_requests_access_level : enabled
     * wiki_access_level : enabled
     * builds_access_level : enabled
     * snippets_access_level : enabled
     * shared_runners_enabled : false
     * lfs_enabled : true
     * creator_id : 58
     * import_status : none
     * open_issues_count : 0
     * ci_default_git_depth : 50
     * public_jobs : true
     * build_timeout : 3600
     * auto_cancel_pending_pipelines : enabled
     * build_coverage_regex : null
     * ci_config_path :
     * shared_with_groups : []
     * only_allow_merge_if_pipeline_succeeds : false
     * request_access_enabled : true
     * only_allow_merge_if_all_discussions_are_resolved : false
     * remove_source_branch_after_merge : true
     * printing_merge_request_link_enabled : true
     * merge_method : merge
     * suggestion_commit_message : null
     * auto_devops_enabled : false
     * auto_devops_deploy_strategy : continuous
     * autoclose_referenced_issues : true
     * permissions : {"project_access":null,"group_access":{"access_level":50,"notification_level":3}}
     */

    @SerializedName("id")
    private Integer id;
    @SerializedName("description")
    private String description;
    @SerializedName("name")
    private String name;
    @SerializedName("name_with_namespace")
    private String nameWithNamespace;
    @SerializedName("path")
    private String path;
    @SerializedName("path_with_namespace")
    private String pathWithNamespace;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("default_branch")
    private String defaultBranch;
    @SerializedName("tag_list")
    private List<?> tagList;
    @SerializedName("ssh_url_to_repo")
    private String sshUrlToRepo;
    @SerializedName("http_url_to_repo")
    private String httpUrlToRepo;
    @SerializedName("web_url")
    private String webUrl;
    @SerializedName("readme_url")
    private String readmeUrl;
    @SerializedName("avatar_url")
    private Object avatarUrl;
    @SerializedName("star_count")
    private Integer starCount;
    @SerializedName("forks_count")
    private Integer forksCount;
    @SerializedName("last_activity_at")
    private String lastActivityAt;
    @SerializedName("namespace")
    private NamespaceDTO namespace;
    @SerializedName("_links")
    private LinksDTO links;
    @SerializedName("empty_repo")
    private Boolean emptyRepo;
    @SerializedName("archived")
    private Boolean archived;
    @SerializedName("visibility")
    private String visibility;
    @SerializedName("resolve_outdated_diff_discussions")
    private Boolean resolveOutdatedDiffDiscussions;
    @SerializedName("container_registry_enabled")
    private Boolean containerRegistryEnabled;
    @SerializedName("container_expiration_policy")
    private ContainerExpirationPolicyDTO containerExpirationPolicy;
    @SerializedName("issues_enabled")
    private Boolean issuesEnabled;
    @SerializedName("merge_requests_enabled")
    private Boolean mergeRequestsEnabled;
    @SerializedName("wiki_enabled")
    private Boolean wikiEnabled;
    @SerializedName("jobs_enabled")
    private Boolean jobsEnabled;
    @SerializedName("snippets_enabled")
    private Boolean snippetsEnabled;
    @SerializedName("issues_access_level")
    private String issuesAccessLevel;
    @SerializedName("repository_access_level")
    private String repositoryAccessLevel;
    @SerializedName("merge_requests_access_level")
    private String mergeRequestsAccessLevel;
    @SerializedName("wiki_access_level")
    private String wikiAccessLevel;
    @SerializedName("builds_access_level")
    private String buildsAccessLevel;
    @SerializedName("snippets_access_level")
    private String snippetsAccessLevel;
    @SerializedName("shared_runners_enabled")
    private Boolean sharedRunnersEnabled;
    @SerializedName("lfs_enabled")
    private Boolean lfsEnabled;
    @SerializedName("creator_id")
    private Integer creatorId;
    @SerializedName("import_status")
    private String importStatus;
    @SerializedName("open_issues_count")
    private Integer openIssuesCount;
    @SerializedName("ci_default_git_depth")
    private Integer ciDefaultGitDepth;
    @SerializedName("public_jobs")
    private Boolean publicJobs;
    @SerializedName("build_timeout")
    private Integer buildTimeout;
    @SerializedName("auto_cancel_pending_pipelines")
    private String autoCancelPendingPipelines;
    @SerializedName("build_coverage_regex")
    private Object buildCoverageRegex;
    @SerializedName("ci_config_path")
    private String ciConfigPath;
    @SerializedName("shared_with_groups")
    private List<?> sharedWithGroups;
    @SerializedName("only_allow_merge_if_pipeline_succeeds")
    private Boolean onlyAllowMergeIfPipelineSucceeds;
    @SerializedName("request_access_enabled")
    private Boolean requestAccessEnabled;
    @SerializedName("only_allow_merge_if_all_discussions_are_resolved")
    private Boolean onlyAllowMergeIfAllDiscussionsAreResolved;
    @SerializedName("remove_source_branch_after_merge")
    private Boolean removeSourceBranchAfterMerge;
    @SerializedName("printing_merge_request_link_enabled")
    private Boolean printingMergeRequestLinkEnabled;
    @SerializedName("merge_method")
    private String mergeMethod;
    @SerializedName("suggestion_commit_message")
    private Object suggestionCommitMessage;
    @SerializedName("auto_devops_enabled")
    private Boolean autoDevopsEnabled;
    @SerializedName("auto_devops_deploy_strategy")
    private String autoDevopsDeployStrategy;
    @SerializedName("autoclose_referenced_issues")
    private Boolean autocloseReferencedIssues;
    @SerializedName("permissions")
    private PermissionsDTO permissions;

    @NoArgsConstructor
    @Data
    public static class NamespaceDTO {
        /**
         * id : 69
         * name : ota
         * path : ota
         * kind : group
         * full_path : ota
         * parent_id : null
         * avatar_url : null
         * web_url : http://139.9.33.210/groups/ota
         */

        @SerializedName("id")
        private Integer id;
        @SerializedName("name")
        private String name;
        @SerializedName("path")
        private String path;
        @SerializedName("kind")
        private String kind;
        @SerializedName("full_path")
        private String fullPath;
        @SerializedName("parent_id")
        private Object parentId;
        @SerializedName("avatar_url")
        private Object avatarUrl;
        @SerializedName("web_url")
        private String webUrl;
    }

    @NoArgsConstructor
    @Data
    public static class LinksDTO {
        /**
         * self : http://139.9.33.210/api/v4/projects/112
         * issues : http://139.9.33.210/api/v4/projects/112/issues
         * merge_requests : http://139.9.33.210/api/v4/projects/112/merge_requests
         * repo_branches : http://139.9.33.210/api/v4/projects/112/repository/branches
         * labels : http://139.9.33.210/api/v4/projects/112/labels
         * events : http://139.9.33.210/api/v4/projects/112/events
         * members : http://139.9.33.210/api/v4/projects/112/members
         */

        @SerializedName("self")
        private String self;
        @SerializedName("issues")
        private String issues;
        @SerializedName("merge_requests")
        private String mergeRequests;
        @SerializedName("repo_branches")
        private String repoBranches;
        @SerializedName("labels")
        private String labels;
        @SerializedName("events")
        private String events;
        @SerializedName("members")
        private String members;
    }

    @NoArgsConstructor
    @Data
    public static class ContainerExpirationPolicyDTO {
        /**
         * cadence : 7d
         * enabled : false
         * keep_n : null
         * older_than : null
         * name_regex : null
         * next_run_at : 2021-03-23T01:31:58.742Z
         */

        @SerializedName("cadence")
        private String cadence;
        @SerializedName("enabled")
        private Boolean enabled;
        @SerializedName("keep_n")
        private Object keepN;
        @SerializedName("older_than")
        private Object olderThan;
        @SerializedName("name_regex")
        private Object nameRegex;
        @SerializedName("next_run_at")
        private String nextRunAt;
    }

    @NoArgsConstructor
    @Data
    public static class PermissionsDTO {
        /**
         * project_access : null
         * group_access : {"access_level":50,"notification_level":3}
         */

        @SerializedName("project_access")
        private Object projectAccess;
        @SerializedName("group_access")
        private GroupAccessDTO groupAccess;

        @NoArgsConstructor
        @Data
        public static class GroupAccessDTO {
            /**
             * access_level : 50
             * notification_level : 3
             */

            @SerializedName("access_level")
            private Integer accessLevel;
            @SerializedName("notification_level")
            private Integer notificationLevel;
        }
    }
}
