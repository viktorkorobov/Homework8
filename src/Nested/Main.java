package Nested;
public class Main {
    public static void main(String[] args) {

        /*1*/
        ClassA.ClassB ClassB = new ClassA.ClassB();


        System.out.println();
        /*2*/
        int a = (int) (Math.random()*(3 - 1 + 1) + 1);
        int b = (int) (Math.random()*(3 - 1 + 1) + 1);
    switch (a){
        case 1: System.out.println(Meal.BREAKFAST.getValue()); break;
        case 2:   System.out.println(Meal.LANCH.getValue()); break;
        case 3: System.out.println(Meal.DINNER.getValue()); break;
        default:
            System.out.println("Unknown step");
    }
        /*3*/
        System.out.println("a: " + a + " b: " +b);
        System.out.println(Calc.SUM.action(a,b));
        System.out.println(Calc.SUBTRACT.action(a,b));
        System.out.println(Calc.MULTIPLY.action(a,b));
        System.out.println(Calc.DIVIDE.action(a,b));
        System.out.println(Calc.POW.action(a,b));
    }
}