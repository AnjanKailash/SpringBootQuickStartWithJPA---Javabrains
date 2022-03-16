package io.javabrains.springbootstarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	private String description;
	private String name;
	@ManyToOne
	private Topic topic;
	
	
	public Course() {
		super();
	}
	public Course(String id,  String name, String description, String topicId) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.topic = new Topic(topicId, "", "");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Topic [id=");
		builder.append(id);
		builder.append(", description=");
		builder.append(description);
		builder.append(", name=");
		builder.append(name);
		builder.append(", getId()=");
		builder.append(getId());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getName()=");
		builder.append(getName());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
}
