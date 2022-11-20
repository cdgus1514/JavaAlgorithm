package Programers;


import java.util.Stack;

/**
 * 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
 *
 * "()()" 또는 "(())()" 는 올바른 괄호입니다.
 * ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고,
 * 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 문자열 s의 길이 : 100,000 이하의 자연수
 * 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 * 입출력 예
 * "()()"   >	true
 * "(())()" >	true
 * ")()("   >	false
 * "(()("   >	false
 */
public class 올바른괄호 {

    public static boolean Solution(String s) {
        Boolean answer = false;

        String[] arr = s.split("");

        int cnt = 0;

        for (int i=0; i<arr.length; i++) {

            if(i==0) {
                if(arr[i].equals(")")) {
                    return false;
                }else{
                    cnt++;
                }
            }else{
                if(arr[i].equals("(")) {
                    cnt++;
                }else{
                    cnt--;
                }
            }
        }

        if(cnt == 0) {
            answer = true;
        }

        return answer;
    }


    public static Boolean Solution2(String s) {
        Boolean answer = false;

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(0);
            } else if (s.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    return false;
                }else{
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()) {
            answer = true;
        }


        return answer;
    }

    public static void main(String[] args) {
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

//        System.out.println(Solution(s1));
//        System.out.println(Solution(s2));
//        System.out.println(Solution(s3));
//        System.out.println(Solution(s4));
        System.out.println(Solution2(s1));
        System.out.println(Solution2(s2));
        System.out.println(Solution2(s3));
        System.out.println(Solution2(s4));

    }
}
