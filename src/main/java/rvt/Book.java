package rvt;

public class Book {
    private String title;
    private int pages;
    private int year;

    public Book(String Title, int Pages, int Year){
        this.title = Title;
        this.pages = Pages;
        this.year = Year;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return this.title + ", " + this.pages + ", " + this.year + ".";
    }
    
}
