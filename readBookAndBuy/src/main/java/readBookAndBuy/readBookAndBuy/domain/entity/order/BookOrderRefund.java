package readBookAndBuy.readBookAndBuy.domain.entity.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.BooleanConverter;

import javax.persistence.*;

import static javax.persistence.EnumType.*;
import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class BookOrderRefund {

    @Id @GeneratedValue
    @Column(name = "book_orders_refund_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "book_orders_detail_id")
    private BookOrdersDetail bookOrdersDetail;

    @Enumerated(STRING)
    private RefundCategoryType refundCategoryType;

    private String refundReason;

    @Convert(converter = BooleanConverter.class)
    private boolean refundDone;

}
