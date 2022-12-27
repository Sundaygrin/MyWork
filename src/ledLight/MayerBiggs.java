package ledLight;

import java.util.Scanner;

public class MayerBiggs {

    public static void main(String[] args) {
        questions();
        display();
    }

    private static void display() {
    }


    static int[][] array = new int[4][2];


        public static void questions(){

            Scanner input = new Scanner(System.in);
            String answers;
            System.out.println("Select an Option");
            answers = input.nextLine();

            for (int i = 0; i <= 20 ; i++) {
                switch (i){
                    case 1 :
                        System.out.println("""
                                A:Expend energy, Enjoy groups
                                B:Conserve energy, Enjoy one on one
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")) {
                            array[0][0] ++;
                        }
                        else {
                            array[0][1] ++;
                            break;
                        }
                    case 2 :
                        System.out.println("""
                                A:Interpret literally
                                B:Look for a meaning and possibilities
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")) {
                            array[1][0] ++;
                        }
                        else {
                            array[1][1] ++;
                            break;
                        }
                    case 3 :
                        System.out.println("""
                                A: Logical,thinking,questioning
                                B: Empathetic,feeling,accommodating
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[2][0] ++;
                        }
                        else {
                            array[2][1] ++;
                            break;
                        }
                    case 4 :
                        System.out.println("""
                                A: Organized, orderly
                                B: Flexible, adaptable
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")) {
                            array[3][0]++;
                        }
                        else {
                            array[3][1] ++;
                            break;
                        }
                    case 5 :
                        System.out.println("""
                                A: More Outgoing, think out loud
                                B: More reserved, think to yourself
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")) {
                            array[0][0]++;
                        }
                        else {
                            array[0][1] ++;
                            break;
                        }
                    case 6 :
                        System.out.println("""
                                A: Practical, realistic, experimental
                                B: imaginative, innovative, theoretical
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[1][0] ++;
                        }
                        else {
                            array[1][1] ++;
                            break;
                        }
                    case 7 :
                        System.out.println("""
                                A: Candid, straight forward, frank
                                B: Tactful,kind,encouraging
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[2][0] ++;
                        }
                        else {
                            array[2][1] ++;
                            break;
                        }
                    case 8 :
                        System.out.println("""
                                A: Plan, schedule
                                B: Unplanned, sportaneous
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[3][0] ++;
                        }
                        else {
                            array[3][1] ++;
                            break;
                        }
                    case 9 :
                        System.out.println("""
                                A: Seek many tasks,public activities, interaction with other
                                B: Seek private, solitary activities with quiet to concentrate
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[0][0] ++;
                        }
                        else {
                            array[0][1] ++;
                            break;
                        }
                    case 10 :
                        System.out.println("""
                                A: Standard usual conventional
                                B: Different, novel, unique
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[1][0] ++;
                        }
                        else {
                            array[1][1] ++;
                            break;
                        }
                    case 11 :
                        System.out.println("""
                                A: 
                                B: Gentle, tend to appreciate, conciliate
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[2][0] ++;
                        }
                        else {
                            array[2][1] ++;
                            break;
                        }
                    case 12 :
                        System.out.println("""
                                A: Regulated, structured
                                B: Easygoing, "live" and "let live"
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[3][0] ++;
                        }
                        else {
                            array[3][1] ++;
                            break;
                        }
                    case 13 :
                        System.out.println("""
                                A: External, communicative, express yourself
                                B: Internal, reticent, keep to yourself
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[0][0] ++;
                        }
                        else {
                            array[0][1] ++;
                            break;
                        }
                    case 14 :
                        System.out.println("""
                                A: Focus on here-and-now
                                B: Look at the future, global perspective, "big picture"
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[1][0] ++;
                        }
                        else {
                            array[1][1] ++;
                            break;
                        }
                    case 15 :
                        System.out.println("""
                                A: Tough minded
                                B: tender hearted, merciful
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[2][0] ++;
                        }
                        else {
                            array[2][1] ++;
                            break;
                        }
                    case 16 :
                        System.out.println("""
                                A: Preparation, plan ahead
                                B: Go with the flow, adapt as you go
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[3][0] ++;
                        }
                        else {
                            array[3][1] ++;
                            break;
                        }
                    case 17 :
                        System.out.println("""
                                A: Active, intiate
                                B: Reflective, deliberate
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[0][0] ++;
                        }
                        else {
                            array[0][1] ++;
                            break;
                        }
                    case 18 :
                        System.out.println("""
                                A: Facts, things, "what is"
                                B: Ideas, dreams, "what could be", philosophical
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[1][0] ++;
                        }
                        else {
                            array[1][1] ++;
                            break;
                        }
                    case 19 :
                        System.out.println("""
                                A: Matter of fact, issue-oriented
                                B: sensitive, people-oriented, compassionate
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[2][0] ++;
                        }
                        else {
                            array[2][1] ++;
                            break;
                        }
                    case 20 :
                        System.out.println("""
                                A: Control, govern
                                B: Latitude,freedom
                                """);
                        answers = input.nextLine();
                        if (answers.equalsIgnoreCase("A")){
                            array[3][0] ++;
                        }
                        else {
                            array[3][1] ++;
                            break;
                        }

                }
                display();
                String self1 = "";
                String self2 = "";
                String self3 = "";
                String self4 = "";

                if (array[0][0] > array[0][1]){
                    self1 = "E";
                }
                else {
                    self1 = "I";
                }
                if (array[1][0] > array[1][1]){
                    self2 = "S";
                }
                else {
                    self2 = "N";
                }
                if (array[2][0] > array[2][1]){
                    self3 = "T";
                }
                else {
                    self3 = "F";
                }
                if (array[3][0] > array[3][1]){
                    self4 = "J";
                }
                else {
                    self4 = "P";
                }
                System.out.println("Your personality is " + self1 + self2+ self3 + self4);


            }
        }

     }

