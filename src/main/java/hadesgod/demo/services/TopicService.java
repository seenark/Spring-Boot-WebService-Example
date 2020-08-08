package hadesgod.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hadesgod.demo.model.Topic;
import hadesgod.demo.repository.TopicRepository;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;
    
    public void addTopic(final Topic topic) {
        this.topicRepository.save(topic);
    }
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        this.topicRepository.findAll().forEach(t -> {
            topics.add(t);
        });
        return topics;
    }

    public Topic getTopic(final String id) {
        return this.topicRepository.findById(id).g;
    }

    public void deleteTopic(final String id) {
        this.topicRepository.deleteById(id);
	}

	public void updateTopic(final String id, final Topic topic) {
        this.topicRepository.save(topic);
	}



    
}