package ca.webvue.resource;

import ca.webvue.entity.VueUser;
import ca.webvue.service.VueServiceInt;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
@CrossOrigin(origins = {"*"})
public class VueResource {

    @Autowired
    private VueServiceInt service;

    @GetMapping("/vueusers")
    public List<VueUser> getAll()
    {
        return service.getAllUsers();
    }

    @PostMapping("/vueusers")
    public VueUser addUser(@RequestBody VueUser user)
    {
        return service.addUser(user);
    }

    @PutMapping("/vueusers")
    public VueUser updateUser(@RequestBody VueUser user)
    {
        return service.updateUser(user);
    }

    @DeleteMapping("/vueusers/{id}")
    public void removeUser(@PathVariable("id") Integer id)
    {
        service.removeUser(id);
    }

}
