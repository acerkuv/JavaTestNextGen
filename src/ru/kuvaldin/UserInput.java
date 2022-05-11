package ru.kuvaldin;

interface UserInput {
     default String read(String message){
         //
        return message;
    }
}
