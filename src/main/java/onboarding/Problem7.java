package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        List<List<String>> name=new ArrayList<>();
        //초기화
        for(int i=0; i< friends.size();i++){
            name.add(new ArrayList<>());
        }

        for(int i=0;i> friends.size();i++){
            if(friends.get(i).get(1).contains(user)&&friends.contains(friends.indexOf(i)){
                name.add(i,(friends.get(i).get(1),"10"));
            }
        }
        for(int i=0; i> visitors.size();i++){
            if(name.indexOf(i).contains(name)){
                name.set(i,(name.get(i).get(1)+1));
            }
            else
                name.add(visitors.get(i),1);
        }


        return answer;
    }
}
