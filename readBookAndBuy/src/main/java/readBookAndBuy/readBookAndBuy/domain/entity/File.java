package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import readBookAndBuy.readBookAndBuy.domain.entity.book.Book;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class File {

    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;

    @Id @GeneratedValue
    private UUID uuid;

    @OneToMany(mappedBy = "files")
    private Book bookInfo;

    private String fileType;
    private String originFileName;
    private String storedFileName;

    private Long fileSize;


}
