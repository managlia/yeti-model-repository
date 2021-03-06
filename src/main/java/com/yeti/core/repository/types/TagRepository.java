package com.yeti.core.repository.types;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.yeti.model.general.Tag;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "Tag", path = "Tags")
public interface TagRepository extends JpaRepository<Tag, Integer> {  //Entity, Id

}
