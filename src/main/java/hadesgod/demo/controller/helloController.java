package hadesgod.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hadesgod.demo.model.Topic;
import hadesgod.demo.services.TopicService;

@RestController
@RequestMapping("/topics")
public class helloController {
    
    @Autowired
    private TopicService topicService;

    @GetMapping
    public List<Topic> getTopics() {
        return this.topicService.getAllTopics();
    }

    @GetMapping(path = "/{id}")
    public Topic getTopic(@PathVariable(name = "id") String id) {
        return topicService.getTopic(id);
    }

    @PostMapping()
    public void postTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping(path = "/{id}")
    public void updateTopic(@PathVariable(name = "id") String id,@RequestBody Topic topic) {
        topicService.updateTopic(id,topic);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteTopic(@PathVariable(name = "id") String id) {
        topicService.deleteTopic(id);
    }

}