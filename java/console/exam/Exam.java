import java.util.Scanner;
import java.io.IOException;
import java.io.*;
public class Exam{
    private void showMenu(){
        System.out.println("\n1 Build Question");
        System.out.println("2 Show Questions");
        System.out.println("3 Save Questions");
        System.out.println("4 Load Questions");
        System.out.println("5 Take Exam");
        
        System.out.println("6 Quit");
        System.out.println("");
    }
    private void takeExam(){

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
            BufferedReader bfr = new BufferedReader(new FileReader("question.txt"));
            
            String qline=null;
            String qarray[] = new String[9];
            int c = 0;
            while((qline=bfr.readLine())!=null){
                qarray[c++]=qline;
            };
            aQuestion.question=qarray[0];
            aQuestion.answer1=qarray[1];
            aQuestion.answer2=qarray[2];
            aQuestion.answer3=qarray[3];
            aQuestion.answer4=qarray[4];

            aQuestion.score1=Boolean.parseBoolean(qarray[5]);
            aQuestion.score2=Boolean.parseBoolean(qarray[6]);
            aQuestion.score3=Boolean.parseBoolean(qarray[7]);
            aQuestion.score4=Boolean.parseBoolean(qarray[8]);

            System.out.print(""+aQuestion.toString());

            bfr.close();
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
        int correctAnswer = aQuestion.correctAnswer();
        
        System.out.println("Answer "+correctAnswer+" is correct.");
        
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
                loadQuestion();
            } else if (response == 5){
                //takeExam();
            } else if (response == 6){
                quit = true;
            }
        }
    }
    
    public static void main(String args[]){
        new Exam();
    }
    
}