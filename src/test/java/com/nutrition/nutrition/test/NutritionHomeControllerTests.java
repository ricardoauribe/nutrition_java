package com.nutrition.nutrition.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class NutritionHomeControllerTests extends NutritionApplicationTests {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void testHome() throws Exception {

    ResponseEntity<String> response = restTemplate.getForEntity(
        new URL("http://localhost:" + port + "/").toString(), String.class);
    assertEquals("Hello Controller", response.getBody());

  }


  @Test
  public void testPatient() throws Exception {
    mockMvc.perform(get("/patient")).andExpect(status().isOk())
      .andExpect(content().contentType("application/json"))
      .andExpect(jsonPath("$.name").value("Ricardo"))
      .andExpect(jsonPath("$.weight").value("70"))
      .andExpect(jsonPath("$.age").value("myAge"));

  }
  
}
