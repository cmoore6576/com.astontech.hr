package com.astontech.hr.services;

import com.astontech.hr.domain.ElementType;


/**
 * Created by CodyMoor1 on 11/1/2017.
 */
public interface ElementTypeService {


        Iterable<ElementType> listAllElementTypes();

        ElementType getElementTypeById(Integer id);

        ElementType saveElementType(ElementType elementType);

        Iterable<ElementType> saveElementTypeList (Iterable<ElementType> elementTypeIterable);

        void deleteElementType(Integer id);

    ElementType findByElementTypeName (String elementTypeName);
}
