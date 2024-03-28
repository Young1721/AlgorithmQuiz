package programmers;
public class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1cnt = 0;
        int cards2cnt = 0;
        for(int i=0; i<goal.length; i++){
            if(cards1.length > cards1cnt && cards1[cards1cnt].equals(goal[i])){
                cards1cnt++;

            }
            else if(cards2.length > cards2cnt && cards2[cards2cnt].equals(goal[i])){
                cards2cnt++;

            }else{
                answer = "No";
                break;
            }

        }


        return answer;
    }
}
