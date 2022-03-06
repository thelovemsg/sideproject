package readBookAndBuy.readBookAndBuy.domain.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.*;

@Entity
public class File {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "file_id")
    private Long id;

    private String fileType;
    private String fileContent;
}
