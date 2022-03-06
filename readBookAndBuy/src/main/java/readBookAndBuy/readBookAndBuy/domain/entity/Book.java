package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Book extends BaseEntity{

    @Id @GeneratedValue
    @Column(name = "book_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    private BookInfo bookInfo;


}
