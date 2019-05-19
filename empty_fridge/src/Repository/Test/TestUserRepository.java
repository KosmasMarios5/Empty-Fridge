/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository.Test;

import empty_fridge.Entities.User;
import Repository.IEntityRepository;
import Repository.Test.TestEntityRepositoryBase;
import empty_fridge.Entities.Recipe;
import empty_fridge.Entities.Role;
import java.util.ArrayList;

public class TestUserRepository extends TestEntityRepositoryBase<User>{

    public TestUserRepository(){
        this.entities.add(new User(0,"Kwstas","labraki@ceid.upatras.gr",Role.Admin));
        this.entities.add(new User(1,"Alexandros","kretsimos@ceid.upatras.gr",Role.Authenticated));
        this.entities.add(new User(2,"Marios","kosma@ceid.upatras.gr",Role.Authenticated));
        this.entities.add(new User(3,"Petros","petros@ceid.upatras.gr",Role.Authenticated));
    }

}
