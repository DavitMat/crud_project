package am.dav_mat.crud_project.service;

import am.dav_mat.crud_project.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User findById(int id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(int id);
}
