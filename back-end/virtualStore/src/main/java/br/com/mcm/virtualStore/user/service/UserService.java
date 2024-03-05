package br.com.mcm.virtualStore.user.service;

import br.com.mcm.virtualStore.user.dto.UserRequest;
import br.com.mcm.virtualStore.user.dto.UserResponse;
import br.com.mcm.virtualStore.user.entity.User;
import br.com.mcm.virtualStore.user.mapper.UserMapper;
import br.com.mcm.virtualStore.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(final UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserResponse createUser (final UserRequest userRequest){
        var user = User.newUser(userRequest.user(),userRequest.password(), 1L);
        return UserMapper.mapper(userRepository.save(user));
    }
    public void delete(){
    }
    public void update(){}
    public UserResponse getById(final Long id ){
        return UserMapper.mapper(userRepository.findById(id).get());
    }
    public List<UserResponse> getAll(){
        return null;
    }

    public boolean alreadyExists(final Long id){
        return userRepository.existsById(id);
    }
}
