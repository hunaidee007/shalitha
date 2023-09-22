package org.example.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("DuckWithoutWings")
public class DuckWithoutWings implements Flyable{

    @Override
    public String fly() {
        return "Duck that cannot fly";
    }
}
