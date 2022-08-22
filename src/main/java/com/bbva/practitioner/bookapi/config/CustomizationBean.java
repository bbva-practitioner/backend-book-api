package com.bbva.practitioner.bookapi.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomizationBean implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
  @Override
  public void customize(ConfigurableServletWebServerFactory factory) {
    factory.setPort(8085);
    factory.setContextPath("/v1");
  }
}
