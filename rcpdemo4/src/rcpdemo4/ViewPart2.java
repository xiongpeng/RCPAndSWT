package rcpdemo4;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class ViewPart2 extends ViewPart {

	public ViewPart2() {
	}

	@Override
	public void createPartControl(Composite parent) {
        Text text = new Text(parent,SWT.BORDER);
        text.setText("My Second View");
	}

	@Override
	public void setFocus() {

	}

}
