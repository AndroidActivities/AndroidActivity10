package cat.udl.eps.fragments.ejbase;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Jaume and Nil on 02/05/17.
 *
 */

public class DetailActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.detail);
        DetailFrag detalle = (DetailFrag) getFragmentManager().findFragmentById(R.id.frag_capt);
        detalle.showText(getIntent().getStringExtra("value"));
    }
}

