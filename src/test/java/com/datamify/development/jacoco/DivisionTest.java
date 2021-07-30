package com.datamify.development.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    public void shouldDivide() {
        assertEquals(3L, new Division().divide(21L, 7L));
    }

}
