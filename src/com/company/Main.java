package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Shark();
        Animal animal2=new Turtle();
        Animal animal3=new Eagle();

        Animal[] arr={animal,animal2,animal3};
        for (Animal a:arr) {
            if (a instanceof Turtle){
                animal2.method();
                System.out.println(a.getClass());
            }
            else if (a instanceof Shark){
                animal.method();
                System.out.println(a.getClass());
            }
            else if (a instanceof Eagle){
                animal3.method();
                System.out.println(a.getClass());
            }
            else{
                System.out.println("defoult");
            }
        }
    }
}
