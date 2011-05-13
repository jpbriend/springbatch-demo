package fr.infinit.demo.springbatch.service;

import com.excilys.utils.spring.log.slf4j.InjectLogger;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

/**
 * User: Jean-Philippe Briend
 * Date: 5/12/11
 * Time: 10:15 PM
 */
@Service
public class AnnounceService {

    @InjectLogger
    private Logger logger;

    public void announce() {
        logger.info("Announcing service !!!");
    }
}
