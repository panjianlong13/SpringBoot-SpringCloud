package com.peter.springboot.dubbo.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName: PropertiesConfig
 * @Description: 加载配置
 * @author Peter Pan
 * @date 2018年12月12日
 *
 */
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource({ "classpath:dubbo/*.xml" })
public class PropertiesConfig {
}
