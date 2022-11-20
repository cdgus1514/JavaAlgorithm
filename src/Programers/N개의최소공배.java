package Programers;


/**
 * 두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
 * 예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
 *
 * n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.
 *
 * 제한 사항
 * arr은 길이 1이상, 15이하인 배열입니다.
 * arr의 원소는 100 이하인 자연수입니다.
 * 입출력 예
 * [2,6,8,14]   >	168
 * [1,2,3]      >	6
 */
public class N개의최소공배 {

    public static int Solution(int[] arr) {
        int answer = arr[0];
        System.out.println("answer : " + answer);

        for (int i=1; i<arr.length; i++) {
            int gcd = gcd(answer, arr[i]);
            answer = (answer * arr[i]) / gcd;
            System.out.println("answer : " + answer);
        }

        return answer;

    }

    public static int gcd(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        System.out.println("------------------------------");
        System.out.println("max : " + max + ", min : " + min);
        while (max%min != 0) {
            int rem = max%min;
            max = min;
            min = rem;
            System.out.println("max : " + max + ", min : " + min);
        }
        System.out.println("gcd : " + min);

        return min;

    }


    public static void main(String[] args) {
        int[] arr1 = {2,6,8,14};
        System.out.println(Solution(arr1));
        int[] arr2 = {1,2,3};
        System.out.println(Solution(arr2));
    }
}
