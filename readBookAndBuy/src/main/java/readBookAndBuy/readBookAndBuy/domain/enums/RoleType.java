package readBookAndBuy.readBookAndBuy.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RoleType {

    @Id @GeneratedValue
    @Column(name = "role_id")
    private Long id;

    private String roleType;
}
