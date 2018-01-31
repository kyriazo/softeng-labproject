package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;

import javax.swing.JOptionPane;

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
	private Text newBirthdate;
	private Text newAddress;
	private Text newTk;
	private Text newCity;
	private Text newTelephone;
	private int id;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public  int Anoikse() {
		try {
			AddPatient window = new AddPatient();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return 1;
	}

	/**
	 * Open the window.
	 */
	public int open() {
		Display display = Display.getDefault();
		createContents();
		shlMedica.open();
		shlMedica.layout();
		while (!shlMedica.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		return 1;
	}

	/**
	 * Create contents of the window.
	 */
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
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 10);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
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
		
		Button btnCancel = new Button(shlMedica, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
			}
		});
		FormData fd_btnCancel = new FormData();
		fd_btnCancel.left = new FormAttachment(100, -130);
		fd_btnCancel.bottom = new FormAttachment(100, -10);
		fd_btnCancel.right = new FormAttachment(100, -10);
		btnCancel.setLayoutData(fd_btnCancel);
		btnCancel.setText("\u0386\u03BA\u03C5\u03C1\u03C9\u03C3\u03B7");
		
		Button btnSave = new Button(shlMedica, SWT.NONE);
		btnSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
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
	}
}
