package eNews.common;

import eNews.app.R;

/**
 * 
 * @author ����
 * @date 2016-9-12 ��ȡ����ͼ����
 */
public class GetWeatherIconTypeId {

	public static int getTypeId(String typedesc) {
if("��".equals(typedesc)){
	return R.drawable.qing_0;
		}else if("����".equals(typedesc)){
			return R.drawable.duoyun_0;
		}else if("��".equals(typedesc)){
			return R.drawable.yin_0;
		}else if("����".equals(typedesc)){
			return R.drawable.zhenyu_0;
		}else if("������".equals(typedesc)){
			return R.drawable.leizhenyu_0;
		}else if("���ѩ".equals(typedesc)){
			return R.drawable.yujiaxue_0;
		}else if("С��".equals(typedesc)){
			return R.drawable.xiaoyu_0;
		}else if("����".equals(typedesc)){
			return R.drawable.zhongyu_0;
		}else if("����".equals(typedesc)){
			return R.drawable.dayu_0;
		}else if("����".equals(typedesc)){
			return R.drawable.baoyu_0;
		}else if("�ش���".equals(typedesc)){
			return R.drawable.tedabaoyu_0;
		}else if("Сѩ".equals(typedesc)){
			return R.drawable.xiaoxue_0;
		}else if("��ѩ".equals(typedesc)){
			return R.drawable.zhongxue_0;
		}	else if("��ѩ".equals(typedesc)){
			return R.drawable.daxue_0;
		}	else if("��ѩ".equals(typedesc)){
			return R.drawable.baoxue_0;
		}	else if("��".equals(typedesc)){
			return R.drawable.wu_0;
		}	else if("����".equals(typedesc)){
			return R.drawable.dongyu_0;
		}	else if("ɳ����".equals(typedesc)){
			return R.drawable.shachenbao_0;
		}	else if("����".equals(typedesc)){
			return R.drawable.fuchen_0;
		}	else if("��ɳ".equals(typedesc)){
			return R.drawable.yangsha_0;
		}	else if("ǿɳ����".equals(typedesc)){
			return R.drawable.qiangshachenbao_0;
		}	else if("��".equals(typedesc)){
			return R.drawable.mai_0;
		}	else if("����".equals(typedesc)){
			return R.drawable.bingbao_0;
		}	else {
			return -1;
		}			
	
		
		/*switch (typedesc) {

		case "��":
			return R.drawable.qing_0;
		case "����":
			return R.drawable.duoyun_0;
		case "��":
			return R.drawable.yin_0;
		case "����":
			return R.drawable.zhenyu_0;
		case "������":
			return R.drawable.leizhenyu_0;
		case "���ѩ":
			return R.drawable.yujiaxue_0;
		case "С��":
			return R.drawable.xiaoyu_0;
		case "����":
			return R.drawable.zhongyu_0;
		case "����":
			return R.drawable.dayu_0;
		case "����":
			return R.drawable.baoyu_0;
		case "�ش���":
			return R.drawable.tedabaoyu_0;
		case "Сѩ":
			return R.drawable.xiaoxue_0;
		case "��ѩ":
			return R.drawable.zhongxue_0;
		case "��ѩ":
			return R.drawable.daxue_0;
		case "��ѩ":
			return R.drawable.baoxue_0;
		case "��":
			return R.drawable.wu_0;
		case "����":
			return R.drawable.dongyu_0;
		case "ɳ����":
			return R.drawable.shachenbao_0;
		case "����":
			return R.drawable.fuchen_0;
		case "��ɳ":
			return R.drawable.yangsha_0;
		case "ǿɳ����":
			return R.drawable.qiangshachenbao_0;
		case "��":
			return R.drawable.mai_0;
		case "����":
			return R.drawable.bingbao_0;
		default:
			return -1;
		}*/
	}

}
