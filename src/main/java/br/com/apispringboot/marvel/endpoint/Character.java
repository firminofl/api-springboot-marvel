package br.com.apispringboot.marvel.endpoint;

import br.com.apispringboot.marvel.model.CharacterModel;
import br.com.apispringboot.marvel.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("characters")
public class Character {
    @Autowired
    private DateUtil dateUtil;

    @GetMapping
    public List<CharacterModel> listAll() {
        String formatLocalDateTime = dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now());

        System.out.println(formatLocalDateTime);

        return Arrays.asList(new CharacterModel(
                1,
                "Viúva Negra",
                "Armas de fogo",
                26,
                formatLocalDateTime
        ));
    }
}
