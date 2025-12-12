package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBooks{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    while(true){
      System.out.println("Tittle: ");
      String title = scanner.nextLine();
        

      
      System.out.println("Pages: ");
      int pages = scanner.nextInt();

      System.out.println("Publication year: ");
      int year = scanner.nextInt();

      books.add(new Book(title, pages, year));
        
      System.out.println("Want to finish adding books? ");
      String ans = scanner.nextLine();
      if(ans.equals("Yes")){
          break;
      } else if(ans.equals("No")){
        continue;
      }}
    
      System.out.println("What information will be printed? ");
      
      String inf = scanner.nextLine();

    for(Book book : books){

      if(inf.equals("everything")){
        System.out.println(book);
      } else if(inf.equals("name")){
        System.out.println(book.getTitle());
      }
    }
    scanner.close();
  } 
}
