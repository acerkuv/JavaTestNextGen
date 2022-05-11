package ru.kuvaldin;

import java.util.Scanner;

public class TestElement implements UserInput, UserOutput{
     private String[] Answers = {"1. cs", "2. java", "3. class", "4. exe",
                                "1. commit", "2. push", "3. clone", "4. copy",
                                "1. while", "2. for", "3. loop"};

     private String [] Questions = {
             "В файл с каким расширением компилируется java-файл?",
             "С помощью какой команды git можно получить полную копию удаленного репозитория?",
             "Какой применяется цикл, когда не известно количество итераций?"};

     private int rightAnswerIndex;

     public void setRightAnswerIndex(int rightAnswerIndex){
         this.rightAnswerIndex = rightAnswerIndex;
     }

    public String getAnswer(int elementPosition){
         return Answers[elementPosition];
    }

    public String getQuestion(int elementPosition){
         return  Questions[elementPosition];
    }

    protected boolean ask(String userInput) {
         if (Integer.parseInt(userInput) == rightAnswerIndex) return true;
         return false;
     }

    protected void print() {
         print();
     }

    public int lenQuestions(){
         return Questions.length;
    }
    public void print(String string){

     }
     public String read(){
         Scanner userInput = new Scanner(System.in);
         return userInput.nextLine();
    }

}
