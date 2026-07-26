package methodStatic;

public class MainMath {

    public static void main(String[] args) {

        int result = MathExample.add(2,22);
        System.out.println(result);

        MathExample mathClass = new MathExample();
        System.out.println(mathClass.sub(1,2));

    }

}
