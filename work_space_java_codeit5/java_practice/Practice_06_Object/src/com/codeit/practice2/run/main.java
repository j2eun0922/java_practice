package com.codeit.practice2.run;

import com.codeit.practice2.model.Book;
import org.w3c.dom.ls.LSOutput;

public class main {
    public static void main(String[] args) {
        Book book1 = new Book("자바", "출판사1", "홍길동");
        Book book2 = new Book("파이썬", "출판사2", "박길동", 20000, 0.1);

        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
