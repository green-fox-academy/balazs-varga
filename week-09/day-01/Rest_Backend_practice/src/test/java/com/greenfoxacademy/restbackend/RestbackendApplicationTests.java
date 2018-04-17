package com.greenfoxacademy.restbackend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RestbackendApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void isDoubling10() throws Exception {
    mockMvc
            .perform((get("/doubling/?input=5")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received").value(5))
            .andExpect(jsonPath("$.result").value(10));

  }

  @Test
  public void isDoublingError() throws Exception {
    mockMvc
            .perform((get("/doubling/?input=")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an input!"));

  }
}
