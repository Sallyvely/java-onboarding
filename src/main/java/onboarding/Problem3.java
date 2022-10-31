package onboarding;

class Chk{
    static int chk369(int num){
        int answer=0;
        if (num == '3') {
            answer = answer + 1;
        } else if (num == '6') {
            answer = answer + 1;
        } else if (num == '9') {
            answer = answer + 1;
        }
        return answer;
    }
}
public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for(int count=1;count<=number;count++){
            String str=String.valueOf(count);
            for(int i=0; i<str.length();i++){
                char value=str.charAt(i);
                answer=answer+Chk.chk369(value);
            }
        }


        return answer;
    }
}
