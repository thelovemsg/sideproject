package readBookAndBuy.readBookAndBuy.domain.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.FetchType.*;

@Entity
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Email
    @NotEmpty
    private String email;

    @Length(min = 10, max = 50)
    @NotEmpty
    private String nickname;

    @ManyToOne(fetch = LAZY) // 무조건 fetch는 처음에 LAZY 세팅
    @JoinColumn(name = "role_id")
    private Role role;

    @NotEmpty
    @Pattern(regexp = "^\\\\d{3}-\\\\d{3,4}-\\\\d{4}$")
    private String phoneNumber;

    @NotEmpty
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\{\\}\\[\\]\\/?.,;:|\\)*~`!^\\-_+<>@\\#$%&\\\\\\=\\(\\'\\\"]).{8,20}")
    private String password;

    private String address;
    private LocalDateTime recentOnlineTime;
    private LocalDate birthday;
    private String connectionUrl;
    private String companyName;
    private String companyPhoneNumber;


}
