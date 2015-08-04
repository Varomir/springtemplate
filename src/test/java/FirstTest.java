import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import springConstructors.UserData;

public class FirstTest extends AbstractTestRunner {

    private UserData userData;

    @BeforeClass
    public void prepareUserData(){
        userData = DataContainer.getUserData();
    }

    @Test
    public void method1(){

        System.out.println("1");
        System.out.println(userData.getFirstName());
        System.out.println(userData.getUsername());
    }

    @Test
    public void method2(){

        System.out.println("2");
        System.out.println(userData.getGender());
    }

    @Test
    public void method3(){

        System.out.println("3");
        System.out.println("Address" + userData.getTitle());
        System.out.println("City " + userData.getGender());
    }
}
