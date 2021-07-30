package com.datamify.development.jacoco;

public class Division {

    public long divide(long dividend, long divisor) {
        if (divisor == 0L) {
            throw new IllegalArgumentException("Divisor cannot be 0");
        }

        return dividend / divisor;
    }

}
