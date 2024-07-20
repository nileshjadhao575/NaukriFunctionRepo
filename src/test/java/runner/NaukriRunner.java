package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		        features="F:\\new1\\DemoNaukri\\src\\main\\java\\FeatureFile\\Naukri.feature",
		        glue="stepDefination",
		        plugin={"pretty","html:target/cucumberReport.html"}
		        
		
		
		
		)








public class NaukriRunner {

}
