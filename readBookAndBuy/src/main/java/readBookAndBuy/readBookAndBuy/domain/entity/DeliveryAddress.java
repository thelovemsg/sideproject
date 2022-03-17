package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class DeliveryAddress extends Address{

    @Id @GeneratedValue
    @Column(name = "delivery_address_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    private boolean isMainAddress;

}
