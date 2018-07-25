package digitalhouse.com.viewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;

import java.util.List;

public class FragmentPageAdapter extends FragmentStatePagerAdapter {
    List<Fragment> lista;

    public FragmentPageAdapter(FragmentManager fm, List<Fragment> lista) {
        super(fm);
        this.lista = lista;
    }

    @Override
    public Fragment getItem(int i) {
        return lista.get(i);
    }

    @Override
    public int getCount() {
        return lista.size();
    }
}
