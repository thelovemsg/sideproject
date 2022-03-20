package readBookAndBuy.readBookAndBuy.domain.entity.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.BooleanConverter;
import readBookAndBuy.readBookAndBuy.domain.entity.book.Book;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class BookOrdersDetail {

    @Id @GeneratedValue
    @Column(name = "book_orders_detail_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_id")
    private Book book;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_orders_id")
    private UserOrders userOrders;

    @Convert(converter = BooleanConverter.class)
    private boolean isPaid;

    @OneToMany(mappedBy = "bookOrdersDetail")
    private List<BookOrderRefund> bookOrderRefundList = new ArrayList<>();

    @Convert(converter = BooleanConverter.class)
    private boolean isRefundable;

}
