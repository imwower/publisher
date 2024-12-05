package com.example.publisher;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

/**
 * Description:
 *
 * @author jiaozhiwang
 * {@code @date} 2024/12/5
 */

@Getter
public class FooEvent extends ApplicationEvent {

    private final String bar;

    public FooEvent(Object source, String bar) {
        super(source);
        this.bar = bar;
    }
}
