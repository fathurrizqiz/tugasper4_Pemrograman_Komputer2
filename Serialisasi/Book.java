/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialisasi;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author FATHUR
 */
public class Book implements Serializable {


    private String idBook;
    private String NameBook;
    private List<Book> books;
    private double Nomor_seri;
    
    
    public Book(String NameBook, double Nomor_seri) {
        this.NameBook = NameBook;
        this.Nomor_seri = Nomor_seri;
    }
    
    public Book(){
        
    }
    
    
    public void setNameBook (String Nama){
        this.NameBook = NameBook;
    }
    public void setListBook (List<Book> books){
        this.books = books;
    }
    
    
    
    @Override
    public String toString() {
        String produk, item = "";
        produk = "Produk: \r\n"
                + "Id Buku=" + idBook + "\r\n"
                + "Nama Buku=" + NameBook + "\r\n"
                + "=======================\r\n"
                + "pilih buku:\r\n";
        
        if (books != null) {
            item = books.stream().map(obj -> obj.toString()).reduce(item, String::concat);
        }
        
        return produk + item;
    }
}
