package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by CodyMoor1 on 10/24/2017.
 */
public interface ElementRepository extends CrudRepository <Element, Integer> {

    //will auto generate the requireed code from the structer of the method name
    Element findByElementName (String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);
}
