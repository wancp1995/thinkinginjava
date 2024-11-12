package com.example.demo.config;


import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class Swagger2Config implements WebMvcConfigurer {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API Documentation")
                        .description("使用 Spring Boot 构建的 RESTful APIs")
                        .version("V1"))
                        .components(new Components().addSecuritySchemes("bearAuth",
                                new SecurityScheme().name("Authorization")
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bear")
                                        .bearerFormat("JWT")
                                        )).addSecurityItem(new SecurityRequirement().addList("bearAuth"));
    }


}
