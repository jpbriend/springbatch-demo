package fr.infinit.demo.springbatch.batch;

import fr.infinit.demo.springbatch.model.User;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * User: Jean-Philippe Briend
 * Date: 5/12/11
 * Time: 11:02 PM
 */
public class UserFieldMapper implements FieldSetMapper {
    
    @Override
    public User mapFieldSet(FieldSet fieldSet) throws BindException {
        User user = new User();

        user.setId(fieldSet.readInt(0));
        user.setFirstName(fieldSet.readString(1));
        user.setLastName(fieldSet.readString(2));
        user.setBirthday(fieldSet.readDate(3));

        return user;
    }
}
