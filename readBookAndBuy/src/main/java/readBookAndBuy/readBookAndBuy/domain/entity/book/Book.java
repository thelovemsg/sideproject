package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.File;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class Book {

    @Id @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    @Id
    private String isbn;
    private String author;
    private String publishCompany;
    private LocalDate publishDate;
    private String bookName;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "file_id")
    private List<File> files = new ArrayList<>();

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_classify_id")
    private List<BookClassify> bookClassifies = new ArrayList<>();

    public void addClassifyForBookInfo(BookClassify bookClassify){
        bookClassifies.add(bookClassify);
    }

    public void removeClassifyForBookInfo(BookClassify bookClassify){
        bookClassifies.stream().filter(bc -> bc.getId() != bookClassify.getId()).collect(Collectors.toList());
    }

}
