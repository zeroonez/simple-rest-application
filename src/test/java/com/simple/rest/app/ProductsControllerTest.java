package com.simple.rest.app;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.simple.rest.products.ProductsDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testJson() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        mockMvc.perform(MockMvcRequestBuilders.post("/products").content(
                objectMapper.writeValueAsString(new ProductsDto("Prim", 25000, null,"R0lGODlhAQABAIAAAAUEBA"))
        )
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status()
                        .is(HttpStatus.CREATED.value()))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

    @Test
    public void testXml() throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        mockMvc.perform(MockMvcRequestBuilders.post("/products").content(
                xmlMapper.writeValueAsString(new ProductsDto("Prim", 25000, null,"R0lGODlhAQABAIAAAAUEBA"))
        )
                .contentType(MediaType.APPLICATION_XML)
                .accept(MediaType.APPLICATION_XML))
                .andExpect(MockMvcResultMatchers.status()
                        .is(HttpStatus.CREATED.value()))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_XML));
    }

    @Test
    public void test400() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/products").content(
                "{}"
        )
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status()
                        .is(HttpStatus.BAD_REQUEST.value()))
                .andExpect(MockMvcResultMatchers.content()
                        .contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }

}
