package org.launchcode.Songs4Soldiers.data;

import org.launchcode.Songs4Soldiers.models.Veteran;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Veteran, Integer>{
}
