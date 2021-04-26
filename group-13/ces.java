package com.ruanjianpj;

import java.util.Random;

public class ces {
    public  void tj(book[] Book){
        Random rand = new Random();
        int r1=rand.nextInt(Book.length);
        System.out.println(Book[r1]);
    }
}
