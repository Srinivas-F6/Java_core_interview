public class Login {
    public void login(){
        
        User user = new User.UserBuilder()
                            .setName("Srinivas")
                            .setAge(84)
                            .setEmail("glsrinivas1111@gmail.com")
                            .setPassword("srinvas")
                            .build();

        System.out.println("login successfully");

        System.out.println("user Details -- > "+user.getEmail()+" "+user.getPassword());
    }
}
