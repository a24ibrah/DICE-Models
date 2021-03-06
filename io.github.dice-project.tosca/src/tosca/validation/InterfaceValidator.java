/**
 *
 * $Id$
 */
package tosca.validation;

import org.eclipse.emf.common.util.EList;

import tosca.Operation;
import tosca.Property;

/**
 * A sample validator interface for {@link tosca.Interface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceValidator {
    boolean validate();

    boolean validateInterface_name(String value);
    boolean validateOperations(EList<Operation> value);
    boolean validateInputs(EList<Property> value);
    boolean validateType(String value);
}
