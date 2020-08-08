package hadesgod.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import hadesgod.demo.model.Topic;

@Service
public class TopicService {
    
    private List<Topic> topicList = new ArrayList<>();
    
    public TopicService() {
        topicList.add(new Topic("spring", "Spring Framework", "Spring Framework description"));
        topicList.add(new Topic("java", "Core Java", "Core Java description"));
        topicList.add(new Topic("javascript", "Java Script", "Java Script description"));
    }

    public List<Topic> getAllTopics() {
        return this.topicList;
    }

    public Topic getTopic(String id) {
        return this.topicList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void postTopic(Topic topic) {
        this.topicList.add(topic);
    }

	public void updateTopic(String id, Topic topic) {
        for(int i = 0;i<topicList.size(); i++) {
            if (topicList.get(i).getId().equals(id)) {
                this.topicList.set(i, new Topic(id, topic.getName(), topic.getDescription()));
                return;
            }
        }
	}

	public void deleteTopic(String id) {
        this.topicList.removeIf(topic -> topic.getId().equals(id));
	}

    
}