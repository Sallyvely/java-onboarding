package onboarding;

import java.util.*;

public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");
        List<String> email=new ArrayList<>();
        List<String> overname= new ArrayList<>();
        Set<String> setemail =new HashSet<String>(email);

        for(int i=0;i<forms.size();i++){
            String name=forms.get(i).get(1);
            for(int j=0; j<name.length()-1;j++){
                if(name.length()<3){
                    break;
                }
                overname.add(name.substring(j,j+2));
            }
        }
        for(int i=0;i<overname.size();i++){
            for(int k=0; k< overname.size();k++){
                if((overname.get(i).equals(overname.get(k)))&&!(i==k)){
                    for(int j=0; j< forms.size(); j++){
                    if(forms.get(j).get(1).contains(overname.get(i))){
                        setemail.add(forms.get(j).get(0));
                    }}
                }
            }
        }
        List<String> answeremail =new ArrayList<String>(setemail);

        answer= answeremail;
        return answer;
    }
}
