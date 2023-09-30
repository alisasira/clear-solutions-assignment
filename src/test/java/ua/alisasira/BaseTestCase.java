package ua.alisasira;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import ua.alisasira.controller.HttpApiProvider;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.DEFINED_PORT;

@ContextConfiguration(classes = TestAssignmentApplication.class)
@SpringBootTest(webEnvironment = DEFINED_PORT)
@ActiveProfiles(value = "test")
public abstract class BaseTestCase {

    private static String SERVER_URL = "http://localhost:8081";
    protected HttpApiProvider provider = new HttpApiProvider(SERVER_URL);
}