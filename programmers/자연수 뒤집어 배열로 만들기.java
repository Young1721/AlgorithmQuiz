public class Solution {
    public int[] solution(long n) {

        String s = String.valueOf(n);
        char[] charArr = s.toCharArray();
        int [] answer = new int[s.length()];
        int end = 0;
        //StringBuffer / reverse() 메소드 사용하면 문자열 뒤집기 가능
        //String str = "ABCDE";         
        // 문자열 reverse        
        //StringBuffer sb = new StringBuffer(str);        
        //String reverse = sb.reverse().toString();         
        // 결과 출력        
        //System.out.println(sb); // "EDCBA"        
        //System.out.println(reverse); // "EDCBA"

        for (int i = charArr.length; i > 0; i--){
            answer[end] = Character.getNumericValue(charArr[i-1]);
            end++;
        }
        return answer;
    }
}
