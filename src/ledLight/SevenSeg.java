package ledLight;

public class SevenSeg {

    static int[][] board = new int[5][4];
    public static void main(String[] args) {

        setBoard("1101101");
        display();
    }

    public static void display(){
        for (int[] i : board) {
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

    public static void lineA(){
        board [0][0] = 1;
        board [0][1] = 1;
        board [0][2] = 1;
        board [0][3] = 1;
    }

    public static  void lineB(){
        board [0][3] = 1;
        board [1][3] = 1;
        board [2][3] = 1;

    }

    public static  void lineC(){
        board [2][3] = 1;
        board [3][3] = 1;
        board [4][3] = 1;
    }
    public  static void lineD(){
        board [4][0] = 1;
        board [4][1] = 1;
        board [4][2] = 1;
        board [4][3] = 1;
    }

    public  static void lineE(){
        board [2][0] = 1;
        board [3][0] = 1;
        board [4][0] = 1;
    }
    public  static void lineF(){
        board [0][0] = 1;
        board [1][0] = 1;
        board [2][0] = 1;
    }
    public  static void lineG(){
        board [2][1] = 1;
        board [2][2] = 1;
    }

    public static void setBoard(String input) {
        if (input.length() > 8){
            input = input.substring(0,8);
        }

        char[] ch =input.toCharArray();
        for (char i : ch) {
            if (!(i == '1' || i == '0')) {
                throw new IllegalArgumentException("the Value must be '1' or '0' ");
            }
        }


            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == '1') {
                    switch (j){
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


