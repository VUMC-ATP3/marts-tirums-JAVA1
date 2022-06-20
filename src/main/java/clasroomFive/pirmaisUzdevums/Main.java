package clasroomFive.pirmaisUzdevums;

import clasroomFive.encapsulation.Weather;
import clasroomFive.pirmaisUzdevums.Author;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();

    Author JKRowling = new Author("JK Rowling", "JK@gmail.com", 'F');
    Author Rainis = new Author("Jānis Rainis", "JR@gmail.com", 'V');

    Book bookThree = new Book("Harry Potter 2", JKRowling, new Cena(19.99, '$'));
    Cena cena = new Cena(9.99, 'e');

//    Book bookOne = new Book("Harry Potter", JKRowling, 15.99);
    Book bookTwo = new Book("Cits nosaukums", Rainis, cena);
    bookTwo.price.discount(30);
        System.out.println();


        System.out.println(bookTwo.toString());
        System.out.println(bookThree.toString());



    }
}
