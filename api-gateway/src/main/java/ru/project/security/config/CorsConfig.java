package ru.project.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.setAllowedHeaders(List.of("*"));
        config.setAllowedOrigins(List.of("*"));
        config.setAllowedMethods(Arrays.asList("GET","POST", "PUT", "DELETE"));

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }

}
