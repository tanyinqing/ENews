package eNews.common;

import eNews.app.R;

/**
 * 
 * @author Õıø≠
 * @date 2016-9-12 ªÒ»°ÃÏ∆¯‘§±®±≥æ∞Õº∆¨ID¿‡
 */
public class GetWeatherBackground {

	public static int getBackgroundId(String typedesc) {
		if("«Á".equals(typedesc)){
			return R.drawable.sun;
			}else if("∂‡‘∆".equals(typedesc)){		
			return R.drawable.duoyun;
			}else if("“ı".equals(typedesc)){		
			return R.drawable.yin;
			}else if("’Û”Í".equals(typedesc)){		
		
			return R.drawable.rain;
			}else if("¿◊’Û”Í".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("”Íº–—©".equals(typedesc)){	
		
			return R.drawable.default_bg;
			}else if("–°”Í".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("÷–”Í".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("¥Û”Í".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("±©”Í".equals(typedesc)){	
			return R.drawable.rain;
			}else if("Ãÿ¥Û±©”Í".equals(typedesc)){	
		
			return R.drawable.rain;
			}else if("–°—©".equals(typedesc)){	
		
			return R.drawable.snow;
			}else if("÷–—©".equals(typedesc)){	
		
			return R.drawable.snow;
			}else if("¥Û—©".equals(typedesc)){	
		
			return R.drawable.snow;
			}else if("±©—©".equals(typedesc)){	
	
			return R.drawable.snow;
			}else if("ŒÌ".equals(typedesc)){	
		
			return R.drawable.wu;
			}else if("∂≥”Í".equals(typedesc)){	
	
			return R.drawable.default_bg;
			}else if("…≥≥æ±©".equals(typedesc)){	
		
			return R.drawable.yangsha;
			}else if("∏°≥æ".equals(typedesc)){	
		
			return R.drawable.yangsha;
			}else if("—Ô…≥".equals(typedesc)){	
		
			return R.drawable.yangsha;
			}else if("«ø…≥≥æ±©".equals(typedesc)){
	
			return R.drawable.yangsha;
			}else if("ˆ≤".equals(typedesc)){
		
			return R.drawable.wu;
			}else if("±˘±¢".equals(typedesc)){
		
			return R.drawable.binbao;
			}else {
		
			return -1;
		}
		/*switch (typedesc) {
		case "«Á":
			return R.drawable.sun;
		case "∂‡‘∆":
			return R.drawable.duoyun;
		case "“ı":
			return R.drawable.yin;
		case "’Û”Í":
			return R.drawable.rain;
		case "¿◊’Û”Í":
			return R.drawable.rain;
		case "”Íº–—©":
			return R.drawable.default_bg;
		case "–°”Í":
			return R.drawable.rain;
		case "÷–”Í":
			return R.drawable.rain;
		case "¥Û”Í":
			return R.drawable.rain;
		case "±©”Í":
			return R.drawable.rain;
		case "Ãÿ¥Û±©”Í":
			return R.drawable.rain;
		case "–°—©":
			return R.drawable.snow;
		case "÷–—©":
			return R.drawable.snow;
		case "¥Û—©":
			return R.drawable.snow;
		case "±©—©":
			return R.drawable.snow;
		case "ŒÌ":
			return R.drawable.wu;
		case "∂≥”Í":
			return R.drawable.default_bg;
		case "…≥≥æ±©":
			return R.drawable.yangsha;
		case "∏°≥æ":
			return R.drawable.yangsha;
		case "—Ô…≥":
			return R.drawable.yangsha;
		case "«ø…≥≥æ±©":
			return R.drawable.yangsha;
		case "ˆ≤":
			return R.drawable.wu;
		case "±˘±¢":
			return R.drawable.binbao;
		default:
			return -1;
		}*/
	}
}
