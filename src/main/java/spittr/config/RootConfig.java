package spittr.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * Created by admin on 2018-02-04.
 */
@Configuration
@ComponentScan(basePackages = {"spittr"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/cls_weeklyreport?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=UTC");
        ds.setUsername("clstest");
        ds.setPassword("clstest");
        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        SqlSessionFactory object = null;
        sqlSessionFactory.setDataSource(dataSource());
        sqlSessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:Mybatis-config.xml"));
//        sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper\\*.xml"));
        System.out.println("return sqlSessionFactory");
        try {
            object = sqlSessionFactory.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
