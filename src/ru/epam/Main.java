package ru.epam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        int i = 3;
        i = -i++ + i++ + -i;
        //-3 + 4  + 5
        //i=4  i=5
        System.out.println("i:" + i);
    }
}
