package com.example.rabbitink;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Context;
        import android.os.Bundle;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.AdapterView;
        import android.widget.BaseAdapter;
        import android.widget.GridView;
        import android.widget.ImageView;
        import android.widget.Toast;

public class Embroidery_Regular_Design extends AppCompatActivity {
    Integer[] embroidery = {R.drawable.combo, R.drawable.dikis, R.drawable.gift, R.drawable.hat, R.drawable.hattwo, R.drawable.shirt,R.drawable.starrbucks,R.drawable.patch,R.drawable.linex,
            R.drawable.one,R.drawable.two,R.drawable.thee,R.drawable.four,R.drawable.five, R.drawable.six, R.drawable.seven};
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_embroidery__regular__design);

        GridView grid = (GridView)findViewById(R.id.gridView);
        final ImageView pic = (ImageView)findViewById(R.id.imgLarge);
        grid.setAdapter(new ImageAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener( ){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext( ), "Embroidery Designs ", Toast.LENGTH_SHORT).show( );
                pic.setImageResource(embroidery[position]);
            }
        });
    }
    class ImageAdapter extends BaseAdapter {

        private Context context;
        public ImageAdapter (Context c) {
            context=c;
        }

        @Override
        public int getCount() {
            return embroidery.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(embroidery[position]);
            pic.setScaleType(ImageView.ScaleType.FIT_XY);
            pic.setLayoutParams(new GridView.LayoutParams(330,300));
            return pic;
        }
    }
}