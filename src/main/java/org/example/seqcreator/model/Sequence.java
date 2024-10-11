package org.example.seqcreator.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sequence {
/* todo
   Generate id automatically and be unique
*/
    private Long id;
    private String name;
    private List<CustomScene> customSceneList;
    private Set<Camera> cameraSet;

    public Sequence(Long id, String name) {
        this.id = id;
        this.name = name;
        this.customSceneList = new ArrayList<>();
        this.cameraSet = new HashSet<>();
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

    public List<CustomScene> getCustomSceneList() {
        return customSceneList;
    }

    public void setCustomSceneList(List<CustomScene> customSceneList) {
        this.customSceneList = customSceneList;
    }

    public Set<Camera> getCameraSet() {
        return cameraSet;
    }

    public void setCameraSet(HashSet<Camera> cameraSet) {
        this.cameraSet = cameraSet;
    }

    public boolean addCustomScene(CustomScene customScene) {
        this.customSceneList.add(customScene);
        return true;
    }

    public boolean insertCustomScene(CustomScene customScene, int num) {
        if(num < 0 || num > this.customSceneList.size()) {
            return false;
        }
        this.customSceneList.add(num, customScene);
        return true;
    }

    public boolean replaceCustomScene(CustomScene customScene, int num) {
        if(num < 0 || num > this.customSceneList.size()) {
            return false;
        }
        this.customSceneList.set(num, customScene);
        return true;
    }

    public boolean removeCustomScene(CustomScene customScene) {
        return this.customSceneList.remove(customScene);
    }

    public boolean addCamera(Camera camera) {
        return this.cameraSet.add(camera);
    }

    public boolean removeCamera(Camera camera) {
        return this.cameraSet.remove(camera);
    }

}
