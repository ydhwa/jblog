package com.cafe24.jblog.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.cafe24.config.app.DBDeveloperConfig;
import com.cafe24.config.app.DBProductionConfig;
import com.cafe24.config.app.MyBatisConfig;

@Configuration
@EnableAspectJAutoProxy	// 오토프록시 설정
@ComponentScan({"com.cafe24.jblog.service", "com.cafe24.jblog.repository", "com.cafe24.jblog.aspect"})
@Import({DBDeveloperConfig.class, DBProductionConfig.class, MyBatisConfig.class})
public class AppConfig {

}
