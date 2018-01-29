package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by CodyMoor1 on 10/24/2017.
 */
public interface ElementTypeRepository extends CrudRepository<ElementType, Integer>{

    ElementType findByElementTypeName(String elementTypeName);
}
