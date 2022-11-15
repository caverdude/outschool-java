import java.util.Scanner;
import java.io.IOException;
import java.io.*;
public class Exam{
    private void showMenu(){
        System.out.println("\n1 Build Question");
        System.out.println("2 Show Questions");
        System.out.println("3 Save Questions");
        System.out.println("4 Load Questions");
        System.out.println("5 Quit");
        System.out.println("");
    }
    Question aQuestion = new Question();
    private void saveQuestion(){
      try{        
        FileWriter fw = new FileWriter("question.txt");
     
        fw.write(aQuestion.toString());
     
        fw.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
    
    private void loadQuestion(){
        try{        
            FileReader fr = new FileReader("question.txt");
         
            fw.(aQuestion.toString());
         
            fw.close();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
    }
    private void buildQuestion(){


        System.out.println("Enter Question text");
        consoleInput.nextLine();
        aQuestion.question = consoleInput.nextLine();
        System.out.println("Enter Answer 1 text");
        aQuestion.answer1 = consoleInput.nextLine();
        System.out.println("Enter Answer 2 text");
        aQuestion.answer2 = consoleInput.nextLine();
        System.out.println("Enter Answer 3 text");
        aQuestion.answer3 = consoleInput.nextLine();
        System.out.println("Enter Answer 4 text");
        aQuestion.answer4 = consoleInput.nextLine();
        System.out.println("Which answer is correct?");
        int correctAnswer = 0;
        correctAnswer = consoleInput.nextInt();
        if (correctAnswer == 1){
            aQuestion.score1 = true;
        } else if (correctAnswer == 2){
            aQuestion.score2 = true;
        } else if (correctAnswer == 3){
            aQuestion.score3 = true;
        } else if (correctAnswer == 4){
            aQuestion.score4 = true;
        }
    }
    public static void writeFile2() throws IOException {
        FileWriter fw = new FileWriter("out.txt");
     
        for (int i = 0; i < 10; i++) {
            fw.write("something");
        }
     
        fw.close();
    }
    private void showQuestion(){
        
        System.out.println("" + aQuestion.question);
        System.out.println("" + aQuestion.answer1);
        System.out.println("" + aQuestion.answer2);
        System.out.println("" + aQuestion.answer3);
        System.out.println("" + aQuestion.answer4);
        if (aQuestion.score1 == true){
            System.out.println("Answer 1 is correct.");
        } 
        if (aQuestion.score2 == true){
            System.out.println("Answer 2 is correct.");
        }
        if (aQuestion.score3 == true){
            System.out.println("Answer 3 is correct.");
        }
        if (aQuestion.score4 == true){
            System.out.println("Answer 4 is correct.");
        }
    }
    private Scanner consoleInput = new Scanner(System.in);
    public Exam(){
        
        boolean quit = false;
        int response;
        while (!quit){
            showMenu();
            response = consoleInput.nextInt();
            if (response == 1){
                buildQuestion();
            } else if (response == 2){
                showQuestion();
            } else if (response == 3){
                saveQuestion();
            } else if (response == 4){
                //loadQuestion();
            } else if (response == 5){
                quit = true;
            }
        }
    }
    
    public static void main(String args[]){
        new Exam();
    }
    
}