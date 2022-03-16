package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Subscribe {

    @Id @GeneratedValue
    @Column(name = "subscribe_id")
    private Long id;

    private int subscribe_price;
    private LocalDateTime subscribeDate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean isExpired;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

}
