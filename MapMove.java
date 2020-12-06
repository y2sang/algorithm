import java.util.*;
public class MapMove {
    public static class MoveIt {
        public void move(int count, char[] dirs){
            int[] dx = {0, 0, -1, 1};
            int[] dy = {-1, 1, 0, 0};
            int x = 1;
            int y = 1;
            String[] moveType = {"L","R","U","D"};
            
            for(int i=0; i<dirs.length; i++){
                char c = dirs[i];
                int idx = Arrays.asList(moveType).indexOf(String.valueOf(c));
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if ( nx < 1 || ny < 1 || nx > count || ny > count ){
                    continue;
                } else {
                    x = x + dx[idx];
                    y = x + dx[idx];
                }
                System.out.println("x : "+ x);
                System.out.println("y : "+ y);
                System.out.println("-------");
            }
        }
    }
    public static void main(String[] args) {
        /* 5
        R R R U D D
        */
        
        MoveIt sub = new MoveIt();
        sub.move(5, new char[]{'R','R','R','U','D','D'});
    }
}