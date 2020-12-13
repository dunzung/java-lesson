package com.dunzung.java.spring.common.mybatisplus.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class DruidConfiguration {

    @ConditionalOnClass(DruidDataSource.class)
    @ConditionalOnProperty(name = "spring.datasource.type", havingValue = "com.alibaba.druid.pool.DruidDataSource", matchIfMissing = true)
    static class Druid extends DruidConfiguration {

        @Bean
        @ConfigurationProperties("spring.datasource")
        public DruidDataSource druidDataSource() {
            return new DruidDataSource();
        }

        @Bean
        public PlatformTransactionManager txManager(DataSource dataSource) {
            return new DataSourceTransactionManager(dataSource);
        }

        @Bean
        public ServletRegistrationBean statViewServlet() {
            ServletRegistrationBean reg = new ServletRegistrationBean();
            reg.setServlet(new StatViewServlet());
            reg.addUrlMappings("/druid/*");
            reg.addInitParameter("loginUsername", "janson");
            reg.addInitParameter("loginPassword", "abc.123");
            reg.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
            return reg;
        }
    }

}
