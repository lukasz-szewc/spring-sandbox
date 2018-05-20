package org.luksze;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PersonResource {

    @GetMapping
    public List<Person> get() {
        return Arrays.asList(new Person("John", "Smith"), new Person("George", "Newman"));
    }

}
