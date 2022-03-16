package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class DeliveryAddress {

    @Id @GeneratedValue
    @Column(name = "delivery_address_id")
    private Long id;
    private String userAddress1;
    private String userAddress2;
    private String userAddress3;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    public DeliveryAddress(String userAddress1, String userAddress2, String userAddress3) {
        this.userAddress1 = userAddress1;
        this.userAddress2 = userAddress2;
        this.userAddress3 = userAddress3;
    }



}
