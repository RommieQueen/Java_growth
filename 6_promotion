public class Main {
    public static void main(String[] args) {
        // java_growth 6 : 타입변환

        //타입변환
        byte a = 10;
        int b = a; //10은 저장해서 복사할 때 int 타입이 되었다.

        //자동 타입 변환 : 자동으로 타입변환 , 작은허용범위->큰허용범위타입
        // byte < short < int < long < float < double
        //정수타입->실수타입 저장시 무조건 형변환
        byte byteVal = 5;
        int intVal = byteVal; //자동 타입 변환

        char charVal = 'C';
        int ch = charVal; //저장가능, 유니코드가 저장된다.

        System.out.println(ch);

        /* byte ByteVal = 65;
           char CharVal = ByteVal; == 컴파일에러 cause byte는 음수포함, char는 음수X
         */

        char ga = '가';
        int ga_unicode = ga;
        System.out.println(ga+"의 유니코드 : " +ga_unicode);

        long longVal = 123;
        float floatVal = longVal;
        System.out.println(longVal+"-> 실수형변환 ->"+floatVal);
    }
}
