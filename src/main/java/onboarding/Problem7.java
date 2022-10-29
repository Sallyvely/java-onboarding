package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        List<String> Userfriends=new ArrayList<>();
        HashMap<String, Integer> score=new HashMap<>();
        for(int i=0; i< friends.size();i++){
            if(score.containsKey(friends.get(i).get(1))){
                score.put(friends.get(i).get(1),score.get(friends.get(i).get(1))+10);
            }
            else score.put(friends.get(i).get(1),1);
            if(friends.get(i).get(1).contains(user)){
                score.remove(user);
                Userfriends.add(friends.get(i).get(0));
            }
        }

        for(int j=0;j< visitors.size();j++){
            if(score.containsKey(visitors.get(j))){
                score.put(visitors.get(j),score.get(visitors.get(j))+1);
            } else score.put(visitors.get(j),1);
            for(int k=0; k< Userfriends.size();k++){
                if(score.containsKey(Userfriends.get(k))){
                    score.remove(visitors.get(j));
                }
            }
        }
        List<String> scoreAnswer= new ArrayList<>(score.keySet());
        answer=scoreAnswer;
        return answer;
    }
}
