package com.devmit.financialapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("production")
public class MessageService {

    @Value("${application.name")
    private String appName;

}
