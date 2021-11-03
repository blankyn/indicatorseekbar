package me.blankm.indicatorseekbar.fragment;

import android.view.View;

import me.blankm.indicatorseekbar.R;
import me.blankm.widget.IndicatorSeekBar;



public class IndicatorFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.custom_indicator;
    }

    @Override
    protected void initView(View root) {
        //custom indicator text by java code
        IndicatorSeekBar seekBarWithProgress = root.findViewById(R.id.custom_indicator_by_java_code);
        seekBarWithProgress.setIndicatorTextFormat("${PROGRESS} %");

        //custom indicator text by java code
        IndicatorSeekBar seekBarWithTickText = root.findViewById(R.id.custom_indicator_by_java);
        seekBarWithTickText.setIndicatorTextFormat("${TICK_TEXT} --");
    }
}
