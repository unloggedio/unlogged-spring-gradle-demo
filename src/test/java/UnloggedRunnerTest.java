import io.unlogged.runner.UnloggedTestRunner;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

@RunWith(UnloggedTestRunner.class)
@ComponentScan("org.unlogged.demo")
@EnableAutoConfiguration
@TestPropertySource({"classpath:application.properties"})
// @WebAppConfiguration
public class UnloggedRunnerTest {

    public static class YamlPropertySourceFactory implements PropertySourceFactory {
        public YamlPropertySourceFactory() {
        }

        @Override
        public PropertiesPropertySource createPropertySource(String name, EncodedResource encodedResource) throws IOException {
            YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
            factory.setResources(encodedResource.getResource());
            return new PropertiesPropertySource(encodedResource.getResource().getFilename(), factory.getObject());
        }
    }
}