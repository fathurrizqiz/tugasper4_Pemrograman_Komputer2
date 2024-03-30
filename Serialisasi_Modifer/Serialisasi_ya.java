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
public class Serialisasi_ya implements Serializable {
    private static final long serialVersionUID = 1L;
    private transient String idBook;
    private String NameBook;
    private List<Book>books;
    private static double Nomor_seri;
    private final String publisher;

    public String getNameBook() {
        return NameBook;
    }

    public void setNameBook(String NameBook) {
        this.NameBook = NameBook;
    }

    public static double getNomor_seri() {
        return Nomor_seri;
    }

    public static void setNomor_seri(double Nomor_seri) {
        Serialisasi_ya.Nomor_seri = Nomor_seri;
    }

    public Serialisasi_ya() {
        this.publisher = null;
    }
    
    
    @Override
    public String toString(){
        String buku, item = " ";
        buku = "Produk: \\r\\n"
                + "Id Buku=" + idBook + "\r\n"
                + "Nama Buku=" + NameBook + "\r\n"
                + "=======================\r\n"
                + "pilih buku:\r\n";
        
        if (books != null){
            item = books.stream().map(obj -> obj.toString()).reduce(item, String :: concat);
            
        }
        return buku + item;
    
    }
    
    
}
