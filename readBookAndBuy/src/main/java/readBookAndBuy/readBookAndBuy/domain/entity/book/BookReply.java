package readBookAndBuy.readBookAndBuy.domain.entity.book;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import readBookAndBuy.readBookAndBuy.domain.entity.BooleanConverter;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookReply {

    @Id
    @GeneratedValue
    @Column(name = "book_reply_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;
    @Length(max = 200)
    private String content;
    private String writerNickname;
    private Integer replyOrder;

    @Convert(converter = BooleanConverter.class)
    private boolean isDeleted;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private BookReply parent;

    @OneToMany(mappedBy = "parent")
    private List<BookReply> child = new ArrayList<>();

    public void addChildBookReply(BookReply child){
        this.child.add(child);
        child.setParent(this);
    }

}
