package readBookAndBuy.readBookAndBuy.domain.entity;

import lombok.Getter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
public class Address {

    private String userAddress1;
    private String userAddress2;
    private String userAddress3;

}
