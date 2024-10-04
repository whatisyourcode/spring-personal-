package spring;

public class VersionPrinter {
	
	private int majorVersion;
	private int minorVersion;
	
	public void print() {
		System.out.printf("�� ���α׷��� ������ %d.%d�Դϴ�.\n\n",
				majorVersion,minorVersion);
	}
	
	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}
	
	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
}	
