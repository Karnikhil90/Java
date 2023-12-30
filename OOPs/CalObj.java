package OOPs;

public class CalObj {
    int num1, num2, num3;

    CalObj(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static void main(String[] args) {
        CalObj obj = new CalObj(12, 12, 12);
        CalObj obj2 = new CalObj(10, 10, 10);

        CalObj obj3 = new CalObj(obj.num1 + obj2.num1, obj.num2 + obj2.num2, obj.num3 + obj2.num3);
        System.out.println(obj3.num1);
        System.out.println(obj3.num2);
        System.out.println(obj3.num3);
    }
}
