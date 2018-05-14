package com.xhx.vns.confg;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 解决跨域问题
 *
 * @author XHX
 * @date 2018/5/9.
 */
@Configuration
public class CROSConfiguration implements WebMvcConfigurer {

    private Logger logger = Logger.getLogger(getClass());

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        logger.info("CROS");
        registry
                .addMapping("/**")
                .allowedMethods("*")
                .allowedOrigins("*")
                .allowedHeaders("*");
    }

}
