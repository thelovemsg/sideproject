package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class BookInfo extends BaseEntity{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "bookInfo_id")
    private Long id;

    @Column(nullable = false)
    private String isbn;
    private String author;
    private String publishCompany;
    private LocalDate publishDate;
    private String bookName;
    @ManyToOne
    @JoinColumn(name = "file_id")
    private File file;


}
