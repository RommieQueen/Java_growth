public class j2_int {
    public static void main(String[] args) {

        int i = 3; // 4byte , 2,147...~ - 2,147...
        byte b = 127; //1byte, -128~127
        char ch = 'a'; //2byte, 0~65535(유니코드)
        short sh = 23423; //2byte, -32768 ~ 32767
        
        long l = 24134234L; //8byte 2의63승... ***주의 : 변수값 끝에 L안붙이면 컴파일에러!!*

        System.out.println(i);
        System.out.println(b);
        System.out.println(ch);
        System.out.println(sh);
        System.out.println(l);
    }
}
