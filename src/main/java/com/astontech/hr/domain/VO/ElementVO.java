package com.astontech.hr.domain.VO;

/**
 * Created by CodyMoor1 on 11/3/2017.
 */
public class ElementVO {

    private String newElementType;
    private String newElements;
    private String[] newElementArray;

    public ElementVO(){}


    //region Custom Methods
    public void splitNewElementsIntoArray(){
        //regex for spliting on a new line or carriage return is "\\r?\\n"
    this.setNewElementArray(this.getNewElements().split("\\r?\\n"));
    }

    //endregion

    //region Getters/Setters

    public String getNewElementType() {
        return newElementType;
    }

    public void setNewElementType(String newElementType) {
        this.newElementType = newElementType;
    }

    public String getNewElements() {
        return newElements;
    }

    public void setNewElements(String newElements) {
        this.newElements = newElements;
    }

    public String[] getNewElementArray() {
        return newElementArray;
    }

    public void setNewElementArray(String[] newElementArray) {
        this.newElementArray = newElementArray;
    }
    //endregion
}

