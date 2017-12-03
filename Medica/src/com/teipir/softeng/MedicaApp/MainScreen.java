package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.DateTime;
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
		shlMedica.setSize(601, 501);
		shlMedica.setText("Medica");
		
		DateTime dateTime = new DateTime(shlMedica, SWT.NONE);
		dateTime.setBounds(495, 10, 80, 24);
		
		Label lblUserTade = new Label(shlMedica, SWT.NONE);
		lblUserTade.setBounds(10, 10, 55, 15);
		lblUserTade.setText("User: Tade");
		
		Label lblMedica = new Label(shlMedica, SWT.NONE);
		lblMedica.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.NORMAL));
		lblMedica.setBounds(158, 29, 252, 67);
		lblMedica.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		label.setBounds(175, 107, 221, 30);
		label.setText("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7\u03C2");
		
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

	}
}
