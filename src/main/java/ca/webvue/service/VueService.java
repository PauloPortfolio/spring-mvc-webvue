package ca.webvue.service;

import ca.webvue.entity.VueUser;
import ca.webvue.repository.VueRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VueService implements VueServiceInt {

    @Autowired
    private VueRepo repo;

    @Override
    public List<VueUser> getAllUsers()
    {
        return repo.findAll();
    }

    @Override
    public VueUser addUser(VueUser user)
    {
        return repo.save(user);

    }

    @Override
    public VueUser updateUser(VueUser user)
    {
        return repo.save(user);
    }

    @Override
    public void removeUser(Integer id)
    {
        repo.deleteById(id);
    }


}
