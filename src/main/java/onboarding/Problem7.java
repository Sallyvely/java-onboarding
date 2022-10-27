package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        List<List<String>> name=new ArrayList<>();
        HashMap<String, Integer> number=new HashMap<>();
        List<Map.Entry<String, Integer>> sortmap = number.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect((Collectors.toList()));

        for(int i=0; i< friends.size();i++){
            String friendA=friends.get(i).get(0);
            String friendB=friends.get(i).get(1);
            if(friendB==user&&friendA.equals(friendA)){
                number.put(friendB,+10);
            }
        }
        for(int i=0; i< visitors.size();i++){
            number.put(visitors.get(i),+1);
        }
        number.remove(user);
        for(Map.Entry<String, Integer> entry : sortmap){
                answer.add(entry.getKey());
        }



        return answer;
    }
}
