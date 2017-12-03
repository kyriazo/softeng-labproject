package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SearchPatient {

	protected Shell shlMedica;
	private Text surnameSearch;
	private Text amkaSearch;
	private Table birthdayColumn;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void Anoikse() {
		try {
			SearchPatient window = new SearchPatient();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlMedica.open();
		shlMedica.layout();
		while (!shlMedica.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMedica = new Shell();
		shlMedica.setSize(836, 596);
		shlMedica.setText("Medica");
		
		Label lblMedica = new Label(shlMedica, SWT.NONE);
		lblMedica.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		lblMedica.setBounds(10, 10, 410, 40);
		lblMedica.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica - \u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setBounds(10, 74, 55, 15);
		label.setText("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF:");
		
		Label label_1 = new Label(shlMedica, SWT.NONE);
		label_1.setBounds(10, 98, 55, 15);
		label_1.setText("\u0391.\u039C.\u039A.\u0391.:");
		
		surnameSearch = new Text(shlMedica, SWT.BORDER);
		surnameSearch.setBounds(70, 71, 135, 18);
		
		amkaSearch = new Text(shlMedica, SWT.BORDER);
		amkaSearch.setBounds(71, 95, 112, 18);
		
		Button btnSearch = new Button(shlMedica, SWT.NONE);
		btnSearch.setBounds(10, 137, 93, 20);
		btnSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		
		CTabFolder tabFolder = new CTabFolder(shlMedica, SWT.BORDER);
		tabFolder.setBounds(15, 210, 795, 317);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03B9\u03B1 \u0391\u03C3\u03B8\u03B5\u03BD\u03B7");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		
		birthdayColumn = new Table(composite, SWT.FULL_SELECTION);
		birthdayColumn.setBounds(0, 0, 789, 285);
		birthdayColumn.setHeaderVisible(true);
		birthdayColumn.setLinesVisible(true);
		
		TableColumn surnameColumn = new TableColumn(birthdayColumn, SWT.NONE);
		surnameColumn.setWidth(99);
		surnameColumn.setText("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF");
		
		TableColumn nameColumn = new TableColumn(birthdayColumn, SWT.NONE);
		nameColumn.setWidth(100);
		nameColumn.setText("\u038C\u03BD\u03BF\u03BC\u03B1");
		
		TableColumn amkaColumn = new TableColumn(birthdayColumn, SWT.NONE);
		amkaColumn.setWidth(89);
		amkaColumn.setText("\u0391.\u039C.\u039A.\u0391");
		
		TableColumn tableColumn_3 = new TableColumn(birthdayColumn, SWT.NONE);
		tableColumn_3.setWidth(100);
		tableColumn_3.setText("\u0397\u03BC/\u03BD\u03AF\u03B1 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2");
		
		TableColumn historyColumn = new TableColumn(birthdayColumn, SWT.NONE);
		historyColumn.setWidth(100);
		historyColumn.setText("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
		
		TableColumn checkupColumn = new TableColumn(birthdayColumn, SWT.NONE);
		checkupColumn.setWidth(100);
		checkupColumn.setText("\u0395\u03BE\u03B5\u03C4\u03AC\u03C3\u03B5\u03B9\u03C2");
		
		CTabItem tabItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_1);
		
		CTabItem tabItem_2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("\u0395\u03BE\u03B5\u03C4\u03B1\u03C3\u03B5\u03B9\u03C2");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite_2);
		
		Button btnEdit = new Button(shlMedica, SWT.NONE);
		btnEdit.setBounds(109, 137, 96, 20);
		btnEdit.setText("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1");
		
		Button btnBack = new Button(shlMedica, SWT.NONE);
		btnBack.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
				MainScreen piso = new MainScreen();
				piso.Anoikse();				
			}
		});
		btnBack.setBounds(717, 10, 93, 25);
		btnBack.setText("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE");

	}
}
