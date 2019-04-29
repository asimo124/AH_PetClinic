package info.alexhawley.petclinic.services;

import info.alexhawley.petclinic.model.Owner;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
