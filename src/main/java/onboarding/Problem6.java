package onboarding;

import java.util.ArrayList;
import java.util.List;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        List<String> namekey= new ArrayList<>();
        int count=0;
        for(int i= 0; i <forms.size();i++){
            String name=forms.get(i).get(1);
            for(int j=0; j<name.length();j++){
                if(forms.get(i).get(1).contains(name.substring(j,j+2))){
                    count= count +1;
                    if(count>1) {
                        answer.add(forms.get(i));

                    }

                }
            }

        }


        return answer;
    }
}
S