package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.Users;
import readBookAndBuy.readBookAndBuy.domain.entity.book.BookMark;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class Lend {

    @Id @GeneratedValue
    @Column(name = "lend_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @OneToMany
    @JoinColumn(name = "bookmark_id")
    private BookMark bookMark;

    private LocalDateTime lendDate;
    private LocalDateTime expireDate;

}
