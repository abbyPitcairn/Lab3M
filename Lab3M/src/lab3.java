
/**this class will run the final test of the Lab 3 Project
 * and print the precision method's output
 * @author abigailpitcairn
 * @version 2 october 2023
 */
public class lab3 {

    public static void main(String[] args) throws Exception {

        IStack stack = new myStack();
        IPostFixCal postFix = new myPostFixCal();
        postFixCalTesting calc = new postFixCalTesting();

        System.out.println("Precision method output: " + calc.precision(stack,postFix));

    }
}
