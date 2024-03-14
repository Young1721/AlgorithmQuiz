public class Solution {
    public int[] solution(long n) {

        String s = String.valueOf(n);
        char[] charArr = s.toCharArray();
        int [] answer = new int[s.length()];
        int end = 0;
        for (int i = charArr.length; i > 0; i--){
            answer[end] = Character.getNumericValue(charArr[i-1]);
            end++;
        }
        return answer;
    }
}
