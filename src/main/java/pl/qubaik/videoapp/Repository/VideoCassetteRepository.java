package pl.qubaik.videoapp.Repository;

import org.springframework.data.repository.CrudRepository;
import pl.qubaik.videoapp.Model.VideoCassette;

public interface VideoCassetteRepository extends CrudRepository<VideoCassette, Long> {
}
