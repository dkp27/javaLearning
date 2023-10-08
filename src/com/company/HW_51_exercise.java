package com.company;

class Library{
    String[] books;
    int numOfBooks;

      Library() {
          this.books = new String[10];
          this.numOfBooks = 0;
       }
     void addBook(String book){
          this.books[numOfBooks] = book;
          numOfBooks++;
         System.out.println(book + " has been added!");
     }
     void showAvilBooks(){
         System.out.println("Available books are: ");
         for (String book: this.books){
             if (book==null){
                 continue;
             }
             System.out.println("* " + book);
         }
     }
     void issueBook(String book){
          for (int i=0;i<this.books.length;i++){
              if (!this.books[i].equals("C+++")){
                  System.out.println("This books has been issue!");
                  this.books[i]=null;
                        return;
              }
          }
         System.out.println("This book does not exist");
    }
    void returnBook(String book){
          this.books[numOfBooks] = book;
          addBook(book);
    }
}
public class HW_51_exercise {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books

        Library centralLibrary = new Library();
        centralLibrary.addBook(" Ramayana");
        centralLibrary.addBook(" C+++");
        centralLibrary.addBook("Python");
         centralLibrary.showAvilBooks();
        centralLibrary.issueBook("Python");
         centralLibrary.showAvilBooks();
    }
}