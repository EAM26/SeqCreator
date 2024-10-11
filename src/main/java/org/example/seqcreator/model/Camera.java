package org.example.seqcreator.model;

import java.util.ArrayList;
import java.util.List;

public class Camera {
/* todo
   Generate id automatically and be unique
*/
    private Long id;
    private String name;
    private List<String> ptzList;

    public Camera(Long id, String name) {
        this.id = id;
        this.name = name;
        this.ptzList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPtzList() {
        return ptzList;
    }

    public void setPtzList(List<String> ptzList) {
        this.ptzList = ptzList;
    }

    public boolean addPtz(String ptz) {
        if (this.ptzList.contains(ptz)) {
            return false;
        }
        ptzList.add(ptz);
        return true;
    }

    public boolean removePtz(String ptz) {
        return this.ptzList.remove(ptz);
    }

}
