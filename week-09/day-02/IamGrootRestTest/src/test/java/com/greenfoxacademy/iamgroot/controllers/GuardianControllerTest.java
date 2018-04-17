package com.greenfoxacademy.iamgroot.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GuardianControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void isGrootStatusOkTest() throws Exception {
    mockMvc
            .perform((get("/groot").param("message", "Hello")))
            .andExpect(status().isOk());

  }

  @Test
  public void isGrootMessageTest() throws Exception {
    mockMvc
            .perform((get("/groot").param("message", "Hello")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received").value("Hello"))
            .andExpect(jsonPath("$.translated").value("I am Groot!"));
  }

  @Test
  public void isGrootErrorTest() throws Exception {
    mockMvc
            .perform((get("/groot")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("I am Groot!"));
  }
}