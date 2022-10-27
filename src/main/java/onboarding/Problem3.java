package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        for(int count=1;count<=number;count++){
            String str=String.valueOf(count);
            for(int i=0; i<str.length();i++){
                char chk=str.charAt(i);
                if (chk == '3') {
                    answer = answer + 1;
                } else if (chk == '6') {
                    answer = answer + 1;
                } else if (chk == '9') {
                    answer = answer + 1;
                }
            }
        }




        return answer;
    }
}
