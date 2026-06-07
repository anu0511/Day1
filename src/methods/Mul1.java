package methods;
//static method no return
public class Mul1 {
    public static void main(String[] args) {


        multiplyNum(1, 2, 3);
        int finalmul = multiplynum2(2, 3, 4);
        System.out.println(finalmul);

        Mul1 obj = new Mul1();

        obj.multiplynum3(2,3,4);


        int output = obj.multiplynum4(1, 3, 4);
        System.out.println(output);

    }

    static void multiplyNum(int x, int y, int z) {
        int result = x * y * z;
        System.out.println(result);
    }

    static int multiplynum2(int a, int b, int c) {
        int result = a * b * c;
        return result;


    }

    void multiplynum3(int i, int j, int k) {
        int result1 = i * j * k;
        System.out.println("result1");
}

    int multiplynum4(int a, int b, int c) {
        int result = a * b * c;
        return result;
}}