package ee.oskar.salat.repository;

import ee.oskar.salat.entity.Kodutoo1;
import org.springframework.data.jpa.repository.JpaRepository;

                                                       // @Entity, selle entity ID tüüp
public interface Kodutoo1Repository extends JpaRepository<Kodutoo1, Long> {
    //                   .save(Kodutoo1 kodutoo1)
    // List<Kodutoo1>    .findall()
    //                   .deletebyID(Long id)
}
