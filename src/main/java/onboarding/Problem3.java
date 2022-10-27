package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        int count=0;

        if(number>99){
            count=count+number/100*3;
            if(number/100/3>=1){
                count=count+7*(number/100/3);
            } //100의 자리인데 369포함되어있을경우
        }

        else if(number>999){
            count=count+number/1000*3;
            if(number/1000/3>=1){
                count=count+7*(number/1000/3);
            }//1000의 자리인데 369포함되어있을경우
        }
        count=count+(number/10)*3;//10의기본자리
        if(number/10/3>=1){
            count=count+7*(number/10/3);
        } //10의 자리인데 369포함되어있을경우

        if(number%3==0){//1의자리
            count=count+1;
        }
        else if (number%6==0){
            count=count+1;
        }
        else if(number%9==0){
            count=count+1;
        }
        answer=count;
        return answer;
    }
}
