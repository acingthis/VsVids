package CucumberTests;

import apiComponentsSakilaFilms.SakilaFilmsApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SakilaFilmsApplication.class)
public class CucumberRun {

}
