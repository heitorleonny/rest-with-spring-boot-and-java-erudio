package br.com.erudio.data.vo.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.github.dozermapper.core.Mapping;
import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.util.Objects;


@JsonPropertyOrder({"id", "firstName", "lastName", "address","gender"})
public class PersonVO extends RepresentationModel<PersonVO> implements Serializable {
    private static  final long serialVersionUTD = 1L;

    @JsonProperty("id")
    @Mapping("id")
    private Long key;


    private String firstName;


    private String lastName;


    private String address;


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
        return Objects.equals(key, person.key) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && Objects.equals(gender, person.gender);
    }


    public int hashCode() {
        return Objects.hash(key, firstName, lastName, address, gender);
    }

    public Long getKey() {
        return key;
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

    public void setKey(Long id) {
        this.key = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}