package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
public class Resources extends BaseEntity{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "resources_id")
    private Long id;
    private String resourceContent;

}
