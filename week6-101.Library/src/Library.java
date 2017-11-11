/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
import java.util.ArrayList; 


public class Library {
    private ArrayList<Book> list; 
    
    public Library(){
        this.list = new ArrayList<Book>(); 
    }
    public void addBook(Book newBook) {
        this.list.add(newBook);
    }
    
    public void printBooks(){
        for ( Book b : this.list){
            System.out.println(b);
        }
    }
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();

     // iterate the list of books and add all the matching books to the list found
        for (Book b : this.list){
            if(StringUtils.included(b.title(), title))
            {
                found.add(b);
            }
        }
     return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();

     // iterate the list of books and add all the matching books to the list found
        for (Book b : this.list){
            
            
            if(StringUtils.included(b.publisher(), publisher)){
                found.add(b);
            }
        }
     return found;
    }
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
     // iterate the list of books and add all the matching books to the list found
        for (Book b : this.list){
            if(b.year() == year){
                found.add(b);
            }
        }
     return found;
    }
    
    
}

