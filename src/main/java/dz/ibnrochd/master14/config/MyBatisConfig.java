package dz.ibnrochd.master14.config;


import dz.ibnrochd.master14.dao.TraitmentRepository;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


import javax.sql.DataSource;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */
@Configuration
@MapperScan(basePackages = "dz.ibnrochd.master14.dao")
public class MyBatisConfig {

    @Primary
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:dz/ibnrochd/master14/dao/*.xml"));
        return bean.getObject();
    }

    @Bean
    public MapperFactoryBean<TraitmentRepository> traitmentMapper(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        MapperFactoryBean<TraitmentRepository> factoryBean = new MapperFactoryBean<>(TraitmentRepository.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }
}


