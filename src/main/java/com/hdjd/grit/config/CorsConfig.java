package com.hdjd.grit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig{

    // 设置允许跨域的源
//    private static String[] originsVal = new String[]{
//            "127.0.0.1:8081",
//            "localhost:8081",
//            "google.com"
//    };

    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");
        //关键配置
        corsConfiguration.setAllowCredentials(true);
        source.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(source);
    }

//    private void addAllowedOrigins(CorsConfiguration corsConfiguration) {
//        for (String origin : originsVal) {
//            corsConfiguration.addAllowedOrigin("http://" + origin);
//            corsConfiguration.addAllowedOrigin("https://" + origin);
//        }
//    }


}
