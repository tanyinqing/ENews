package eNews.common;

import eNews.url.Url;

/**
 * 
 * @author 
 * @date 2016-9-12 ��ȡ��ԴID��
 */
public class GetTypeId {

	public static String getTypeId(String typedesc) {
		if("ͷ��".equals(typedesc)){	
			return Url.TopId;
		}else if("��������".equals(typedesc)){
		

			return Url.NewDetail;
		}else if("����".equals(typedesc)){
		
			return Url.FootId;
		}else if("����".equals(typedesc)){
		
			return Url.YuLeId;
		}else if("�ƶ�".equals(typedesc)){
		
			return Url.YiDongId;
		}else if("����".equals(typedesc)){
		
			return Url.TiYuId;
		}else if("�ƾ�".equals(typedesc)){
		
			return Url.CaiJingId;
		}else if("�Ƽ�".equals(typedesc)){
		
			return Url.KeJiId;
		}else if("��Ӱ".equals(typedesc)){
		
			return Url.DianYingId;
		}else if("����".equals(typedesc)){
		
			return Url.QiChiId;
		}else if("Ц��".equals(typedesc)){
		
			return Url.XiaoHuaId;
		}else if("ʱ��".equals(typedesc)){
		
			return Url.ShiShangId;
		}else if("���".equals(typedesc)){
		
			return Url.QingGanId;
		}else if("��ѡ".equals(typedesc)){
		
			return Url.JingXuanId;
		}else if("��̨".equals(typedesc)){
		
			return Url.DianTaiId;
		}else if("NBA".equals(typedesc)){
		
			return Url.NBAId;
		}else if("CBA".equals(typedesc)){
	
			return Url.CBAId;
		}else if("����".equals(typedesc)){
		
			return Url.ShuMaId;
		}else if("��Ʊ".equals(typedesc)){
		
			return Url.CaiPiaoId;
		}else if("����".equals(typedesc)){
		
			return Url.JiaoYuId;
		}else if("��̳".equals(typedesc)){
		
			return Url.LunTanId;
		}else if("����".equals(typedesc)){
		
			return Url.LvYouId;
		}else if("�ֻ�".equals(typedesc)){
		
			return Url.ShouJiId;
		}else if("����".equals(typedesc)){
		
			return Url.BoKeId;
		}else if("���".equals(typedesc)){
		
			return Url.SheHuiId;
		}else if("�Ҿ�".equals(typedesc)){
		
			return Url.JiaJuId;
		}else if("��ѩ".equals(typedesc)){
		
			return Url.BaoXueId;
		}else if("����".equals(typedesc)){
		
			return Url.QinZiId;
		}else if("��Ϣ".equals(typedesc)){
		
			return Url.XiaoHuaId;
		}else if("��Ϸ".equals(typedesc)){
		
			return Url.YouXiId;
		}else if("�ȵ���Ƶ".equals(typedesc)){
		
			return Url.VideoReDianId;
		}else if("������Ƶ".equals(typedesc)){
		
			return Url.VideoYuLeId;
		}else if("��Ц��Ƶ".equals(typedesc)){
		
			return Url.VideoGaoXiaoId;
		}else if("��Ʒ��Ƶ".equals(typedesc)){
		
			return Url.VideoJingPinId;
		}else {		
			return "null";
		}
	}

	public static boolean isBvNews(String docId) {

		String capture = docId.substring(0, 1);
		if (capture.equals("P"))
			return false;

		return true;
	}

}
