package com.example.wuyin.themechange;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //用来记录当前主题的资源
    public static int currentTheme = R.style.BlueTheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载主题   必须在setContentView之前
        if(currentTheme!=-1){
            setTheme(currentTheme);
        }

        setContentView(R.layout.activity_main);

        Button btn_switch = (Button) findViewById(R.id.btn_switch);
        btn_switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchTheme();
            }
        });
    }

    /**
     * 切换主题
     */
    protected void switchTheme() {
        if(currentTheme==R.style.BlueTheme){
            currentTheme= R.style.OrangeTheme;
        }else {
            currentTheme= R.style.BlueTheme;
        }
        //重新创建activity，使theme生效   先finish()   然后start()
        recreate();
    }
}
