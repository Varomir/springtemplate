import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import springConstructors.UserData;

@ContextConfiguration(locations={"/spring-config.xml"})
public class AbstractTestRunner extends AbstractTestNGSpringContextTests {

    @Autowired
    @Qualifier("userData")
    private UserData userData;

    @BeforeClass(alwaysRun = true)
    protected void setUp() throws Exception{
        DataContainer.setUserData(userData);
    }
}
