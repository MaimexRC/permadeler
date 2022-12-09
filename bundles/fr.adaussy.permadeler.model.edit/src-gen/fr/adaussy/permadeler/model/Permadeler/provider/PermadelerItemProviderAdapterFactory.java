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
package fr.adaussy.permadeler.model.Permadeler.provider;

import fr.adaussy.permadeler.model.Permadeler.util.PermadelerAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PermadelerItemProviderAdapterFactory extends PermadelerAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermadelerItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Root} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootItemProviderCustomImpl rootItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Root}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootAdapter() {
		if (rootItemProvider == null) {
			rootItemProvider = new RootItemProviderCustomImpl(this);
		}

		return rootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnowledgeBaseItemProviderCustomImpl knowledgeBaseItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.KnowledgeBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKnowledgeBaseAdapter() {
		if (knowledgeBaseItemProvider == null) {
			knowledgeBaseItemProvider = new KnowledgeBaseItemProviderCustomImpl(this);
		}

		return knowledgeBaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.SeedBank} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeedBankItemProviderCustomImpl seedBankItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.SeedBank}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeedBankAdapter() {
		if (seedBankItemProvider == null) {
			seedBankItemProvider = new SeedBankItemProviderCustomImpl(this);
		}

		return seedBankItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.SeedItem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeedItemItemProviderCustomImpl seedItemItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.SeedItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSeedItemAdapter() {
		if (seedItemItemProvider == null) {
			seedItemItemProvider = new SeedItemItemProviderCustomImpl(this);
		}

		return seedItemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Plantation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantationItemProviderCustomImpl plantationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Plantation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantationAdapter() {
		if (plantationItemProvider == null) {
			plantationItemProvider = new PlantationItemProviderCustomImpl(this);
		}

		return plantationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Reference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceItemProvider referenceItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceAdapter() {
		if (referenceItemProvider == null) {
			referenceItemProvider = new ReferenceItemProvider(this);
		}

		return referenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProviderCustomImpl imageItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProviderCustomImpl(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProviderCustomImpl eventItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProviderCustomImpl(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Zone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ZoneItemProviderCustomImpl zoneItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Zone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createZoneAdapter() {
		if (zoneItemProvider == null) {
			zoneItemProvider = new ZoneItemProviderCustomImpl(this);
		}

		return zoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Nursary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NursaryItemProvider nursaryItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Nursary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNursaryAdapter() {
		if (nursaryItemProvider == null) {
			nursaryItemProvider = new NursaryItemProvider(this);
		}

		return nursaryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Tray} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrayItemProviderCustomImpl trayItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Tray}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrayAdapter() {
		if (trayItemProvider == null) {
			trayItemProvider = new TrayItemProviderCustomImpl(this);
		}

		return trayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Row} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RowItemProviderCustomImpl rowItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Row}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRowAdapter() {
		if (rowItemProvider == null) {
			rowItemProvider = new RowItemProviderCustomImpl(this);
		}

		return rowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Cell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellItemProviderCustomImpl cellItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCellAdapter() {
		if (cellItemProvider == null) {
			cellItemProvider = new CellItemProviderCustomImpl(this);
		}

		return cellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.TrayZone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrayZoneItemProvider trayZoneItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.TrayZone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrayZoneAdapter() {
		if (trayZoneItemProvider == null) {
			trayZoneItemProvider = new TrayZoneItemProvider(this);
		}

		return trayZoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.GridBedRow} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridBedRowItemProvider gridBedRowItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.GridBedRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGridBedRowAdapter() {
		if (gridBedRowItemProvider == null) {
			gridBedRowItemProvider = new GridBedRowItemProvider(this);
		}

		return gridBedRowItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.GridBedCell} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridBedCellItemProvider gridBedCellItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.GridBedCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGridBedCellAdapter() {
		if (gridBedCellItemProvider == null) {
			gridBedCellItemProvider = new GridBedCellItemProvider(this);
		}

		return gridBedCellItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Planifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanifierItemProvider planifierItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Planifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlanifierAdapter() {
		if (planifierItemProvider == null) {
			planifierItemProvider = new PlanifierItemProvider(this);
		}

		return planifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SowPlanficationItemProviderCustomImpl sowPlanficationItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.SowPlanfication}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSowPlanficationAdapter() {
		if (sowPlanficationItemProvider == null) {
			sowPlanficationItemProvider = new SowPlanficationItemProviderCustomImpl(this);
		}

		return sowPlanficationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BackgroundImageItemProvider backgroundImageItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.BackgroundImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBackgroundImageAdapter() {
		if (backgroundImageItemProvider == null) {
			backgroundImageItemProvider = new BackgroundImageItemProvider(this);
		}

		return backgroundImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Plant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantItemProviderCustomImpl plantItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Plant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantAdapter() {
		if (plantItemProvider == null) {
			plantItemProvider = new PlantItemProviderCustomImpl(this);
		}

		return plantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Production} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionItemProvider productionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Production}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductionAdapter() {
		if (productionItemProvider == null) {
			productionItemProvider = new ProductionItemProvider(this);
		}

		return productionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantationPhaseItemProviderCustomImpl plantationPhaseItemProvider;

	/**
	 * This creates an adapter for a {@link fr.adaussy.permadeler.model.Permadeler.PlantationPhase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantationPhaseAdapter() {
		if (plantationPhaseItemProvider == null) {
			plantationPhaseItemProvider = new PlantationPhaseItemProviderCustomImpl(this);
		}

		return plantationPhaseItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (rootItemProvider != null)
			rootItemProvider.dispose();
		if (knowledgeBaseItemProvider != null)
			knowledgeBaseItemProvider.dispose();
		if (seedBankItemProvider != null)
			seedBankItemProvider.dispose();
		if (seedItemItemProvider != null)
			seedItemItemProvider.dispose();
		if (plantationItemProvider != null)
			plantationItemProvider.dispose();
		if (referenceItemProvider != null)
			referenceItemProvider.dispose();
		if (imageItemProvider != null)
			imageItemProvider.dispose();
		if (eventItemProvider != null)
			eventItemProvider.dispose();
		if (zoneItemProvider != null)
			zoneItemProvider.dispose();
		if (nursaryItemProvider != null)
			nursaryItemProvider.dispose();
		if (trayItemProvider != null)
			trayItemProvider.dispose();
		if (rowItemProvider != null)
			rowItemProvider.dispose();
		if (cellItemProvider != null)
			cellItemProvider.dispose();
		if (trayZoneItemProvider != null)
			trayZoneItemProvider.dispose();
		if (gridBedRowItemProvider != null)
			gridBedRowItemProvider.dispose();
		if (gridBedCellItemProvider != null)
			gridBedCellItemProvider.dispose();
		if (planifierItemProvider != null)
			planifierItemProvider.dispose();
		if (sowPlanficationItemProvider != null)
			sowPlanficationItemProvider.dispose();
		if (backgroundImageItemProvider != null)
			backgroundImageItemProvider.dispose();
		if (plantItemProvider != null)
			plantItemProvider.dispose();
		if (productionItemProvider != null)
			productionItemProvider.dispose();
		if (actionItemProvider != null)
			actionItemProvider.dispose();
		if (plantationPhaseItemProvider != null)
			plantationPhaseItemProvider.dispose();
	}

}
