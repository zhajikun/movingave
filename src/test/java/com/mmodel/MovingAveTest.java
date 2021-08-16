package com.mmodel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhaji on 8/15/2021.
 */
class MovingAveTest {
    @Test
    void getMovingAveArr() {

        MovingAve movingAve = new MovingAve();
        double[] returnArr = movingAve.getMovingAveArr(3, new double[]{0, 1, 2, 3,4,5});
        assertNotNull(returnArr);

    }
}