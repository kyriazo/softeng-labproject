package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class LoginScreen {

	protected Shell shlMedica;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			LoginScreen window = new LoginScreen();
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
		shlMedica.setSize(600, 401);
		shlMedica.setText("Medica");
		shlMedica.setLayout(null);
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.NORMAL));
		lblNewLabel.setBounds(147, 40, 250, 51);
		lblNewLabel.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Button btnNewButton = new Button(shlMedica, SWT.NONE);
		btnNewButton.setBounds(256, 246, 89, 28);
		btnNewButton.setText("Login");
		
		Button btnNewButton_1 = new Button(shlMedica, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(1);
			}
		});
		btnNewButton_1.setBounds(476, 327, 98, 25);
		btnNewButton_1.setText("Exit");
		
		Label lblNewLabel_1 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblNewLabel_1.setBounds(157, 97, 217, 28);
		lblNewLabel_1.setText("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7\u03C2");
		
		text = new Text(shlMedica, SWT.BORDER);
		text.setBounds(241, 156, 104, 21);
		
		Label lblNewLabel_2 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_2.setBounds(180, 162, 55, 15);
		lblNewLabel_2.setText("Username:");
		
		Label lblNewLabel_3 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_3.setBounds(180, 194, 55, 15);
		lblNewLabel_3.setText("Password:");
		
		text_1 = new Text(shlMedica, SWT.BORDER | SWT.PASSWORD);
		text_1.setBounds(241, 191, 104, 21);
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
		btnHelp.setBounds(10, 327, 67, 25);
		btnHelp.setText("Help");

	}
}
