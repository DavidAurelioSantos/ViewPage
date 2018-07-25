package digitalhouse.com.viewpage;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicialização da lista
        list = new ArrayList<>();

        //Criação dos Fragmentos
        Fragment_blue fb = new Fragment_blue();
        Fragment_red fr = new Fragment_red();
        Fragment_green fg = new Fragment_green();

        //Adicionando os Fragmentos na lista
        list.add(fb);
        list.add(fr);
        list.add(fg);

        //Criando um Adapter para o Fragment
        //Ao criar o Adapter, passamos um FragmentManager e a lista de Fragments que será exibida
        FragmentPageAdapter fragmentPageAdapter = new FragmentPageAdapter(getSupportFragmentManager(),list);

        //Criando um objeto ViewPager e associando o com o ViwerPager do XML
        ViewPager viewPager = findViewById(R.id.viewPager);
        //Inserindo o adapter ao viewPager
        viewPager.setAdapter(fragmentPageAdapter);
    }
}
