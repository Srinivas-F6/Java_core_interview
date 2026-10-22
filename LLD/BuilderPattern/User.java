
public class User {
    private String name;
    private int age;
    private String email;
    private String password;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.password = builder.password;
    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }

    public String toString(){

        return "User : { name : " + name + "'\'" + "Age :" + age + "'\'" +"Email" + email + "'\'" +"Password"+  password  +"}";
    }


    public static class UserBuilder{
        String name;
        int age;
        String email;
        String password;

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email){
            this.email =email;
            return this;
        }

        public UserBuilder setPassword(String password){
            this.password = password;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
