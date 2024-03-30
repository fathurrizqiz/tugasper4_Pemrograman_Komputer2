/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialisasi;
import java.io.Serializable;

/**
 *
 * @author FATHUR
 */
public class ListBook {
    String NameBook;
    int ListBook;
    
    public ListBook (String NameBook, int nomorbuku){
        this.NameBook = NameBook;
        this.ListBook = nomorbuku;
    }
    @Override
 public String toString() {
 return "\r\nNama buku=" + NameBook + "\r\nnomor buku=" + ListBook + "\r\n";
 }
}
