package edu.tcu.cs.hogwartsartifactonline.service;

import edu.tcu.cs.hogwartsartifactonline.dao.ArtifactDao;
import edu.tcu.cs.hogwartsartifactonline.domain.Artifact;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ArtifactServiceTest {

    @Mock
    ArtifactDao artifactDao;
    @InjectMocks
    ArtifactService service;

    List<Artifact> list;

    @BeforeEach
    void setUp() {
        Artifact a1 = new Artifact();
        a1.setId("1250808601736515584");
        a1.setName("Deluminator");
        a1.setDescription("A Deluminator is a device invented by Albus Dumbledore that resembles a cigarette lighter. It is used to remove or absorb (as well as return) the light from any light source to provide cover to the user.");
        a1.setImageUrl("imageUrl");

        Artifact a2 = new Artifact();
        a2.setId("1250808601744904193");
        a2.setName("Invisibility Cloak");
        a2.setDescription("An invisibility cloak is used to make the wearer invisible.");
        a2.setImageUrl("imageUrl");
        list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
        when(artifactDao.findAll()).thenReturn(list);
        assertEquals(2, service.findAll().size());
    }

    @Test
    void findById() {
        when(artifactDao.findById("1250808601736515584")).thenReturn(java.util.Optional.ofNullable(list.get(0)));
        when(artifactDao.findById("1250808601744904193")).thenReturn(java.util.Optional.ofNullable(list.get(1)));
        assertEquals("1250808601744904193",service.findById("1250808601744904193").getId());
        assertEquals("1250808601736515584",service.findById("1250808601736515584").getId());
    }

    @Test
    void save() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}