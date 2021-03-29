# Gitlab-Transfer  For  CE

[FAQ](https://github.com/xiaozefeng/gitlab-transfer/wiki/FAQ)

## Reason

gitlab近日爆出一个漏洞 https://s.tencent.com/research/bsafe/1275.html

为了解决这个问题，需要升级到官方推荐的版本

但是:

#### 坑1

gitlab 如果版本比较低的情况，是不能直接升级到最新版本的

比如安全版本是 13.9.4 , 本地版本是　12.7.5 那么需要根据官方的升级路线一个一个去升级  , 可参考 https://docs.gitlab.com/ee/policy/maintenance.html#upgrade-recommendations

但是我太懒了，不想这么干，想想要一级一级的升，中间可能会出现非常多问题，我没耐心去一个一个去解决。就算解决下来，万一遇到一个解决不了的，那就ＧＧ了。越是复杂的事物越是容易出问题。



#### 坑2

当时我想到了一个其他的方案，不如把当前系统的数据备份，然后在新机器上安装一个最新安全版本，然后把数据在新机器上恢复。

后来去网上求证了下，是不可行的。

数据备份+恢复的策略只能在同版本之间进行，因为不同版本的数据库可能存在差异



## Solution

基于以上问题，我又想到了一个其他的方案。

gitlab是支持 `REST API`的，能否通过API把数据拉下来，把数据处理一遍再上传到新版本的服务器呢？ 

这个项目就是基于这个思想去做的。



## Usage

先讲讲怎么样



### 下载项目

```bash
git clone https://github.com/xiaozefeng/gitlab-transfer.git
```

### 配置

找到 `application.yml`文件

```yml
gitlab:
  sourceUrl: http://xxx/api/v4/   # 数据来源的gitlab api地址
  sourceToken: w7hf-xzGxaa_bayPMqdF # 数据来源的api token
  # username 和 password 主要是用来从原始服务器，把project 导入到 新的服务中
  sourceUserName: mickey.xiao  # 数据来源的 username
  sourcePassword: 1qaz@WSX     # 数据来源的 password
  targetUrl: http://yyy/api/v4/   #  目标gitlab的 api 地址
  targetToken: wqzeyya4xzEa9GYeYWBq # 目标gitlab的 token
  defaultPassword: 1qaz@WSX123  # 目标gitlab的 默认密码
```



### 运行

```bash
cd gitlab-transfer
maven clean package -Dmaven.test.skip=true  # 或者导入到idea中，运行GitlabTransferApplication
# 打包成功后
java -jar target/gitlab-transfer-0.0.1-SNAPSHOT.jar
# 启动成功后
curl http://localhost:9090/entrance
```





## Current Situation

目前支持同步  

[x] group

[x] user

[x] project 

[x] 以及group, user, project 之间的关系

如果需要支持更多功能，可以提 PR 或者 Issue



## Conclusion

欢迎 pr 和 star

