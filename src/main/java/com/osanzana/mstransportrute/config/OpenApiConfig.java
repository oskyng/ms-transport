package com.osanzana.mstransportrute.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI transporteOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Microservicio Transporte Público")
                        .description("API para gestión y monitoreo de transporte público")
                        .version("1.0.0"));
    }
}
