package org.cristiandrami.mps.fibonacciCalculator;

/**
 * this class deals with the calculation of the value of
 * the fibonacci sequence corresponding to
 * the number that is passed as a parameter of the method used
 * @author cristiandrami
 */


public class FibonacciCalculator {

    /*
     * Class constructor
     * */

    public FibonacciCalculator(){
    }

    /**
     * Returns the fibonacci sequence value of a number passed by parameter
     * This method returns an exception if the number is negative, because the fibonacci sequence starts with 0
     *
     * Base case:
     * This method returns 1 if the number is 1, because the fibonacci sequence of 1 is 1
     * This method returns 0 if the number is 0, because the fibonacci sequence of 0 is 0
     *
     *
     *
     * @param number the number to compute
     */
    public long compute(long number){
        if (number>1){
            //recursive function
            return compute(number-1) + compute(number-2);
        } else if (number==1) {
            //base case
            return 1;
        }else if (number==0){
            //base case
            return 0;
        }else{
            //negative number
            throw new RuntimeException("It isn't possible to compute the fibonacci of a negative number");
        }
    }

}