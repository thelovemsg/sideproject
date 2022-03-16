package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Array;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class BookMark {

    @Id @GeneratedValue
    @Column(name = "bookmark_id")
    private Long id;

    private String location;

}
