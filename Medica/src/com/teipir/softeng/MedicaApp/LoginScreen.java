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
	private Text usern;
	private Text pwd;
	private String EnteredUsername;
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
		shlMedica.setSize(600, 401);
		shlMedica.setText("Medica");
		shlMedica.setLayout(null);
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.NORMAL));
		lblNewLabel.setBounds(147, 40, 250, 51);
		lblNewLabel.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Button btnLogin = new Button(shlMedica, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

//				
				EnteredUsername = usern.getText(); 
				String pass= pwd.getText();
				//String EnteredPassword = new String(pass);
				//System.out.println(EnteredPassword);
				
				
				
				dbConnection db = new dbConnection();
				boolean Flag = db.SignIn(pass,EnteredUsername);
				if (Flag) {
					shlMedica.setVisible(false);
					MainScreen ebros = new MainScreen();
					ebros.Anoikse();
										
				}else {
					System.err.println("Wrong credentials!");
				}
				
				
			}
		});
		btnLogin.setBounds(256, 246, 89, 28);
		btnLogin.setText("Login");
		
		Button btnExit = new Button(shlMedica, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setBounds(476, 327, 98, 25);
		btnExit.setText("Exit");
		
		Label lblNewLabel_1 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblNewLabel_1.setBounds(157, 97, 217, 28);
		lblNewLabel_1.setText("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7\u03C2");
		
		usern = new Text(shlMedica, SWT.BORDER);
		usern.setBounds(241, 156, 104, 21);
		
		Label lblNewLabel_2 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_2.setBounds(180, 162, 55, 15);
		lblNewLabel_2.setText("Username:");
		
		Label lblNewLabel_3 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_3.setBounds(180, 194, 55, 15);
		lblNewLabel_3.setText("Password:");
		
		pwd = new Text(shlMedica, SWT.BORDER | SWT.PASSWORD);
		pwd.setBounds(241, 191, 104, 21);
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
		btnHelp.setBounds(10, 327, 67, 25);
		btnHelp.setText("Help");
		return 1;
	}
	



	
}
