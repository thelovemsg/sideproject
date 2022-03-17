package readBookAndBuy.readBookAndBuy.domain.entity.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

    @Id @GeneratedValue
    @Column(name = "role_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private RoleTypeEnum roleType;

}
