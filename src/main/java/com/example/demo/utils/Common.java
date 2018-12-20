
/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.utils;
/**
 * @author LyHaoThienPC
 *
 */
public class Common {
	/**
	 * Tính học kỳ phần ngành
	 * @param maSV
	 * @return
	 */
	public static String layHocKyPhanNganh(String maSV) {
		// 20150393 lay 4 ky tu dau
		String hocKy = maSV.substring(0, 4) + "2";
		return hocKy;
	}
	/**
	 * Kiểm tra chuỗi nhập vào
	 * @param str
	 */
	public static boolean isEmptyOrNull(String str) {
		if(str == null) {
			return true;
		} else if("".equals(str)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Kiểm tra chuỗi nhập vào có quá số ký tự cho phép của DB không
	 * @param str
	 * @param length
	 * @return
	 */
	public static boolean overLength(String str, int length) {
		if(length <= 0) {
			return true;
		} else if (str.length() > length) {
			return true;
		} else {
			return false;
		}
	}
}

