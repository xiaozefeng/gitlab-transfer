package com.otmgorup.gitlabtransfer.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class Group {

    /**
     * id : 69
     * web_url : http://139.9.33.210/groups/ota
     * name : ota
     * path : ota
     * description :
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
     * full_name : ota
     * full_path : ota
     * parent_id : null
     * runners_token : CY-e9cFSJyAaGRY4uq9L
     * projects : [{"id":112,"description":"","name":"distributionall","name_with_namespace":"ota / distributionall","path":"distributionall","path_with_namespace":"ota/distributionall","created_at":"2021-03-16T01:31:58.733Z","default_branch":"master","tag_list":[],"ssh_url_to_repo":"git@139.9.33.210:ota/distributionall.git","http_url_to_repo":"http://139.9.33.210/ota/distributionall.git","web_url":"http://139.9.33.210/ota/distributionall","readme_url":"http://139.9.33.210/ota/distributionall/blob/master/README.md","avatar_url":null,"star_count":0,"forks_count":0,"last_activity_at":"2021-03-16T01:31:58.733Z","namespace":{"id":69,"name":"ota","path":"ota","kind":"group","full_path":"ota","parent_id":null,"avatar_url":null,"web_url":"http://139.9.33.210/groups/ota"},"_links":{"self":"http://139.9.33.210/api/v4/projects/112","issues":"http://139.9.33.210/api/v4/projects/112/issues","merge_requests":"http://139.9.33.210/api/v4/projects/112/merge_requests","repo_branches":"http://139.9.33.210/api/v4/projects/112/repository/branches","labels":"http://139.9.33.210/api/v4/projects/112/labels","events":"http://139.9.33.210/api/v4/projects/112/events","members":"http://139.9.33.210/api/v4/projects/112/members"},"empty_repo":false,"archived":false,"visibility":"private","resolve_outdated_diff_discussions":false,"container_registry_enabled":true,"container_expiration_policy":{"cadence":"7d","enabled":false,"keep_n":null,"older_than":null,"name_regex":null,"next_run_at":"2021-03-23T01:31:58.742Z"},"issues_enabled":true,"merge_requests_enabled":true,"wiki_enabled":true,"jobs_enabled":true,"snippets_enabled":true,"issues_access_level":"enabled","repository_access_level":"enabled","merge_requests_access_level":"enabled","wiki_access_level":"enabled","builds_access_level":"enabled","snippets_access_level":"enabled","shared_runners_enabled":false,"lfs_enabled":true,"creator_id":58,"import_status":"none","open_issues_count":0,"ci_default_git_depth":50,"public_jobs":true,"build_timeout":3600,"auto_cancel_pending_pipelines":"enabled","build_coverage_regex":null,"ci_config_path":"","shared_with_groups":[],"only_allow_merge_if_pipeline_succeeds":false,"request_access_enabled":true,"only_allow_merge_if_all_discussions_are_resolved":false,"remove_source_branch_after_merge":true,"printing_merge_request_link_enabled":true,"merge_method":"merge","suggestion_commit_message":null,"auto_devops_enabled":false,"auto_devops_deploy_strategy":"continuous","autoclose_referenced_issues":true},{"id":109,"description":"","name":"bc-elong","name_with_namespace":"ota / bc-elong","path":"bc-elong","path_with_namespace":"ota/bc-elong","created_at":"2021-03-15T10:49:23.462Z","default_branch":"master","tag_list":[],"ssh_url_to_repo":"git@139.9.33.210:ota/bc-elong.git","http_url_to_repo":"http://139.9.33.210/ota/bc-elong.git","web_url":"http://139.9.33.210/ota/bc-elong","readme_url":"http://139.9.33.210/ota/bc-elong/blob/master/readme.md","avatar_url":null,"star_count":0,"forks_count":0,"last_activity_at":"2021-03-23T08:57:45.907Z","namespace":{"id":69,"name":"ota","path":"ota","kind":"group","full_path":"ota","parent_id":null,"avatar_url":null,"web_url":"http://139.9.33.210/groups/ota"},"_links":{"self":"http://139.9.33.210/api/v4/projects/109","issues":"http://139.9.33.210/api/v4/projects/109/issues","merge_requests":"http://139.9.33.210/api/v4/projects/109/merge_requests","repo_branches":"http://139.9.33.210/api/v4/projects/109/repository/branches","labels":"http://139.9.33.210/api/v4/projects/109/labels","events":"http://139.9.33.210/api/v4/projects/109/events","members":"http://139.9.33.210/api/v4/projects/109/members"},"empty_repo":false,"archived":false,"visibility":"private","resolve_outdated_diff_discussions":false,"container_registry_enabled":true,"container_expiration_policy":{"cadence":"7d","enabled":false,"keep_n":null,"older_than":null,"name_regex":null,"next_run_at":"2021-03-22T10:49:23.468Z"},"issues_enabled":true,"merge_requests_enabled":true,"wiki_enabled":true,"jobs_enabled":true,"snippets_enabled":true,"issues_access_level":"enabled","repository_access_level":"enabled","merge_requests_access_level":"enabled","wiki_access_level":"enabled","builds_access_level":"enabled","snippets_access_level":"enabled","shared_runners_enabled":false,"lfs_enabled":true,"creator_id":58,"import_status":"none","open_issues_count":0,"ci_default_git_depth":50,"public_jobs":true,"build_timeout":3600,"auto_cancel_pending_pipelines":"enabled","build_coverage_regex":null,"ci_config_path":"","shared_with_groups":[],"only_allow_merge_if_pipeline_succeeds":false,"request_access_enabled":true,"only_allow_merge_if_all_discussions_are_resolved":false,"remove_source_branch_after_merge":true,"printing_merge_request_link_enabled":true,"merge_method":"merge","suggestion_commit_message":null,"auto_devops_enabled":false,"auto_devops_deploy_strategy":"continuous","autoclose_referenced_issues":true}]
     * shared_projects : []
     */

    @com.google.gson.annotations.SerializedName("id")
    private Integer id;
    @com.google.gson.annotations.SerializedName("web_url")
    private String webUrl;
    @com.google.gson.annotations.SerializedName("name")
    private String name;
    @com.google.gson.annotations.SerializedName("path")
    private String path;
    @com.google.gson.annotations.SerializedName("description")
    private String description;
    @com.google.gson.annotations.SerializedName("visibility")
    private String visibility;
    @com.google.gson.annotations.SerializedName("share_with_group_lock")
    private Boolean shareWithGroupLock;
    @com.google.gson.annotations.SerializedName("require_two_factor_authentication")
    private Boolean requireTwoFactorAuthentication;
    @com.google.gson.annotations.SerializedName("two_factor_grace_period")
    private Integer twoFactorGracePeriod;
    @com.google.gson.annotations.SerializedName("project_creation_level")
    private String projectCreationLevel;
    @com.google.gson.annotations.SerializedName("auto_devops_enabled")
    private Object autoDevopsEnabled;
    @com.google.gson.annotations.SerializedName("subgroup_creation_level")
    private String subgroupCreationLevel;
    @com.google.gson.annotations.SerializedName("emails_disabled")
    private Object emailsDisabled;
    @com.google.gson.annotations.SerializedName("mentions_disabled")
    private Object mentionsDisabled;
    @com.google.gson.annotations.SerializedName("lfs_enabled")
    private Boolean lfsEnabled;
    @com.google.gson.annotations.SerializedName("avatar_url")
    private Object avatarUrl;
    @com.google.gson.annotations.SerializedName("request_access_enabled")
    private Boolean requestAccessEnabled;
    @com.google.gson.annotations.SerializedName("full_name")
    private String fullName;
    @com.google.gson.annotations.SerializedName("full_path")
    private String fullPath;
    @com.google.gson.annotations.SerializedName("parent_id")
    private Object parentId;
    @com.google.gson.annotations.SerializedName("runners_token")
    private String runnersToken;
    @com.google.gson.annotations.SerializedName("projects")
    private List<ProjectsDTO> projects;
    @com.google.gson.annotations.SerializedName("shared_projects")
    private List<?> sharedProjects;

    @NoArgsConstructor
    @Data
    public static class ProjectsDTO {
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
         */

        @com.google.gson.annotations.SerializedName("id")
        private Integer id;
        @com.google.gson.annotations.SerializedName("description")
        private String description;
        @com.google.gson.annotations.SerializedName("name")
        private String name;
        @com.google.gson.annotations.SerializedName("name_with_namespace")
        private String nameWithNamespace;
        @com.google.gson.annotations.SerializedName("path")
        private String path;
        @com.google.gson.annotations.SerializedName("path_with_namespace")
        private String pathWithNamespace;
        @com.google.gson.annotations.SerializedName("created_at")
        private String createdAt;
        @com.google.gson.annotations.SerializedName("default_branch")
        private String defaultBranch;
        @com.google.gson.annotations.SerializedName("tag_list")
        private List<?> tagList;
        @com.google.gson.annotations.SerializedName("ssh_url_to_repo")
        private String sshUrlToRepo;
        @com.google.gson.annotations.SerializedName("http_url_to_repo")
        private String httpUrlToRepo;
        @com.google.gson.annotations.SerializedName("web_url")
        private String webUrl;
        @com.google.gson.annotations.SerializedName("readme_url")
        private String readmeUrl;
        @com.google.gson.annotations.SerializedName("avatar_url")
        private Object avatarUrl;
        @com.google.gson.annotations.SerializedName("star_count")
        private Integer starCount;
        @com.google.gson.annotations.SerializedName("forks_count")
        private Integer forksCount;
        @com.google.gson.annotations.SerializedName("last_activity_at")
        private String lastActivityAt;
        @com.google.gson.annotations.SerializedName("namespace")
        private ProjectsDTO.NamespaceDTO namespace;
        @com.google.gson.annotations.SerializedName("_links")
        private ProjectsDTO.LinksDTO links;
        @com.google.gson.annotations.SerializedName("empty_repo")
        private Boolean emptyRepo;
        @com.google.gson.annotations.SerializedName("archived")
        private Boolean archived;
        @com.google.gson.annotations.SerializedName("visibility")
        private String visibility;
        @com.google.gson.annotations.SerializedName("resolve_outdated_diff_discussions")
        private Boolean resolveOutdatedDiffDiscussions;
        @com.google.gson.annotations.SerializedName("container_registry_enabled")
        private Boolean containerRegistryEnabled;
        @com.google.gson.annotations.SerializedName("container_expiration_policy")
        private ProjectsDTO.ContainerExpirationPolicyDTO containerExpirationPolicy;
        @com.google.gson.annotations.SerializedName("issues_enabled")
        private Boolean issuesEnabled;
        @com.google.gson.annotations.SerializedName("merge_requests_enabled")
        private Boolean mergeRequestsEnabled;
        @com.google.gson.annotations.SerializedName("wiki_enabled")
        private Boolean wikiEnabled;
        @com.google.gson.annotations.SerializedName("jobs_enabled")
        private Boolean jobsEnabled;
        @com.google.gson.annotations.SerializedName("snippets_enabled")
        private Boolean snippetsEnabled;
        @com.google.gson.annotations.SerializedName("issues_access_level")
        private String issuesAccessLevel;
        @com.google.gson.annotations.SerializedName("repository_access_level")
        private String repositoryAccessLevel;
        @com.google.gson.annotations.SerializedName("merge_requests_access_level")
        private String mergeRequestsAccessLevel;
        @com.google.gson.annotations.SerializedName("wiki_access_level")
        private String wikiAccessLevel;
        @com.google.gson.annotations.SerializedName("builds_access_level")
        private String buildsAccessLevel;
        @com.google.gson.annotations.SerializedName("snippets_access_level")
        private String snippetsAccessLevel;
        @com.google.gson.annotations.SerializedName("shared_runners_enabled")
        private Boolean sharedRunnersEnabled;
        @com.google.gson.annotations.SerializedName("lfs_enabled")
        private Boolean lfsEnabled;
        @com.google.gson.annotations.SerializedName("creator_id")
        private Integer creatorId;
        @com.google.gson.annotations.SerializedName("import_status")
        private String importStatus;
        @com.google.gson.annotations.SerializedName("open_issues_count")
        private Integer openIssuesCount;
        @com.google.gson.annotations.SerializedName("ci_default_git_depth")
        private Integer ciDefaultGitDepth;
        @com.google.gson.annotations.SerializedName("public_jobs")
        private Boolean publicJobs;
        @com.google.gson.annotations.SerializedName("build_timeout")
        private Integer buildTimeout;
        @com.google.gson.annotations.SerializedName("auto_cancel_pending_pipelines")
        private String autoCancelPendingPipelines;
        @com.google.gson.annotations.SerializedName("build_coverage_regex")
        private Object buildCoverageRegex;
        @com.google.gson.annotations.SerializedName("ci_config_path")
        private String ciConfigPath;
        @com.google.gson.annotations.SerializedName("shared_with_groups")
        private List<?> sharedWithGroups;
        @com.google.gson.annotations.SerializedName("only_allow_merge_if_pipeline_succeeds")
        private Boolean onlyAllowMergeIfPipelineSucceeds;
        @com.google.gson.annotations.SerializedName("request_access_enabled")
        private Boolean requestAccessEnabled;
        @com.google.gson.annotations.SerializedName("only_allow_merge_if_all_discussions_are_resolved")
        private Boolean onlyAllowMergeIfAllDiscussionsAreResolved;
        @com.google.gson.annotations.SerializedName("remove_source_branch_after_merge")
        private Boolean removeSourceBranchAfterMerge;
        @com.google.gson.annotations.SerializedName("printing_merge_request_link_enabled")
        private Boolean printingMergeRequestLinkEnabled;
        @com.google.gson.annotations.SerializedName("merge_method")
        private String mergeMethod;
        @com.google.gson.annotations.SerializedName("suggestion_commit_message")
        private Object suggestionCommitMessage;
        @com.google.gson.annotations.SerializedName("auto_devops_enabled")
        private Boolean autoDevopsEnabled;
        @com.google.gson.annotations.SerializedName("auto_devops_deploy_strategy")
        private String autoDevopsDeployStrategy;
        @com.google.gson.annotations.SerializedName("autoclose_referenced_issues")
        private Boolean autocloseReferencedIssues;

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

            @com.google.gson.annotations.SerializedName("id")
            private Integer id;
            @com.google.gson.annotations.SerializedName("name")
            private String name;
            @com.google.gson.annotations.SerializedName("path")
            private String path;
            @com.google.gson.annotations.SerializedName("kind")
            private String kind;
            @com.google.gson.annotations.SerializedName("full_path")
            private String fullPath;
            @com.google.gson.annotations.SerializedName("parent_id")
            private Object parentId;
            @com.google.gson.annotations.SerializedName("avatar_url")
            private Object avatarUrl;
            @com.google.gson.annotations.SerializedName("web_url")
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

            @com.google.gson.annotations.SerializedName("self")
            private String self;
            @com.google.gson.annotations.SerializedName("issues")
            private String issues;
            @com.google.gson.annotations.SerializedName("merge_requests")
            private String mergeRequests;
            @com.google.gson.annotations.SerializedName("repo_branches")
            private String repoBranches;
            @com.google.gson.annotations.SerializedName("labels")
            private String labels;
            @com.google.gson.annotations.SerializedName("events")
            private String events;
            @com.google.gson.annotations.SerializedName("members")
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

            @com.google.gson.annotations.SerializedName("cadence")
            private String cadence;
            @com.google.gson.annotations.SerializedName("enabled")
            private Boolean enabled;
            @com.google.gson.annotations.SerializedName("keep_n")
            private Object keepN;
            @com.google.gson.annotations.SerializedName("older_than")
            private Object olderThan;
            @com.google.gson.annotations.SerializedName("name_regex")
            private Object nameRegex;
            @com.google.gson.annotations.SerializedName("next_run_at")
            private String nextRunAt;
        }
    }
}
