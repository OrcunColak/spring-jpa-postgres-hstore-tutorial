package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    void findById() {
        Optional<Employee> byId = repository.findById(1L);
        assertThat(byId).isPresent();

        Map<String, String> properties = Map.of("key1", "value1", "key2", "value2");
        assertThat(byId.get().getProperties()).containsAllEntriesOf(properties);
    }

}