package operator;

public class BitComp {
    public static void main(String[] args) {
	   int x = 3;
	   int y = 0xffff_ffff;            // 모든 비트가 1인 정수
        System.out.format("%d의 이진수: %s %n", y, Integer. toBinaryString(y));
        System.out.println(x &= y);    // x = x & y, 저장 값이 결과 값
        System.out.println(x);         // 위와 같은 결과

        int key = 120;
        System.out.println(x ^= key);  // 암호화된 값
        System.out.println(x ^= key);  // 다시 원래의 값
    }
}
