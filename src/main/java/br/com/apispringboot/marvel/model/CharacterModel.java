package br.com.apispringboot.marvel.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CharacterModel {
    private int id;
    private String name;
    private String power;
    private int age;

    public static List<CharacterModel> characterModels;

    static {
        charactersRepository();
    }

    public CharacterModel() {
    }

    public CharacterModel(int id, String name, String power, int age) {
        this(name);
        this.id = id;
        this.power = power;
        this.age = age;
    }

    public CharacterModel(String name) {
        this.name = name;
    }

    private static void charactersRepository() {
        characterModels = new ArrayList<CharacterModel>(Arrays.asList(new CharacterModel(
                1,
                "Viúva Negra",
                "Armas de fogo",
                26
        )));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CharacterModel)) return false;
        CharacterModel that = (CharacterModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
