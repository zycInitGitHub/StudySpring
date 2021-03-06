第十二章 使用NoSQL数据库
    本章内容：
        1、为MongoDB和Neo4j编写Repository
        2、为多种数据存储形式持久化数据
        3、组合使用Spring与Redis
    12.1 使用MongoDB持久化文档数据
        MongoDB是最为流行的的开源文档数据库之一。
        Spring Data MongoDB提供了三种方式在Spring应用中使用MongoDB
            1、通过注解实现对象-文档映射
            2、使用MongoDBTemplate实现基于模板的数据库访问
            3、自动化的运行时Repository生成功能。
        12.1.1 启动MongoDB
        12.1.2 为模型添加注解，实现MongoDB持久化
        12.1.3 使用MongoTemplate访问MongoDB
        12.1.4 编写MongDB Repository
            添加自定义的查询方法
            指定查询
            混合自定义性能
    12.2 使用Neo4j操作图数据
        12.2.1 配置Spring Data Neo4j
        12.2.2 使用注解标注图实体
        12.2.3 使用Neo4jTemplate
        12.2.4 创建自动化的Neo4j Repository
            添加查询方法
            自定义查询方法
            混合自定义性能
    12.3 使用Redis操作key-value数据
        12.3.1 连接到Redis
            Spring Data为四种Redis客户端提供实现：
                JdeisConnectionFactory
                JredisConnectionFactory
                LettuceConnectionFactory
                SrpConnectionFactory
        12.3.2 使用redisTemplate
            Spring Data Redis提供了两个模板：
                RedisTemplate
                StringRedisTemplate
            使用最简单的值
            使用List类型的值
            在set上执行操作
            绑定到某个key上
        12.3.3 使用key和value的序列化器
    12.4 小结
