/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Luis-R
 */
public class Chofer {

    String name;
    String lastName;
    String id;
    Uber uber;

    public Chofer(String name, String lastName, String id, Uber uber) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.uber = uber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Uber getUber() {
        return uber;
    }

    public void setUber(Uber uber) {
        this.uber = uber;
    }

}
