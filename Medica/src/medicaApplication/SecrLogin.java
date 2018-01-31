package medicaApplication;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class SecrLogin {

	protected Shell shlMedica;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void NewScreen() {
		try {
			SecrLogin window = new SecrLogin();
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
		shlMedica.setSize(700, 554);
		shlMedica.setText("Medica");
		
		Label lblUser = new Label(shlMedica, SWT.NONE);
		lblUser.setBounds(10, 32, 26, 15);
		lblUser.setText("User:");
		
		Button btnNewButton = new Button(shlMedica, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.setVisible(false);
				SecrSearch nj = new SecrSearch();
				nj.PatientSearch();
			}
		});
		btnNewButton.setBounds(227, 198, 224, 52);
		btnNewButton.setText("Î‘Î½Î±Î¶Î®Ï„Î·ÏƒÎ· Î‘ÏƒÎ¸ÎµÎ½Î®");
		
		Label lblNewLabel = new Label(shlMedica, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 26, SWT.NORMAL));
		lblNewLabel.setBounds(212, 75, 239, 43);
		lblNewLabel.setText("K\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica");
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		label.setBounds(118, 124, 414, 43);
		label.setText("Î•Ï†Î±Ï�Î¼Î¿Î³Î® Î”Î¹Î±Ï‡ÎµÎ¯Ï�Î·ÏƒÎ·Ï‚ Î‘ÏƒÎ¸ÎµÎ½ÏŽÎ½");
		
		Button btnNewButton_1 = new Button(shlMedica, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				AddPatient np = new AddPatient();
				np.NewPatient();
				shlMedica.close();
				
			}
		});
		btnNewButton_1.setBounds(227, 256, 224, 52);
		btnNewButton_1.setText("Î”Î·Î¼Î¹Î¿Ï…Ï�Î³Î¯Î± Î™Î±Ï„Ï�Î¹ÎºÎ¿Ï� Î¦Î±ÎºÎ­Î»Î¿Ï…");
		
		Button btnNewButton_3 = new Button(shlMedica, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				shlMedica.close();
				MainWindow nm = new MainWindow();
				nm.open();
				
				
			}
		});
		btnNewButton_3.setBounds(512, 430, 110, 43);
		btnNewButton_3.setText("Î‘Ï€Î¿ÏƒÏ�Î½Î´ÎµÏƒÎ·");
		
		Label label_1 = new Label(shlMedica, SWT.NONE);
		label_1.setBounds(497, 32, 76, 15);
		label_1.setText("\u0397\u03BC\u03B5\u03C1\u03BF\u03BC\u03B7\u03BD\u03B9\u03B1:");
		
		Label lblNewLabel_1 = new Label(shlMedica, SWT.NONE);
		lblNewLabel_1.setBounds(579, 32, 70, 15);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		lblNewLabel_1.setText(dateFormat.format(cal.getTime()));
		
		Label lblUser_1 = new Label(shlMedica, SWT.NONE);
		lblUser_1.setBounds(42, 32, 110, 15);
		lblUser_1.setText("USER");

	}

}
