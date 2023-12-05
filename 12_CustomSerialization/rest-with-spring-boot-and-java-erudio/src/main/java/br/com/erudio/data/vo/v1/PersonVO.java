package br.com.erudio.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@JsonPropertyOrder({"id", "address", "first_name", "last_name", "gender"})
public class PersonVO implements Serializable {
    private static  final long serialVersionUTD = 1L;


    private Long id;


    @JsonProperty("first_name")
    private String firstName;


    @JsonProperty("last_name")
    private String lastName;


    private String address;


    @JsonIgnore
    private String gender;

    public PersonVO() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVO person = (PersonVO) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && Objects.equals(gender, person.gender);
    }


    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, gender);
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}