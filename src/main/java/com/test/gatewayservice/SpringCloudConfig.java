package com.test.gatewayservice;

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringCloudConfig {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("sanpham", r -> r.path("/sanpham/**")
                        .uri("lb://SANPHAM"))
                .route("danhmuc", r -> r.path("/danhmuc/**")
                        .uri("lb://DANHMUC"))
                .build();
    }
    }   

