package orl.learning.bestoftheyear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import orl.learning.bestoftheyear.model.Song;

import java.util.ArrayList;

@Controller
@RequestMapping("/songs")
public class SongController {

    @GetMapping
    public String songsList(Model model) {
        ArrayList<Song> songsList = getSongs();
        model.addAttribute("songs", songsList);
        return "songs-list";
    }

    @GetMapping("/details")
    public String songDetails(@RequestParam(name = "id", required = true, defaultValue = "0") int songId, Model model) {
        model.addAttribute("song", getSongById(songId));
        return "songDetails";
    }

    @GetMapping("/details/{songId}")
    public String singDetailsPath(@PathVariable(name = "songId", required = true) int songId, Model model) {
        model.addAttribute("song", getSongById(songId));
        return "songDetails";
    }

    private ArrayList<Song> getSongs() {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(0,"title0", "author0"));
        songs.add(new Song(1,"title1", "author1"));
        songs.add(new Song(2,"title2", "author2"));
        return songs;
    }

    private Song getSongById(int songId) throws IllegalArgumentException {
        if (songId < 0)
            throw new IllegalArgumentException("songId must be a positive number.");
        for (Song song : getSongs())
            if (song.getId() == songId)
                return song;
        return null;
    }
}
