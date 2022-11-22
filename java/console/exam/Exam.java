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
    Question aQuestion = new MultiOptionQuestion();
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
            aQuestion.setQuestion(qarray[0]);
            aQuestion.setAnswer1(qarray[1]);
            aQuestion.setAnswer2(qarray[2]);
            aQuestion.setAnswer3(qarray[3]);
            aQuestion.setAnswer4(qarray[4]);

            aQuestion.setScore1(Boolean.parseBoolean(qarray[5]));
            aQuestion.setScore2(Boolean.parseBoolean(qarray[6]));
            aQuestion.setScore3(Boolean.parseBoolean(qarray[7]));
            aQuestion.setScore4(Boolean.parseBoolean(qarray[8]));

            System.out.print(""+aQuestion.toString());

            bfr.close();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
    }
    private void buildQuestion(){

        System.out.println("Enter Question text");
        consoleInput.nextLine();
        aQuestion.setQuestion(consoleInput.nextLine());
        System.out.println("Enter Answer 1 text");
        aQuestion.setAnswer1(consoleInput.nextLine());
        System.out.println("Enter Answer 2 text");
        aQuestion.setAnswer2(consoleInput.nextLine());
        System.out.println("Enter Answer 3 text");
        aQuestion.setAnswer3(consoleInput.nextLine());
        System.out.println("Enter Answer 4 text");
        aQuestion.setAnswer4(consoleInput.nextLine());
        System.out.println("Which answer is correct?");
        int correctAnswer = 0;
        correctAnswer = consoleInput.nextInt();

        if (correctAnswer == 1){
            aQuestion.setScore1(true);
        } else if (correctAnswer == 2){
            aQuestion.setScore2(true);
        } else if (correctAnswer == 3){
            aQuestion.setScore2(true);
        } else if (correctAnswer == 4){
            aQuestion.setScore2(true);
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
        
        System.out.println(""+aQuestion.toString());
        
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