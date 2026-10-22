

public class Register {

    public void registeration() {
        User user = new User.UserBuilder()
                            .setEmail("glsrinivas1111@gmail.com")
                            .build();
        System.out.println("registerd Succesfully");
        System.out.println(user.getName());
    }
}
