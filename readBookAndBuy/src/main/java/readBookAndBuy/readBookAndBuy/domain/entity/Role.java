package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
public class Role extends BaseEntity{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "role_id")
    private Long id;
    private String roleType;

}
