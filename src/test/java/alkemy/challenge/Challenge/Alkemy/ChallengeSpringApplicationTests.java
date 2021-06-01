//package alkemy.challenge.Challenge.Alkemy;
//
//import alkemy.challenge.Challenge.Alkemy.model.Users;
//import alkemy.challenge.Challenge.Alkemy.repository.IUserRepository;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//@SpringBootTest
//class ChallengeSpringApplicationTests {
//
//    @Autowired
//    private IUserRepository repository;
//
//    @Autowired
//    private BCryptPasswordEncoder encoder;
//
//    @Test
//    public void createUserTest() {
//        Users us = new Users();
//        us.setId(3);
//        us.setEmail("paola@correo.com");
//        us.setPassword(encoder.encode("1234"));
//        Users back = repository.save(us);
//        assertTrue(back.getPassword().equalsIgnoreCase(us.getPassword()));
//    }
//
//}
