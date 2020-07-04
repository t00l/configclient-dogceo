package com.test.breedClient.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("url")
public class ConfigProp {
    private String list;
    private String detail;
}
