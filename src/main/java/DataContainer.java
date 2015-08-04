import springConstructors.UserData;

public class DataContainer {

    private static UserData userData;

    public static UserData getUserData() {
        return userData;
    }

    public static void setUserData(UserData userData) {
        DataContainer.userData = userData;
    }
}
