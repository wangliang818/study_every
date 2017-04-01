package com.example.administrator.life_cycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.orhanobut.logger.Logger;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.ddd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=    new Intent(MainActivity.this,SendtoActivity.class);
                startActivity(intent);
            }
        });
        Toast.makeText(this,"onCreate创建时被调用",Toast.LENGTH_SHORT).show();

       /* try {
            Thread.sleep(5000);

            Intent intent=     new Intent(this,SendtoActivity.class);
            startActivity(intent);

        } catch (Exception e) {
            e.printStackTrace();
        }*/

        Logger.e("onCreate");
    }


    /**
     * Activity从后台重新回到前台时被调用
     */
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart从后台重新回到前台时被调用",Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart创建或者从后台重新回到前台时被调用",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume创建或者从被覆盖、后台重新回到前台时被调用",Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause被覆盖到下面或者锁屏时被调用",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStop_退出当前Activity或者跳转到新Activity时被调用",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"_onDestroy_退出当前Activity时被调用,调用之后Activity就结束了",Toast.LENGTH_SHORT).show();
    }


}

