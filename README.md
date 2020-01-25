# IMCHP

#### Minecraft 服务端轻量级等级血量插件

#### 使用插件

无配置文件，参数都是写死的（主要就几句代码，没有必要复杂化），自行修改编译

1. 导入项目到 IDE 中（Eclipse / IDEA）
2. 修改你想要的参数
3. 导出为 jar 文件（包含 plugin.yml）
4. 将 jar 放到服务端 plugin 文件夹内，重载服务器

#### 游戏中使用
基本等级换算血量的算法
> 20 + 等级 ÷ 2
20 基本生存血量，加上等级兑换的血量
event.getNewLevel() 获取升级后的等级，根据需求修改算法

#### 版本兼容
基于 Spigot 1.15.1 开发，理论兼容很多版本，毕竟代码很少，也没有使用较新的方法


个人博客：<https://www.imyeyu.net>