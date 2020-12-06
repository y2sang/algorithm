class Chess{
    public void move(String currentPos){
        int column = Character.getNumericValue(currentPos.charAt(1));
        int row = toNumber(currentPos.charAt(0));
        // System.out.println(column);
        // System.out.println(row);
        int[][] steps = new int[][]{
            {1, -2}, {1, 2}, {-1, -2}, {-1, 2},
            {2, -1}, {2, 1}, {-2, -1}, {-2, 1}
        };
        int result = 0;
        for(int[] step : steps){
            int nextRow = row + step[0];
            int nextColumn = column + step[1];
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8){
                result = result + 1;
            }
        }
        System.out.println(result);

    }
    static int toNumber(char chr) {
        return (chr - 96);
    }
}
public class MoveKnight {
    public static void main(String args[]) { 
        Chess chess = new Chess();
        chess.move("c1");

    }
}
