package name.alexkosarev.sandbox.services;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class PersonServiceBase {

    @Before
    public void setUp() {
        RestAssuredMockMvc.standaloneSetup(new PersonService());
    }
}
