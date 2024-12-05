package com.example.publisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Description:
 *
 * @author jiaozhiwang
 * {@code @date} 2024/12/5
 */

@Slf4j
@Component
public class BizService {
    @Resource
    private ApplicationEventPublisher publisher;

    public void foo() {
        log.info("foo method executed");
        publisher.publishEvent(new FooEvent(this, "bar"));
    }
}
