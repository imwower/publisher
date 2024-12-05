package com.example.publisher;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import static org.mockito.Mockito.mock;

/**
 * Description:
 *
 * @author jiaozhiwang
 * {@code @date} 2024/12/5
 */

@TestConfiguration
public class MockitoConfiguration {

    @Bean
    @Primary
    public ApplicationEventPublisher publisher() {
        return mock(ApplicationEventPublisher.class);
    }
}
