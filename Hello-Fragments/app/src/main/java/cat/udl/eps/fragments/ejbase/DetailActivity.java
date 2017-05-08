package cat.udl.eps.fragments.ejbase;

import android.app.Activity;
import android.os.Bundle;

import cat.udl.eps.fragments.ejbase.DetailFrag;
import cat.udl.eps.fragments.ejbase.R;

/**
 * Created by Jaume and Nil on 03/05/2017.
 */

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);
        DetailFrag detalle = (DetailFrag) getFragmentManager().findFragmentById(R.id.frag_series);
        detalle.showText(getIntent().getStringExtra(ListFrag.VALUE));
    }
}
