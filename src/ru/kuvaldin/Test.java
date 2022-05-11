package ru.kuvaldin;

public class Test implements UserOutput{

    private static TestElement questions;
    private int rightAnswerCount = 0;

    public void passTest(int rightAnswerCount){
        switch (rightAnswerCount){
            case 1 -> print("Один правильный ответ");
            case 2 -> print("Два ответа правильные");
            case 3 -> print("Отлично все ответы правильные");
            default -> print("Вы ошиблись везде");
        }
    }

    protected void setTestElement (TestElement questions){
        this.questions = questions;
    }
    protected TestElement getQuestions(){
        return questions;
    }

    protected void incRightAnswerCount(){
        rightAnswerCount ++;
    }
    public int getRightAnswerCount(){
        return rightAnswerCount;
    }
    public void print(String message){
        System.out.println(message);
    }
}
