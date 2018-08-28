package eNews.common;

import eNews.url.Url;

/**
 * 
 * @author 
 * @date 2016-9-12 获取资源ID类
 */
public class GetTypeId {

	public static String getTypeId(String typedesc) {
		if("头条".equals(typedesc)){	
			return Url.TopId;
		}else if("新闻详情".equals(typedesc)){
		

			return Url.NewDetail;
		}else if("足球".equals(typedesc)){
		
			return Url.FootId;
		}else if("娱乐".equals(typedesc)){
		
			return Url.YuLeId;
		}else if("移动".equals(typedesc)){
		
			return Url.YiDongId;
		}else if("体育".equals(typedesc)){
		
			return Url.TiYuId;
		}else if("财经".equals(typedesc)){
		
			return Url.CaiJingId;
		}else if("科技".equals(typedesc)){
		
			return Url.KeJiId;
		}else if("电影".equals(typedesc)){
		
			return Url.DianYingId;
		}else if("汽车".equals(typedesc)){
		
			return Url.QiChiId;
		}else if("笑话".equals(typedesc)){
		
			return Url.XiaoHuaId;
		}else if("时尚".equals(typedesc)){
		
			return Url.ShiShangId;
		}else if("情感".equals(typedesc)){
		
			return Url.QingGanId;
		}else if("精选".equals(typedesc)){
		
			return Url.JingXuanId;
		}else if("电台".equals(typedesc)){
		
			return Url.DianTaiId;
		}else if("NBA".equals(typedesc)){
		
			return Url.NBAId;
		}else if("CBA".equals(typedesc)){
	
			return Url.CBAId;
		}else if("数码".equals(typedesc)){
		
			return Url.ShuMaId;
		}else if("彩票".equals(typedesc)){
		
			return Url.CaiPiaoId;
		}else if("教育".equals(typedesc)){
		
			return Url.JiaoYuId;
		}else if("论坛".equals(typedesc)){
		
			return Url.LunTanId;
		}else if("旅游".equals(typedesc)){
		
			return Url.LvYouId;
		}else if("手机".equals(typedesc)){
		
			return Url.ShouJiId;
		}else if("博客".equals(typedesc)){
		
			return Url.BoKeId;
		}else if("社会".equals(typedesc)){
		
			return Url.SheHuiId;
		}else if("家居".equals(typedesc)){
		
			return Url.JiaJuId;
		}else if("暴雪".equals(typedesc)){
		
			return Url.BaoXueId;
		}else if("亲子".equals(typedesc)){
		
			return Url.QinZiId;
		}else if("消息".equals(typedesc)){
		
			return Url.XiaoHuaId;
		}else if("游戏".equals(typedesc)){
		
			return Url.YouXiId;
		}else if("热点视频".equals(typedesc)){
		
			return Url.VideoReDianId;
		}else if("娱乐视频".equals(typedesc)){
		
			return Url.VideoYuLeId;
		}else if("搞笑视频".equals(typedesc)){
		
			return Url.VideoGaoXiaoId;
		}else if("精品视频".equals(typedesc)){
		
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
