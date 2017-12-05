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

public class SearchPatient {

	protected Shell shlMedica;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
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
		
		text = new Text(shlMedica, SWT.BORDER);
		text.setBounds(110, 94, 146, 21);
		
		text_1 = new Text(shlMedica, SWT.BORDER);
		text_1.setBounds(110, 126, 146, 21);
		
		CTabFolder tabFolder = new CTabFolder(shlMedica, SWT.BORDER);
		tabFolder.setBounds(10, 201, 819, 330);
		tabFolder.setSelectionBackground(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		
		CTabItem tabItem = new CTabItem(tabFolder, SWT.NONE);
		tabItem.setText("\u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		
		CTabItem tabItem_1 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("\u0399\u03C3\u03C4\u03BF\u03C1\u03B9\u03BA\u03CC");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_1);
		
		CTabItem tabItem_2 = new CTabItem(tabFolder, SWT.NONE);
		tabItem_2.setText("\u0395\u03BE\u03B5\u03C4\u03B1\u03C3\u03B5\u03B9\u03C2");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite_2);
		
		Button button = new Button(shlMedica, SWT.NONE);
		button.setBounds(10, 159, 106, 25);
		button.setText("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		
		text_2 = new Text(shlMedica, SWT.BORDER | SWT.CENTER);
		text_2.setText("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE");
		text_2.setBounds(774, 10, 101, 25);

	}
}
