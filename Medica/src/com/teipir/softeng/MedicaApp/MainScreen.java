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

	protected Shell shlMedica;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void Anoikse() {
		try {
			MainScreen window = new MainScreen();
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
		shlMedica.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shlMedica.setImage(SWTResourceManager.getImage("D:\\Desktop\\Finalworkspace\\Medica\\src\\images\\medicaLogo.jpg"));
		shlMedica.setSize(601, 501);
		shlMedica.setText("Medica");
		
		Label lblUser = new Label(shlMedica, SWT.NONE);
		lblUser.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblUser.setBounds(10, 10, 124, 15);
		dbConnection nea = new dbConnection();
		lblUser.setText("User: " + nea.USER);
		
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
		btnSearch.setBounds(180, 324, 194, 36);
		btnSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		Button btnRegister = new Button(shlMedica, SWT.NONE);
		btnRegister.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AddPatient neos = new AddPatient();
				neos.Anoikse();
			}
		});
		btnRegister.setBounds(180, 381, 194, 36);
		btnRegister.setText("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B9\u03C3\u03B7 \u039D\u03AD\u03BF\u03C5 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
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
		label.setImage(SWTResourceManager.getImage("D:\\Desktop\\Finalworkspace\\Medica\\src\\images\\medicaLogoScaled.jpg"));
		label.setBounds(179, 106, 203, 199);
		
	}
}
