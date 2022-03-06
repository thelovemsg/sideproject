package readBookAndBuy.readBookAndBuy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import readBookAndBuy.readBookAndBuy.domain.entity.User;
import readBookAndBuy.readBookAndBuy.repository.UserRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> findByEmail(String email){
        return userRepository.findByEmail(email);
    }


}
