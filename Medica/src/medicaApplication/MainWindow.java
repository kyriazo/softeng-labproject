package medicaApplication;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

public class MainWindow {

	protected Shell shlMedicaLogin;
	private Text un;
	private Text pwd;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
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
		shlMedicaLogin.open();
		shlMedicaLogin.layout();
		while (!shlMedicaLogin.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlMedicaLogin = new Shell();
		shlMedicaLogin.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
		shlMedicaLogin.setSize(450, 419);
		shlMedicaLogin.setText("Medica Login");
		
		CLabel lblNewLabel = new CLabel(shlMedicaLogin, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("D:\\Desktop\\qTAc.jpg"));
		lblNewLabel.setBounds(167, 120, 93, 101);
		lblNewLabel.setText("");
		
		CLabel lblUsername = new CLabel(shlMedicaLogin, SWT.NONE);
		lblUsername.setBounds(90, 243, 61, 21);
		lblUsername.setText("Username");
		
		CLabel lblPassword = new CLabel(shlMedicaLogin, SWT.NONE);
		lblPassword.setBounds(90, 270, 61, 21);
		lblPassword.setText("Password");
		
		un = new Text(shlMedicaLogin, SWT.BORDER);
		un.setBounds(167, 243, 112, 21);
		
		pwd = new Text(shlMedicaLogin, SWT.BORDER | SWT.PASSWORD);
		pwd.setBounds(167, 270, 112, 21);
		
		Button btnLogin = new Button(shlMedicaLogin, SWT.NONE);
		btnLogin.addSelectionListener(new SelectionAdapter() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedicaLogin.setVisible(false);
				SecrLogin nw = new SecrLogin();
				nw.NewScreen();
				
				
				
			}
		});
		btnLogin.setBounds(185, 312, 75, 25);
		btnLogin.setText("Login");
		
		Label lblNewLabel_1 = new Label(shlMedicaLogin, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblNewLabel_1.setBounds(72, 78, 302, 36);
		lblNewLabel_1.setText("\u039A\u03B1\u03BB\u03C9\u03C2 \u03AE\u03C1\u03B8\u03B1\u03C4\u03B5 \u03C3\u03C4\u03B7\u03BD \u03B5\u03C6\u03B1\u03C1\u03BC\u03BF\u03B3\u03AE");
		
		Label lblNewLabel_2 = new Label(shlMedicaLogin, SWT.NONE);
		lblNewLabel_2.setFont(SWTResourceManager.getFont("Segoe UI", 24, SWT.NORMAL));
		lblNewLabel_2.setBounds(109, 21, 218, 51);
		lblNewLabel_2.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Button button = new Button(shlMedicaLogin, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(1);
			}
		});
		button.setBounds(349, 345, 75, 25);
		button.setText("\u0388\u03BE\u03BF\u03B4\u03BF\u03C2");

	}
}
