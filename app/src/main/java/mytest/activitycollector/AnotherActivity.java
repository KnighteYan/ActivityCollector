package mytest.activitycollector;

import android.os.Bundle;

public class AnotherActivity extends BaseActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_another);
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    ActivityCollector.finishAll();
  }
}
