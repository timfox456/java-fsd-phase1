package org.example.virtualkey;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VirtualKeyApplicationTests {

    @Test
    public void MyTest()
    {

        String myGreeting = VirtualKeyApplication.Greeting();

        assertEquals("Hello World!", myGreeting);


    }


}
