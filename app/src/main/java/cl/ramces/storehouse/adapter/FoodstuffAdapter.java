package cl.ramces.storehouse.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.Query;

import cl.ramces.storehouse.R;
import cl.ramces.storehouse.data.Nodes;
import cl.ramces.storehouse.models.Foodstuff;

/**
 * Created by sebas on 12-09-2017.
 */

public class FoodstuffAdapter extends FirebaseRecyclerAdapter<Foodstuff, FoodstuffAdapter.ViewHolder> {


    public FoodstuffAdapter() {
        super(Foodstuff.class, R.layout.list_item_foodstuff, ViewHolder.class, new Nodes().todayShift());
    }


    @Override
    protected void populateViewHolder(ViewHolder viewHolder, Foodstuff model, int position) {

        viewHolder.food.setText(model.getFood());
        viewHolder.quantity.setText(String.valueOf(model.getQuantity()));
        viewHolder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        viewHolder.less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        viewHolder.detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView food, quantity;
        private ImageView add, less, detail;

        public ViewHolder(View itemView) {
            super(itemView);

            food = (TextView) itemView.findViewById(R.id.foodTv);
            quantity = (TextView) itemView.findViewById(R.id.quantityTv);
            add = (ImageView) itemView.findViewById(R.id.addBtn);
            less = (ImageView) itemView.findViewById(R.id.removeBtn);
            detail = (ImageView) itemView.findViewById(R.id.detailBtn);
        }



    }
}
