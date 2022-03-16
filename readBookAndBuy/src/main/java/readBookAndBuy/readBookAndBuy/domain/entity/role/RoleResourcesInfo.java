package readBookAndBuy.readBookAndBuy.domain.entity.role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.base.BaseTimeEntity;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Getter
@NoArgsConstructor
public class RoleResourcesInfo extends BaseTimeEntity {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "role_id")
    public Roles roles;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "resource_id")
    public Resource resources;

}
