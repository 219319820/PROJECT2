package za.ac.cput.calculator;

/**
 * @author Justin
 */
public class Division {
    /**Return results of integer division
     *
     * @param numerator
     * @param denominator
     * @return
     */

    public static int integerDivision(int numerator,int denominator) {


        if (denominator < 1) return 0;
        return numerator / denominator;

    }
}
