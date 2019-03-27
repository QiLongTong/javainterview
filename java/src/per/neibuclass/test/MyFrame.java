package per.neibuclass.test;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	public MyFrame() {
		addWindowListener(
				new WindowAdapter() {//匿名内部类
					public void windowClosing(WindowEvent e) {
						dispose();
						System.exit(0);
					}
		});
	}
}
