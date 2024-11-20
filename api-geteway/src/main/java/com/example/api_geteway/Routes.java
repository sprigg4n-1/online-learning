package com.example.api_geteway;

import static org.springframework.cloud.gateway.server.mvc.filter.FilterFunctions.setPath;
import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
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
                .route(RequestPredicates.path("/api/course"), http("http://course-service:8080"))
                .build();    
    }
    @Bean
    public RouterFunction<ServerResponse> testsServiceRoute() {
        return route("testsservice")
                .route(RequestPredicates.path("/api/test"), http("http://coursetests-service:8081"))
                .build();    
    }

    @Bean
    public RouterFunction<ServerResponse> courseServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("course_service_swagger")
                .route(RequestPredicates.path("/aggregate/courseservice/v3/api-docs"), http(System.getenv("COURSES_URL")))
                .filter(setPath("/api-docs"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> testsServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("tests_service_swagger")
                .route(RequestPredicates.path("/aggregate/testsservice/v3/api-docs"), http(System.getenv("TESTS_URL")))
                .filter(setPath("/api-docs"))
                .build();
    }
}
