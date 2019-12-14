package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 100);
        Book book2 = new Book("Война и мир", 1000);
        Book book3 = new Book("Преступление и наказание", 500);
        Book book4 = new Book("Мастер и Маргарита", 400);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;

        for (int i = 0; i < books.length; i++) {
            Book lib = books[i];
            System.out.println(lib.getName() + " - " + lib.getPages());
        }

        System.out.println('\n' + "Перестановка 0 и 3 :" + '\n');
        books[0] = book4;
        books[3] = book1;
        for (int i = 0; i < books.length; i++) {
            Book lib = books[i];
            System.out.println(lib.getName() + " - " + lib.getPages());
        }

        System.out.println('\n' + "Книги Clean code :" + '\n');
        for (int i = 0; i < books.length; i++) {
            Book lib = books[i];
            if (lib.getName().equals("Clean code")) {
                System.out.println(lib.getName() + " - " + lib.getPages());
            }
        }
    }
}
