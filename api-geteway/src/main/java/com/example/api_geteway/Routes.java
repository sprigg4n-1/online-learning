package com.example.api_geteway;

import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration(proxyBeanMethods=false)
public class Routes {
    
    @Bean
    public RouterFunction<ServerResponse> courseServiceRoute() {
        return route("courseservice")
                .route(RequestPredicates.path("/api/course"), http("http://localhost:8081"))
                .build();    
    }
    @Bean
    public RouterFunction<ServerResponse> testsServiceRoute() {
        return route("testsservice")
                .route(RequestPredicates.path("/api/test"), http("http://localhost:8082"))
                .build();    
    }
}
