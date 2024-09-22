package Bai38_Enum;

public class ThoiKhoaBieu {
	private EnumDay Thu;
	private String MonHoc;

	public ThoiKhoaBieu() {
	};

	public ThoiKhoaBieu(EnumDay Thu, String MonHoc) {
		this.MonHoc = MonHoc;
		this.Thu = Thu;
	}

	public String getMonHoc() {
		return this.MonHoc;
	}

	public EnumDay getThu() {
		return this.Thu;
	}

	public void setMonHoc(String MonHoc) {
		this.MonHoc = MonHoc;
	}

	public void setThu(EnumDay Thu) {
		this.Thu = Thu;
	}

	@Override
	public String toString() {
		return "Mon Hoc : " + this.MonHoc + "; Thu : " + this.Thu;
	}

	public static void main(String[] args) {
		ThoiKhoaBieu TKB1 = new ThoiKhoaBieu(EnumDay.Monday, "Toan Li Hoa");
		System.out.println(TKB1);

		System.out.println(EnumThang.Thang_1.SoNgay());
	}
}
