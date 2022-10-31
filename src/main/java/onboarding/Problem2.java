package onboarding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "";
        String[] decode=cryptogram.split("");
        List<String> list= Arrays.asList(decode);
        List<String> codestr= new ArrayList<>();
        codestr.addAll(list);
        boolean check = true;

        while(check){
            check = false;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i).equals(list.get(i+1))){
                    codestr.subList(i,i+2).clear();
                    list=codestr;
                    check=true;

                }

            }
        }
       answer=String.join("",list);
        return answer;
            }
        }



