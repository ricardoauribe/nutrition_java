package com.nutrition.nutrition.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class NutritionHomeControllerTests extends NutritionApplicationTests {

  @LocalServerPort
  private int port;

  @Autowired
  private TestRestTemplate restTemplate;

  @Test
  public void testPatient() throws Exception {

    ResponseEntity<String> response = restTemplate.getForEntity(
        new URL("http://localhost:" + port + "/").toString(), String.class);
    assertEquals("Hello Controller", response.getBody());

  }

/*
  @Test
  public void testPatient2() throws Exception {
    mockMvc.perform(get("/patient")).andExpect(status().isOk())
      .andExpect(content().contentType("application/json;charset=UTF-8"))
      .andExpect(jsonPath("$.name").value("Ricardo"))
      .andExpect(jsonPath("$.weight").value("70"))
      .andExpect(jsonPath("$.age").value("myAge"));

  }
  */
}
