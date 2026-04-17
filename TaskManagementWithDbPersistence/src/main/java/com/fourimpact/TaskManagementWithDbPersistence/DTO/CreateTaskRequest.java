package com.fourimpact.TaskManagementWithDbPersistence.DTO;

import com.fourimpact.TaskManagementWithDbPersistence.Enums.TaskPriority;
import com.fourimpact.TaskManagementWithDbPersistence.Enums.TaskStatus;

import java.util.List;

public class CreateTaskRequest {

    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;

    private Long user_id;
    private Long category_id;
    private List<Long> tag_ids;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public List<Long> getTag_ids() {
        return tag_ids;
    }

    public void setTag_ids(List<Long> tag_ids) {
        this.tag_ids = tag_ids;
    }
}
