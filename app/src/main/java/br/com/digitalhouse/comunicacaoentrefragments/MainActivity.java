package br.com.digitalhouse.comunicacaoentrefragments;

import android.app.Person;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import br.com.digitalhouse.comunicacaoentrefragments.fragments.FistFragment;
import br.com.digitalhouse.comunicacaoentrefragments.fragments.SecondFragment;
import br.com.digitalhouse.comunicacaoentrefragments.interfaces.Comunicador;
import com.example.comunicaoentrefragments.R;

public class MainActivity extends AppCompatActivity implements Comunicador {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Fragment fistFragment = new FistFragment();
        replaceFragment(R.id.container2, new FistFragment());


    }

    public void replaceFragment(int container, Fragment fragment) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(container, fragment);
        transaction.commit();
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void receberMensagem(Person person) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PERSON", person);
        Fragment secondFragment = new SecondFragment();
        secondFragment.setArguments(bundle);
        replaceFragment(R.id.container1, secondFragment);

    }
}



