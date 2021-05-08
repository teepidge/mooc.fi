/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taylor Pigeon
 */
public class Film {

    private String filmName;
    private int ageRating;

    public Film(String name, int ageRating) {
        this.filmName = name;
        this.ageRating = ageRating;

    }

    public String name() {
        return this.filmName;
    }

    public int ageRating() {
        return this.ageRating;
    }
}
