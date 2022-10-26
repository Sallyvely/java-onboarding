package onboarding;
import java.util.List;
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int pobisum[]={};
        int crongsum[]={};
        int pobimax=0;
        int crongmax=0;

        for(int i=0;i<pobi.size();i++){
            pobisum[i+2] = pobi.get(i)/100+pobi.get(i)/10+ pobi.get(i)%10;
            if(pobi.get(i)>99){// 3자리일 경우 각 자리 곱하기
                pobisum[i] = (pobi.get(i)/100)*(pobi.get(i)/10)*(pobi.get(i)%10);
            }
            else pobisum[i] = (pobi.get(i)/10)*(pobi.get(i)%10);
        }

        for(int i=0;i<crong.size();i++){
            crongsum[i+2] = crong.get(i)/100+crong.get(i)/10+ crong.get(i)%10;
            if(crong.get(i)>99){// 3자리일 경우 각 자리 곱하기
                crongsum[i] = (crong.get(i)/100)*(crong.get(i)/10)*(crong.get(i)%10);
            }
            else {
                crongsum[i] = (crong.get(i)/10)*(crong.get(i)%10);
            }
        }

        for(int i=0; i<pobisum.length;i++){
            if(pobisum[i]>pobimax){
                pobimax=pobisum[i];
            }
            else if(pobisum[i]==0){
                pobimax=0;
            }
            if(crongsum[i]>crongmax){
                crongmax=crongsum[i];
            }
            else if(crongsum[i]==0){
                crongmax=0;
            }
        }

        if(crongmax>pobimax){
            answer=2;
        }
        else if(pobimax>crongmax){
            answer=1;
        }
        else if(pobimax==crongmax){
            answer=0;
        }
        else if((pobimax|crongmax)==0){
            answer=-1;
        }
        return answer;
    }
}
