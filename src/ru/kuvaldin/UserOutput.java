package ru.kuvaldin;

interface UserOutput {
    default void print(String string){
        System.out.println(string);
    }
}
