package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
<<<<<<< HEAD
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
=======
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SearchPatient {

	protected Shell shlMedica;
<<<<<<< HEAD
	private Text surname;
	private Text amka;
	private int id;
=======
	private Text surnameSearch;
	private Text amkaSearch;
	private Table birthdayColumn;
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
<<<<<<< HEAD
	public int Anoikse() {
=======
	public void Anoikse() {
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		try {
			SearchPatient window = new SearchPatient();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
<<<<<<< HEAD
	
		return 1;
=======
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
	}

	/**
	 * Open the window.
	 */
<<<<<<< HEAD
	public int open() {
=======
	public void open() {
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		Display display = Display.getDefault();
		createContents();
		shlMedica.open();
		shlMedica.layout();
		while (!shlMedica.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
<<<<<<< HEAD
		
		return 1;
=======
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
	}

	/**
	 * Create contents of the window.
	 */
<<<<<<< HEAD
	protected int createContents() {
		shlMedica = new Shell();
		shlMedica.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		shlMedica.setImage(SWTResourceManager.getImage(SearchPatient.class, "/images/medicaLogoScaled.jpg"));
		shlMedica.setSize(901, 599);
		shlMedica.setText("Medica");
		dbConnection db = new dbConnection();
		id = db.getId();
		
		Label lblMedica = new Label(shlMedica, SWT.NONE);
		lblMedica.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		lblMedica.setFont(SWTResourceManager.getFont("Segoe UI", 23, SWT.NORMAL));
		lblMedica.setBounds(10, 10, 518, 54);
		lblMedica.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica - \u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		label.setBounds(10, 97, 94, 15);
		label.setText("\u0388\u03C0\u03B9\u03B8\u03B5\u03C4\u03BF \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		Label label_1 = new Label(shlMedica, SWT.NONE);
		label_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND));
		label_1.setBounds(10, 129, 94, 15);
		label_1.setText("\u0386.\u039C.\u039A.\u0391. \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		surname = new Text(shlMedica, SWT.BORDER);
		surname.setBounds(110, 94, 146, 21);
		
		amka = new Text(shlMedica, SWT.BORDER);
		amka.setBounds(110, 126, 146, 21);
		
		CTabFolder tabFolder = new CTabFolder(shlMedica, SWT.BORDER);
		tabFolder.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		tabFolder.setBounds(10, 201, 819, 330);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2");
=======
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
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		
<<<<<<< HEAD
		Label lblName = new Label(composite, SWT.NONE);
		lblName.setBounds(10, 10, 55, 15);
		lblName.setText("\u038C\u03BD\u03BF\u03BC\u03B1:");
		
		Label lblSurname = new Label(composite, SWT.NONE);
		lblSurname.setBounds(10, 31, 55, 15);
		lblSurname.setText("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF:");
		
		Label lblAmka = new Label(composite, SWT.NONE);
		lblAmka.setBounds(10, 52, 55, 15);
		lblAmka.setText("\u0391.\u039C.\u039A.\u0391.:");
		
		Label lblCarrier = new Label(composite, SWT.NONE);
		lblCarrier.setBounds(10, 73, 127, 15);
		lblCarrier.setText("\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		
		Label lblBirthday = new Label(composite, SWT.NONE);
		lblBirthday.setBounds(10, 94, 127, 15);
		lblBirthday.setText("\u0397\u03BC/\u03BD\u03AF\u03B1 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		
		Label lblAddress = new Label(composite, SWT.NONE);
		lblAddress.setBounds(10, 115, 127, 15);
		lblAddress.setText("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7:");
		
		Label lblTk = new Label(composite, SWT.NONE);
		lblTk.setBounds(10, 136, 55, 15);
		lblTk.setText("\u03A4.\u039A.:");
		
		Label lblCity = new Label(composite, SWT.NONE);
		lblCity.setBounds(10, 157, 55, 15);
		lblCity.setText("\u03A0\u03CC\u03BB\u03B7:");
		
		Label lblPhone = new Label(composite, SWT.NONE);
		lblPhone.setBounds(10, 178, 127, 15);
		lblPhone.setText("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		
		Label carrier = new Label(composite, SWT.NONE);
		carrier.setBounds(143, 73, 109, 15);
		
		Label name = new Label(composite, SWT.NONE);
		name.setBounds(143, 10, 109, 15);
		
		Label sname = new Label(composite, SWT.NONE);
		sname.setBounds(143, 31, 109, 15);
		
		Label samka = new Label(composite, SWT.NONE);
		samka.setBounds(143, 52, 109, 15);
		
		Label birthday = new Label(composite, SWT.NONE);
		birthday.setBounds(143, 94, 109, 15);
		
		Label address = new Label(composite, SWT.NONE);
		address.setBounds(143, 115, 109, 15);
		
		Label tk = new Label(composite, SWT.NONE);
		tk.setBounds(143, 136, 109, 15);
		
		Label city = new Label(composite, SWT.NONE);
		city.setBounds(143, 157, 109, 15);
		
		Label phone = new Label(composite, SWT.NONE);
		phone.setBounds(143, 178, 109, 15);
		
		Button btnEdit = new Button(composite, SWT.NONE);
		if(id != 3) {
			
			btnEdit.setVisible(false);
			
		}
		btnEdit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnEdit.setBounds(10, 242, 172, 25);
		btnEdit.setText("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03B9\u03CE\u03BD");
		
		CTabItem tabItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
=======
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
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_1);
		
		CTabItem tabItem_2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("\u0395\u03BE\u03B5\u03C4\u03B1\u03C3\u03B5\u03B9\u03C2");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite_2);
		
<<<<<<< HEAD
		Button btnGetCheckup = new Button(composite_2, SWT.NONE);
		btnGetCheckup.setBounds(10, 21, 144, 38);
		btnGetCheckup.setText("Λήψη Εξετάσεων");
		
		Button btnSearch = new Button(shlMedica, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				tabFolder.setFocus();
				String epitheto = surname.getText();
				String amk = amka.getText();
				dbConnection psakse = new dbConnection();
				String[] info = psakse.yparxei(epitheto,amk);
				if(info != null) {
					
					name.setText(info[0]);
					sname.setText(info[1]);
					samka.setText(info[2]);
					carrier.setText(info[3]);
					birthday.setText(info[4]);
					address.setText(info[5]);
					tk.setText(info[6]);
					city.setText(info[7]);
					phone.setText(info[8]);
					
					
					
				}
				
				
			}
		});
		btnSearch.setBounds(10, 159, 106, 25);
		btnSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
		btnHelp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(id==1) {
					DoctorHelp helpForDoc = new DoctorHelp();
					helpForDoc.open();
					
				}else if(id==2) {
					NurseHelp helpForDoc = new NurseHelp();
					helpForDoc.open();
					
				}else if(id==3) {
					BureauHelp helpForDoc = new BureauHelp();
					helpForDoc.open();
				}
				
			}
		});
		btnHelp.setText("Help");
		btnHelp.setBounds(800, 41, 75, 25);
		
		Button btnReturn = new Button(shlMedica, SWT.NONE);
		btnReturn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
				MainScreen gurise = new MainScreen();
				gurise.Anoikse();
				
			}
		});
		btnReturn.setBounds(781, 10, 94, 25);
		btnReturn.setText("Επιστροφή");
		shlMedica.setDefaultButton(btnSearch);

		return 1;
=======
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

>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
	}
}
