package eNews.common;

import eNews.app.R;

/**
 * 
 * @author ����
 * @date 2016-9-12 ��ȡ����Ԥ������ͼƬID��
 */
public class GetWeatherBackground {

	public static int getBackgroundId(String typedesc) {
		if("��".equals(typedesc)){
			return R.drawable.sun;
			}else if("����".equals(typedesc)){		
			return R.drawable.duoyun;
			}else if("��".equals(typedesc)){		
			return R.drawable.yin;
			}else if("����".equals(typedesc)){		
		
			return R.drawable.rain;
			}else if("������".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("���ѩ".equals(typedesc)){	
		
			return R.drawable.default_bg;
			}else if("С��".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("����".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("����".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("����".equals(typedesc)){	
			return R.drawable.rain;
			}else if("�ش���".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("Сѩ".equals(typedesc)){	
		
			return R.drawable.snow;
			}else if("��ѩ".equals(typedesc)){	
		
			return R.drawable.snow;
			}else if("��ѩ".equals(typedesc)){	
		
			return R.drawable.snow;
			}else if("��ѩ".equals(typedesc)){	
	
			return R.drawable.snow;
			}else if("��".equals(typedesc)){	
		
			return R.drawable.wu;
			}else if("����".equals(typedesc)){	
	
			return R.drawable.default_bg;
			}else if("ɳ����".equals(typedesc)){	
		
			return R.drawable.yangsha;
			}else if("����".equals(typedesc)){	
		
			return R.drawable.yangsha;
			}else if("��ɳ".equals(typedesc)){	
		
			return R.drawable.yangsha;
			}else if("ǿɳ����".equals(typedesc)){
	
			return R.drawable.yangsha;
			}else if("��".equals(typedesc)){
		
			return R.drawable.wu;
			}else if("����".equals(typedesc)){
		
			return R.drawable.binbao;
			}else {
		
			return -1;
		}
		/*switch (typedesc) {
		case "��":
			return R.drawable.sun;
		case "����":
			return R.drawable.duoyun;
		case "��":
			return R.drawable.yin;
		case "����":
			return R.drawable.rain;
		case "������":
			return R.drawable.rain;
		case "���ѩ":
			return R.drawable.default_bg;
		case "С��":
			return R.drawable.rain;
		case "����":
			return R.drawable.rain;
		case "����":
			return R.drawable.rain;
		case "����":
			return R.drawable.rain;
		case "�ش���":
			return R.drawable.rain;
		case "Сѩ":
			return R.drawable.snow;
		case "��ѩ":
			return R.drawable.snow;
		case "��ѩ":
			return R.drawable.snow;
		case "��ѩ":
			return R.drawable.snow;
		case "��":
			return R.drawable.wu;
		case "����":
			return R.drawable.default_bg;
		case "ɳ����":
			return R.drawable.yangsha;
		case "����":
			return R.drawable.yangsha;
		case "��ɳ":
			return R.drawable.yangsha;
		case "ǿɳ����":
			return R.drawable.yangsha;
		case "��":
			return R.drawable.wu;
		case "����":
			return R.drawable.binbao;
		default:
			return -1;
		}*/
	}
}
