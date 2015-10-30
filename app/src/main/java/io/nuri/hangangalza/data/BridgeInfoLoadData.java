package io.nuri.hangangalza.data;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by chayongbin on 15. 10. 26..
 */
    public class BridgeInfoLoadData {

    private Context mContext;
    private String json;

    public BridgeInfoLoadData(Context context) {
        mContext = context;
    }

    public ArrayList<BridgeInfoData> getJsonData() {

        ArrayList<BridgeInfoData> bridgeInfoList = new ArrayList<BridgeInfoData>();

        JSONArray bridgeInfoJsonArray;
        int bridge_id;
        String bridge_info;
        String bridge_lat;
        String bridge_lng;
        String bridge_bike_name;
        String bridge_bike_lat;
        String bridge_bike_lng;
        String bridge_metro;
        String bridge_bus;
        String bridge_tourist;
        String bridge_history;


        String json = getJson();
        BridgeInfoData bridgeInfoData;

        try {

            JSONObject bridge = new JSONObject(json);
            bridgeInfoJsonArray = bridge.getJSONArray("bridge");
            for (int i = 0; i < bridgeInfoJsonArray.length(); i++) {
                JSONObject jsonObject = bridgeInfoJsonArray.getJSONObject(i);
                bridge_id = jsonObject.getInt("bridge_id");
                bridge_info = jsonObject.getString("bridge_info");
                bridge_lat = jsonObject.getString("bridge_lat");
                bridge_lng = jsonObject.getString("bridge_lng");
                bridge_bike_name = jsonObject.getString("bridge_bike_name");
                bridge_bike_lat = jsonObject.getString("bridge_bike_lat");
                bridge_bike_lng = jsonObject.getString("bridge_bike_lng");
                bridge_metro = jsonObject.getString("bridge_metro");
                bridge_bus = jsonObject.getString("bridge_bus");
                bridge_tourist = jsonObject.getString("bridge_tourist");
                bridge_history = jsonObject.getString("bridge_history");

                bridgeInfoData = new BridgeInfoData(bridge_id, bridge_info, bridge_lat,
                        bridge_lng, bridge_bike_name,bridge_bike_lat, bridge_bike_lng, bridge_metro,
                        bridge_bus, bridge_tourist, bridge_history);
                bridgeInfoList.add(bridgeInfoData);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return bridgeInfoList;
    }

    public String getJson() {

        json = "{\n" +
                "\t\"bridge\" : \n" +
                "    [\n" +
                "        {\n" +
                "            \"bridge_id\" : 1,\n" +
                "            \"bridge_info\" : \" 경기 고양시 덕양구 행주동과 강서구 개화동을 잇는 교량으로, 빛의 관문이라는 의미를 지니고 있다.\\n이 교량의 완공으로 김포지역과 의정부 · 문산방면을 왕래하는 차량이 서울 도심지를 경유하지 않고 직행할 수 있게 되었다.  \",\n" +
                "            \"bridge_lat\" : \"37.598134\",\n" +
                "            \"bridge_lng\" : \"126.809878\",\n" +
                "            \"bridge_bike_name\" : \"강서한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5850931\",\n" +
                "            \"bridge_bike_lng\" : \"126.8204220\",\n" +
                "            \"bridge_metro\" : \"(경의중앙)행신역 능곡역\",\n" +
                "            \"bridge_bus\" : \"(일반)85-1 (마을)011 012 \",\n" +
                "            \"bridge_tourist\" : \"행주산성\",\n" +
                "            \"bridge_history\" : \" 1978년에 준공된 행주대교는 교량의 노후화로 인하여 1992년부터 10톤 이상의 차량에 대한 통행제한을 실시하기에 이르렀다. 한편 주변에 시가지 개발이 활발해짐에 따라 증가하는 교통량을 흡수하기에는 역부족이었다. 이에 따라 교통난을 해소하기 위하여 1987년에 공사를 시작하여 1992년에 완공할 목표로 신교 건설공사를 시작하였으나, 구조상의 문제로 1992년 7월 31일 일부 구간이 무너져 내려 복구공사를 실시한 후 1995년 5월에 하류쪽(북단에서 남단 방향) 교량을 완공하였다. 상류쪽 교량은 2000년 12월에 완공되었다. 이렇게 해서 행주대교는 왕복 6차로의 교량이 되었다. 그리고 구 행주대교는 폐쇄되었다.\\n 공공 시설물에 대한 미관을 중시하여 1997년 5월 당시 한강 다리 중에서 최초로 조명시설이 설치되었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 2,\n" +
                "            \"bridge_info\" : \" 강서구 방화동과 경기도 고양시 강매동을 잇는 다리다.인천국제공항고속도로 구간 중 서울특별시 입구에 건설된 다리이다. 한강을 횡단하는 다리 가운데 27번째로 건설된 최장 교량이며, 특히 중앙부 540m의 아치트러스(arch truss)교는 비행기의 이착륙을 형상화한 디자인으로 미관이 뛰어나서 남쪽의 개화산과 북쪽의 행주산성 등 주변 경관과 조화를 이루고 있다.  \",\n" +
                "            \"bridge_lat\" : \"37.588520\",\n" +
                "            \"bridge_lng\" : \"126.826761\",\n" +
                "            \"bridge_bike_name\" : \"강서한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5850931\",\n" +
                "            \"bridge_bike_lng\" : \"126.8204220\",\n" +
                "            \"bridge_metro\" : \"(5)방화역, (경의중앙)강매역\",\n" +
                "            \"bridge_bus\" : \"(마을)강서07\",\n" +
                "            \"bridge_tourist\" : \"강서습지 생태공원, 덕양산, 행주산성, 꿩고개공원, 방화공원\",\n" +
                "            \"bridge_history\" : \" 1995년 12월 인천국제공항고속도로의 전 구간 착공과 함께 동시에 착공하였다. 그리고 2000년 11월 20일 인천국제공항고속도로의 전 구간 완공과 동시에 한강 다리 중 27번째로 개통하였다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 3,\n" +
                "            \"bridge_info\" : \" 강서구 가양동과 마포구 상암동을 잇는 교량으로, 새천년을 향한 희망을 상징한다.\\n 화곡 IC와 상암IC가 연결되어 전방향 진출입이 가능하며, 서울 관문의 주요 교량으로서 아름다운 한강의 경관을 조망할 수 있다.\\n 한강에 있는 다른 다리에 비해 교각과 교각 사이가 넓어 시각적으로 매우 간결한 느낌을 준다.\\n 이 다리는 인천공항고속도로와 연결되어 있어 강북에서 인천으로 연결하는 주요 다리가 되었다. 서울특별시 서부지역의 도시발전과 함께 상암동 월드컵경기장을 중심으로 한 신도시 개발에도 영향을 미쳤다.\",\n" +
                "            \"bridge_lat\" : \"37.569365\",\n" +
                "            \"bridge_lng\" : \"126.86102\",\n" +
                "            \"bridge_bike_name\" : \"난지한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5653357\",\n" +
                "            \"bridge_bike_lng\" : \"126.8804424\",\n" +
                "            \"bridge_metro\" : \"(9)가양역\",\n" +
                "            \"bridge_bus\" : \"(지선)6631 6642 6712 6645 (일반)1002\",\n" +
                "            \"bridge_tourist\" : \"노을공원, 월드컵공원, 하늘공원, 난지캠핑장, 난지한강공원\",\n" +
                "            \"bridge_history\" : \" 1994년 12월 착공하였으며 2002년 5월 31일에 준공되었다.\\n 가양대교는 한 때 공암대교라는 이름으로 불리기도 했는데, 1995년 1월 서울특별시에서 지명위원회를 열어 회의한 결과 가양대교의 위치가 옛 공암나루터였기 때문에 이와 같은 명칭을 사용하기로 했었다. 그러나 지역주민들의 반대에 부딪혀 같은 해 12월에 다시 연 지명위원회에서 본래대로 가양대교라는 명칭을 사용하기로 결정했다.\\n 야간조명이 아름다워 2002년 제17회 월드컵축구대회 때는 서울월드컵경기장을 찾은 내·외국인들에게 파노라마식 조명을 선보인 곳으로 유명하다. \"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 4,\n" +
                "            \"bridge_info\" : \"마포구 망원동과 영등포구 양평동을 연결하는 대교로서 월드컵의 환희를 표현했다.\\n 제2한강교(현재 양화대교)의 교통량 분산과, 김포공항에서 도심으로 진입하는 시간을 단축시키는 효과를 가져왔다.\\n 한강의 12번째 교량으로서 성수대교와 같은 트러스 공법으로 세워졌는데, 다리의 외측이 반달형으로 되어 있어 특유한 조형미를 갖추고 있으며, 덕분에 성산대교의 야경은 다른 곳보다 아름답다.\",\n" +
                "            \"bridge_lat\" : \"37.553036\",\n" +
                "            \"bridge_lng\" : \"126.891634\",\n" +
                "            \"bridge_bike_name\" : \"망원한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5563440\",\n" +
                "            \"bridge_bike_lng\" : \"126.8942576\",\n" +
                "            \"bridge_metro\" : \"(9)신목동역 (6)마포구청역\",\n" +
                "            \"bridge_bus\" : \"(간선)602 661 670 (마을)영등포02\",\n" +
                "            \"bridge_tourist\" : \"평화의 공원, 서울월드컵경기장, 망원한강공원, 안양천, 양화한강공원\",\n" +
                "            \"bridge_history\" : \" 1977년 4월에 착공해 1980년 6월 30일에 개통되었다. 한강에서 12번째로 건설되었다.\\n 성산대교의 건설로 인하여 교량의 아름다움에 대한 관심이 증대되었을 뿐만 아니라, 인접한 양화대교 및 신촌로의 교통량이 분산됨으로써 김포가도와 도심지의 연결이 원활해졌다.\\n 성산대교의 차량 통행량은 2007년까지 꾸준히 증가하여 2007년에 일일 평균 19만 980대를 기록하였으나 이후 감소하여 2009년에는 18만 9,313대를 기록하였다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 5,\n" +
                "            \"bridge_info\" : \" 마포구 합정동과 영등포구 양평동 사이를 연결하는 교량으로, 빛의 개화와 번영, 화합을 상징한다. 지금은 영등포 인천 방면, 김포공항으로 가는 시간을 단축하는 서울의 서부관문 역할을 하고 있다. 1962년 6월에 착공해 1965년 1월 25일 준공한 구교(舊橋)와 1979년 1월에 착공해 1982년 2월 2일 준공한 구교 위측의 신교(新橋) 2개의 다리를 합쳐서 부르는 이름이다. \",\n" +
                "            \"bridge_lat\" : \"37.543718\",\n" +
                "            \"bridge_lng\" : \"126.904398\",\n" +
                "            \"bridge_bike_name\" : \"양화한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5441048\",\n" +
                "            \"bridge_bike_lng\" : \"126.8926554\",\n" +
                "            \"bridge_metro\" : \"(9)선유도역 (2)(9)당산역 (2)(6)합정역\",\n" +
                "            \"bridge_bus\" : \"(간선)602 604 760 마포07\",\n" +
                "            \"bridge_tourist\" : \"양화한강공원, 선유도, 선유도공원, 망원한강공원\",\n" +
                "            \"bridge_history\" : \" 서울도심에서 서부지역으로의 교통량이 증가하면서 한강대교만으로는 교통량을 감당하기 어려워 한강 하류에 다리를 가설하고 제2한강교라고 하였다. \n" +
                " 이후 한강종합개발계획이 시행될 때 다리 이름을 변경하였는데, 조선시대 양화나루가 있었기 때문에 양화대교라고 하였다. 1979년 1월에 이르러 양화대교의 극심한 교통량을 해소하기 위하여 신교의 가설이 필요하게 되었다.\n" +
                "그 결과 1982년 2월 25일 원래 있는 양화대교에서 한강 상류쪽으로 양화대교 신교를 가설하였다. 다리 이름은 새로 짓지 않고 기존의 양화대교와 붙어 있어 그대로 양화대교라고 하였다.\n" +
                " 기존 양화대교는 노후화되어 안전진단을 거쳐 2000년 6월 25일 성능을 개선하였다. 그후 2002년 8월 14일 보수 보강공사를 실시하였다. \n" +
                " 그 후 2006년 7월 1일 오세훈 시장이 한강 르네상스 프로젝트를 추진하면서, 다시 교각의 철거·확장 등 대형 공사를 맞이하였다. 최종적으로 2012년 10월 14일 오후 3시부터 전면 개통하였다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 6,\n" +
                "            \"bridge_info\" : \" 영등포구 당산동과 마포구 합정동을 잇는 지하철 2호선용 철교로 양화대교 옆에 있다. 1996년 12월 말 철거에 들어가 3년간의 공사를 통해 내진설계가 이루어진 1등급 교량으로 다시 건설되었다. \n" +
                " 합정역과 당산역을 잇는 도시 순환기능을 하고 있다. 다리 이름은 당산동의 동명에서 유래되었는데, 이 마을 산에 당집이 있었기 때문에 붙여진 이름이다.\n" +
                "  다리 상부는 강재(鋼材)로 되어 있고 하부는 철근콘크리트 구조이다. 한강의 다리 중 최초로 트러스(truss) 형식으로 가설되어 조형미가 뛰어나고 경쾌한 느낌을 준다. \",\n" +
                "            \"bridge_lat\" : \"37.541112\",\n" +
                "            \"bridge_lng\" : \"126.908044\",\n" +
                "            \"bridge_bike_name\" : \"양화한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5441048\",\n" +
                "            \"bridge_bike_lng\" : \"126.8926554\",\n" +
                "            \"bridge_metro\" : \"(2)(9)당산역 (2)(6)합정역\",\n" +
                "            \"bridge_bus\" : \"(간선)602 604 760 (마포)07\",\n" +
                "            \"bridge_tourist\" : \"양화한강공원\",\n" +
                "            \"bridge_history\" : \" 1980년 2월 26일 착공하여 1983년 12월 31일 준공되었다. 1994년 성수대교가 붕괴되는 사고로 인해 교량 안전 점검을 시행하여 상판은 물론 교각 자체에도 균열 현상이 급속히 확산되는 등 심각한 문제가 발견되었다. 1996년 12월 31일 마지막 열차 운행을 끝으로 다음 날인 1997년 1월 1일부터 대대적인 공사가 시작되어 당산역-합정역 구간이 한때 단절되었다. \n" +
                " 1996년 12월부터 재시공에 착수하여 1999년 11월 준공되었다. 1999년 11월 22일 당산철교가 다시 개통되어 현재까지 별다른 문제 없이 교량의 역할을 잘 수행하고 있다. \"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 7,\n" +
                "            \"bridge_info\" : \" 영등포구 여의도동과 마포구 신정동을 잇는 아치형 다리로 미관이 수려하다. 또한 철새도래지인 밤섬을 통과하는 교량으로 곡선미와 조형미가 뛰어나 한강교량 중 최고의 명소로 꼽힌다. \n" +
                " 주변 경관과 어울리는 형태의 닐슨 아치(Nielsen Arch)교로 건설되었다. \n" +
                " 강북 지역은 창전로와 직선으로 이어지고, 우회로를 통해 자유로와 연결된다. 남쪽은 여의도 일주도로와 연결된다.\",\n" +
                "            \"bridge_lat\" : \"37.537084\",\n" +
                "            \"bridge_lng\" : \"126.924997\",\n" +
                "            \"bridge_bike_name\" : \"마포한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5299969\",\n" +
                "            \"bridge_bike_lng\" : \"126.9284669\",\n" +
                "            \"bridge_metro\" : \"(9)국회의사당역 (6)광흥창역\",\n" +
                "            \"bridge_bus\" : \"(간선)753 (지선)5615 5618 5713\",\n" +
                "            \"bridge_tourist\" : \"국회의사당, 밤섬, 샛강, 샛강 생태공원, 서울마리나, 여의도\",\n" +
                "            \"bridge_history\" : \" 조선시대 이 부근의 한강을 서강이라고 부른 데서 연유되었다. 1980년 2월 착공되었으나 ’88서울올림픽 준비와 막대한 공사비로  예산 집행 우선순위에서 밀려 10년간 방치되어 '서울의 흉물, 한강의 괴물'이라는 오명을 사기도 했다. 1990년대 초 최악으로 치닫는 서울의 교통난을 해소하기 위해서 1993년부터 공사를 재개하였다. 이후 1996년 12월 30일 개통되었다. \n" +
                " 서강대교가 밤섬을 거치게 건설되고 있었기 때문에 철새가 사라질 것을 우려한 환경 단체의 반발이 있었고, 이를 반영해 서강대교 건설 방식을 변경하였다. 밤섬이 위치하는 150m 구간에는 닐슨 아치교 형식으로 건설되었다. \"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 8,\n" +
                "            \"bridge_info\" : \" 마포구 용강동과 영등포구 여의도동을 잇는 교량이다. 1968년부터 시작된 한강종합개발계획의 핵심사업으로 추진되어 황무지 상태의 여의도를 ‘서울의 맨허튼’으로 비약시키는 발판이 되었다. \n" +
                " 한남대교에 이어 한강에 4번째로 가설된 교량이다. 준공 당시는 ‘서울대교’라고 부르다가 1984년 마포대교로 이름을 바꾸었다.\",\n" +
                "            \"bridge_lat\" : \"37.533995\",\n" +
                "            \"bridge_lng\" : \"126.937134\",\n" +
                "            \"bridge_bike_name\" : \"마포한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5299969\",\n" +
                "            \"bridge_bike_lng\" : \"126.9284669\",\n" +
                "            \"bridge_metro\" : \"(5)여의나루역 마포역\",\n" +
                "            \"bridge_bus\" : \"(지선)7016\",\n" +
                "            \"bridge_tourist\" : \"여의도 한강공원, 여의도공원\",\n" +
                "            \"bridge_history\" : \" 1968년 2월에 착공하여 1970년 5월에 준공되었다. 1996년 12월 늘어난 교통량을 감당하기 위해 대대적인 개보수공사가 진행되었으며 2000년 6월 30일에 완공하였고, 7월 3일 통행이 이루어졌다. \n" +
                " 2012년 9월 26일 서울특별시는 삼성생명과 함께 마포대교를 생명의 다리를 조성하였다. 생명의다리 운영은 2015년 말까지 운영되며 이후 운영(철거 및 보완)여부는 미정이다. \n" +
                " 2014년 3월 30일에는 영화 어벤져스 : 에이지 오브 울트론의 촬영을 이 곳에서 진행하였다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 9,\n" +
                "            \"bridge_info\" : \" 용산구 원효로 4가와 영등포구 여의도동 사이를 잇는 교량으로 남성적인 힘찬 기상을 상징한다. 한강대교 및 마표대교의 과중한 교통량을 분산시키기 위해 세워졌다.\n" +
                " 독일의 디비닥 공법 및 프리 캔틸레버 공법을 이용하여 건설되었다. 서울특별시는 국내 최초로 디비닥 공법을 도입하여 건설한 원효대교를 보존가치가 충분하다고 여겨 서울시미래유산으로 선정하였다. \",\n" +
                "            \"bridge_lat\" : \"37.527124\",\n" +
                "            \"bridge_lng\" : \"126.945681\",\n" +
                "            \"bridge_bike_name\" : \"원효한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5246026\",\n" +
                "            \"bridge_bike_lng\" : \"126.9369477\", \n" +
                "            \"bridge_metro\" : \"(5)여의나루역\",\n" +
                "            \"bridge_bus\" : \"(지선)0017 2016 5534(간선)261 262\",\n" +
                "            \"bridge_tourist\" : \"여의도 한강공원, 63빌딩, 샛강 생태공원, 용산전자상가\",\n" +
                "            \"bridge_history\" : \" 1978년 7월 착공, 1981년 10월 준공한 13번째 한강 교량이다. 개통 초기에는 통행료를 징수했으나, 차량통행이 워낙 적은데다 통행료를 부과하는 바람에 차량들이 통행을 기피하면서 가로등 전력비도 뽑지 못하여 이후 1983년 2월 서울특별시에 헌납하였다. 다리의 소유권을 서울특별시에 기부한 이후 톨게이트는 철거되었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 10,\n" +
                "            \"bridge_info\" : \" 용산구 이촌동과 동작구 노량진동을 연결하는 철교이면서 한강 위에 놓인 최초의 교량으로 4년에 걸쳐 완공되었다. 한강철교의 완공은 ‘한반도의 교통혁명’으로 비유될 만한 일대 사건이었다. \n" +
                " 한강철교는 A, B, C, D선의 4개 교량으로 구성되어 있다. 2011년 기준 A선은 용산에서 동인천간 경인선 직통 전철, B선은 화물열차, C선은 경부선·장항선·호남선 등의 철도, D선은 경인행·경수행 전철이 사용하고 있다. \n" +
                " 4개의 철로를 이용하여 하루 1,220차례 열차가 지나다닌다. \",\n" +
                "            \"bridge_lat\" : \"37.518802\",\n" +
                "            \"bridge_lng\" : \"126.951382\",\n" +
                "            \"bridge_bike_name\" : \"원효한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5246026\",\n" +
                "            \"bridge_bike_lng\" : \"126.9369477\",\n" +
                "            \"bridge_metro\" : \"(1)(9)노량진역 (1)(경의중앙)용산역\",\n" +
                "            \"bridge_bus\" : \"(간선)150, 151 350\",\n" +
                "            \"bridge_tourist\" : \"용산전자상가\",\n" +
                "            \"bridge_history\" : \" A선은 한강에 놓인 최초의 다리로 1897년 3월에 착공하여 1900년 7월에 준공되었다. B선은 1911년 7월에 공사를 시작하여 1912년 9월에 완공되었다. C선은 1930년대 초에 착공하였으나 자재난 등으로 인해 1944년 6월에 공사를 마쳤다.\n" +
                " 그러나 6·25전쟁의 발발로 1950년 6월 A·B·C 3선이 모두 폭파되어 가복구하여 임시로 사용하다가 1957년 7월에 C선을 복구하고, 1969년 6월에는 3선이 모두 완전 복구되었다. 1995년 D선을 건설하여 오늘날의 모습을 갖추게 되었다. \n" +
                " 경인선 및 한강철교가 개통되기 이전에는 서울에서 인천까지 육로로 12시간, 배편으로 8시간이 걸렸으나, 완공 뒤에는 1시간에서 2시간이 걸렸다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 11,\n" +
                "            \"bridge_info\" : \" 용산구 한강로3가와 동작구 노량진 사이를 잇는 한강인도교이다. 사람과 우마차가 다니는 길이라 해서 ‘인도교’라는 이름이 붙어졌다. \n" +
                " 1982년 2월에는 기존 인도교 옆에 같은 형태, 같은 규모의 다리가 놓여 쌍둥이 다리가 되었다. 인도교의 개통으로 영등포 ·노량진 일대가 급격히 도시화(都市化)되었다. \",\n" +
                "            \"bridge_lat\" : \"37.517764\",\n" +
                "            \"bridge_lng\" : \"126.958861\",\n" +
                "            \"bridge_bike_name\" : \" 이촌한강공원 자전거대여소 \",\n" +
                "            \"bridge_bike_lat\" : \"37.5169979\",\n" +
                "            \"bridge_bike_lng\" : \"126.9696395\",\n" +
                "            \"bridge_metro\" : \"(9)노들역\",\n" +
                "            \"bridge_bus\" : \"(간선)150 152 350 (마을)동작10\",\n" +
                "            \"bridge_tourist\" : \"노들나루공원, 사육신공원, 노들섬, 이촌한강공원\",\n" +
                "            \"bridge_history\" : \" 916년 3월에 착공하여 1917년 10월 준공하였다. 1950년 6월 28일 한국전쟁으로 다리가 폭파되었고, 서울 수복 후 부교 또는 가교가 놓여졌다. \n" +
                " 1957년 9월 시멘트와 철근을 이용한 공사가 착공되어 1958년 5월 15일에 준공되었다. \n" +
                " 제1한강교라고도 불리었던 이 다리는 서울의 인구와 교통량이 크게 증가됨에 따라 새로운 다리가 필요하게 되자, 1979년 1월 4일 다리의 폭을 20m에서 40m로 늘리는 확장공사에 착수, 1981년 12월에 준공하였다.\n" +
                " 그 결과 쌍둥이 교량으로 탈바꿈되면서, 이름도 ‘한강인도교’에서 ‘한강대교’로 개칭되었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 12,\n" +
                "            \"bridge_info\" : \" 용산구 이촌동과 서초구 반포동을 잇는 교량으로 하늘 및 구름다리 또는 행복한 미래를 상징한다. \n" +
                " 조선시대 이곳에 동작나루가 있었기 때문에 다리 이름을 동작대교라고 하였다. 한강대교와 반포대교 사이에 있다. \n" +
                " 도로교와 지하철 4호선 전철교의 복합교량으로 그 폭이 한강다리 가운데서 가장 넓다.서울시가 한강대교와 반포대교의 과밀교통량 분산효과를 기대하고 착공하였다. \n" +
                " 한강 다리 중 11번째로 개통하였다. 한강의 5번째 철교로서, 구조가 유사한 동호대교와 같은 날에 철교가 개통하였다.\",\n" +
                "            \"bridge_lat\" : \"37.509769\",\n" +
                "            \"bridge_lng\" : \"126.981543\",\n" +
                "            \"bridge_bike_name\" : \"이촌한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5169979\",\n" +
                "            \"bridge_bike_lng\" : \"126.9696395\",\n" +
                "            \"bridge_metro\" : \"(4)(9)동작역\",\n" +
                "            \"bridge_bus\" : \"(간선)502 (지선)3012\",\n" +
                "            \"bridge_tourist\" : \"현충원, 국립중앙박물관, 용산가족공원, 서래섬\",\n" +
                "            \"bridge_history\" : \" 1978년 10월에 착공하여 1984년 11월에 준공하였다. 1994년 4월 성수대교 사고 이후 1995년 3월에서 1996년 6월 30일까지 교각 우물통 보수 등 긴급 보수공사를 하였으며, 1996년 11월에서 1997년 5월까지 정기점검 용역을 하여 1997년 9월에서 1998년 5월 30일까지 교좌장치 교체 등 보수공사를 실시함으로써 다리 수명을 연장하고 기능을 향상시켰다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 13,\n" +
                "            \"bridge_info\" : \" 용산구 서빙고동과 서초구 반포동을 잇는 교량이다. 역동적인 기상과 희망을 상징한다. \n" +
                " 한국 최초의 2층 교량으로 1층이 잠수교이고, 2층이 반포대교로 한강교량 중 가장 많은 사람들이 이용하고 있다. 잠수교의 경우 홍수 때에 수면 아래에 잠기도록 낮게 가설한 교량이다.  집중 호우에 따른 한강의 수위 변화의 상황을 상징적으로 보여주는 척도의 역할도 수행하고 있다. \n" +
                " 강남지구 도시개발 촉진을 위해 건설된 다리로서, 강남과 강북을 잇는 주요 통로 역할을 하며, 경부고속도로 교통을 도심부에 직접 연결시켜 줌으로써 수도권 전체 교통의 효율성을 높이는 역할도 한다.\",\n" +
                "            \"bridge_lat\" : \"37.515738\",\n" +
                "            \"bridge_lng\" : \"126.996059\",\n" +
                "            \"bridge_bike_name\" : \"반포한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5125651\",\n" +
                "            \"bridge_bike_lng\" : \"127.0022140\",\n" +
                "            \"bridge_metro\" : \"(경의중앙)서빙고역 (3)(7)(9)고속버스터미널역\",\n" +
                "            \"bridge_bus\" : \"(간선)400 405 740 (지선)2016 6211\",\n" +
                "            \"bridge_tourist\" : \"반포한강공원, 무지개분수, 세빛섬, 서래섬\",\n" +
                "            \"bridge_history\" : \" 잠수교는 1975년 9월에 착공해 이듬해 7월 15일 완공하였고, 반포대교는 1980년 1월에 착공해 1982년 6월 25일 완공하였다. \n" +
                " 다리 이름은 반포동의 동명에서 유래되었는데, 반포는 이 마을로 흐르는 개울이 서리서리 굽이쳐 흐른다 하여 ‘서릿개’ 곧 반포(蟠浦)라고 하다가 음이 변하여 오늘날의 반포(盤浦)가 되었다는 설과 이 일대가 상습 침수지역이므로 반포(盤浦)라고 하였다는 설이 있다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 14,\n" +
                "            \"bridge_info\" : \" 용산구 한남동과 강남구 신사동 사이를 잇는 교량으로 한국의 기적 혹은 대한민국의 성장을 상징한다. \n" +
                " 현재 12차로의 가장 넓은 교량으로 강남, 강북 교통 소통에 큰 기여를 하고 있다. 한강에서는 네번째로 건설된 교량이다. 서울과 부산을 연결하는 경부고속도로의 진입 관문 역할을 한다. 이 다리를 통해 강남구 및 경부고속도로에서 남산1호터널 및 명동·을지로 일대로 직결된다. \",\n" +
                "            \"bridge_lat\" : \"37.527337\",\n" +
                "            \"bridge_lng\" : \"127.012907\",\n" +
                "            \"bridge_bike_name\" : \"잠원한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5250436\",\n" +
                "            \"bridge_bike_lng\" : \"127.0162308\",\n" +
                "            \"bridge_metro\" : \"(경의중앙)한남역\",\n" +
                "            \"bridge_bus\" : \"(간선)140 142 (지선)3011 4318\",\n" +
                "            \"bridge_tourist\" : \"잠원한강공원, 신사동 가로수길\",\n" +
                "            \"bridge_history\" : \" 1966년 1월 19일 착공하여 1969년 12월 25일에 준공되었다. 교통량 증가와 다리의 노후로 1996년 12월 기존 다리 서쪽에 새 다리를 착공, 2001년 3월 개통하였다. \n" +
                " 이후 기존 다리는 보수공사를 진행하여 2004년 8월 9일 재개통, 현재의 12차로로 구성된 다리가 완성되었다.  \n" +
                " 원래 이름은 '제3한강교'였으나 1985년 현재의 이름으로 바뀌었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 15,\n" +
                "            \"bridge_info\" : \" 성동구 옥수동과 강남구 압구정동을 잇는 교량으로, 태극을 형상화하고 세계속의 한국을 의미한다. \n" +
                " 한남대교와 성수대교 사이에 있는 연속 트러스교이다. \n" +
                " 3호선 전철교가 지나고 각 2차선으로 된 도로교가 그 양옆으로 난 복합교량이다.\n" +
                " 1970년대에 본격적으로 개발된 강남지역의 교통량 부하를 감당하기 어려운 실정이었으며, 특히 영동지구에서 발생하는 교통량이 도심으로 직통할 수 없었다. 이러한 문제점을 해결하기 위하여 건설된 동호대교는 한강이남과 한강이북을 연결하는 교통량을 분산시켜 줌으로써 강남북의 연결을 수월하게 해 주고 있다.\",\n" +
                "            \"bridge_lat\" : \"37.536272\",\n" +
                "            \"bridge_lng\" : \"127.021061\",\n" +
                "            \"bridge_bike_name\" : \"잠원한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5250436\",\n" +
                "            \"bridge_bike_lng\" : \"127.0162308\",\n" +
                "            \"bridge_metro\" : \"(3)(경의중앙)옥수역 (3)압구정역\",\n" +
                "            \"bridge_bus\" : \"(마을)성동01 성동 09 성동12\",\n" +
                "            \"bridge_tourist\" : \"달맞이봉공원, 압구정\",\n" +
                "            \"bridge_history\" : \" 1980년 6월에 착공하여 1985년 2월 2일에 개통되었다. 1994년 10월 성수대교 붕괴사고 이후 전문가의 긴급 점검을 실시하고 그 결과에 따라 1995년 3월 15일부터 1996년 9월 30일까지 안전에 우려되는 부분을 긴급보수하였다. \n" +
                " 또한 추가 점검 결과에 따라 다리의 수명 연장이나 기능향상을 위하여 1997년 9월 5일부터 1998년 6월 30일까지 보수공사를 실시하여 이용 시민의 안전에 이상이 없을 뿐 아니라 다리 기능도 원활히 이루어지게 되었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 16,\n" +
                "            \"bridge_info\" : \" 성동구 성수동과 강남구 압구정동을 연결하는 교량으로, 비상하는 색채와 무한한 가능성을 표현했다. 분괴사고 후 재시공을 통해 더욱더 아름다운 다리로 변신했다.\",\n" +
                "            \"bridge_lat\" : \"37.537030\",\n" +
                "            \"bridge_lng\" : \"127.034989\",\n" +
                "            \"bridge_bike_name\" : \"잠원한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5250436\",\n" +
                "            \"bridge_bike_lng\" : \"127.0162308\",\n" +
                "            \"bridge_metro\" : \"(분당)서울숲역 압구정로데오역\",\n" +
                "            \"bridge_bus\" : \"(간선)141 148 463 121\",\n" +
                "            \"bridge_tourist\" : \"서울숲, 압구정\",\n" +
                "            \"bridge_history\" : \" 1977년 4월 착공하여 1979년 10월 준공하였다. 1994년 10월 21일 아침, 다리의 북단 5번째와 6번째 교각 사이 상판 50여m가 내려앉는 붕괴참사가 발생하였다. \n" +
                " 그 뒤 서울시에서는 1996년 3월부터 기존 다리를 헐고 새 성수대교를 세우기 시작하여 1997년에 완공하고, 뒤이어 2004년 9월에 왕복 8차선으로 확장했다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 17,\n" +
                "            \"bridge_info\" : \" 성동구 성수동과 강남구 청담동을 잇는 교량으로, 서울 도심의 인구 분산과 영동지구 개발을 위해 건설되었다. \n" +
                " 강남구 청담동 삼성동 일원의 개발을 촉진하는 데 크게 기여했을 뿐만 아니라, 이미 건설된 한남대교와 잠실대교에 집중되는 교통량을 분산시키는 효과를 가져왔다.\",\n" +
                "            \"bridge_lat\" : \"37.530215\",\n" +
                "            \"bridge_lng\" : \"127.057245\",\n" +
                "            \"bridge_bike_name\" : \"뚝섬한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5309054\",\n" +
                "            \"bridge_bike_lng\" : \"127.0665410\",\n" +
                "            \"bridge_metro\" : \"(7)뚝섬유원지역\",\n" +
                "            \"bridge_bus\" : \"(지선)2014 2224 2412\",\n" +
                "            \"bridge_tourist\" : \"뚝섬한강공원\",\n" +
                "            \"bridge_history\" : \" 1970년 8월에 착공, 1973년 11월에 준공하였다. 영동(永東)이라는 명칭은 영등포의 동쪽에 있는 지역이라는 뜻으로 붙여진 이름으로, 1970년대 강남 개발 당시에 강남이라는 이름이 자리잡기 전 붙여진 이름이다.\n" +
                "  강원도 영동 지방이나 충청북도 영동군, 그리고 영동고속도로와는 전혀 관련이 없으며, 영동이라는 이름은 현재 강남으로 대체되었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 18,\n" +
                "            \"bridge_info\" : \" 광진구 자양동과 송파구 신천동을 잇는 교량으로,  대한민국 최초의 복층 교량으로 아래층에는 지하철 7호선 철도교가 위층에는 차량이 통행한다. 이곳에서는 계절별로 색다른 풍경을 감상할 수 있다.\n" +
                "다리 이름은 옛날 이 일대 한강변의 물이 맑아 이 마을을 청숫골이라고 부른 데서 유래되었다.\n" +
                " 탄천을 따라 분당까지 이어지는 동부간선도로와 접속되어 성동지역과 강남지역 사이에 교통난 해소와 분당신도시 주민들의 도심 진, 출입 때 관문 역할을 담당한다.\",\n" +
                "            \"bridge_lat\" : \"37.5265524\",\n" +
                "            \"bridge_lng\" : \"127.064462\",\n" +
                "            \"bridge_bike_name\" : \"뚝섬한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5309054\",\n" +
                "            \"bridge_bike_lng\" : \"127.0665410\",\n" +
                "            \"bridge_metro\" : \"(7)청담역 뚝섬유원지역\",\n" +
                "            \"bridge_bus\" : \"102, 1002\",\n" +
                "            \"bridge_tourist\" : \"뚝섬한강공원, 뚝섬 전망문화 콤플렉스(자벌레)\",\n" +
                "            \"bridge_history\" : \" 1993년 12월에 착공하여 본교는 1999년 12월 23일에, 접속교는 2001년 1월에 완전 개통 되었다. \n" +
                " 원래는 서울지하철 7호선용 하저터널로 건설될 예정이였으나, 영동대교, 잠실대교 간의 도로 거리가 멀어 차량혼잡으로 인해서 중간 정도에 다리 하나의 필요성을 인식하였으며, 또 자양동 쪽으로 뚝섬유원지가 자리잡고 있어 하저터널로 뚫을 경우 지하에서 나오는 매연 문제로 인한 뚝섬유원지 이용객들의 불편을 초래하는 점때문에 당시 서울특별시의 하저터널 반대, 건설 당시 IMF 위기로 인한 토지보상 문제와 예산 문제 등으로 인해 여건상 여러모로 맞지가 않아서 건설된 다리가 바로 이 청담대교이다.\" \n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 19,\n" +
                "            \"bridge_info\" : \" 광진구 자양동과 송파구 신천동을 잇는 교량으로 상생과 창조의 의지를 표현한다. \n" +
                " 잠실대교 아래 계단식으로 설계된 물고길 주변에는 물길을 거슬러 올라가는 물고기를 구경할 수 있는 관찰데크가 마련되어 있다. 다리 하부에는 잠실보가 있다. \n" +
                " 이것은 한강의 수위를 일정하게 유지시켜 줌으로써 수량의 저하에 따른 취수장의 취수 곤란, 바닷물의 역류에 의한 생태계의 변동, 하천 구조물의 노출로 인한 미관상의 문제 등을 해결해 주었다. \",\n" +
                "            \"bridge_lat\" : \"37.524352\",\n" +
                "            \"bridge_lng\" : \"127.091572\",\n" +
                "            \"bridge_bike_name\" : \"잠실한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5178569\",\n" +
                "            \"bridge_bike_lng\" : \"127.0819557\",\n" +
                "            \"bridge_metro\" : \"(2)(8)잠실역\",\n" +
                "            \"bridge_bus\" : \"(간선)302 320 (순환)8331\",\n" +
                "            \"bridge_tourist\" : \"잠실한강공원, 석촌호수, 롯데월드\",\n" +
                "            \"bridge_history\" : \" 송파구 잠실동과 연결되는 한강의 큰 다리이므로 잠실대교라고 하였다.1970년 10월에 착공하였고, 1972년 7월에 준공하였다. \n" +
                " 한강에 건설한 서울의 6번째 다리로, 완공 당시에는 마포대교에 이어 한국에서 2번째로 긴 다리였다. 2003년 기존 6차선에서 8차선으로 확장하였다.\" \n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 20,\n" +
                "            \"bridge_info\" : \" 광진구 구의동과 송파구 신천동을 잇는 한강 위의 복선철교이다. 철교 좌우에 소형 자동차 전용의 도로교를 함께 건설해 전동차와 자동차가 동시에 통행할 수 있게 되었다. \n" +
                " 서울특별시가 지하철 1호선에 이어 도시구조를 획기적으로 개선하기 위해 순환 지하철도 2호선을 건설하면서 업무도시 기본계획에 따라 건설한 복선철교이다. \",\n" +
                "            \"bridge_lat\" : \"37.529129\",\n" +
                "            \"bridge_lng\" : \"127.098508\",\n" +
                "            \"bridge_bike_name\" : \"잠실한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5178569\",\n" +
                "            \"bridge_bike_lng\" : \"127.0819557\",\n" +
                "            \"bridge_metro\" : \"(2)잠실나루역 강변역\",\n" +
                "            \"bridge_bus\" : \"(마을)광진05 강동01 (일반)92 (간선)351\",\n" +
                "            \"bridge_tourist\" : \"성내천, 올림픽공원, 몽촌토성\",\n" +
                "            \"bridge_history\" : \" 1977년 착공하여 1979년 완공하였으며, 서울에서 도로와 철도가 같이 통행할 수 있도록 놓인 최초의 다리이다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 21,\n" +
                "            \"bridge_info\" : \" 광진구 구의동과 송파구 풍납동을 연결하는 교량으로 새천년 서울의 이미지를 상징한다. \n" +
                " 국내 최초의 콘크리트 사장교로서 역사적인 제 24회 서울올림픽을 영구적으로 기념하기 위해 만들어졌다.\n" +
                " 또한 올림픽을 기념하면서 윤회하는 한국의 24절기를 표상하도록 하여 ‘세계는 서울로, 서울은 세계로’, 즉 우주속의 한국을 세계에 알리기 위하여 주탑을 중심으로 좌우에 12가닥씩 도합 24개의 사장케이블을 교량 중앙선을 따라 배치하였다.\n" +
                " 천호대교, 잠실대교의 교통량을 분산시키고 강남과 강북의 교통 소통에 도움을 주는 역할을 한다.\",\n" +
                "            \"bridge_lat\" : \"37.533975\",\n" +
                "            \"bridge_lng\" : \"127.103843\",\n" +
                "            \"bridge_bike_name\" : \"잠실한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5178569\",\n" +
                "            \"bridge_bike_lng\" : \"127.0819557\",\n" +
                "            \"bridge_metro\" : \"(8)강동구청역\",\n" +
                "            \"bridge_bus\" : \"(지선)4318\",\n" +
                "            \"bridge_tourist\" : \"잠실한강공원, 올림픽공원\",\n" +
                "            \"bridge_history\" : \" 1984년 12월에 건설계획을 수립하고 1985년 4월에 현상공모 당선작을 선정하였으며, 1985년 11월에 착공하여 1989년 11월 15일에 개통하였다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 22,\n" +
                "            \"bridge_info\" : \" 광진구 광장동과 강동구 천호동 사이를 잇는 교량으로, 강동지구 개발을 촉진하기 위해 만들어졌다. \n" +
                " 천호지구의 광진교가 노후돼 제 기능을 발휘하지 못하게 되자 대체용으로 건설된 다리다. 강동구 천호동의 동명을 따고, 한강에 있는 큰 다리이므로 천호대교라고 하였다. \n" +
                " 서울 동부의 관문역할을 할 이 교량이 가설됨에 따라 강동구와 송파구의 급격한 발전을 이루었다. \n" +
                " 지하철 5호선이 건설되면서 한강 아래로 지하철이 통과하고 있다.\",\n" +
                "            \"bridge_lat\" : \"37.543108\",\n" +
                "            \"bridge_lng\" : \"127.111780\",\n" +
                "            \"bridge_bike_name\" : \"광나루한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5447504\",\n" +
                "            \"bridge_bike_lng\" : \"127.1193642\",\n" +
                "            \"bridge_metro\" : \"(5)광나루역 (5)(8)천호역\",\n" +
                "            \"bridge_bus\" : \"(지선)4318 (마을)광진01\",\n" +
                "            \"bridge_tourist\" : \"광나루한강공원, 풍납토성 \",\n" +
                "            \"bridge_history\" : \" 1974년 8월 17일 착공하여 1976년 7월 5일 준공된 교량이다. 이후 1968년 이후에는 늘어나는 교통량을 소화하지 못하게 되었는데, 1989년 하류에 올림픽대교가 건설됨으로써 소통이 다소 완화되었다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 23,\n" +
                "            \"bridge_info\" : \" 광진구 광장동과 강동구 천호동을 잇는 광진교는 민족과 가족의 번영을 기원한다는 의미를 지니고 있다.\n" +
                " 지금은 보행자 중심의 걷고 싶은 교량으로, 야간의 한강 경관이 인상적이다. 강동대교에 이어 한강 상류에서 두번째 위치하는 교량으로, 천호대교의 교통량을 분산 처리해 강남, 강북의 교통을 원할하게 하고 경기도 구리시 외곽의 교통을 편리하게 하는 역할을 한다. \n" +
                " 조선시대 이곳에 나루터가 있어 광나루 혹은 광진나루라고 불렸기 때문에 광진교라고 이름 붙였다.\",\n" +
                "            \"bridge_lat\" : \"37.544762\",\n" +
                "            \"bridge_lng\" : \"127.113128\",\n" +
                "            \"bridge_bike_name\" : \"광나루한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5447504\",\n" +
                "            \"bridge_bike_lng\" : \"127.1193642\",\n" +
                "            \"bridge_metro\" : \"(8)천호역\",\n" +
                "            \"bridge_bus\" : \"(지선)4318 (마을)광진01\",\n" +
                "            \"bridge_tourist\" : \"광나루한강공원, 암사 생태공원\",\n" +
                "            \"bridge_history\" : \" 1934년 착공되어 1936년 10월 완공되었다. 1950년 한국전쟁 때 파괴되었다가 1952년 미8군에 의해 복구되었다. \n" +
                " 이후 교통량의 증가와 구조물의 노후로 인해 1960년 교각보수공가, 1972년 상판보수공사, 1985년 교각보수공사를 벌였다. 그러나 근본적으로 안전상 문제가 대두되어 2000년 완전 해체하였고, 2003년 11월 재개통되었다가 다시 확장 공사가 착수되어 2005년 6월 30일 최종 완료되었다.\n" +
                " 2009년 7월에 걷고 싶은 다리 조성공사를 하여 4차로 중 2차로가 보행로와 자전거 전용도로로 새로이 조성되고 다리 중간부분에 하부 전망대를 설치하여 한강 교량 유일의 걷는 다리와 복합 문화예술 공간으로 만들어졌다.\"\n" +
                "        },\n" +
                "\n" +
                "        {\n" +
                "            \"bridge_id\" : 24,\n" +
                "            \"bridge_info\" : \" 서울 강동구 암사동 둔촌로와 경기도 구리시 아천동 사이를 잇는 다리이다. 천호대교와 올림픽대교 등에 집중되는 교통량을 분산 처리하고, 서울 동부권에 급증하는 개통 수요에 대처하기 위한 목적으로 계획되었다. \n" +
                " 다리 이름은 처음에는 가칭 암사대교로 하였으나 구리시에서 구리대교로 명명할 것을 요구하여 마찰을 빚다가 2008년 8월 26일 서울시 지명위원회에서 구리암사대교로 명명할 것을 확정하였다.\",\n" +
                "            \"bridge_lat\" : \"37.568671\",\n" +
                "            \"bridge_lng\" : \"127.132305\",\n" +
                "            \"bridge_bike_name\" : \"광나루한강공원 자전거대여소\",\n" +
                "            \"bridge_bike_lat\" : \"37.5447504\",\n" +
                "            \"bridge_bike_lng\" : \"127.1193642\",\n" +
                "            \"bridge_metro\" : \"(8)암사역\",\n" +
                "            \"bridge_bus\" : \"(마을)강동02\", \n" +
                "            \"bridge_tourist\" : \"구리시민 한강공원, 서울암사동유적지, 암사 생태공원, 광나루 한강공원\",\n" +
                "            \"bridge_history\" : \" 원래는 2005년 착공하여 2008년 완공할 예저이었으나 연기되어 2006년 4월 착공하였고 2014년 11월 21일 임시 개통하여 통행을 시작했으며 전체 완공은 2015년 6월 29일에 모든 진출입 램프가 완공되면서 이루어졌다.\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        return json;
    }

}

