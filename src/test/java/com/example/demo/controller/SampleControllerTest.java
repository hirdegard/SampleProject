package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class SampleControllerTest {

	@Autowired
	private MockMvc mock;
	
	@Test
	void test() throws Exception {
		
		mock.perform(get("/"))
		.andExpect(status().isOk())
		.andExpect(view().name("sampleView"));
		
	}

}
