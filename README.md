# wechat4j
用java实现的微信客户端，支持自动聊天, 消息监听，自动回复，添加好友，获取群成员列表,自动记录聊天记录，自动下载图片，语音，视频消息

QQ交流群:580889921


# 启动方式
###  1:控制台启动
    自定任意类，在main方法下用WecahtStartup.login()实现扫码登陆
```
WechatMeta meta = WechatStartup.login();	
```
登陆成功后，会返回WechatMeta实例，里面包含了当前扫码用户的登陆信息，后面所有的功能都需要该实例
WechatApiUtil类封装微信的相关接口，具体功能实现在plugin及其实子包里，您也可以在这基础上扩展



### 下载jar包体验
[wechat4j.jar](https://github.com/hexiangtao/wechat4j/blob/master/assert/wechat4j.jar)

####  运行方式
````
java -jar  wechat4j.jar
````


启动后控制台如下:
![demo](https://github.com/hexiangtao/wechat4j/blob/master/assert/console1.png)


#### 代码示例
![demo](https://github.com/hexiangtao/wechat4j/blob/master/assert/code0.png)



#### 运行示例图
![demo](https://github.com/hexiangtao/wechat4j/blob/master/assert/demo1.png)





