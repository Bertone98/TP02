package com.example.bertone.tp02;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.bertone.tp02.MeuAdapter;
import com.example.bertone.tp02.R;

import static com.example.bertone.tp02.MeuAdapter.recyclerInterface;


public class MeuViewHolder extends RecyclerView.ViewHolder {

    protected TextView txtNome;
    protected TextView txtTelefone;
    protected TextView txtEmail;
    protected ImageButton btnDeleta;


    public MeuViewHolder(final View itemView) {
        super(itemView);
        txtNome = itemView.findViewById(R.id.txtNome);
        txtTelefone = itemView.findViewById(R.id.txtTelefone);
        txtEmail = itemView.findViewById(R.id.txtEmail);
        btnDeleta = itemView.findViewById(R.id.btnDelete);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerInterface.onItemClick(minhaLista.get(getLayoutPosition()));
            }});
    }
}
}