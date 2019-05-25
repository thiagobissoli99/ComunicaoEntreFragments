package br.com.digitalhouse.comunicacaoentrefragments.fragments;


import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import br.com.digitalhouse.comunicacaoentrefragments.Model.Pessoa;
import br.com.digitalhouse.comunicacaoentrefragments.interfaces.Comunicador;
import com.example.comunicaoentrefragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FistFragment extends Fragment {

    private Comunicador comunicador ;


    public FistFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
            }catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fist, container, false);

        Button btnSend = view.findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Colocar o Envio de Dados
                Pessoa pessoa = new Pessoa("Tairo" , "Professor",30);

            }
        });

        return view;

    }

}
