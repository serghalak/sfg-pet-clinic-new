package guru.springframework.sfgpetclinic.services.map;

import com.petclinic.drdolittle.model.PetType;
import com.petclinic.drdolittle.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetTypeMapService
        extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType oblect) {
        super.delete(oblect);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
