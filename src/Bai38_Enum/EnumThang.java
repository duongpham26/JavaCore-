package Bai38_Enum;

public enum EnumThang {
	Thang_1(31), Thang_2(28), Thang_3(31), Thang_4(30), Thang_5(31), Thang_6(30), Thang_7(30), Thang_8(31), Thang_9(30),
	Thang_10(31), Thang_11(30), Thang_12(31);

	private final int songay;

	EnumThang(int numberDay) {
		this.songay = numberDay;
	}

	public int SoNgay() {
		return this.songay;
	}
}
