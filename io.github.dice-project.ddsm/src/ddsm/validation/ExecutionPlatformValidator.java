/**
 *
 * $Id$
 */
package ddsm.validation;

import ddsm.Component;

/**
 * A sample validator interface for {@link ddsm.ExecutionPlatform}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ExecutionPlatformValidator {
    boolean validate();

    boolean validateOwner(Component value);
    boolean validateExecutionPlatformId(String value);
}
