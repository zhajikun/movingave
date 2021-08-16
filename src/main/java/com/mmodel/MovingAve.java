package com.mmodel;

/**
 * Created by zhaji on 8/15/2021.
 */
public class MovingAve {

    public double[] getMovingAveArr(int windowSize, double[] arr){


        if(windowSize ==0 || arr == null || arr.length == 0){
            return arr;
        }

        if(windowSize > arr.length){
            windowSize = arr.length;
        }

        return arr;
    }
}

