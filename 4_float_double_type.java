public class Main {
    public static void main(String[] args) {
        // Jave_growth_4 : float and double type
        //tmi : double은 float의 두배의 정밀도를 갖기에 붙여졌다.!

        //float f1 = 3.14; = 컴파일에러
        float f2 = 3.14f;
        double d1 = 3.141592;

        //정밀도를 확인해보자.(=소수점 몇재짜리까지?)
        float f_check = 0.12345678987654321f;
        double d_check = 0.12345678987654321;

        System.out.println(f2);
        System.out.println(d1);
        System.out.println(f_check); //float정밀도, 출력결과 : 9까지
        System.out.println(d_check); //double 정밀도, 출력 : 끝까지
    }
}
