package org.example;

public class Main {
    public static void main(String[] args) {
        // примитивные типы данны
        byte b1 = 127; // -128 (2^7) до 127
        short shrt = 32_000; // -2^15 до 2^15 - 1
        int a = 2_000_000_000;
        long l = 3_000_000_000l;
        char c = 'a';
        float f = 5f;
        double d = 5;
        boolean b = true;

        String s = "string"; // String - класс

//        System.out.println(b1);
//        System.out.println(shrt);
//        System.out.println(a);
//        System.out.println(l);
//        System.out.println(c);
//        System.out.println(f);
//        System.out.println(d);
////        System.out.println(b);
//        System.out.println("Int: " + a + " long: " + l);
//        System.out.println("Sum = " + (1 + 1));
//        System.out.println(1 + 1 + "=sum");
//        System.out.println((char)(c + 5));

//        if (a == 2_000_000_000){
//            System.out.println("a == 2000000000");
//        }else{
//            System.out.println("a != 2000000000");
//        }
        // for (инциализация переменных; условия выполнение; инкремент)
//        for (int i = 0; i < 10; i++){
//            System.out.print(i);
//        }
//        int i = 0;
//        while(i < 10){
//            System.out.print(i);
//            i++;
//        }
//        System.out.println(calculate(5,5));
        int prefixJ = 0;
        int postfixJ = 0;
        while (prefixJ < 3 ){
            System.out.println(++prefixJ);
            System.out.println(postfixJ++);
            System.out.println("------------");
        }
    }

    // void - если методо ничего не возвращает
    public static int calculate(int a, int b){
        // % - остаток от деления
        int c = (a + b) % 5;
        return c;
    }
}