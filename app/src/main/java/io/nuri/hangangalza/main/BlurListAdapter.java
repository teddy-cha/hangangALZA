package io.nuri.hangangalza.main;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.AlertDialog;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.GoogleMap;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import io.nuri.hangangalza.R;
import io.nuri.hangangalza.data.BridgeData;
import io.nuri.hangangalza.data.BridgeInfoData;
import io.nuri.hangangalza.data.BridgeInfoLoadData;
import io.nuri.hangangalza.tour.TourActivity;
import io.nuri.hangangalza.utils.ImageUtils;

/**
 * Created by chayongbin on 15. 10. 19..
 */
public class BlurListAdapter extends BaseAdapter {

    public static final String API_KEY = "AIzaSyD92Bhijy3QI__bFdrdTbbdLXrXvsmX14Y";

    private LayoutInflater layoutInflater;
    private LinearLayout linearLayout;
    private ListView listView;
    private int screenHeight;
    private Context mContext;

    private BridgeInfoLoadData bridgeInfoLoadData;
    private ArrayList<BridgeInfoData> bridgeInfoArrayList = new ArrayList<BridgeInfoData>();

    private String name;
    private int id;

    public BlurListAdapter(Activity context, String name, String id) {
        layoutInflater = LayoutInflater.from(context);
        screenHeight = ImageUtils.getScreenHeight(context);
        this.name = name;
        mContext = context;
        bridgeInfoLoadData = new BridgeInfoLoadData(context);
        bridgeInfoArrayList = bridgeInfoLoadData.getJsonData();
        this.id = Integer.parseInt(id);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        switch (getItemViewType(position)) {
            case 0:
                return getFirstView(position, convertView, parent, name, id-1);
            case 1:
                return getSecondView(position, convertView, parent);
            default:
                return null;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return 1;
    }

    private View getFirstView(int position, View convertView, ViewGroup parent, String name, int id) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.activity_page_layout,
                    parent, false);

            // 페이지 뷰를 전체적으로 셋팅하는 항목들.

            linearLayout = (LinearLayout) convertView.findViewById(R.id.bridge_name);
            linearLayout.setMinimumHeight(screenHeight);
            convertView.setId(R.id.id0);

            createToBridgeName(convertView, name);
            createToBridgeInfo(convertView, bridgeInfoArrayList.get(id).getBridge_info());
            createToBridgeMap(convertView, bridgeInfoArrayList.get(id).getBridge_lat(),
                    bridgeInfoArrayList.get(id).getBridge_lng());

            String[] array;

            array = bridgeInfoArrayList.get(id).getBridge_tourist().split(", ");

            ArrayList<String> arrayList = new ArrayList<String>();
            for (int i = 0; i < array.length; i++){
                arrayList.add(array[i]);
            }
            createToBridgeTourList(convertView, arrayList);

            createToBridgeHistory(convertView, bridgeInfoArrayList.get(id).getBridge_history());

            createToBikeMap(convertView, bridgeInfoArrayList.get(id).getBridge_bike_lat(), bridgeInfoArrayList.get(id).getBridge_bike_lng());

        }

        return convertView;

    }

    private void createToBridgeName(View view, String name){
        TextView textView = (TextView) view.findViewById(R.id.name);
        textView.setText(name);
    }

    private void createToBridgeInfo(View view, String info){

        TextView textView = (TextView) view.findViewById(R.id.tv_bridge_info_content);
        textView.setText(info);

    }

    private void createToBridgeMap(View view, String lat, String lng){

        ImageView imageView = (ImageView) view.findViewById(R.id.img_bridge_static_map);

        String url = "https://maps.googleapis.com/maps/api/staticmap" +
                "?center=" + lat + "," + lng +
                "&zoom=13" +
                "&size=300x200" +
                "&maptype=roadmap" +
                "&markers=color:red%7C" + lat + "," + lng +
                "&key=" + API_KEY;

        Log.e("URL : ", url);

        Glide.with(mContext).load(url).into(imageView);

    }

    private void createToBridgeTourList(View view, ArrayList<String> tourList) {

        listView = (ListView) view.findViewById(R.id.tour_list);
        listView.setAdapter(new BridgeTourListAdapter(mContext, tourList));

        ViewGroup.LayoutParams params = listView.getLayoutParams();

        params.height = ( int ) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                50 * tourList.size() , view.getResources().getDisplayMetrics());

        listView.setLayoutParams(params);

        listView.setOnItemClickListener(new ListViewItemClickListener(tourList));

    }

    private void createToBridgeHistory(View view, String history){

        TextView textView = (TextView) view.findViewById(R.id.tv_bridge_history_content);
        textView.setText(history);
    }

    private void createToBikeMap(View view, String lat, String lng){

        ImageView imageView = (ImageView) view.findViewById(R.id.img_bridge_static_map_bike);

        String url = "https://maps.googleapis.com/maps/api/staticmap" +
                "?center=" + lat + "," + lng +
                "&zoom=13" +
                "&size=300x200" +
                "&maptype=roadmap" +
                "&markers=color:red%7C" + lat + "," + lng +
                "&key=" + API_KEY;

        Glide.with(mContext).load(url).into(imageView);

    }


    private class ListViewItemClickListener implements AdapterView.OnItemClickListener{
        ArrayList<String> tourList;

        public ListViewItemClickListener(ArrayList<String> tourList){
            this.tourList = tourList;
        }


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(mContext, R.style.AppTheme));
            builder.setTitle(tourList.get(position))
                    .setMessage("죄송합니다. 현재 기능은 개발 진행중입니다.")
                    .setCancelable(false)
                    .setNegativeButton("확인", new DialogInterface.OnClickListener() {
                        // 취소 버튼 클릭시 설정
                        public void onClick(DialogInterface dialog, int whichButton) {
                            dialog.cancel();
                        }
                    });
            android.app.AlertDialog dialog = builder.create();    // 알림창 객체 생성
            dialog.show();    // 알림창 띄우기


        }
    }


    // 리스트를 유지하는 부분
    private View getSecondView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = layoutInflater.inflate(
                    android.R.layout.simple_list_item_1, parent, false);
        }

        TextView txt = (TextView) convertView;
        txt.setText("Position :" + position);

        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }
}
