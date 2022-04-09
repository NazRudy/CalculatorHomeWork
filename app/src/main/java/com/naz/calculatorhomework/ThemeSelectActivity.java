package com.naz.calculatorhomework;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.naz.calculatorhomework.storage.Theme;

public class ThemeSelectActivity extends AppCompatActivity {

    public static final String SELECTED_THEME="SELECTED_THEME";
    public static final String CHOOSED_THEME="CHOOSED_THEME";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_select);

        LinearLayout root=findViewById(R.id.root);

        Theme selectedTheme = (Theme) getIntent().getSerializableExtra(SELECTED_THEME);

        for (Theme theme: Theme.values()){
            View itemView=getLayoutInflater().inflate(R.layout.item_theme, root, false);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent resultIntent=new Intent();
                    resultIntent.putExtra(CHOOSED_THEME, theme);
                    setResult(Activity.RESULT_OK, resultIntent);
                    finish();
                }
            });
            TextView title = itemView.findViewById(R.id.theme_title);
            ImageView check = itemView.findViewById(R.id.theme_checked);

            title.setText(theme.getTitle());
            if (theme.equals(selectedTheme)){
                check.setVisibility(View.VISIBLE);
            }else {
                check.setVisibility(View.GONE);
            }

            root.addView(itemView);
        }
    }

}