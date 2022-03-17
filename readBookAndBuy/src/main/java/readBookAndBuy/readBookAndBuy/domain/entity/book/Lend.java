package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import readBookAndBuy.readBookAndBuy.domain.entity.Users;
import readBookAndBuy.readBookAndBuy.domain.entity.base.BaseTimeEntity;
import readBookAndBuy.readBookAndBuy.domain.entity.book.BookMark;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class Lend extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "lend_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @OneToMany(mappedBy = "lend")
    private List<BookMark> bookMarks = new ArrayList<>();

    private LocalDateTime lendDate;

    private LocalDateTime expireDate;

}
