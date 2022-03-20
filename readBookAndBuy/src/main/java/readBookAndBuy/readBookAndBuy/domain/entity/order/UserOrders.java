package readBookAndBuy.readBookAndBuy.domain.entity.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.Address;
import readBookAndBuy.readBookAndBuy.domain.entity.Member;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor
public class UserOrders extends Address {

    @Id @GeneratedValue
    @Column(name = "user_order_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Member member;

    private String receiverName;
    private String receiverPhone;

}
