package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Array;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class BookMark {

    @Id @GeneratedValue
    @Column(name = "bookmark_id")
    private Long id;

    private String location;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "lend_id")
    private Lend lend;

}
