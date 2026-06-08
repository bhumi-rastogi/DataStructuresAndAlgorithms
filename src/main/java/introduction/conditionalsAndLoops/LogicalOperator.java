package introduction.conditionalsAndLoops;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 200 , y = 50 , z = 100;
        if(x > y && y > z){
            System.out.println("Hellooo");
        }

        if (z>y && z<x){
            System.out.println("Byeeeee");
        }

        if((z+100) > y && (z+200) > x){
            System.out.println("Test");
        }

        int a = 2 , b = 5;
        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));

        System.out.println(exp1);
        System.out.println(exp2);
    }
}
