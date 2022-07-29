package pl.fis.kafka.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class GlobalConsumerConfig {
    @Bean
    public Consumer<String> userConsumer() {
        return (msg) -> log.info("USER - Received message: {}", msg);
    }

    @Bean
    public Consumer<String> articleConsumer() {
        return (msg) -> log.info("ARTICLE - Received message: {}", msg);
    }

    @Bean
    public Consumer<String> commentConsumer() {
        return (msg) -> log.info("COMMENT - Received message: {}", msg);
    }

    @Bean
    public Consumer<String> emailConsumer() {
        return (msg) -> log.info("EMAIL - Received message: {}", msg);
    }
}
