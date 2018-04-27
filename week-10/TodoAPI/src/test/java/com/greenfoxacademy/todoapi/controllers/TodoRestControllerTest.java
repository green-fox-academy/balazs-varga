package com.greenfoxacademy.todoapi.controllers;

import com.greenfoxacademy.todoapi.TodoapiApplication;
import com.greenfoxacademy.todoapi.models.Todo;
import com.greenfoxacademy.todoapi.services.TodoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;
import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {TodoapiApplication.class})
@WebAppConfiguration
@EnableWebMvc
public class TodoRestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
					MediaType.APPLICATION_JSON.getSubtype(),
                  Charset.forName("utf8"));

  private MockMvc mockMvc;

  @MockBean
  TodoService todoService;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void getAllTodo() throws Exception {
    Todo firstTodo = new Todo("Read Clean Code", true, false);
    Todo secondTodo = new Todo("Feed the dog", false, false);

    when(todoService.findAll()).thenReturn(Arrays.asList(firstTodo, secondTodo));

    mockMvc.perform(get("/api/list")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.data[0].title").value("Read Clean Code"))
            .andExpect(jsonPath("$.data[0].isUrgent").value("true"))
            .andExpect(jsonPath("$.data[0].isDone").value("false"))
            .andExpect(jsonPath("$.data[1].title").value("Feed the dog"))
            .andExpect(jsonPath("$.data[1].isUrgent").value("false"))
            .andExpect(jsonPath("$.data[1].isDone").value("false"));
  }
}