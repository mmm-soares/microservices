package guru.springframework.msscbreweryclient.web.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import guru.springframework.msscbreweryclient.web.model.BeerDto;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BreweryClientTest {

    @Autowired
    BreweryClient client;

    @Test
    void getbeerbyId() {

        BeerDto dto = client.getbeerbyId(UUID.randomUUID());

        assertNotNull(dto);

    }
}