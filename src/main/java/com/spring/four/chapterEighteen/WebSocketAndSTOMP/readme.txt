第十八章 使用WebSocket和STOMP实现消息功能
    本章内容：
        1、在浏览器与服务器之间发送消息
        2、在Spring MVC控制器中处理消息
        3、为目标用户发送消息
    18.1 使用Spring的低层级WebScocket API
    18.2 应对不支持WebSocket的场景
    18.3 使用STOMP消息
        18.3.1 启动STOMP消息功能
            启动STOMP代理中继
        18.3.2 处理来自客户端的STOMP消息
            处理订阅
            编写JavaScript客户端
        18.3.3 发送消息到客户端
            Spring提供了两种发送数据给客户端的方法：
                1、作为处理消息或处理订阅的附带结果
                2、使用消息模板
            在处理消息之后，发送数据
            在应用的任意地方发送消息
    18.4 为目标用户发送消息
        18.4.1 在控制器中处理用户信息
        18.4.2 为指定用户发送消息
    18.5 处理消息异常
    18.6 小结