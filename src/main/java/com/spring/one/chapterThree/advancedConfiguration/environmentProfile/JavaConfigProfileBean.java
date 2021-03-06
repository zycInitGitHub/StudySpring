package com.spring.one.chapterThree.advancedConfiguration.environmentProfile;

import org.springframework.context.annotation.Configuration;

/**
 * 3.1.1配置profile bean 使用javaConfig的方式进行差异化配置
 * 从Spring3.2开始@Profile不仅仅可以写在类上，也可以写在方法上，这样就可以使两个完全不同的配置写在同一个类中
 */
@Configuration
//@Profile("prod") //3.2之前，该属性只可以写在java类上
public class JavaConfigProfileBean {

    //@Bean
    //@Profile("dev")
    //public DataSource embeddeDataSource () {
    //    return new EmbeddedDatabaseBuilder()
    //            .setType(EmbeddedDatabaseType.H2)
    //            .addScript("classpath:schema.sql")
    //            .addScript("classpath:test-data.sql")
    //            .build();
    //}
    //
    //@Bean
    //@Profile("prod")
    //public DataSource jndiDataSource () {
    //    JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
    //    jndiObjectFactoryBean.setJndiName("jdbc/myDS");
    //    jndiObjectFactoryBean.setResourceRef(true);
    //    jndiObjectFactoryBean.setProxyInterface(javax.sql.DataSource.class);
    //    return (DataSource) jndiObjectFactoryBean.getObject ();
    //}
}