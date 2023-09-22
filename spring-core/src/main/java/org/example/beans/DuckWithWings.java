package org.example.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DuckWithWings")
public class DuckWithWings implements Flyable{
    @Override
    public String fly() {
        return "Duck that can fly";
    }
}
