/**
 *  Copyright (c) 2020 Arthur Daussy.
 * 
 *  This program and the accompanying materials are made 
 *  available under the terms of the Eclipse Public License 2.0 
 *  which is available at https://www.eclipse.org/legal/epl-2.0/ 
 *  Contributors:
 *  Arthur Daussy - initial API and implementation.
 * 
 */
package fr.adaussy.permadeler.model.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;

import fr.adaussy.permadeler.model.Permadeler.NamedElement;
import fr.adaussy.permadeler.model.Permadeler.PlantNamedElement;

public class TextHelper {

	private static final String UNNAMED = "Unnamed"; //$NON-NLS-1$

	/**
	 * Builds a label of a {@link PlantNamedElement}
	 * 
	 * @param o
	 *            a name element (not <code>null</code>)
	 * @return a name
	 */
	public static String getLabel(PlantNamedElement o) {
		String name = o.getName() != null ? o.getName() : UNNAMED;
		String latinName = o.getLatinName() != null ? ("<" + o.getLatinName() + ">") : ""; //$NON-NLS-1$//$NON-NLS-2$//$NON-NLS-3$
		return name + " " + latinName; //$NON-NLS-1$

	}

	/**
	 * Gets the label of an EObject by delegating to the EMF Factory
	 * 
	 * @param rootAdapterFactory
	 *            a root adapter factor
	 * @param o
	 *            the label to edit
	 * @return the label
	 */
	public static String getEditLabel(AdapterFactory rootAdapterFactory, EObject o) {
		IItemLabelProvider adapt = (IItemLabelProvider)rootAdapterFactory.adapt(o, IItemLabelProvider.class);
		return adapt.getText(o);
	}

	/**
	 * Builds a label of a {@link NamedElement}
	 * 
	 * @param o
	 *            a name element (not <code>null</code>)
	 * @return a name
	 */
	public static String getLabel(NamedElement o) {
		String name = o.getName() != null ? o.getName() : UNNAMED;
		return name;

	}

}
