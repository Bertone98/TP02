package com.example.bertone.tp02;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bertone.tp02.RecyclerInterface;

import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MeuViewHolder>   {


    public static RecyclerInterface recyclerInterface;
    Context context;
    private List<Contatos> minhaLista;
    public MeuAdapter(Context ctx, List<Contatos> list, RecyclerInterface clickRecyclerInterface)
    {
        this.context = ctx;
        this.minhaLista = list;
        this.recyclerInterface = clickRecyclerInterface;
    }


    @Override
    public void onBindViewHolder(MeuViewHolder viewHolder, final int i) {
        Contatos contato = minhaLista.get(i);
        viewHolder.txtNome.setText(i + ":" +contato.getNome());
        viewHolder.txtTelefone.setText(contato.getTelefone());
        viewHolder.txtEmail.setText(contato.getEmail());
        viewHolder.btnDeleta.setOnClickListener((new View.OnClickListener()
        {
            public void onClick (View v){
                Contatos contatoDeletado = minhaLista.get(i);
                minhaLista.remove(contatoDeletado);
                notifyItemRemoved(i);
                notifyDataSetChanged();
            } } ));
    }


    @Override
    public MeuViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listacontatos,
                viewGroup, false);
        return new MeuViewHolder(itemView);
    }
    @Override
    public int getItemCount() {

        return minhaLista.size();
    }
package br.com.devix.reclyclerview;

    public interface RecyclerInterface {
        void onItemClick(Object object);
    }
}
