/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialisasi_Modifer;
import Serialisasi.Book;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author FATHUR
 */
public class Serialisasi_tidak implements Serializable {
    private String idBook;
    private String NameBook;
    private List<Book>books;
    private double Nomor_seri;
    private String publisher;

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String NameBook) {
        this.NameBook = NameBook;
    }

    public double getNomor_seri() {
        return Nomor_seri;
    }

    public void setNomor_seri(double Nomor_seri) {
        this.Nomor_seri = Nomor_seri;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
    
    //keterangan 
    //perbedaan yang paling terlihat pada bagian Transien, Static, dan Final
    //
}
