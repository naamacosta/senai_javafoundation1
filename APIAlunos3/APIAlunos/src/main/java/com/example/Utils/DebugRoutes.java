package com.example.Utils;

import jakarta.annotation.PostConstruct;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;


public class DebugRoutes {

        private final ApplicationContext context;

        public DebugRoutes(ApplicationContext context) {
            this.context = context;
        }

        @PostConstruct
        public void printAllRoutes() {
            RequestMappingHandlerMapping mapping = context.getBean(RequestMappingHandlerMapping.class);
            mapping.getHandlerMethods().forEach((key, value) -> {
                System.out.println("📌 Rota registrada: " + key);
            });
    }
}
