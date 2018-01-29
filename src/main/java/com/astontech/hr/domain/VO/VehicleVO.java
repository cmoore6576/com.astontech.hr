package com.astontech.hr.domain.VO;

/**
 * Created by CodyMoor1 on 11/16/2017.
 */
public class VehicleVO {

    private String newVehicle;
    private String newMake;
    private String newModel;
    private String[] newVehicleArray;
    private String[] newModelArray;
    private String[] newMakeArray;
    private int makeId;
    private int modelId;


    public VehicleVO(){}


    //region Custom Methods
    public void splitNewVehiceIntoArray(){
        //regex for spliting on a new line or carriage return is "\\r?\\n"
        this.setNewVehicleArray(this.getNewVehicle().split("\\r?\\n"));
    }

    public String getNewVehicle() {
        return newVehicle;
    }

    public void setNewVehicle(String newVehicle) {
        this.newVehicle = newVehicle;
    }

    public String getNewMake() {
        return newMake;
    }

    public void setNewMake(String newMake) {
        this.newMake = newMake;
    }

    public String getNewModel() {
        return newModel;
    }

    public void setNewModel(String newModel) {
        this.newModel = newModel;
    }

    public String[] getNewVehicleArray() {
        return newVehicleArray;
    }

    public void setNewVehicleArray(String[] newVehicleArray) {
        this.newVehicleArray = newVehicleArray;
    }

    public String[] getNewModelArray() {
        return newModelArray;
    }

    public void setNewModelArray(String[] newModelArray) {
        this.newModelArray = newModelArray;
    }

    public String[] getNewMakeArray() {
        return newMakeArray;
    }

    public void setNewMakeArray(String[] newMakeArray) {
        this.newMakeArray = newMakeArray;
    }

    public int getMakeId() {
        return makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }
}
