package org.example.seqcreator.model;

public class CustomScene {

/*  todo
    Generate id automatically and be unique
    Number is the order in Sequence and the index of list, unique!
    Numbers dont need to follow up, but can skip for later insertion

 */
    private Long id;
    private String name;
    private Camera camera;

    public CustomScene(Long id, String name, Camera camera) {
        this.id = id;
        this.name = name;
        this.camera = camera;
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

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
