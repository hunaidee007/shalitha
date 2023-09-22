package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Duck {

    @Autowired
    @Qualifier("DuckWithWings")
    Flyable flyable;

    public String fly() {
        return flyable.fly();
    }
}
