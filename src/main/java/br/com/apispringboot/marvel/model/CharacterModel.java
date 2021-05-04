package br.com.apispringboot.marvel.model;

import java.util.Objects;

public class CharacterModel {
    private int id;
    private String name;
    private String power;
    private int age;
    private String dateUtil;

    public CharacterModel() {
    }

    public CharacterModel(int id, String name, String power, int age, String dateUtil) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.age = age;
        this.dateUtil = dateUtil;
    }

    public CharacterModel(String name) {
        this.name = name;
    }

    public String getDateUtil() {
        return dateUtil;
    }

    public void setDateUtil(String dateUtil) {
        this.dateUtil = dateUtil;
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
