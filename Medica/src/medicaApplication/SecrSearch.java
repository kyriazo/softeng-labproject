package medicaApplication;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
//import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.widgets.TableColumn;

public class SecrSearch {

	protected Shell shlMedica;
	private Text text;
	private Text text_1;
	private Label label_1;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void PatientSearch() {
		try {
			SecrSearch window = new SecrSearch();
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
		shlMedica.setSize(883, 711);
		shlMedica.setText("Medica - Î‘Î½Î±Î¶Î·Ï„Î®ÏƒÎµÎ¹Ï‚");
		
		CTabFolder tabFolder = new CTabFolder(shlMedica, SWT.BORDER);
		tabFolder.setBounds(10, 257, 806, 395);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tabItem_2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("Î‘Î½Î±Î¶Î·Ï„Î·ÏƒÎ·");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite);
		
		table = new Table(composite, SWT.CHECK);
		//table.setHeaderBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		//table.setHeaderForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		table.setHeaderVisible(true);
		table.setBounds(10, 10, 780, 343);
		
		TableColumn tableColumn = new TableColumn(table, SWT.NONE);
		tableColumn.setWidth(150);
		tableColumn.setText("Î•Ï€Î¹Î¸ÎµÏ„Î¿");
		
		TableColumn tableColumn_1 = new TableColumn(table, SWT.NONE);
		tableColumn_1.setWidth(120);
		tableColumn_1.setText("ÎŸÎ½Î¿Î¼Î±");
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(130);
		tblclmnNewColumn.setText("A.M.K.A.");
		
		TableColumn tableColumn_2 = new TableColumn(table, SWT.NONE);
		tableColumn_2.setResizable(false);
		tableColumn_2.setWidth(160);
		tableColumn_2.setText("Î‘ÏƒÏ†Î±Î»Î¹ÏƒÏ„Î¹ÎºÏŒÏ‚ Î¦Î¿Ï�Î­Î±Ï‚");
		
		TableColumn tableColumn_3 = new TableColumn(table, SWT.NONE);
		tableColumn_3.setWidth(120);
		tableColumn_3.setText("Î—Î¼ÎµÏ�Î¿Î¼Î·Î½Î¯Î±");
		
		TableColumn tableColumn_4 = new TableColumn(table, SWT.NONE);
		tableColumn_4.setWidth(100);
		tableColumn_4.setText("Î‘Î¹Ï„Î¹Î¿Î»Î¿Î³Î¯Î±");
		
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		CTabItem tabItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03BF ");
		
		CTabItem tbtmE = new CTabItem(tabFolder, SWT.NONE);
		tbtmE.setText("E\u03BE\u03B5\u03C4\u03B1\u03C3\u03B5\u03B9\u03C2");
		
		text = new Text(shlMedica, SWT.BORDER);
		text.setBounds(114, 165, 98, 21);
		
		text_1 = new Text(shlMedica, SWT.BORDER);
		text_1.setBounds(114, 138, 180, 21);
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setBounds(10, 138, 98, 21);
		label.setAlignment(SWT.RIGHT);
		label.setText("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		label_1 = new Label(shlMedica, SWT.NONE);
		label_1.setBounds(10, 165, 98, 21);
		label_1.setAlignment(SWT.RIGHT);
		label_1.setText("Î‘.Îœ.Îš.Î‘. Î±ÏƒÎ¸ÎµÎ½Î®:");
		
		Button btnNewButton = new Button(shlMedica, SWT.NONE);
		btnNewButton.setBounds(114, 201, 113, 21);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setText("Î‘Î½Î±Î¶Î®Ï„Î·ÏƒÎ·");
		
		Label label_2 = new Label(shlMedica, SWT.NONE);
		label_2.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.NORMAL));
		label_2.setBounds(10, 105, 146, 27);
		label_2.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		Label lblMedicaA = new Label(shlMedica, SWT.NONE);
		lblMedicaA.setFont(SWTResourceManager.getFont("Segoe UI", 25, SWT.NORMAL));
		lblMedicaA.setBounds(10, 24, 540, 75);
		lblMedicaA.setText("ÎšÎ»Î¹Î½Î¹ÎºÎ® Medica - AÎ½Î±Î¶Î®Ï„Î·ÏƒÎ· Î‘ÏƒÎ¸ÎµÎ½Î®");
		
		Button btnNewButton_1 = new Button(shlMedica, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				shlMedica.setVisible(false);
				SecrLogin nj = new SecrLogin();
				nj.NewScreen();
				
				
			}
		});
		btnNewButton_1.setBounds(750, 24, 107, 27);
		btnNewButton_1.setText("Î•Ï€Î¹ÏƒÏ„Ï�Î¿Ï†Î®");

	}
}
