public class Main {
    public static void main(String[] args) {
        //Java_growth 5 : 논리타입 boolean
        // boolean은 논리 리터럴로 1bye / true또는 false 저장

        boolean start1 = true;
        boolean start2 = false;

        if(start1) {
            System.out.println("누르십시오."); //start1은 true라 이게 실행됨.
        }
        else {
            System.out.println("누르지 마십시오.");
        }
        if(start2) {
            System.out.println("누르십시오.");
        }
        else {
            System.out.println("누르지 마십시오."); //이게실행
        }
        System.out.println(start1);
        System.out.println(start2);
    }
}
