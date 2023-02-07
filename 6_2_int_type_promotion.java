public class Main {
    public static void main(String[] args) {
      //  java growth 6_2 : 정수연산 자동타입변환 주의
        // byte x = 10; byte y = 20; byte res = x+y; == 컴파일에러
        //정수변수가 산술식에서 피연산자로 사용되면 int 타입보다 작은 byte나 short타입은 int타입으로 자동변환됨

        byte x=10;
        byte y=20;
        int res = x+y;
        System.out.println(res); //이게맞지~~
    }
}
