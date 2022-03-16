package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;
import readBookAndBuy.readBookAndBuy.domain.enums.RoleType;
import readBookAndBuy.readBookAndBuy.domain.enums.UserGrade;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static javax.persistence.FetchType.*;

@Entity
@NoArgsConstructor
@Getter
public class User extends DeliveryAddress {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name="role_id")
    private RoleType roleType;

    @Email
    private String email;
    private String nickname;

    @Pattern(regexp = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")
    private String password;

    @Pattern(regexp = "\\d{2,3}-\\d{3,4}-\\d{3,4}")
    private String phone;

    private String connectionIp;
    private String companyName;

    @Pattern(regexp = "\\d{2,3}-\\d{3,4}-\\d{3,4}")
    private String companyNumber;

    @Enumerated(EnumType.STRING)
    private UserGrade userGrade;
    private LocalDate birthDay;

    @OneToMany(mappedBy = "user")
    private List<DeliveryAddress> deliveryAddresses = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    private List<Subscribe> subscribes = new ArrayList<>();

    public void addDeliveryAddress(DeliveryAddress address){
        deliveryAddresses.add(address);
    }

}
