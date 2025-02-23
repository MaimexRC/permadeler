/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramElementEditPart;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.ContextualMenuFiller;
import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;

/**
 * Object in charge of filling a contextual menu depending on a selection
 * 
 * @author Arthur Daussy
 */
public class MenuFiller implements IMenuListener {

	private Supplier<ISelection> selectionProvider;

	public MenuFiller(Supplier<ISelection> selectionProvider) {
		this.selectionProvider = selectionProvider;
	}

	/**
	 * Extracts from the given selection all {@link EObject} that belong to the permadeller MM
	 * 
	 * @param selection
	 *            a selection
	 * @return list of {@link EObject}
	 */
	public static List<EObject> getPermadellerSelection(IStructuredSelection selection) {
		if (selection == null) {
			return Collections.emptyList();
		}
		List<EObject> objects = new ArrayList<EObject>();
		for (Object o : selection.toArray()) {
			if (o instanceof EObject) {
				EObject eObject = (EObject)o;
				if (isPermadelerObject(eObject)) {
					objects.add(eObject);
				}
			} else if (o instanceof IDiagramElementEditPart) {
				((IDiagramElementEditPart)o).resolveAllSemanticElements().stream()
						.filter(e -> isPermadelerObject(e)).forEach(e -> {
							objects.add(e);
						});
			}
		}
		return objects;
	}

	public static boolean isPermadelerObject(EObject o) {
		return o.eClass().getEPackage().getNsURI().equals(PermadelerPackage.eINSTANCE.getNsURI());
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		ISelection selection = selectionProvider.get();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structureSelection = (IStructuredSelection)selection;

			List<EObject> permSelection = getPermadellerSelection(structureSelection);
			if (!permSelection.isEmpty()) {
				EObject first = permSelection.get(0);
				Session session = SessionManager.INSTANCE.getSession(first);
				ContextualMenuFiller filler = new ContextualMenuFiller(session);
				for (EClass eClass : EMFUtils.getCommonEClasses(permSelection)) {
					filler.fill(eClass, permSelection);
				}

				addSubMenu(filler.getNewElementActions(), RcpMessages.MenuFiller_0, manager);
				List<IAction> navigateAction = filler.getNavigateAction();
				navigateAction.add(new FocusOnElementAction(RcpMessages.MenuFiller_1, permSelection, null));

				addSubMenu(navigateAction, RcpMessages.MenuFiller_2, manager);
				addSubMenu(filler.getTimeViewActions(), RcpMessages.MenuFiller_3, manager);

				for (IAction a : filler.getOthers()) {
					manager.add(a);
				}

			}
		}

	}

	/**
	 * Adds a sub menu with a list of actions
	 * 
	 * @param actions
	 *            the actions to add
	 * @param name
	 *            the name of the menu
	 * @param menuManager
	 *            the parent menu manager
	 */
	private void addSubMenu(List<IAction> actions, String name, IMenuManager menuManager) {
		if (!actions.isEmpty()) {
			menuManager.add(buildSubMenu(name, new IMenuListener() {

				@Override
				public void menuAboutToShow(IMenuManager manager) {
					for (IAction action : actions) {
						manager.add(action);
					}

				}
			}));
		}
	}

	/**
	 * Builds a sub menu with the given name
	 * 
	 * @param name
	 *            the name of the menue
	 * @param filler
	 *            the menu to fill
	 * @return a {@link IMenuManager}
	 */
	private IMenuManager buildSubMenu(String name, IMenuListener filler) {
		IMenuManager newChildMenuManager = new MenuManager(name);
		newChildMenuManager.add(new Action("never shown entry") { //$NON-NLS-1$
		}); // needed if it's a submenu
		newChildMenuManager.setRemoveAllWhenShown(true);
		newChildMenuManager.addMenuListener(filler);
		return newChildMenuManager;
	}

}
