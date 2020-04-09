package com.imooc.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author CBeann
 * @create 2020-04-09 13:43
 */
//@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("payment_routh"
                , r->r.path("/payment/get/**").uri("http://localhost:8001"))
                .build();
        return routes.build();
    }
}