package Programers;

/**
 * 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
 *
 * 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 * 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 * 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 * 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
 *
 * 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
 *
 * 제한 사항
 * n은 1,000,000 이하의 자연수 입니다.
 * 입출력 예
 * 78	83
 * 15	23
 */
public class 다음큰숫자 {

    public static int Solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);  // 이진수로 만들기

        while (true) {
            n++;
            int count = Integer.bitCount(n);
            if(cnt == count ) {
                answer = n;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int n1 = 78;
        System.out.println(Solution(n1));

        int n2 = 15;
        System.out.println(Solution(n2));
    }
}
