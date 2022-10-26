package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";

       while (true){
            for(int i=0; i<cryptogram.length();i++){
                if(cryptogram.charAt(i)==cryptogram.charAt(i+1)){
                    answer=cryptogram.substring((i-1)+(i+2));
                } else if (!(cryptogram.charAt(i)==cryptogram.charAt(i+1))){
                    break;
                }
            }
       }
        return answer;
    }
}
