package kr.co.sist.memo.view;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.TextArea;

/**
 * ����ڰ� ������ �޸� �ۼ�, ���Ϸ� ����, ���Ͽ��� �о���̴� ����� ������ 
 * �޸��� 
 * @author owner
 */
public class JavaMemo extends Frame{
	private Menu menuFile,menuEdit, menuHelp ;
	private MenuItem miNew, miOpen, miSave, miNewSave, miEnd, miFormat, miHelp;
	private TextArea taNote;
	
	public JavaMemo() {
			
	}//JavaMemo

	public Menu getMenuFile() {
		return menuFile;
	}

	public Menu getMenuEdit() {
		return menuEdit;
	}

	public Menu getMenuHelp() {
		return menuHelp;
	}

	public MenuItem getMiNew() {
		return miNew;
	}

	public MenuItem getMiOpen() {
		return miOpen;
	}

	public MenuItem getMiSave() {
		return miSave;
	}

	public MenuItem getMiNewSave() {
		return miNewSave;
	}

	public MenuItem getMiEnd() {
		return miEnd;
	}

	public MenuItem getMiFormat() {
		return miFormat;
	}

	public MenuItem getMiHelp() {
		return miHelp;
	}

	public TextArea getTaNote() {
		return taNote;
	}
	
	
}//class