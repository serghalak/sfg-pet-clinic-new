package guru.springframework.sfgpetclinic.model;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity{

    @Builder
    public PetType(Long id, String name) {
        super(id);

        this.name=name;
    }


    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "petType")
    private Set<Pet> pet;

    @Override
    public String toString() {
        return name;
    }
}
