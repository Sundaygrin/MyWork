package ledLight;

public class Practice {

    static int [][] grid = new int[5][4];

    public static void main(String[] args) {
        setBoard("0110000");
        display();
    }



    public static void display() {
        for (int [] i:grid) {
            for (int j:i) {
                if (j == 1) {
                    System.out.print("# ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void  lineA(){
        grid[0][0] = 1;
        grid[0][1] = 1;
        grid[0][2] = 1;
        grid[0][3] = 1;
    }

    public static  void lineB(){
        grid[0][3] = 1;
        grid[1][3] = 1;
        grid[2][3] = 1;
    }

    public static void lineC(){
        grid[2][3] = 1;
        grid[3][3] = 1;
        grid[4][3] = 1;
    }

    public static void lineD(){
        grid[4][0] = 1;
        grid[4][1] = 1;
        grid[4][2] = 1;
        grid[4][3] = 1;
    }

    public static  void lineE(){
        grid[2][0] = 1;
        grid[3][0] = 1;
        grid[4][0] = 1;
    }

    public static void lineF(){
        grid[0][0] = 1;
        grid[1][0] = 1;
        grid[2][0] = 1;
    }
    public static void lineG(){
        grid[2][1] = 1;
        grid[2][2] = 1;
    }
    public static void setBoard(String input) {
        if (input.length() > 8){
            input = input.substring(0,8);
        }

        char[] ch = input.toCharArray();
        for (char i:ch) {
            if (!(i == '1' || i == '0')) {
                throw new IllegalArgumentException("Values must either be '1' or '0' ");
            }
        }
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == '1'){
                switch (j) {
                    case 0 -> lineA();
                    case 1 -> lineB();
                    case 2 -> lineC();
                    case 3 -> lineD();
                    case 4 -> lineE();
                    case 5 -> lineF();
                    case 6 -> lineG();
                }
            }

        }
    }

}
