package fr.infinit.demo.springbatch.batch;

import com.excilys.ebi.utils.spring.log.slf4j.InjectLogger;
import org.slf4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.io.File;

/**
 * User: Jean-Philippe Briend
 * Date: 5/15/11
 * Time: 3:47 PM
 */
public class CleanTasklet implements Tasklet {

    @InjectLogger
    private Logger logger;

    @Override
    public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
        File output = new File("output.txt");
        if (output.exists()) {
            logger.info("Deleting output file ...");
            output.delete();
        }
        return RepeatStatus.FINISHED;
    }
}
