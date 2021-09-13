package _case_study.service;

import _case_study.model.Facility;

public interface FacilityService extends FuramaService<Facility> {
    void displayListMaintenance(String path);
    void addVilla(String path);
    void addHouse(String path);
    void addRoom(String path);
}
