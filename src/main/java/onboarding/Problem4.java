package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        for(char x : word.toCharArray()){
            if(x>=97 && x<=122){
                answer=answer+(char)(219-x);
            }
            else answer=answer+(char)(155-x);
        }
        return answer;
    }
}
