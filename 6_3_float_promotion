public class Main {
    public static void main(String[] args) {
      //java growth 6_3 : 실수 연산 자동타입변환
        //피연산자중 하나라도 double이면 다른 피연산자도 double이된다.

        double res = 1.2f + 3.44;
        System.out.println(res);

        //Q) 좌항이 float이라면..? A)컴파일에러

        /* float res1 = 1.2f + 3.3;
        System.out.println(res1);*/

        //나눗셈

        int x = 1;
        int y = 2;
        double res1 = x/y;
        System.out.println(res1); //0.5출력X -> int의 연산결과를 double변환한거라서.
        //0.5가 출력되려면 x또는 y를 실수형으로(혹은 둘다) 변환해주면 된다.

        res1 = (float) x/y;
        System.out.println(res1); //원하는 0.5가 출력!!
    }
}
