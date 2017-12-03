package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
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
	private Text newBirthday;
	private Text newAddress;
	private Text newCity;
	private Text newTk;
	private Text newPhone;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void Anoikse() {
		try {
			AddPatient window = new AddPatient();
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
		shlMedica.setSize(548, 551);
		shlMedica.setText("Medica");
		shlMedica.setLayout(new FormLayout());
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 18, SWT.NORMAL));
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 10);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
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
		
		Button btnCancel = new Button(shlMedica, SWT.NONE);
		btnCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
			}
		});
		FormData fd_btnCancel = new FormData();
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
		
		Button btnSave = new Button(shlMedica, SWT.NONE);
		btnSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
			}
		});
		FormData fd_btnSave = new FormData();
		fd_btnSave.top = new FormAttachment(lblNewLabel_9, 36);
		fd_btnSave.left = new FormAttachment(lblNewLabel_1, 0, SWT.LEFT);
		btnSave.setLayoutData(fd_btnSave);
		btnSave.setText("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");

	}
}
