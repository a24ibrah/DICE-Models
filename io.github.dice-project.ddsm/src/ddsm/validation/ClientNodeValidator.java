/**
 *
 * $Id$
 */
package ddsm.validation;

import ddsm.Crontab;
import ddsm.JobSubmission;

/**
 * A sample validator interface for {@link ddsm.ClientNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ClientNodeValidator {
    boolean validate();

    boolean validateSubmits(JobSubmission value);
    boolean validateSkipRunningJob(boolean value);
    boolean validateNumberOfSubmissions(int value);
    boolean validateHasSchedule(Crontab value);
}
