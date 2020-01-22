package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {

    int insertPerson(UUID id, Person person);
    // ID가 주어졌을 경우

    // ID가 주어지지 않았을 땐, 랜덤숫자 넣어줌
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }
}