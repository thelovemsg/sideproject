package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

    public DeliveryAddress(String userAddress1, String userAddress2, String userAddress3) {
        this.userAddress1 = userAddress1;
        this.userAddress2 = userAddress2;
        this.userAddress3 = userAddress3;
    }
}
