public class Order_of_Operation {
    public static void main(String[] args) {
        //This order of operation is only for Arithmetic Operators.

        //B O D M A S
        /*B->Bracket ()
        O->Order
        D->Division /
        M->Multiplication *
        A->Addition +
        S->Subtraction -
        */
        System.out.println(3+6/8-10);/*Division has highest priority.So first  6/8 takes place.
        Although output of this division is in decimal but since both the operands are integer
        so output will be implicitly casted to int.After that as per priority addition will occur followed by
        substraction.*/
        System.out.println(5+(8/4-1)/1+8-10);
    }
}
