package oopconcept;

public class FunctionOverloadingExample {
    /*
     Function overloading is a property  of object-oriented programming where there  are
     two or more functions with same function name but different number of parameter
     or/and different type of parameter

     */
    public int overloadedAdd(int a, int b){

        return(a+b);
    }
    public int overloadedAdd(int a, int b, int c){
        return(a+b+c);
    }
    public void overloadedAdd(double a, int b){

        System.out.println(a+b);
    }
    public static void main(String[] args) {
        FunctionOverloadingExample abc  =new FunctionOverloadingExample();
        int result1;
        int result2;
        result1=abc.overloadedAdd(1, 2 );
        result2=abc.overloadedAdd(1,2,3);
        System.out.println(result1);
        System.out.println(result2);
        abc.overloadedAdd(3.2,1);


    }
}
