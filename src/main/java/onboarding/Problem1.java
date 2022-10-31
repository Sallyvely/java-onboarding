package onboarding;
import java.util.*;
import java.lang.Integer;

class Cal{
    static int add(int num){
        int result = num / 100 + num % 100 / 10 + num % 10;
        return result;
    }
    static int mul(int num){
        int result = 0;
        if(num >99){
            result = (num/100)*(num%100/10)*(num %10);
        }
        else if(num < 100){
            result=(num/10)*(num %10);
        }
        return result;
    }
}

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer=0;

        ArrayList<Integer> pobilist=new ArrayList<>();
        ArrayList<Integer> cronglist=new ArrayList<>();

        for(int i=0; i<pobi.size();i++) {
            int value1 = pobi.get(i);
            int value2 = crong.get(i);
            pobilist.add(Cal.add(value1));
            pobilist.add(Cal.mul(value1));

            cronglist.add(Cal.add(value2));
            cronglist.add(Cal.mul(value2));
        }

        int pobimax= Collections.max(pobilist);
        int crongmax=Collections.max(cronglist);
        int pobimin= Collections.min(pobilist);
        int crongmin=Collections.min(cronglist);

        if(pobimin==0||crongmin==0){
            answer=-1;
        }
        else{
                if(crongmax>pobimax){
                    answer=2;
                }
                else if(pobimax>crongmax){
                    answer=1;
                }
                else if(pobimax==crongmax){
                    answer=0;
                }
            }
        return answer;
    }
}
