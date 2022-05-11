package ru.kuvaldin;


public class Main {

    public static void main(String[] args) {

    int [] RightAnswers = {3,3,1};

        TestElement testElement = new TestElement();
        Answer answer = new Answer( "Ваш ответ - ");

        Test test = new Test();
        test.setTestElement(testElement);

        int numberAnswersPosition = 0;
        for (int i = 0; i < testElement.lenQuestions(); i++) {
            // Сеттер номера правильного ответа
            testElement.setRightAnswerIndex(RightAnswers[i]);
            // Выводим на экран очередной вопрос через геттер и метод принт
            test.print(testElement.getQuestion(i));

            for (int j = numberAnswersPosition; j < numberAnswersPosition + 4 ; j++) {
                try {
                    // Выводим на экран вариант ответа, арлученного через геттер
                    test.print(testElement.getAnswer(j));
                // Ловим ошибку - переполниение массива для вариантов ответа на третий вопрос (из 3 шт)
                }catch (ArrayIndexOutOfBoundsException e){
                    break;
                }

            }
            //Переходим с следующему шагу переборов выриантов ответов
            numberAnswersPosition += 4;

            // Проверяем  правильность введеннго ответа пользователя
            boolean checkedAnswer =  testElement.ask(testElement.read());
            if (checkedAnswer) test.incRightAnswerCount();

            answer.showText(checkedAnswer);

        }
        //
        test.passTest(test.getRightAnswerCount());

    }
}
