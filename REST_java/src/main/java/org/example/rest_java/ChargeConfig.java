package org.example.rest_java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
@Configuration
public class ChargeConfig {
    @Bean
    public ManagedChannel getManagedChannel() {
        return ManagedChannelBuilder.forTarget("127.0.0.1:8080")
                .usePlaintext()
                .build();
    }
}
