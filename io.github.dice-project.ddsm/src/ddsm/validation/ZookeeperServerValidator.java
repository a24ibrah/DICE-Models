/**
 *
 * $Id$
 */
package ddsm.validation;


/**
 * A sample validator interface for {@link ddsm.ZookeeperServer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ZookeeperServerValidator {
    boolean validate();

    boolean validateTickTime(int value);
    boolean validateSyncLimit(int value);
    boolean validateInitLimit(int value);
}
