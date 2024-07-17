public class Unary_Operators {
    public static void main(String[] args) {
        //Operators which act only on one operand are called Unary Operators.
        /*
        - turns a positive number into negative.
        a++->Post increment which means first use the value of a and then increment
        a-- ->Post decrement which means first use the value of a and then decrement
        ++a->Pre increment means that first increment the value and then use it
        --a->Pre decrement means that first decrement the value and then use it
        */
        int a=1;
        System.out.println(-a);//a becomes negative with value -1
        System.out.println(a++);//first a is printed as 1 and then value is incremented by 1 and the new value is 2
        System.out.println(a--);//first value of a is printed which is 2 obtained from previous statement and then the value is decremented
        System.out.println(++a);
        System.out.println(--a);
    }
}
