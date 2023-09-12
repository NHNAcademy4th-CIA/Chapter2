package org.nhnacademy;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class problem2Test {

    @Test
    void number1() {
        problem2.number1();
    }

    @Test
    void number2() {
        Assertions.assertEquals("LEEJUNGBUM",problem2.number2());
    }

    @Test
    void number3() {
        Assertions.assertEquals(1.14,problem2.number3());
    }

    @Test
    void number4() {
        Assertions.assertEquals("1342",problem2.number4());
    }

    @Test
    void number5() {
        Assertions.assertEquals("LJ",problem2.number5());
    }

    @Test
    void number6() {
        Assertions.assertEquals(80,problem2.number6());
    }
    @Test
    void number6_1(){
        Assertions.assertThrows(IOException.class,()->problem2.number6()) ;
    }
}