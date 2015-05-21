package example.deeplinking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;


public class DeepLinking extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_linking);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();

        TextView deepLinkTV = (TextView) findViewById(R.id.deepLinkTV);
        deepLinkTV.setText("Action: "+action+"\n URI: "+data.toString());
    }
}
