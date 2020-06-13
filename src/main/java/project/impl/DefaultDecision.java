package project.impl;

import project.*;


import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultDecision <br>
 * @version generated on Thu May 28 13:55:50 CEST 2020 by kamsz
 */
public class DefaultDecision extends WrappedIndividualImpl implements Decision {

    public DefaultDecision(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_action
     */
     
    public Collection<? extends Action> getHas_action() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_ACTION,
                                               DefaultAction.class);
    }

    public boolean hasHas_action() {
	   return !getHas_action().isEmpty();
    }

    public void addHas_action(Action newHas_action) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_ACTION,
                                       newHas_action);
    }

    public void removeHas_action(Action oldHas_action) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_ACTION,
                                          oldHas_action);
    }


    /* ***************************************************
     * Object Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_consequence
     */
     
    public Collection<? extends Consequence> getHas_consequence() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HAS_CONSEQUENCE,
                                               DefaultConsequence.class);
    }

    public boolean hasHas_consequence() {
	   return !getHas_consequence().isEmpty();
    }

    public void addHas_consequence(Consequence newHas_consequence) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HAS_CONSEQUENCE,
                                       newHas_consequence);
    }

    public void removeHas_consequence(Consequence oldHas_consequence) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HAS_CONSEQUENCE,
                                          oldHas_consequence);
    }


    /* ***************************************************
     * Data Property http://webprotege.stanford.edu/project/BDGSqwMbfBgw7pUJ8IOnJ1#has_certainty
     */
     
    public Collection<? extends Object> getHas_certainty() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_CERTAINTY, Object.class);
    }

    public boolean hasHas_certainty() {
		return !getHas_certainty().isEmpty();
    }

    public void addHas_certainty(Object newHas_certainty) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_CERTAINTY, newHas_certainty);
    }

    public void removeHas_certainty(Object oldHas_certainty) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HAS_CERTAINTY, oldHas_certainty);
    }


}