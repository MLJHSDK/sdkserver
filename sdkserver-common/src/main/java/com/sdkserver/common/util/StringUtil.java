package com.sdkserver.common.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	public static final String CHECKEMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
	public static final String CHECKPASSWORD = "^[A-Za-z0-9]+$";
	public static final String SPLIT = "|";
	public static final String SPLIT_ESCAPE = "\\|";

	public static boolean isLetter(char c) {
		int k = 0x80;
		return c / k == 0 ? true : false;
	}

	// 判断是不是中文
	public static boolean isChina(String str) {
		return str.matches("[\\u4E00-\\u9FA5]+");
	}

	public static int getNameSize(String content) {
		int count = 0;
		char[] c = content.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (isLetter(c[i])) {
				count++;
			} else {
				count += 2;
			}
		}

		return count;
	}

	// 判断是否半角
	public static boolean isEnna(String param) {

		char[] chs = param.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if (!(('\uFF61' <= chs[i]) && (chs[i] <= '\uFF9F')) && !(('\u0020' <= chs[i]) && (chs[i] <= '\u007E'))) {
				if (!isChina(String.valueOf(chs[i]))) {
					return false;
				}
			}
		}
		return true;
	}

	public static Integer toInt(Object o) {
		Integer temp = 0;
		if (o != null) {
			String mintemp = o.toString();
			if (mintemp.indexOf(".") > 0) { //
				temp = Integer.parseInt(mintemp.substring(0, mintemp // 把小数位去掉
						.indexOf("."))); //
			}
		}
		return temp;
	}

	/**
	 * 写二进制文件
	 * 
	 * @param path
	 * @param bytedate
	 * @return
	 */
	public static boolean wirteByte(String path, byte[] bytedate) {
		File file = new File(path);

		FileOutputStream stream = null;
		try {
			if (!file.exists()) {
				if (!file.createNewFile()) {
					return false;
				}
			}
			stream = new FileOutputStream(file);
			FileChannel channel = stream.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(bytedate.length);
			buffer.put(bytedate);
			buffer.flip();

			channel.write(buffer);
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return false;

	}

	static byte NUMBER_KEY = 48;
	static byte UPPER_KEY = 55;
	static byte LOWER_KEY = 87;
	static byte HEX_KEY = 16;
	static byte NUMBER_MAX = 57;
	static byte NUMBER_MIN = 48;
	static byte UPPER_MAX = 70;
	static byte UPPER_MIN = 65;
	static byte LOWER_MAX = 102;
	static byte LOWER_MIN = 97;
	static byte checkByte = 0;

	/**
	 * 将二进制字符串数据转换为byte
	 * 
	 * @param pStr
	 *            二进制字符串
	 * @return
	 */
	public static byte[] StrToByte(String pStr) {
		byte[] tmpBytes = pStr.getBytes();
		byte[] returnBytes = new byte[tmpBytes.length / 2];
		for (int i = 0; i < tmpBytes.length; i++) {
			if (tmpBytes[i] >= NUMBER_MIN && tmpBytes[i] <= NUMBER_MAX)
				tmpBytes[i] = new Integer(tmpBytes[i] - NUMBER_KEY).byteValue();
			if (tmpBytes[i] >= UPPER_MIN && tmpBytes[i] <= UPPER_MAX)
				tmpBytes[i] = new Integer(tmpBytes[i] - UPPER_KEY).byteValue();
			if (tmpBytes[i] >= LOWER_MIN && tmpBytes[i] <= LOWER_MAX)
				tmpBytes[i] = new Integer(tmpBytes[i] - LOWER_KEY).byteValue();
		}
		for (int i = 0; i < tmpBytes.length; i++, i++) {
			returnBytes[i / 2] = new Integer(tmpBytes[i] * 16 + tmpBytes[i + 1]).byteValue();
		}
		return returnBytes;
	}

	/**
	 * 将二进制字符串数据转换为byte
	 * 
	 * @param pBytes
	 *            二进制数组
	 * @return
	 */
	public static String ByteToStr(byte[] pBytes) {
		String returnStr = "";
		for (int i = 0; i < pBytes.length; i++) {
			int tmpInt = new Byte(pBytes[i]).intValue();
			if (tmpInt < 0)
				tmpInt = tmpInt + 256;

			byte[] strList = new byte[2];
			strList[1] = new Integer(tmpInt % 16).byteValue();// 低位
			strList[0] = new Integer((tmpInt / 16) % 16).byteValue();// 高位

			if (strList[1] > 9 && strList[1] < 16)
				strList[1] += LOWER_KEY;
			if (strList[1] >= 0 && strList[1] < 10)
				strList[1] += NUMBER_KEY;

			if (strList[0] > 9 && strList[0] < 16)
				strList[0] += LOWER_KEY;
			if (strList[0] >= 0 && strList[0] < 10)
				strList[0] += NUMBER_KEY;

			returnStr = returnStr + new String(strList);
		}
		return returnStr;
	}

	/**
	 * 读取二进制文件输出二进制数组
	 * 
	 * @param file
	 * @return
	 */
	public static byte[] getBytes(String file) {
		byte[] returnBytes;

		BufferedInputStream in;
		try {
			in = new BufferedInputStream(new FileInputStream(file));
			ByteArrayOutputStream out = new ByteArrayOutputStream(1024);
			byte[] temp = new byte[1024];
			int size = 0;
			while ((size = in.read(temp)) != -1) {
				out.write(temp, 0, size);
			}
			returnBytes = out.toByteArray();
			out.close();
			in.close();
			return returnBytes;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * bytes转换成十六进制字符串
	 */
	public static String byte2HexStr(byte[] b) {
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}
		return hs.toLowerCase();
	}

	/**
	 * 十六进制字符串转换成bytes
	 */
	public static byte[] hexStr2Bytes(String src) {
		int m = 0, n = 0;
		int l = src.length() / 2;
		byte[] ret = new byte[l];
		for (int i = 0; i < l; i++) {
			m = i * 2 + 1;
			n = m + 1;
			ret[i] = uniteBytes(src.substring(i * 2, m), src.substring(m, n));
		}
		return ret;
	}

	private static byte uniteBytes(String src0, String src1) {
		byte b0 = Byte.decode("0x" + src0).byteValue();
		b0 = (byte) (b0 << 4);
		byte b1 = Byte.decode("0x" + src1).byteValue();
		byte ret = (byte) (b0 | b1);
		return ret;
	}

	/**
	 * 将int类型的数据转换为byte数组 原理：将int数据中的四个byte取出，分别存储
	 * 
	 * @param n
	 *            int数据
	 * @return 生成的byte数组
	 */
	public static byte[] intToBytes4(int n) {
		byte[] b = new byte[4];
		for (int i = 0; i < 4; i++) {
			b[i] = (byte) (n >> (24 - i * 8));
		}
		return b;
	}

	/**
	 * 将byte数组数据转换为int
	 * 
	 * @param b
	 *            byte数组
	 * @return 生成的int数据
	 */
	public static int byte4ToInt(byte[] b) {
		int rn = 0;
		for (int i = 0; i < 4; i++) {
			int n = new Integer(b[i]).intValue();
			if (n < 0)
				n += 256;
			rn = (rn * 256) + n;

		}
		return rn;
	}
	
	public static int byte2ToInt(byte[] b) {
		int rn = 0;
		for (int i = 0; i < 2; i++) {
			int n = new Integer(b[i]).intValue();
			if (n < 0)
				n += 256;
			rn = (rn * 256) + n;

		}
		return rn;
	}

	public static int toInt(byte[] bRefArr) {
	    int iOutcome = 0;
	    byte bLoop;

	    for (int i = 0; i < bRefArr.length; i++) {
	        bLoop = bRefArr[i];
	        iOutcome += (bLoop & 0xFF) << (8 * i);
	    }
	    return iOutcome;
	}
	
	/**
	 * 解密
	 * 
	 * @param b
	 * @param count
	 * @return
	 */
	public static byte rrcrByte(byte b, int count) {
		int byteValue = b & 0xff;
		int h = (byteValue << (8 - count));
		int l = (byteValue >>> count);
		return (byte) (h | l);
	}

	/**
	 * 加密
	 * 
	 * @return
	 */
	public static byte lcrcByte(byte b, int count) {
		int byteValue = b & 0xff;
		int h = (byteValue << count);
		int l = (byteValue >>> (8 - count));
		return (byte) (h | l);
	}

	/**
	 * 检查字符串是否空，如果空就返回null
	 * 
	 * @param s
	 * @return
	 */
	public static String getEmptyStringNULL(String s) {
		if (StringUtils.isEmpty(s)) {
			return null;
		} else {
			return s;
		}
	}
	
	/**
	 * 打印出一个错误
	 * 
	 * @param errorMsg
	 *            错误描述
	 */
	private static final String preErr = "ERROR!!!!:\n";
	
	private static void printError(String str, Exception e) {
		String errorMsg = "不能转换:" + str;
		StackTraceElement[] st = e.getStackTrace();
		if (st != null && st.length > 1) {
			System.out.println(preErr + errorMsg + "(" + st[1].getFileName() + ":" + st[1].getLineNumber() + ")");
		} else {
			System.out.println(errorMsg);
		}
	}
	
	public static Byte str2Byte(String str) {
		try {
			return StringUtils.isEmpty(str) ? 0 : Byte.parseByte(str);
		} catch (Exception e) {
			printError(str, e);
		}
		return 0;
	}

	public static Integer str2Int(String str) {
		try {
			return StringUtils.isEmpty(str) ? 0 : Integer.parseInt(str);
		} catch (Exception e) {
			printError(str, e);
		}
		return 0;
	}

	public static Long str2Long(String str) {
		try {
			return StringUtils.isEmpty(str) ? 0 : Long.parseLong(str);
		} catch (Exception e) {
			printError(str, e);
		}
		return 0l;
	}
	
	public static Long str2Long(String str, int radix) {
		try {
			return StringUtils.isEmpty(str) ? 0 : Long.parseLong(str, radix);
		} catch (Exception e) {
			printError(str, e);
		}
		return 0l;
	}

	public static Float str2Float(String str) {
		try {
			return StringUtils.isEmpty(str) ? 0 : Float.parseFloat(str);
		} catch (Exception e) {
			printError(str, e);
		}
		return 0f;
	}

	public static Boolean str2Boolean(String str) {
		try {
			return "1".equals(str) || Boolean.parseBoolean(str);
		} catch (Exception e) {
			printError(str, e);
		}
		return false;
	}
	
	/**
	 * 检查format的字符串是否合法
	 * @param format
	 * @param bCheckOnlyOne	是否检查唯一性
	 * @return
	 */
	public static boolean checkFormatString(String format, boolean bCheckOnlyOne) {
		Pattern p = Pattern.compile("\\{\\d\\}");
		Matcher m = p.matcher(format);
		
		//把字符串入set
		HashSet<String> s = new HashSet<String>();
		while (m.find()) {
			String temp = m.group();
			
			// 检查唯一性，这个可以不检查吧
			if (bCheckOnlyOne && s.contains(temp)) {
				return false;
			}
			
			s.add(temp);
		}
		
		// 检查是否从0开始
		if (s.size() > 0) {
			if (!s.contains("{0}")) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 划分字符串到整形数组
	 * @param s
	 * @param regex
	 * @return
	 */
	public static int[] split(String s, String regex) {
		if (StringUtils.isEmpty(s)) return null;
		
		String[] a = s.split(regex);
		int l = a.length;
		int[] r = new int[l];
		for (int i = 0; i < l; ++i) {
			r[i] = str2Int(a[i]);
		}
		
		return r;
	}
	
}
