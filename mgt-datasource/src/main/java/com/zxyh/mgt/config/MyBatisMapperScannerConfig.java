package com.zxyh.mgt.config;

import com.zxyh.mgt.mapper.BaseMapper;
import com.zxyh.mgt.mapper.LogBaseMapper;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter({MyBatisSessionFactoryConfig.class})
public class MyBatisMapperScannerConfig {

    @Value("${mapping.basePackage}")
    private String basePackage;

    @Value("${mapping.logBasePackage}")
    private String logBasePackage;

	private static Logger logger = LoggerFactory.getLogger(MyBatisMapperScannerConfig.class);

    @Bean(name="mapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer() {
    	logger.info("Database Scanner File");
        MapperScannerConfigurer readMapperScannerConfigurer = new MapperScannerConfigurer();
        readMapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        readMapperScannerConfigurer.setBasePackage("com.zxyh.mgt");
        readMapperScannerConfigurer.setMarkerInterface(BaseMapper.class);
        return readMapperScannerConfigurer;
    }

    @Bean(name="logMapperScannerConfigurer")
    public MapperScannerConfigurer logMapperScannerConfigurer() {
        logger.info("Database Scanner File");
        MapperScannerConfigurer readMapperScannerConfigurer = new MapperScannerConfigurer();
        readMapperScannerConfigurer.setSqlSessionFactoryBeanName("logSqlSessionFactory");
//        readMapperScannerConfigurer.setBasePackage(logBasePackage);
        readMapperScannerConfigurer.setBasePackage("com.zxyh.mgt");
        readMapperScannerConfigurer.setMarkerInterface(LogBaseMapper.class);
        return readMapperScannerConfigurer;
    }
}
