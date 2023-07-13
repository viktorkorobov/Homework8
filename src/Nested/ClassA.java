package Nested;

public class ClassA {
    public static class ClassB {
    }
}
class ClassC{
}
enum Meal{

    BREAKFAST("Time to breakfast"),
    LANCH("Time to LANCH"),
    DINNER("Time to DINNER");

    final String meal;
    Meal(String meal) {
        this.meal = meal;
    }
    public String getValue(){
        return meal;
    }
}

enum Calc{
    SUM{
        @Override
        public double action(double a, double b)  {
            return a+b;
        }
    },
    SUBTRACT{
        @Override
        public double action(double a, double b) {
            return a-b;
        }
    },
    MULTIPLY{
        @Override
        public double action(double a, double b){
            return a*b;
        }
    },
    DIVIDE{
        @Override
        public double action(double a, double b) {
            return a/b;
        }
    },
    POW{
        @Override
        public double action(double a, double b) {
            double result= 1;
            for (int i = 0; i<=b; i++){
                result = result * a;
            }
            return result;
        }
    }
    ;

    public abstract double action(double a, double b);
}