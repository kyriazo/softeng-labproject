package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;




public class LoginScreen {

	protected Shell shlMedica;
	private Text usern;
	private Text pwd;
	private int id;
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
		shlMedica.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		shlMedica.setImage(SWTResourceManager.getImage(LoginScreen.class, "/images/medicaLogoScaled.jpg"));
		shlMedica.setSize(600, 483);
		shlMedica.setText("Medica");
		shlMedica.setLayout(null);
		dbConnection db = new dbConnection();
		id = db.getId();
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.NORMAL));
		lblNewLabel.setBounds(157, 10, 250, 51);
		lblNewLabel.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Button btnLogin = new Button(shlMedica, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

//				
				String EnteredUsername = usern.getText(); 
				//System.out.println(EnteredUsername);
				
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
					MessageBox dialog =
						    new MessageBox(shlMedica, SWT.ICON_ERROR | SWT.OK);
						dialog.setText("Error");
						dialog.setMessage("Wrong Username/Password. Please try again.");

						// open dialog and await user selection
						dialog.open();
						pwd.setText("");
						usern.setText("");
					System.err.println("Wrong credentials!");
				}
				
			}
		});
		btnLogin.setBounds(238, 383, 89, 28);
		btnLogin.setText("Login");
		
		Button btnExit = new Button(shlMedica, SWT.NONE);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(1);
			}
		});
		btnExit.setBounds(476, 409, 98, 25);
		btnExit.setText("Exit");
		
		Label lblNewLabel_1 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblNewLabel_1.setBounds(167, 67, 217, 28);
		lblNewLabel_1.setText("\u0395\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE \u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7\u03C2");
		
		usern = new Text(shlMedica, SWT.BORDER);
		usern.setBounds(249, 310, 104, 21);
		
		Label lblNewLabel_2 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_2.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblNewLabel_2.setBounds(188, 316, 55, 15);
		lblNewLabel_2.setText("Username:");
		
		Label lblNewLabel_3 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_3.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_BACKGROUND_GRADIENT));
		lblNewLabel_3.setBounds(188, 348, 55, 15);
		lblNewLabel_3.setText("Password:");
		
		pwd = new Text(shlMedica, SWT.BORDER | SWT.PASSWORD);
		pwd.setBounds(249, 345, 104, 21);
		
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
		btnHelp.setBounds(10, 409, 67, 25);
		btnHelp.setText("Help");
		
		shlMedica.setDefaultButton(btnLogin);
		
		
		
		Label lblImage = new Label(shlMedica, SWT.NONE);
		lblImage.setImage(SWTResourceManager.getImage(LoginScreen.class, "/images/medicaLogoScaled.jpg"));
		lblImage.setBounds(177, 101, 203, 203);
		usern.setFocus();
		
		return 1;
	}
}
