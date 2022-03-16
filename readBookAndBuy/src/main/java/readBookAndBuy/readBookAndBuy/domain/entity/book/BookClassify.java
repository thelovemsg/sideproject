package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class BookClassify {

    @Id @GeneratedValue
    @Column(name = "book_classify_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private BookType bookType;

    private String classifyName;

}
