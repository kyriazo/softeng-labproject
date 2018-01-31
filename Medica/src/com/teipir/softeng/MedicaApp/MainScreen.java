package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;



public class MainScreen {

	
	private int id;
	protected Shell shlMedica;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public int Anoikse() {
		try {
			MainScreen window = new MainScreen();
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
		shlMedica.setImage(SWTResourceManager.getImage("D:\\Desktop\\Finalworkspace\\Medica\\src\\images\\medicaLogo.jpg"));
		shlMedica.setSize(601, 501);
		shlMedica.setText("Medica");
		dbConnection db = new dbConnection();
		id = db.getId();
		
<<<<<<< HEAD
		Label lblUser = new Label(shlMedica, SWT.NONE);
		lblUser.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblUser.setBounds(10, 10, 124, 15);
		dbConnection nea = new dbConnection();
		lblUser.setText("User: " + nea.USER);
=======
		DateTime dateTime = new DateTime(shlMedica, SWT.NONE);
		dateTime.setBounds(495, 10, 80, 24);
		
		Label lblUserTade = new Label(shlMedica, SWT.NONE);
		lblUserTade.setBounds(10, 10, 55, 15);
		lblUserTade.setText("User: Tade");
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		
		Label lblMedica = new Label(shlMedica, SWT.NONE);
		lblMedica.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblMedica.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.NORMAL));
		lblMedica.setBounds(159, 10, 252, 67);
		lblMedica.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Label labelSec = new Label(shlMedica, SWT.NONE);
		labelSec.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		labelSec.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		labelSec.setBounds(169, 70, 221, 30);
		labelSec.setText("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7\u03C2");
		
		Button btnSearch = new Button(shlMedica, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				SearchPatient psaxe = new SearchPatient();
				shlMedica.close();
				psaxe.Anoikse();
			}
		});
		btnSearch.setBounds(180, 324, 194, 36);
		btnSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
<<<<<<< HEAD
		Button btnRegister = new Button(shlMedica, SWT.NONE);
		if(id != 3) {
			
			btnRegister.setVisible(false);
			
		}
		btnRegister.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AddPatient neos = new AddPatient();
				neos.Anoikse();
			}
		});
		btnRegister.setBounds(180, 381, 194, 36);
		btnRegister.setText("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B9\u03C3\u03B7 \u039D\u03AD\u03BF\u03C5 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
=======
		Button btnSearch = new Button(shlMedica, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
				SearchPatient patient = new SearchPatient();
				patient.Anoikse();
			}
		});
		btnSearch.setBounds(189, 198, 194, 54);
		btnSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		Button btnEntry = new Button(shlMedica, SWT.NONE);
		btnEntry.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AddPatient neos = new AddPatient();
				neos.Anoikse();
			}
		});
		btnEntry.setBounds(189, 280, 194, 54);
		btnEntry.setText("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B9\u03C3\u03B7 \u039D\u03AD\u03BF\u03C5 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
>>>>>>> f6e13af0f4334e6e509b1ae73a188ef621cd7d1a
		
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
		btnHelp.setBounds(10, 427, 66, 25);
		btnHelp.setText("Help");
		
		
		Button btnLogout = new Button(shlMedica, SWT.NONE);
		btnLogout.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.setVisible(false);
				LoginScreen piso = new LoginScreen();
				piso.open();
				
			}
		});
		btnLogout.setBounds(477, 427, 98, 25);
		btnLogout.setText("Logout");
		
		//Calculate date
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate = LocalDate.now();
		String date = dtf.format(localDate); //2016/11/16
		
		
		Label dateLbl = new Label(shlMedica, SWT.NONE);
		dateLbl.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		dateLbl.setBounds(461, 10, 114, 25);
		dateLbl.setText("\u0397\u03BC/\u03BD\u03AF\u03B1: "+ date);
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setImage(SWTResourceManager.getImage(MainScreen.class, "/images/medicaLogoScaled.jpg"));
		label.setBounds(179, 106, 203, 199);
		
		return 1;
	}
	
	
}
