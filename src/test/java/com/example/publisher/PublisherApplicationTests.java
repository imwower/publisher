package com.example.publisher;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PublisherApplication.class)
@ActiveProfiles("dev")
@Slf4j
@Import(MockitoConfiguration.class)
class PublisherApplicationTests {
    @Autowired
    @SpyBean
    private ApplicationEventPublisher publisher;
    @Autowired
    private BizService service;

    @Test
    public void mock_publisher_ok() {
        MockitoAnnotations.openMocks(this);

        service.foo();

        verify(publisher).publishEvent(isA(FooEvent.class));
    }
}
