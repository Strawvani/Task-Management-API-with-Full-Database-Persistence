package com.fourimpact.TaskManagementWithDbPersistence.Repository;

import com.fourimpact.TaskManagementWithDbPersistence.Model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag,Long> {

}
