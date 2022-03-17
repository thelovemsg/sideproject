package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.File;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class Book implements Serializable {

    @Id @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    private String isbn;
    private String author;
    private String publishCompany;
    private LocalDate publishDate;
    private String bookName;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_classify_id")
    private BookClassify bookClassify;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "file_id", insertable = false, updatable = false)
    private File file;

}
