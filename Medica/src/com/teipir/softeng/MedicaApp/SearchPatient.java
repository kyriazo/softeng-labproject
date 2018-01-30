package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class SearchPatient {

	protected Shell shlMedica;
	private Text surname;
	private Text amka;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void Anoikse() {
		try {
			SearchPatient window = new SearchPatient();
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
		shlMedica.setSize(901, 599);
		shlMedica.setText("Medica");
		
		Label lblMedica = new Label(shlMedica, SWT.NONE);
		lblMedica.setFont(SWTResourceManager.getFont("Segoe UI", 23, SWT.NORMAL));
		lblMedica.setBounds(10, 10, 518, 54);
		lblMedica.setText("\u039A\u03BB\u03B9\u03BD\u03B9\u03BA\u03AE Medica - \u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		
		Label label = new Label(shlMedica, SWT.NONE);
		label.setBounds(10, 97, 94, 15);
		label.setText("\u0388\u03C0\u03B9\u03B8\u03B5\u03C4\u03BF \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		Label label_1 = new Label(shlMedica, SWT.NONE);
		label_1.setBounds(10, 129, 94, 15);
		label_1.setText("\u0386.\u039C.\u039A.\u0391. \u03B1\u03C3\u03B8\u03B5\u03BD\u03AE:");
		
		surname = new Text(shlMedica, SWT.BORDER);
		surname.setBounds(110, 94, 146, 21);
		
		amka = new Text(shlMedica, SWT.BORDER);
		amka.setBounds(110, 126, 146, 21);
		
		CTabFolder tabFolder = new CTabFolder(shlMedica, SWT.BORDER);
		tabFolder.setBounds(10, 201, 819, 330);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 55, 15);
		lblNewLabel.setText("\u038C\u03BD\u03BF\u03BC\u03B1:");
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setBounds(10, 31, 55, 15);
		lblNewLabel_1.setText("\u0395\u03C0\u03AF\u03B8\u03B5\u03C4\u03BF:");
		
		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		lblNewLabel_2.setBounds(10, 52, 55, 15);
		lblNewLabel_2.setText("\u0391.\u039C.\u039A.\u0391.:");
		
		Label lblNewLabel_3 = new Label(composite, SWT.NONE);
		lblNewLabel_3.setBounds(10, 73, 127, 15);
		lblNewLabel_3.setText("\u0391\u03C3\u03C6\u03B1\u03BB\u03B9\u03C3\u03C4\u03B9\u03BA\u03CC\u03C2 \u03A6\u03BF\u03C1\u03AD\u03B1\u03C2:");
		
		Label lblNewLabel_4 = new Label(composite, SWT.NONE);
		lblNewLabel_4.setBounds(10, 94, 127, 15);
		lblNewLabel_4.setText("\u0397\u03BC/\u03BD\u03AF\u03B1 \u0393\u03AD\u03BD\u03BD\u03B7\u03C3\u03B7\u03C2:");
		
		Label lblNewLabel_5 = new Label(composite, SWT.NONE);
		lblNewLabel_5.setBounds(10, 115, 127, 15);
		lblNewLabel_5.setText("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7:");
		
		Label lblNewLabel_6 = new Label(composite, SWT.NONE);
		lblNewLabel_6.setBounds(10, 136, 55, 15);
		lblNewLabel_6.setText("\u03A4.\u039A.:");
		
		Label label_2 = new Label(composite, SWT.NONE);
		label_2.setBounds(10, 157, 55, 15);
		label_2.setText("\u03A0\u03CC\u03BB\u03B7:");
		
		Label label_3 = new Label(composite, SWT.NONE);
		label_3.setBounds(10, 178, 127, 15);
		label_3.setText("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		
		Label carrier = new Label(composite, SWT.NONE);
		carrier.setBounds(143, 73, 55, 15);
		
		Label name = new Label(composite, SWT.NONE);
		name.setBounds(143, 10, 55, 15);
		
		Label sname = new Label(composite, SWT.NONE);
		sname.setBounds(143, 31, 55, 15);
		
		Label samka = new Label(composite, SWT.NONE);
		samka.setBounds(143, 52, 55, 15);
		
		Label birthday = new Label(composite, SWT.NONE);
		birthday.setBounds(143, 94, 55, 15);
		
		Label address = new Label(composite, SWT.NONE);
		address.setBounds(143, 115, 55, 15);
		
		Label tk = new Label(composite, SWT.NONE);
		tk.setBounds(143, 136, 55, 15);
		
		Label city = new Label(composite, SWT.NONE);
		city.setBounds(143, 157, 55, 15);
		
		Label phone = new Label(composite, SWT.NONE);
		phone.setBounds(143, 178, 55, 15);
		
		Button btnEdit = new Button(composite, SWT.NONE);
		btnEdit.setBounds(10, 242, 172, 25);
		btnEdit.setText("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03B9\u03CE\u03BD");
		
		CTabItem tabItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_1);
		
		CTabItem tabItem_2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("\u0395\u03BE\u03B5\u03C4\u03B1\u03C3\u03B5\u03B9\u03C2");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite_2);
		
		Button btnSearch = new Button(shlMedica, SWT.NONE);
		btnSearch.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				
				tabFolder.setFocus();
				String epitheto = surname.getText();
				String amk = amka.getText();
				dbConnection psakse = new dbConnection();
				String[] info = psakse.yparxei(epitheto,amk);
				if(info != null) {
					
					name.setText(info[0]);
					sname.setText(info[1]);
					samka.setText(info[2]);
					carrier.setText(info[3]);
					birthday.setText(info[4]);
					address.setText(info[5]);
					tk.setText(info[6]);
					city.setText(info[7]);
					phone.setText(info[8]);
					
					
					
				}
				
				
			}
		});
		btnSearch.setBounds(10, 159, 106, 25);
		btnSearch.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		
		Button btnHelp = new Button(shlMedica, SWT.NONE);
		btnHelp.setText("Help");
		btnHelp.setBounds(800, 41, 75, 25);
		
		Button btnReturn = new Button(shlMedica, SWT.NONE);
		btnReturn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shlMedica.close();
				MainScreen gurise = new MainScreen();
				gurise.Anoikse();
				
			}
		});
		btnReturn.setBounds(781, 10, 94, 25);
		btnReturn.setText("Επιστροφή");
		shlMedica.setDefaultButton(btnSearch);

	}
	
	
}
