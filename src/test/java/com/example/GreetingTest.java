package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import com.example.Greeting;

public class GreetingTest {

    @Test
    public void testSayHelloTo() {
        Greeting instance = new Greeting();
        String msg = instance.sayHelloTo("Freddy");
        assertThat(msg).isEqualTo("Hello, Freddy"); 
    }
}
