package medicaApplication;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class AddPatient {

	protected Shell shell;
	private Text text_4;
	private Text text_5;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void NewPatient() {
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
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(528, 498);
		shell.setText("SWT Application");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		lblNewLabel.setBounds(10, 10, 326, 46);
		lblNewLabel.setText("\u039A\u03B1\u03C4\u03B1\u03C7\u03C9\u03C1\u03B9\u03C3\u03B7 \u03BD\u03B5\u03BF\u03C5 \u03B1\u03C3\u03B8\u03B5\u03BD\u03B7");
		
		Label label = new Label(shell, SWT.NONE);
		label.setBounds(10, 108, 122, 15);
		label.setText("\u038C\u03BD\u03BF\u03BC\u03B1:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setBounds(10, 129, 122, 15);
		lblNewLabel_1.setText("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(10, 150, 122, 15);
		lblNewLabel_2.setText("'\u0395\u03C4\u03BF\u03C2 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		
		Label lblNewLabel_3 = new Label(shell, SWT.NONE);
		lblNewLabel_3.setBounds(10, 171, 122, 15);
		lblNewLabel_3.setText("\u0391.\u039C.\u039A.\u0391.:");
		
		Label lblNewLabel_4 = new Label(shell, SWT.NONE);
		lblNewLabel_4.setBounds(10, 192, 122, 15);
		lblNewLabel_4.setText("\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		
		Label lblNewLabel_5 = new Label(shell, SWT.NONE);
		lblNewLabel_5.setText("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		lblNewLabel_5.setBounds(10, 213, 122, 15);
		
		Label lblNewLabel_6 = new Label(shell, SWT.NONE);
		lblNewLabel_6.setBounds(10, 234, 122, 15);
		lblNewLabel_6.setText("\u039F\u03B4\u03CC\u03C2:");
		
		Label lblNewLabel_7 = new Label(shell, SWT.NONE);
		lblNewLabel_7.setBounds(10, 256, 122, 15);
		lblNewLabel_7.setText("\u03A0\u03CC\u03BB\u03B7:");
		
		Label lblNewLabel_8 = new Label(shell, SWT.NONE);
		lblNewLabel_8.setBounds(10, 277, 122, 15);
		lblNewLabel_8.setText("\u03A4.\u039A.:");
		
		Label lblEmail = new Label(shell, SWT.NONE);
		lblEmail.setBounds(10, 298, 122, 15);
		lblEmail.setText("Email:");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.setVisible(false);
			}
		});
		btnNewButton.setBounds(10, 380, 140, 31);
		btnNewButton.setText("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				shell.setVisible(false);
				
			}
		});
		btnNewButton_1.setBounds(156, 380, 140, 31);
		btnNewButton_1.setText("\u0391\u03BA\u03CD\u03C1\u03C9\u03C3\u03B7");
		
		text_4 = new Text(shell, SWT.NONE);
		text_4.setBounds(138, 147, 140, 18);
		
		text_5 = new Text(shell, SWT.NONE);
		text_5.setBounds(138, 168, 140, 18);
		
		text = new Text(shell, SWT.NONE);
		text.setBounds(138, 126, 140, 18);
		
		text_1 = new Text(shell, SWT.NONE);
		text_1.setBounds(138, 105, 140, 18);
		
		text_2 = new Text(shell, SWT.NONE);
		text_2.setBounds(138, 189, 140, 18);
		
		text_3 = new Text(shell, SWT.NONE);
		text_3.setBounds(138, 210, 140, 18);
		
		text_6 = new Text(shell, SWT.NONE);
		text_6.setBounds(138, 231, 140, 18);
		
		text_7 = new Text(shell, SWT.NONE);
		text_7.setBounds(138, 253, 140, 18);
		
		text_8 = new Text(shell, SWT.NONE);
		text_8.setBounds(138, 274, 140, 18);
		
		text_9 = new Text(shell, SWT.NONE);
		text_9.setBounds(138, 295, 140, 18);

	}
}
