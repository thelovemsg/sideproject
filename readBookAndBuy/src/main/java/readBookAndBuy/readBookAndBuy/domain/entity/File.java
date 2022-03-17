package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import readBookAndBuy.readBookAndBuy.domain.entity.book.Book;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class File implements Serializable {

    @Id @GeneratedValue
    @Column(name = "file_id")
    private Long id;

    @GeneratedValue
    private UUID storedFileName;

    private String fileType;
    private String originFileName;

    private Long fileSize;

    @OneToMany(mappedBy = "file")
    private List<Book> books = new ArrayList<>();

}
