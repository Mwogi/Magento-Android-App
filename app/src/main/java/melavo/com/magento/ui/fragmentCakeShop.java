package melavo.com.magento.ui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import melavo.com.magento.R;
public class fragmentCakeShop extends Fragment {
    public fragmentCakeShop() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_cake_shop, container, false);
        return inflater.inflate(R.layout.fragment_cake_shop, container, false);
    }
}
