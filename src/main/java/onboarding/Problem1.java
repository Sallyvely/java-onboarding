package onboarding;
import java.util.*;
import java.lang.Integer;


class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer=0;

        ArrayList<Integer> pobilist=new ArrayList<>();
        ArrayList<Integer> cronglist=new ArrayList<>();

        //포비 페이지의 합과 곱 구하기
        Integer[] pobiarr=pobi.toArray(new Integer[0]);
        Integer[] crongarr=crong.toArray(new Integer[0]);

        for(int i=0; i<pobiarr.length;i++){
            int value= pobiarr[i];
            pobilist.add(value/100+ value%100/10+ value%10);
            if(value >99){// 3자리일 경우 각 자리 곱하기
                pobilist.add((value/100)*(value%100/10)*(value %10));
            }
            else if(value < 100){
                pobilist.add((value/10)*(value %10));}
        }
        for(int j = 0; j <crongarr.length; j++){
            int value1 = crongarr[j];
            cronglist.add(value1/100+value1%100/10+value1%10);
            if(value1 >99){// 3자리일 경우 각 자리 곱하기
                cronglist.add((value1/100)*(value1%100/10)*(value1%10));
            }
            else if(value1 < 100){
                cronglist.add((value1/10)*(value1%10));
            }
        }

        int pobimax= Collections.max(pobilist);
        int crongmax=Collections.max(cronglist);
        int pobimin= Collections.min(pobilist);
        int crongmin=Collections.min(cronglist);
        System.out.println(pobilist);
        //누가 큰지 비교하기
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
