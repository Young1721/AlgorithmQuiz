public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int sy = 0;
        int sx  =0;
        char[][] arr = new char[park.length][park[0].length()];
        for(int i=0; i < park.length; i++){
            arr[i] = park[i].toCharArray();
            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }

        for(String st : routes){
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);
            int nx = sx;
            int ny = sy;

            for(int i = 0; i < len; i++) {
                if (st.charAt(0) == 'E') {
                    nx += 1;
                }
                if (st.charAt(0) == 'W') {
                    nx -= 1;
                }
                if (st.charAt(0) == 'S') {
                    ny += 1;
                }
                if (st.charAt(0) == 'N') {
                    ny -= 1;
                }
                if (nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length) {
                    if (arr[ny][nx] == 'X') {
                        break;
                    }
                    if (i == len - 1) {
                        sx = nx;
                        sy = ny;
                    }
                }
            }

        }

        System.out.println("start W: " + sx);
        System.out.println("start H: " + sy);
        int [] answer = {sy, sx};
        return answer;
    }
}
