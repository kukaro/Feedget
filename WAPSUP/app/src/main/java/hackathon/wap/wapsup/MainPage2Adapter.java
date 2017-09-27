package hackathon.wap.wapsup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MainPage2Adapter extends BaseAdapter {
    private ArrayList<MainPage1Item> feedgetMarketList = new ArrayList<MainPage1Item>();



    @Override
    public int getCount() {
        return feedgetMarketList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.main_page1_home_item, null);
        }


        MainPage1Item mainPage1Item = feedgetMarketList.get(position);


        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return feedgetMarketList.get(position);
    }

    public void addItem(String... items) {
        MainPage1Item item = new MainPage1Item();


        feedgetMarketList.add(item);
    }
}