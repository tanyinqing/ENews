package eNews.customview;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.PopupWindow;
import eNews.app.R;

/**
 * 
 * @author 
 * @date 2016-9-12 �Զ���MorePopupWindow��
 */
public class MorePopupWindow extends PopupWindow {
	int h;
	int w;
	private View conentView;

	public MorePopupWindow(Activity activity) {
		// TODO Auto-generated constructor stub

		LayoutInflater inflater = LayoutInflater.from(activity);
		conentView = inflater.inflate(R.layout.more_popupwindow, null);

		DisplayMetrics metrics = new DisplayMetrics();
		activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);
		h = metrics.heightPixels;
		w = metrics.widthPixels;
		// ����SelectPicPopupWindow��View
		this.setContentView(conentView);
		// ����SelectPicPopupWindow��������Ŀ�
		this.setWidth(w / 2);
		// ����SelectPicPopupWindow��������ĸ�
		this.setHeight(LayoutParams.WRAP_CONTENT);
		// ����SelectPicPopupWindow��������ɵ��
		this.setFocusable(true);
		this.setOutsideTouchable(true);
		// ˢ��״̬
		this.update();
		// ʵ����һ��ColorDrawable��ɫΪ��͸��
		ColorDrawable dw = new ColorDrawable(0000000000);
		// ��back���������ط�ʹ����ʧ,������������ܴ���OnDismisslistener �����������ؼ��仯�Ȳ���
		this.setBackgroundDrawable(dw);
		// this.setAnimationStyle(R.style.AnimationPreview);

		setOnclickListener(activity);

	}

	private void setOnclickListener(Activity activity) {

		conentView.findViewById(R.id.shareLy).setOnClickListener(
				(OnClickListener) activity);
		conentView.findViewById(R.id.collectLy).setOnClickListener(
				(OnClickListener) activity);
		conentView.findViewById(R.id.shareLyqq).setOnClickListener(
				(OnClickListener) activity);

	}

	@Override
	public void showAsDropDown(View anchor) {
		// TODO Auto-generated method stub
		super.showAsDropDown(anchor, -300, 0);
	}

}