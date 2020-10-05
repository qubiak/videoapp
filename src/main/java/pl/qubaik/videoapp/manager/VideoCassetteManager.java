package pl.qubaik.videoapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.qubaik.videoapp.Model.VideoCassette;
import pl.qubaik.videoapp.Repository.VideoCassetteRepository;

import java.util.Optional;

@Service
public class VideoCassetteManager {

    private VideoCassetteRepository videoCassetteRepository;

    @Autowired
    public VideoCassetteManager(VideoCassetteRepository videoCassetteRepository) {
        this.videoCassetteRepository = videoCassetteRepository;
    }

    public Optional<VideoCassette> findById(Long id) {
        return videoCassetteRepository.findById(id);
    }

    public Iterable<VideoCassette> findAll(Long id) {
        return videoCassetteRepository.findAll();
    }

    public VideoCassette save(VideoCassette videoCassette) {
        return videoCassetteRepository.save(videoCassette);
    }

    public void delateById(Long id) {
        videoCassetteRepository.deleteById(id);
    }
}
