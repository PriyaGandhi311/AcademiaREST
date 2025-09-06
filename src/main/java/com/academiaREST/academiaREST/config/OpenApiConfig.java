package com.academiaREST.academiaREST.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI academiaOpenAPI() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.setDescription("Development Server");

        Contact contact = new Contact();
        contact.setName("Priya Gandhi");
        contact.setUrl("https://github.com/PriyaGandhi311");

        Info info = new Info()
                .title("Academia REST API")
                .version("2.0")
                .contact(contact)
                .description("REST API for managing Students, Courses, and Professors in Academia system");

        return new OpenAPI().info(info).servers(List.of(devServer));
    }
}