package br.com.apispringboot.marvel.endpoint;

import br.com.apispringboot.marvel.model.CharacterModel;
import br.com.apispringboot.marvel.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("characters")
public class Character {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(CharacterModel.characterModels, HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getCharacterById(@PathVariable("id") int id) {
        return new ResponseEntity<>(CharacterModel.characterModels, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Character character) {
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@RequestBody Character character) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Character character) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
