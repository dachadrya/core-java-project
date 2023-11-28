package oopconcept;

public class FunctionBasic {

    public static void main(String[] args) {
       FunctionBasic fb = new FunctionBasic();
        int a = 4;
        int b = 8;
        fb.add(a,b);
        fb.subtract(a,b);
        fb.multiply(a,b);

    }
public void add(int a, int b){
        int result = a+b;
        System.out.println(result);
}
public void subtract(int a, int b){
        int result=a-b;
        System.out.println(result);

}
public void multiply(int a, int b){
        int result;
        result = a*b;
        System.out.println(result);

    }
}
