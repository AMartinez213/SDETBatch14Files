package ReviewClass.class13;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ {



    public static void main(String[] args) {

        String str="bdfjhdfbew1b cnsdfsdf";
        System.out.println(getCount(str));

    }

    public static Map<Character,Integer> getCount(String str){
        char[] charArr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (char c:charArr){

            if(map.get(c)==null){
                map.put(c,1);
            }else{
                int count=map.get(c);
                count=count+1;
                map.put(c,count);

            }

        }
        return map;
    }

}
