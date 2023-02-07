public class Main {
    public static void main(String[] args) {
        //java_growth 7 : 강제 타입 변환 casting

        //casting이란 : 작은허용범위 = (작은 허용범위 타입)큰허용범위 타입;

        //int는 byte보다 큰허용범위. 자동변환X 캐스팅연산자 이용!!

        int intVal = 10;
        byte byteVal = (byte)intVal; //강제타입변환
        System.out.println(byteVal);

        int intchar = 65;
        char charVal = (char)intchar;
        System.out.println(charVal); //유니코드 -> 아스키코드 출력

        double douVal = 3.141592;
        short shVal = (short)douVal; 
        System.out.println(shVal); //소수점버려지고 출력
    }
}
