package com.github.heliommsfilho.imperium_cash.api.resource;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CurrencyResourceTests extends AbstractTestResource {

    @Autowired
    private CurrencyResource currencyResource;

    private MockMvc okMockMvc;

    @BeforeAll
    void setup() {
        okMockMvc = getOkMvcMockInstance(currencyResource);
    }

    @Test
    public void findAllCurrencies_shouldReturnCurrencyList() throws Exception {
        okMockMvc.perform(get("/currency")).andExpect(jsonPath("$", Matchers.hasSize(3)));
    }
}
