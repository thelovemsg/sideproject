package readBookAndBuy.readBookAndBuy.domain.entity.role;

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
public class Resource {

    @Id @GeneratedValue
    @Column(name = "resource_id")
    private Long id;

    private String resourceContent;
}
