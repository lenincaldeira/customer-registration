package services;

import com.customer.registration.dto.Adress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AdressRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AdressService {

    @Autowired
    private AdressRepository repository;

    public Optional<Adress> search(long id) {
        return repository.findById(id);
    }

}
