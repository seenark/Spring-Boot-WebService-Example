package hadesgod.demo.repository;

import org.springframework.data.repository.CrudRepository;

import hadesgod.demo.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {
    
}