package pl.qubaik.videoapp.Api;

import org.springframework.web.bind.annotation.*;
import pl.qubaik.videoapp.Model.VideoCassette;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cassetts")
public class VideoCassetteApi {

    private List<VideoCassette> videoCassettes;

    public VideoCassetteApi() {
        videoCassettes = new ArrayList<>();
        videoCassettes.add(new VideoCassette(1, "coś tam", 2000));
        videoCassettes.add(new VideoCassette(2, "coś tam2", 2010));
    }

    @GetMapping("/all")
    public List<VideoCassette> getAll() {
        return videoCassettes;
    }

    @GetMapping()
    public VideoCassette getById(@RequestParam int index) {
        Optional<VideoCassette> first = videoCassettes.stream().filter(element -> element.getId() == index).findFirst();
        return first.get();
    }

    @PostMapping
    public boolean addVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.add(videoCassette);
    }

    @PutMapping
    public boolean updateVideo(@RequestBody VideoCassette videoCassette) {
        return videoCassettes.add(videoCassette);
    }

    @DeleteMapping
    public boolean delateVideo(@RequestBody int index) {
        return videoCassettes.removeIf(element -> element.getId() == index);
    }

}
