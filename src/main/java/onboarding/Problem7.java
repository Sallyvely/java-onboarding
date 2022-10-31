package onboarding;

import java.util.*;
import java.util.stream.Collectors;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        List<String> userFriends=new ArrayList<>();
        HashMap<String, Integer> score=new HashMap<>();
        for(int i=0; i< friends.size();i++){
            String newFriends=friends.get(i).get(1);
            if(score.containsKey(newFriends)){
                score.put(newFriends,score.get(newFriends)+10);
            }
            else score.put(newFriends,1);
            if(newFriends.contains(user)){
                score.remove(user);
                userFriends.add(friends.get(i).get(0));
            }
        }

        for(int j=0;j< visitors.size();j++){
            if(score.containsKey(visitors.get(j))){
                score.put(visitors.get(j),score.get(visitors.get(j))+1);
            } else score.put(visitors.get(j),1);
            for(int k=0; k< userFriends.size();k++){
                if(score.containsKey(userFriends.get(k))){
                    score.remove(visitors.get(j));
                }
            }
        }
        List<String> scoreAnswer= new ArrayList<>(score.keySet());
        answer=scoreAnswer;
        return answer;
    }
}
