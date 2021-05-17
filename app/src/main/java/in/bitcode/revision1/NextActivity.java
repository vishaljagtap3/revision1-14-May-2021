package in.bitcode.revision1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class NextActivity extends Activity {

    private TextView mTxtName;
    private EditText mEdtTagLine;
    private Button mBtnSubmit;
    private ImageView mImgCountry;
    private LinearLayout mMainContainer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        //get the input
        Intent intent = getIntent();
        /*
        Bundle bundle = intent.getExtras();
        String name = bundle.getString("name", "NA");
        int imageId = bundle.getInt("imageid");
        */

        String name = intent.getStringExtra("name");
        int imageId = intent.getIntExtra("imageid", R.drawable.in_flag);
        mTxtName.setText(name);
        mImgCountry.setImageResource(imageId);

        mBtnSubmit.setOnClickListener(new BtnSubmitClickListener());

    }

    class BtnSubmitClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            intent.putExtra("tagline", mEdtTagLine.getText().toString());
            setResult(1, intent);
            finish();
        }
    }

    private void init(){
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

        mImgCountry = new ImageView(this);
        mImgCountry.setLayoutParams(new ViewGroup.LayoutParams(300, 300) );
        mMainContainer.addView(mImgCountry);

        setContentView(mMainContainer);
    }

}
