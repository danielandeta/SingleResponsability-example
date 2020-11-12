/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author Dlandeta
 */
public class Book {
    private int currentPage;
    
    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public int turnPage() {
        return currentPage;
    }

    public void printCurrentPage() {
        System.out.println("current page content");
    }
    
}
