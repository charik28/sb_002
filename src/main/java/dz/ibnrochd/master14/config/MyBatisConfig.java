package dz.ibnrochd.master14.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @project sb_002
 * @Author Abdessamie Charik on 28/04/2024
 */
@Configuration
@MapperScan(basePackages = "dz.ibnrochd.master14.dao")

public class MyBatisConfig {
}
