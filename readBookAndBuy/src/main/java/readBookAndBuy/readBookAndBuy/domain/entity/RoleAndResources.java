package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.*;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;

@Entity
public class RoleAndResources extends BaseEntity{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "roleAndResourcesId")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "resources_id")
    private Resources resources;

}
