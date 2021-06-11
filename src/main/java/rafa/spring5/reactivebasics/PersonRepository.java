package rafa.spring5.reactivebasics;

import rafa.spring5.reactivebasics.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonRepository {
    Mono<Person> getById(Integer id);

    Flux<Person> findAll();
}
