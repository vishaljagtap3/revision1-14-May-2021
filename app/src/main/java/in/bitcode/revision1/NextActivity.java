package in.bitcode.revision1;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class NextActivity extends Activity {

    private TextView mTxtName;
    private EditText mEdtTagLine;
    private Button mBtnSubmit;
    private LinearLayout mMainContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ViewGroup.LayoutParams layoutParams =
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        mMainContainer = new LinearLayout(this);
        mMainContainer.setLayoutParams(layoutParams);
        mMainContainer.setOrientation(LinearLayout.VERTICAL);

        mTxtName = new TextView(this);
        mTxtName.setLayoutParams(layoutParams);
        mTxtName.setText("Hello Android!");
        mTxtName.setTextSize(40);
        mMainContainer.addView(mTxtName);

        mEdtTagLine = new EditText(this);
        mEdtTagLine.setLayoutParams(layoutParams);
        mMainContainer.addView(mEdtTagLine);

        mBtnSubmit = new Button(this);
        mBtnSubmit.setText(R.string.label_btn_submit);
        mBtnSubmit.setLayoutParams(layoutParams);
        mMainContainer.addView(mBtnSubmit);

        setContentView(mMainContainer);

    }

}
