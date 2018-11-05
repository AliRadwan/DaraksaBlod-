package com.example.wekaradwan.daraksablood;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by weka radwan on 6/23/2018.
 */

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.DataViewHolder> {

    Context mContext;
    List<Data> mData;
    Dialog myDialog;


    public RecyclerviewAdapter(Context mcontext, List<Data> mData) {
        this.mContext = mcontext;
        this.mData = mData;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.item_a_negative,parent,false);
        final DataViewHolder dataViewHolder = new DataViewHolder(view);




        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.call_dialog);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));




        dataViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


//                TextView dialog_name_tv = myDialog.findViewById(R.id.dialog_name_id);
//                TextView dialog_phone_tv =  myDialog.findViewById(R.id.dialog_phone_id);
//                ImageView dialog_contact_img = myDialog.findViewById(R.id.dialog_img);
//                dialog_name_tv.setText(mData.get(dataViewHolder.getAdapterPosition()).getName());
//                dialog_phone_tv.setText(mData.get(dataViewHolder.getAdapterPosition()).getPhone());
//                dialog_contact_img.setImageResource(mData.get(dataViewHolder.getAdapterPosition()).getImage());
//
//
//                myDialog.show();

            }
        });

        return dataViewHolder;
    }

    @Override
    public void onBindViewHolder(final DataViewHolder holder, final int position) {

        holder.nameTextView.setText(mData.get(position).getName());
       // holder.phoneTextView.setText(mData.get(position).getPhone());
        holder.homeTextView.setText(mData.get(position).getHome());
        holder.callImageView.setImageResource(mData.get(position).getImage());

//        final String phone = mData.get(position).getPhone();
//        holder.callImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_DIAL);
//                callIntent.setData(Uri.parse("tel:" +phone));
//                mcontext.startActivity(callIntent);
//
//            }
//        });


        holder.callImageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                TextView dialog_name_tv = myDialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv =  myDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_contact_img = myDialog.findViewById(R.id.dialog_img);

                dialog_name_tv.setText(mData.get(holder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(holder.getAdapterPosition()).getPhone());
                dialog_contact_img.setImageResource(R.drawable.ic_dialog_name);


                final int phone = mData.get(position).getPhone();


                Button buttonCall = myDialog.findViewById(R.id.dialog_btn_call);
                buttonCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:" +phone));
                        mContext.startActivity(callIntent);
                    }
                });

                Button buttonMessage = myDialog.findViewById(R.id.dialog_btn_msg);
                buttonMessage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent messageIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("sms:" +phone));
                        messageIntent.putExtra("sms_body","help me");
                        mContext.startActivity(messageIntent);
                    }
                });



                myDialog.show();

            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class DataViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout item_a_negative_design;

        private TextView nameTextView;
        private TextView phoneTextView;
        private TextView homeTextView;
        private ImageView callImageView;
        public DataViewHolder(View itemView) {
            super(itemView);

            nameTextView = itemView.findViewById(R.id.tvName);
            phoneTextView = itemView.findViewById(R.id.dialog_phone_id);
            homeTextView = itemView.findViewById(R.id.tvHome);
            callImageView = itemView.findViewById(R.id.imgPhone);


        }
    }
}
