package com.example.api_gateway.routes;
import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class Routes {

    @Bean
    public RouterFunction<ServerResponse> userServiceRoute() {
        return GatewayRouterFunctions.route("user_service")
                .route(RequestPredicates.path("/api/users/**"), HandlerFunctions.http("http://user-service:8081"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> showServiceRoute() {
        return GatewayRouterFunctions.route("show_service")
                .route(RequestPredicates.path("/api/shows/**"), HandlerFunctions.http("http://show-service:8082"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> bookingServiceRoute() {
        return GatewayRouterFunctions.route("booking_service")
                .route(RequestPredicates.path("/api/bookings/**"), HandlerFunctions.http("http://booking-service:8083"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> paymentServiceRoute() {
        return GatewayRouterFunctions.route("payment_service")
                .route(RequestPredicates.path("/api/payments/**"), HandlerFunctions.http("http://payment-service:8084"))
                .build();
    }
}
