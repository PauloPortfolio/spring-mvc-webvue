
package ca.webvue.service;

import ca.webvue.entity.VueUser;
import java.util.List;

public interface VueServiceInt {

    VueUser addUser(VueUser user);

    List<VueUser> getAllUsers();

    void removeUser(Integer id);

    VueUser updateUser(VueUser user);

}