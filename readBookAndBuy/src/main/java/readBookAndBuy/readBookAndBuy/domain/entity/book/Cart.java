package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.Users;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class Cart {

    @Id @GeneratedValue
    @Column(name = "cart_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    private int count;

}
