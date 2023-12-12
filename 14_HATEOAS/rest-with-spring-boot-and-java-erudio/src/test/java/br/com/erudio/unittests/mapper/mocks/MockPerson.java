package br.com.erudio.unittests.mapper.mocks;

import java.util.ArrayList;
import java.util.List;

import br.com.erudio.model.Person;

public class MockPerson {


    public Person mockEntity() {
        return mockEntity(0);
    }

    public br.com.erudio.data.vo.v1.PersonVO mockVO() {
        return mockVO(0);
    }

    public List<Person> mockEntityList() {
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockEntity(i));
        }
        return persons;
    }

    public List<br.com.erudio.data.vo.v1.PersonVO> mockVOList() {
        List<br.com.erudio.data.vo.v1.PersonVO> persons = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            persons.add(mockVO(i));
        }
        return persons;
    }

    public Person mockEntity(Integer number) {
        Person person = new Person();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setId(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }

    public br.com.erudio.data.vo.v1.PersonVO mockVO(Integer number) {
        br.com.erudio.data.vo.v1.PersonVO person = new br.com.erudio.data.vo.v1.PersonVO();
        person.setAddress("Addres Test" + number);
        person.setFirstName("First Name Test" + number);
        person.setGender(((number % 2)==0) ? "Male" : "Female");
        person.setKey(number.longValue());
        person.setLastName("Last Name Test" + number);
        return person;
    }

}