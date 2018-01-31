package com.teipir.softeng.MedicaApp;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;

public class NurseHelp {

	protected Shell shlHelp;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			NurseHelp window = new NurseHelp();
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
		shlHelp.open();
		shlHelp.layout();
		while (!shlHelp.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlHelp = new Shell();
		shlHelp.setImage(SWTResourceManager.getImage(NurseHelp.class, "/images/medicaLogoScaled.jpg"));
		shlHelp.setSize(450, 300);
		shlHelp.setText("Help");
		
		Label label = new Label(shlHelp, SWT.NONE);
		label.setBounds(7, 6, 417, 249);
		label.setText("Οδηγίες για το νοσηλευτικό προσωπικό.");

	}
}
