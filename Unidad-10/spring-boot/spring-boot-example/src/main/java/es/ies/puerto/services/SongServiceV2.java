package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;


@RestController
@RequestMapping("/v2/song")
public class SongServiceV2 {
    private static Logger LOG = LoggerFactory.getLogger(SongServiceV2.class);

    private SongRepository songRepository;

    @Autowired
    public void setSongRepository(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    public SongServiceV2() {
    }

    @GetMapping("/")
    public List<Song> getSongs() {
        return songRepository.getSongs();
    }

    @GetMapping("/{id}")
    public Song getSongById(@PathVariable(name = "id") final String id) {
        return songRepository.getSongById(id);
    }

    @PostMapping
    public void addSong(@RequestBody final Song song) {
        songRepository.saveSong(song);
    }

    @PostMapping("/{id}")
    public void addSongInid(@PathVariable(name = "id") final String id,
                            @RequestBody final Song song) {
        songRepository.saveSong(song);
    }

    @PatchMapping("/{id}")
    public void updateSong(@PathVariable(name = "id") final String id,
                           @RequestBody final Song song) {
        songRepository.saveSong(song);
    }


    @PutMapping("/{id}")
    public void updateSong2(@PathVariable(name = "id") final String id,
                           @RequestBody final Song song) {
        songRepository.saveSong(song);
    }


    @DeleteMapping("/{id}")
    public void deleteSongById(@PathVariable(name = "id") final String id) {
        songRepository.deleteSongById(id);
    }
}
