package org.example.seqcreator.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class CameraTest {

    private Camera camera;

    @BeforeEach
    void setUp() {
        camera = new Camera(1L, "Camera1");
    }

    @Test
    void testAddPtz_Success() {
        // Act
        boolean result = camera.addPtz("PTZ1");

        // Assert
        assertTrue(result, "addPtz should return true when adding a new PTZ");
        assertEquals(1, camera.getPtzList().size(), "PTZ list size should be 1 after adding");
        assertTrue(camera.getPtzList().contains("PTZ1"), "PTZ list should contain 'PTZ1'");
    }

    @Test
    void testAddPtz_AlreadyExists() {
        // Arrange
        camera.addPtz("PTZ1");

        // Act
        boolean result = camera.addPtz("PTZ1");

        // Assert
        assertFalse(result, "addPtz should return false when PTZ already exists");
        assertEquals(1, camera.getPtzList().size(), "PTZ list size should remain 1");
    }

    @Test
    void testRemovePtz_isNumber_Success() {
        // Arrange
        camera.addPtz("1");
        camera.addPtz("2");
        camera.addPtz("3");

        // Act
        boolean result = camera.removePtz("1");
        // Assert
        assertTrue(result, "addPtz should return true when PTZ is value of index 0");
        assertEquals("2", camera.getPtzList().getFirst(), "PTZ first value should be 2 now");
    }
    @Test
    void testRemovePtz_isNumber_Fail() {
        // Arrange
        camera.addPtz("1");
        camera.addPtz("2");
        camera.addPtz("3");

        // Act
        boolean result = camera.removePtz("0");

        // Assert
        assertFalse(result, "addPtz should return false when PTZ is non existing name");
        assertEquals(3, camera.getPtzList().size(), "PTZ list size should remain 3");
    }

}