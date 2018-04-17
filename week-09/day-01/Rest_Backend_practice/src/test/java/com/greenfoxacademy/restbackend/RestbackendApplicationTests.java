package com.greenfoxacademy.restbackend;

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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class RestbackendApplicationTests {

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
  public void isDoubling10() throws Exception {
    mockMvc
            .perform((get("/doubling").param("input", "5")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received").value(5))
            .andExpect(jsonPath("$.result").value(10));

  }

  @Test
  public void isDoublingError() throws Exception {
    mockMvc
            .perform((get("/doubling").param("input", "")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide an input!"));

  }

  @Test
  public void isGreeterPetikeStudentTest() throws Exception {
    mockMvc
            .perform((get("/greeter").param("name", "Petike").param("title", "student")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.welcome_message").value("Oh, hi there Petike, my dear student!"));
  }

  @Test
  public void isGreeterNameErrorTest() throws Exception {
    mockMvc
            .perform((get("/greeter").param("title", "student")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a name!"));
  }

  @Test
  public void isGreeterTitleErrorTest() throws Exception {
    mockMvc
            .perform((get("/greeter").param("name", "Petike")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.error").value("Please provide a title!"));
  }

  @Test
  public void isAppendAKutyaTest() throws Exception {
    mockMvc
            .perform((get("/appenda/{appendable}", "kuty")))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void isAppendAErrorTest() throws Exception {
    mockMvc
            .perform((get("/appenda")))
            .andExpect(status().is4xxClientError());
  }

  @Test
  public void isDoUntilSum15() throws Exception {
    mockMvc
            .perform(post("/dountil/{what}", "sum")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"until\": 5}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.result").value("15"));
  }
}
