import java.util.*;

// 알고리즘 문제
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> map1 = new HashMap<>();
        int[] answer = new int[photo.length];
        for (int i = 0; i< name.length; i++){
            map1.put(name[i], yearning[i]);
        }

        for (int j=0; j < photo.length; j++){
            int a = 0;
            for(int k = 0; k < photo[j].length; k++){
                if (map1.containsKey(photo[j][k])){
                    a+=map1.get(photo[j][k]);
                }
            }
            answer[j] = a;
        }

        return answer;
    }
}
