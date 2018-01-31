package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
<<<<<<< HEAD
import org.eclipse.swt.widgets.MessageBox;

import javax.swing.JOptionPane;

=======
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddPatient {

	protected Shell shlMedica;
	private Text newName;
	private Text newSurname;
	private Text newAmka;
	private Text newCarrier;
<<<<<<< HEAD
	private Text newBirthdate;
	private Text newAddress;
	private Text newTk;
	private Text newCity;
	private Text newTelephone;
	private int id;
=======
	private Text newBirthday;
	private Text newAddress;
	private Text newCity;
	private Text newTk;
	private Text newPhone;
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
<<<<<<< HEAD
	public  int Anoikse() {
=======
	public void Anoikse() {
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		try {
			AddPatient window = new AddPatient();
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
		shlMedica.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shlMedica.setImage(SWTResourceManager.getImage(AddPatient.class, "/images/medicaLogoScaled.jpg"));
		shlMedica.setSize(601, 598);
		shlMedica.setText("Medica");
		shlMedica.setLayout(new FormLayout());
		dbConnection db = new dbConnection();
		id = db.getId();
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
=======
	protected void createContents() {
		shlMedica = new Shell();
		shlMedica.setSize(548, 551);
		shlMedica.setText("Medica");
		shlMedica.setLayout(new FormLayout());
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 10);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
<<<<<<< HEAD
		lblNewLabel.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica - \u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B9\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03B7");
		
		Label lblName = new Label(shlMedica, SWT.NONE);
		lblName.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblName.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblName = new FormData();
		fd_lblName.top = new FormAttachment(lblNewLabel, 134);
		fd_lblName.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblName.setLayoutData(fd_lblName);
		lblName.setText("\u038C\u03BD\u03BF\u03BC\u03B1:");
		
		Label lblSurname = new Label(shlMedica, SWT.NONE);
		lblSurname.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblSurname.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblSurname = new FormData();
		fd_lblSurname.top = new FormAttachment(lblName, 6);
		fd_lblSurname.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblSurname.setLayoutData(fd_lblSurname);
		lblSurname.setText("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		
		Label lblAmka = new Label(shlMedica, SWT.NONE);
		lblAmka.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblAmka.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblAmka = new FormData();
		fd_lblAmka.top = new FormAttachment(lblSurname, 6);
		fd_lblAmka.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblAmka.setLayoutData(fd_lblAmka);
		lblAmka.setText("\u0391.\u039C.\u039A.\u0391.:");
		
		Label lblCarrier = new Label(shlMedica, SWT.NONE);
		lblCarrier.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblCarrier.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblCarrier = new FormData();
		fd_lblCarrier.top = new FormAttachment(lblAmka, 6);
		fd_lblCarrier.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblCarrier.setLayoutData(fd_lblCarrier);
		lblCarrier.setText("\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		
		Label lblBirthday = new Label(shlMedica, SWT.NONE);
		lblBirthday.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblBirthday.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblBirthday = new FormData();
		fd_lblBirthday.top = new FormAttachment(lblCarrier, 6);
		fd_lblBirthday.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblBirthday.setLayoutData(fd_lblBirthday);
		lblBirthday.setText("\u0397\u03BC/\u03BD\u03AF\u03B1 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		
		Label lblAddress = new Label(shlMedica, SWT.NONE);
		lblAddress.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblAddress.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblAddress = new FormData();
		fd_lblAddress.top = new FormAttachment(lblBirthday, 6);
		fd_lblAddress.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblAddress.setLayoutData(fd_lblAddress);
		lblAddress.setText("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7:");
		
		Label lblTk = new Label(shlMedica, SWT.NONE);
		lblTk.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblTk.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblTk = new FormData();
		fd_lblTk.top = new FormAttachment(lblAddress, 6);
		fd_lblTk.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblTk.setLayoutData(fd_lblTk);
		lblTk.setText("\u03A4.\u039A.:");
		
		Label lblCity = new Label(shlMedica, SWT.NONE);
		lblCity.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblCity.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblCity = new FormData();
		fd_lblCity.top = new FormAttachment(lblTk, 6);
		fd_lblCity.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblCity.setLayoutData(fd_lblCity);
		lblCity.setText("\u03A0\u03CC\u03BB\u03B7:");
		
		Label lblPhone = new Label(shlMedica, SWT.NONE);
		lblPhone.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblPhone.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		FormData fd_lblPhone = new FormData();
		fd_lblPhone.top = new FormAttachment(lblCity, 6);
		fd_lblPhone.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		lblPhone.setLayoutData(fd_lblPhone);
		lblPhone.setText("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		FormData fd_label = new FormData();
		fd_label.bottom = new FormAttachment(lblName, -44);
		fd_label.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		label.setLayoutData(fd_label);
		label.setText("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B5 \u03C4\u03B1 \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03C4\u03BF\u03C5 \u03BD\u03AD\u03BF\u03C5 \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		newName = new Text(shlMedica, SWT.BORDER);
		FormData fd_newName = new FormData();
		fd_newName.bottom = new FormAttachment(lblName, 0, SWT.BOTTOM);
		fd_newName.left = new FormAttachment(lblName, 126);
		newName.setLayoutData(fd_newName);
		
		newSurname = new Text(shlMedica, SWT.BORDER);
		fd_newName.right = new FormAttachment(newSurname, 0, SWT.RIGHT);
		FormData fd_newSurname = new FormData();
		fd_newSurname.right = new FormAttachment(100, -239);
		fd_newSurname.left = new FormAttachment(lblSurname, 109);
		fd_newSurname.bottom = new FormAttachment(lblSurname, 0, SWT.BOTTOM);
		newSurname.setLayoutData(fd_newSurname);
		
		newAmka = new Text(shlMedica, SWT.BORDER);
		FormData fd_newAmka = new FormData();
		fd_newAmka.right = new FormAttachment(100, -239);
		fd_newAmka.left = new FormAttachment(lblAmka, 120);
		fd_newAmka.top = new FormAttachment(lblAmka, 0, SWT.TOP);
		newAmka.setLayoutData(fd_newAmka);
		
		newCarrier = new Text(shlMedica, SWT.BORDER);
		FormData fd_newCarrier = new FormData();
		fd_newCarrier.right = new FormAttachment(100, -239);
		fd_newCarrier.left = new FormAttachment(lblCarrier, 20);
		fd_newCarrier.top = new FormAttachment(lblCarrier, 0, SWT.TOP);
		newCarrier.setLayoutData(fd_newCarrier);
		
		newBirthdate = new Text(shlMedica, SWT.BORDER);
		FormData fd_newBirthdate = new FormData();
		fd_newBirthdate.right = new FormAttachment(100, -239);
		fd_newBirthdate.left = new FormAttachment(lblBirthday, 58);
		fd_newBirthdate.bottom = new FormAttachment(lblBirthday, 0, SWT.BOTTOM);
		newBirthdate.setLayoutData(fd_newBirthdate);
		
		newAddress = new Text(shlMedica, SWT.BORDER);
		FormData fd_newAddress = new FormData();
		fd_newAddress.right = new FormAttachment(100, -239);
		fd_newAddress.left = new FormAttachment(lblAddress, 101);
		fd_newAddress.top = new FormAttachment(lblAddress, 0, SWT.TOP);
		newAddress.setLayoutData(fd_newAddress);
		
		newTk = new Text(shlMedica, SWT.BORDER);
		FormData fd_newTk = new FormData();
		fd_newTk.right = new FormAttachment(100, -239);
		fd_newTk.left = new FormAttachment(lblTk, 152);
		fd_newTk.top = new FormAttachment(lblTk, 0, SWT.TOP);
		newTk.setLayoutData(fd_newTk);
		
		newCity = new Text(shlMedica, SWT.BORDER);
		FormData fd_newCity = new FormData();
		fd_newCity.right = new FormAttachment(100, -239);
		fd_newCity.left = new FormAttachment(lblCity, 138);
		fd_newCity.bottom = new FormAttachment(lblCity, 0, SWT.BOTTOM);
		newCity.setLayoutData(fd_newCity);
		
		newTelephone = new Text(shlMedica, SWT.BORDER);
		FormData fd_newTelephone = new FormData();
		fd_newTelephone.right = new FormAttachment(100, -239);
		fd_newTelephone.left = new FormAttachment(lblPhone, 102);
		fd_newTelephone.top = new FormAttachment(lblPhone, 0, SWT.TOP);
		newTelephone.setLayoutData(fd_newTelephone);
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
		btnHelp.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				
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
		FormData fd_btnHelp = new FormData();
		fd_btnHelp.bottom = new FormAttachment(100, -10);
		fd_btnHelp.left = new FormAttachment(lblNewLabel, 0, SWT.LEFT);
		btnHelp.setLayoutData(fd_btnHelp);
		btnHelp.setText("Help");
=======
		lblNewLabel.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica - \u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B9\u03C3\u03B7 \u03BD\u03AD\u03BF\u03C5 \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		newName = new Text(shlMedica, SWT.BORDER);
		FormData fd_newName = new FormData();
		fd_newName.top = new FormAttachment(lblNewLabel, 100);
		fd_newName.right = new FormAttachment(100, -238);
		newName.setLayoutData(fd_newName);
		
		Label lblNewLabel_1 = new Label(shlMedica, SWT.NONE);
		fd_newName.left = new FormAttachment(lblNewLabel_1, 17);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.top = new FormAttachment(lblNewLabel, 103);
		fd_lblNewLabel_1.left = new FormAttachment(0, 34);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		lblNewLabel_1.setText("\u038C\u03BD\u03BF\u03BC\u03B1:");
		
		newSurname = new Text(shlMedica, SWT.BORDER);
		FormData fd_newSurname = new FormData();
		fd_newSurname.top = new FormAttachment(newName, 6);
		fd_newSurname.right = new FormAttachment(100, -238);
		newSurname.setLayoutData(fd_newSurname);
		
		Label lblNewLabel_2 = new Label(shlMedica, SWT.NONE);
		fd_lblNewLabel_1.right = new FormAttachment(lblNewLabel_2, 0, SWT.RIGHT);
		fd_newSurname.left = new FormAttachment(lblNewLabel_2, 17);
		FormData fd_lblNewLabel_2 = new FormData();
		fd_lblNewLabel_2.top = new FormAttachment(lblNewLabel_1, 12);
		fd_lblNewLabel_2.left = new FormAttachment(0, 34);
		lblNewLabel_2.setLayoutData(fd_lblNewLabel_2);
		lblNewLabel_2.setText("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		
		newAmka = new Text(shlMedica, SWT.BORDER);
		FormData fd_newAmka = new FormData();
		fd_newAmka.right = new FormAttachment(100, -238);
		fd_newAmka.top = new FormAttachment(newSurname, 6);
		newAmka.setLayoutData(fd_newAmka);
		
		Label lblNewLabel_3 = new Label(shlMedica, SWT.NONE);
		fd_lblNewLabel_2.right = new FormAttachment(lblNewLabel_3, 0, SWT.RIGHT);
		fd_newAmka.left = new FormAttachment(lblNewLabel_3, 17);
		FormData fd_lblNewLabel_3 = new FormData();
		fd_lblNewLabel_3.right = new FormAttachment(100, -374);
		fd_lblNewLabel_3.left = new FormAttachment(0, 34);
		fd_lblNewLabel_3.top = new FormAttachment(lblNewLabel_2, 12);
		lblNewLabel_3.setLayoutData(fd_lblNewLabel_3);
		lblNewLabel_3.setText("\u0391.\u039C.\u039A.\u0391.:");
		
		newCarrier = new Text(shlMedica, SWT.BORDER);
		FormData fd_newCarrier = new FormData();
		fd_newCarrier.right = new FormAttachment(100, -238);
		fd_newCarrier.top = new FormAttachment(newAmka, 6);
		newCarrier.setLayoutData(fd_newCarrier);
		
		newBirthday = new Text(shlMedica, SWT.BORDER);
		FormData fd_newBirthday = new FormData();
		fd_newBirthday.right = new FormAttachment(100, -238);
		newBirthday.setLayoutData(fd_newBirthday);
		
		newAddress = new Text(shlMedica, SWT.BORDER);
		fd_newBirthday.bottom = new FormAttachment(100, -241);
		FormData fd_newAddress = new FormData();
		fd_newAddress.right = new FormAttachment(100, -238);
		fd_newAddress.top = new FormAttachment(newBirthday, 6);
		newAddress.setLayoutData(fd_newAddress);
		
		newCity = new Text(shlMedica, SWT.BORDER);
		FormData fd_newCity = new FormData();
		fd_newCity.right = new FormAttachment(100, -238);
		fd_newCity.top = new FormAttachment(newAddress, 6);
		newCity.setLayoutData(fd_newCity);
		
		newTk = new Text(shlMedica, SWT.BORDER);
		FormData fd_newTk = new FormData();
		fd_newTk.top = new FormAttachment(newCity, 6);
		fd_newTk.right = new FormAttachment(100, -238);
		newTk.setLayoutData(fd_newTk);
		
		Label lblNewLabel_4 = new Label(shlMedica, SWT.NONE);
		fd_newCarrier.left = new FormAttachment(0, 175);
		FormData fd_lblNewLabel_4 = new FormData();
		fd_lblNewLabel_4.top = new FormAttachment(lblNewLabel_3, 12);
		fd_lblNewLabel_4.right = new FormAttachment(newCarrier, -6);
		fd_lblNewLabel_4.left = new FormAttachment(0, 34);
		lblNewLabel_4.setLayoutData(fd_lblNewLabel_4);
		lblNewLabel_4.setText("\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		
		Label lblNewLabel_5 = new Label(shlMedica, SWT.NONE);
		fd_newBirthday.left = new FormAttachment(lblNewLabel_5, 17);
		FormData fd_lblNewLabel_5 = new FormData();
		fd_lblNewLabel_5.right = new FormAttachment(lblNewLabel_1, 0, SWT.RIGHT);
		fd_lblNewLabel_5.left = new FormAttachment(0, 34);
		fd_lblNewLabel_5.top = new FormAttachment(lblNewLabel_4, 12);
		lblNewLabel_5.setLayoutData(fd_lblNewLabel_5);
		lblNewLabel_5.setText("\u0397\u03BC/\u03BD\u03AF\u03B1 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		
		Label lblNewLabel_6 = new Label(shlMedica, SWT.NONE);
		fd_newAddress.left = new FormAttachment(lblNewLabel_6, 17);
		FormData fd_lblNewLabel_6 = new FormData();
		fd_lblNewLabel_6.right = new FormAttachment(lblNewLabel_1, 0, SWT.RIGHT);
		fd_lblNewLabel_6.top = new FormAttachment(lblNewLabel_5, 12);
		fd_lblNewLabel_6.left = new FormAttachment(0, 34);
		lblNewLabel_6.setLayoutData(fd_lblNewLabel_6);
		lblNewLabel_6.setText("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7:");
		
		Label lblNewLabel_7 = new Label(shlMedica, SWT.NONE);
		fd_newCity.left = new FormAttachment(lblNewLabel_7, 17);
		FormData fd_lblNewLabel_7 = new FormData();
		fd_lblNewLabel_7.right = new FormAttachment(lblNewLabel_1, 0, SWT.RIGHT);
		fd_lblNewLabel_7.top = new FormAttachment(lblNewLabel_6, 12);
		fd_lblNewLabel_7.left = new FormAttachment(0, 34);
		lblNewLabel_7.setLayoutData(fd_lblNewLabel_7);
		lblNewLabel_7.setText("\u03A0\u03CC\u03BB\u03B7:");
		
		Label lblNewLabel_8 = new Label(shlMedica, SWT.NONE);
		fd_newTk.left = new FormAttachment(lblNewLabel_8, 17);
		FormData fd_lblNewLabel_8 = new FormData();
		fd_lblNewLabel_8.right = new FormAttachment(lblNewLabel_1, 0, SWT.RIGHT);
		fd_lblNewLabel_8.top = new FormAttachment(lblNewLabel_7, 12);
		fd_lblNewLabel_8.left = new FormAttachment(0, 34);
		lblNewLabel_8.setLayoutData(fd_lblNewLabel_8);
		lblNewLabel_8.setText("\u03A4.\u039A.:");
		
		newPhone = new Text(shlMedica, SWT.BORDER);
		FormData fd_newPhone = new FormData();
		fd_newPhone.right = new FormAttachment(100, -238);
		fd_newPhone.top = new FormAttachment(newTk, 6);
		newPhone.setLayoutData(fd_newPhone);
		
		Label lblNewLabel_9 = new Label(shlMedica, SWT.NONE);
		fd_newPhone.left = new FormAttachment(lblNewLabel_9, 17);
		FormData fd_lblNewLabel_9 = new FormData();
		fd_lblNewLabel_9.right = new FormAttachment(lblNewLabel_1, 0, SWT.RIGHT);
		fd_lblNewLabel_9.top = new FormAttachment(lblNewLabel_8, 12);
		fd_lblNewLabel_9.left = new FormAttachment(0, 33);
		lblNewLabel_9.setLayoutData(fd_lblNewLabel_9);
		lblNewLabel_9.setText("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		
		Label label = new Label(shlMedica, SWT.NONE);
		FormData fd_label = new FormData();
		fd_label.right = new FormAttachment(0, 233);
		fd_label.top = new FormAttachment(lblNewLabel, 37);
		fd_label.left = new FormAttachment(0, 10);
		label.setLayoutData(fd_label);
		label.setText("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B5 \u03C4\u03B1 \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u03C4\u03BF\u03C5 \u03BD\u03AD\u03BF\u03C5 \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		
		Button btnCancel = new Button(shlMedica, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
			}
		});
		FormData fd_btnCancel = new FormData();
<<<<<<< HEAD
		fd_btnCancel.left = new FormAttachment(100, -130);
		fd_btnCancel.bottom = new FormAttachment(100, -10);
		fd_btnCancel.right = new FormAttachment(100, -10);
		btnCancel.setLayoutData(fd_btnCancel);
		btnCancel.setText("\u0386\u03BA\u03C5\u03C1\u03C9\u03C3\u03B7");
=======
		fd_btnCancel.left = new FormAttachment(100, -117);
		fd_btnCancel.bottom = new FormAttachment(100, -10);
		fd_btnCancel.right = new FormAttachment(100, -10);
		btnCancel.setLayoutData(fd_btnCancel);
		btnCancel.setText("\u0386\u03BA\u03C5\u03C1\u03BF");
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
		FormData fd_btnHelp = new FormData();
		fd_btnHelp.right = new FormAttachment(0, 60);
		fd_btnHelp.bottom = new FormAttachment(100, -10);
		fd_btnHelp.left = new FormAttachment(0, 10);
		btnHelp.setLayoutData(fd_btnHelp);
		btnHelp.setText("Help");
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		
		Button btnSave = new Button(shlMedica, SWT.NONE);
		btnSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
<<<<<<< HEAD
				
				String nName = newName.getText();
				String nSurname = newSurname.getText();
				String nAMKA = newAmka.getText();
				String nCarrier = newCarrier.getText();
				String nBirthdate = newBirthdate.getText();
				String nAddress = newAddress.getText();
				String nTK = newTk.getText();
				String nCity = newCity.getText();
				String nPhone = newTelephone.getText();
				
				
				
				if(!nName.isEmpty() && !nSurname.isEmpty() && !nAMKA.isEmpty() && !nCarrier.isEmpty() && !nBirthdate.isEmpty() && !nAddress.isEmpty() && !nTK.isEmpty() && !nCity.isEmpty() && !nPhone.isEmpty()) {
				dbConnection db = new dbConnection();
				db.addPatient(nName, nSurname, nAMKA, nCarrier, nBirthdate, nAddress, nTK, nCity, nPhone);
				shlMedica.close();
				JOptionPane.showMessageDialog(null, "Επιτυχής Καταχώριση");
				}else {
					
					MessageBox dialog =
						    new MessageBox(shlMedica, SWT.ICON_ERROR | SWT.OK);
						dialog.setText("Σφάλμα");
						dialog.setMessage("Παρακαλώ συμπληρώστε όλα τα πεδία.");
						dialog.open();
				}
			}
		});
		FormData fd_btnSave = new FormData();
		fd_btnSave.top = new FormAttachment(newTelephone, 27);
		fd_btnSave.right = new FormAttachment(100, -239);
		fd_btnSave.left = new FormAttachment(100, -345);
		btnSave.setLayoutData(fd_btnSave);
		btnSave.setText("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");

		return 1;
=======
				shlMedica.close();
			}
		});
		FormData fd_btnSave = new FormData();
		fd_btnSave.top = new FormAttachment(lblNewLabel_9, 36);
		fd_btnSave.left = new FormAttachment(lblNewLabel_1, 0, SWT.LEFT);
		btnSave.setLayoutData(fd_btnSave);
		btnSave.setText("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");

>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
	}
}
