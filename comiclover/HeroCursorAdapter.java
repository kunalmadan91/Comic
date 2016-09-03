package com.kunalmadan.android.comiclover;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.kunalmadan.android.comiclover.database.SuperHeroColumns;
import com.squareup.picasso.Picasso;

/**
 * Created by KUNAL on 28-08-2016.
 */
public class HeroCursorAdapter extends CursorAdapter {
    Context mContext;
    private static int sLoaderID;
    private static final String LOG_TAG = HeroCursorAdapter.class.getSimpleName();

    //ViewHolder mVh;
    public static class ViewHolder {
        public final ImageView imageView;
        public final TextView textView;

        public ViewHolder(View view){
            imageView = (ImageView) view.findViewById(R.id.image);
            textView = (TextView) view.findViewById(R.id.text);
        }
    }


    public HeroCursorAdapter(Context context, Cursor c, int flags, int LoaderID) {
        super(context, c, flags);
        Log.d(LOG_TAG, "In constructor");
        mContext = context;
        sLoaderID = LoaderID;
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        Log.d(LOG_TAG, "In newview");
        int layoutId = R.layout.hero_item;
        View view = LayoutInflater.from(context).inflate(layoutId, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        view.setTag(viewHolder);
        return view;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder viewHolder = (ViewHolder) view.getTag();

        Log.d(LOG_TAG, "In bind View");
        int name = cursor.getColumnIndex(SuperHeroColumns.NAME);

        final String heroName = cursor.getString(name);

        viewHolder.textView.setText(heroName);


        int imageIndex = cursor.getColumnIndex(SuperHeroColumns.THUMBNAIL);

        final String thumbnail = cursor.getString(imageIndex);

        //Log.v("thumbnail", "thumbnail>>>" + thumbnail + "" +heroName);
        //String url = thumbnail+"/portrait_uncanny.jpg";
        String url = thumbnail+"/portrait_fantastic.jpg";

        Log.v("thumbnail", "thumbnail>>>" + url + "  " +heroName);

        if(url.equals("http://i.annihil.us/u/prod/marvel/i/mg/b/40/image_not_available/portrait_fantastic.jpg")) {
            Log.v(LOG_TAG,"idhar aagya mai");
            viewHolder.imageView.setImageResource(R.drawable.img);
        }

        else {
            Picasso.with(mContext)
                    .load(url).placeholder(R.drawable.icon)
                    .error(R.drawable.icon)
                    .into(viewHolder.imageView);
        }





        /*Picasso.with(mContext)
                .load(url)
                .networkPolicy(NetworkPolicy.OFFLINE)
                .into(viewHolder.imageView);*/

       /* Picasso.with(mContext)
                .load(Url)
                .placeholder(R.drawable.icon)
                .error(R.drawable.icon)
                .into(imageView);
*/
    }
}
