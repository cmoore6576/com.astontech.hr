package com.astontech.hr.repositories;

import com.astontech.hr.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by CodyMoor1 on 12/6/2017.
 */
public interface ProjectRepository extends CrudRepository<Project, Integer> {
}
