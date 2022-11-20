package Programers;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 * 입출력 예
 * participant	completion	return
 * ["leo", "kiki", "eden"]	["eden", "kiki"]    >	"leo"
 * ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]    >	"vinko"
 * ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"] >	"mislav"
 */
public class 완주하지못한선수 {

    public static String Solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> set = new HashMap<>();
        for (String s : participant) {
            set.put(s, set.getOrDefault(s, 0)+1);
        }
        System.out.println("참가 : " + set);

        for (String s : completion) {
            set.put(s, set.get(s)-1);
        }
        System.out.println("결과 : " + set);

        Iterator<Map.Entry<String, Integer>> iterator = set.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> map = iterator.next();
            if(map.getValue() == 1) {
                answer = map.getKey();
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] partici1 = {"leo", "kiki", "eden"};
        String[] com1 = {"eden", "kiki"};
        System.out.println(Solution(partici1, com1));

        System.out.println("------------------------------");

        String[] partici2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] comp2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println(Solution(partici2, comp2));

        System.out.println("------------------------------");

        String[] partici3 = {"mislav", "stanko", "mislav", "ana"};
        String[] comp3 = {"stanko", "ana", "mislav"};
        System.out.println(Solution(partici3, comp3));
    }
}
