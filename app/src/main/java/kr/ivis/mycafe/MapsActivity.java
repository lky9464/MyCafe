package kr.ivis.mycafe;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        String cafeName = getIntent().getStringExtra("CafeName");

        // Add a marker in Sydney and move the camera

        /*************************************창원*********************************************/
        if(cafeName.equals("1997영국집")) {
            LatLng cl = new LatLng(35.238164, 128.682042);
            mMap.addMarker(new MarkerOptions().position(cl).title("1997영국집"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("S9")){
            LatLng cl = new LatLng(35.247985, 128.687903);
            mMap.addMarker(new MarkerOptions().position(cl).title("S9"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("스페이스펀")){
            LatLng cl = new LatLng(35.242257, 128.685242);
            mMap.addMarker(new MarkerOptions().position(cl).title("스페이스펀"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("가로수")){
            LatLng cl = new LatLng(35.236321, 128.685219);
            mMap.addMarker(new MarkerOptions().position(cl).title("가로수"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페미뇽")){
            LatLng cl = new LatLng(35.237126, 128.683530);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페미뇽"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("스팀펑크")){
            LatLng cl = new LatLng(35.220870, 128.685414);
            mMap.addMarker(new MarkerOptions().position(cl).title("스팀펑크"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("경성코페 귀곡점")){
            LatLng cl = new LatLng(35.172321, 128.595717);
            mMap.addMarker(new MarkerOptions().position(cl).title("경성코페 귀곡점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("타르타르 상남점")){
            LatLng cl = new LatLng(35.219215, 128.679100);
            mMap.addMarker(new MarkerOptions().position(cl).title("타르타르 상남점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("더 클라우드")){
            LatLng cl = new LatLng(35.239696, 128.654426);
            mMap.addMarker(new MarkerOptions().position(cl).title("더 클라우드"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("브라운핸즈")){
            LatLng cl = new LatLng(35.173873, 128.575091);
            mMap.addMarker(new MarkerOptions().position(cl).title("브라운핸즈"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("그래시헤이")){
            LatLng cl = new LatLng(35.243120, 128.680049);
            mMap.addMarker(new MarkerOptions().position(cl).title("그래시헤이"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("컴포즈 창원시청점")){
            LatLng cl = new LatLng(35.228594, 128.680197);
            mMap.addMarker(new MarkerOptions().position(cl).title("컴포즈 창원시청점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************창원*********************************************/



        /*************************************거창*********************************************/
        else if(cafeName.equals("카페외갓집")){
            LatLng cl = new LatLng(35.698629, 127.857456);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페외갓집"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피브라운")){
            LatLng cl = new LatLng(35.693153, 127.921605);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피브라운"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("플래닛커피")){
            LatLng cl = new LatLng(35.691371, 127.924225);
            mMap.addMarker(new MarkerOptions().position(cl).title("플래닛커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("뿌에블로젤라또")){
            LatLng cl = new LatLng(35.688561, 127.917525);
            mMap.addMarker(new MarkerOptions().position(cl).title("뿌에블로젤라또"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("코너131")){
            LatLng cl = new LatLng(35.684822, 127.911461);
            mMap.addMarker(new MarkerOptions().position(cl).title("코너131"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("더무그")){
            LatLng cl = new LatLng(35.684778, 127.910905);
            mMap.addMarker(new MarkerOptions().position(cl).title("더무그"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("감성카페아메리카노")){
            LatLng cl = new LatLng(35.687064, 127.901064);
            mMap.addMarker(new MarkerOptions().position(cl).title("감성카페아메리카노"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("디애플스토리")){
            LatLng cl = new LatLng(35.687784, 127.905452);
            mMap.addMarker(new MarkerOptions().position(cl).title("디애플스토리"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("컵오브커피 거창점")){
            LatLng cl = new LatLng(35.687838, 127.913673);
            mMap.addMarker(new MarkerOptions().position(cl).title("컵오브커피 거창점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피마루")){
            LatLng cl = new LatLng(35.710625, 128.015593);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피마루"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }

        /*************************************거창*********************************************/

        /*************************************합천*********************************************/
        else if(cafeName.equals("님프")){
            LatLng cl = new LatLng(35.561210, 128.158612);
            mMap.addMarker(new MarkerOptions().position(cl).title("님"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("플로리안")){
            LatLng cl = new LatLng(35.410990, 128.124428);
            mMap.addMarker(new MarkerOptions().position(cl).title("플로리안"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페리조트인더시티")){
            LatLng cl = new LatLng(35.560886, 128.160751);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페리조트인더시티"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("인스커피")){
            LatLng cl = new LatLng(35.566062, 128.160868);
            mMap.addMarker(new MarkerOptions().position(cl).title("인스커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피베이 합천점")){
            LatLng cl = new LatLng(35.566176, 128.160868);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피베이 합천점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("이모하")){
            LatLng cl = new LatLng(35.561460, 128.153999);
            mMap.addMarker(new MarkerOptions().position(cl).title("이모하"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페뮤즈")){
            LatLng cl = new LatLng(35.717577, 128.166501);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페뮤즈"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페다온")){
            LatLng cl = new LatLng(35.569200, 128.158844);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페다온"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************합천*********************************************/

        /*************************************의령*********************************************/
        else if(cafeName.equals("그린프로그")){
            LatLng cl = new LatLng(35.380544, 128.322321);
            mMap.addMarker(new MarkerOptions().position(cl).title("그린프로그"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("새콩커피")){
            LatLng cl = new LatLng(35.320074, 128.262843);
            mMap.addMarker(new MarkerOptions().position(cl).title("새콩커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페세그루")){
            LatLng cl = new LatLng(35.354795, 128.195278);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페세그루"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("파인그로브")){
            LatLng cl = new LatLng(35.334465, 128.199983);
            mMap.addMarker(new MarkerOptions().position(cl).title("파인그로브"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("힐링카페")){
            LatLng cl = new LatLng(35.313823, 128.293706);
            mMap.addMarker(new MarkerOptions().position(cl).title("힐링카페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }

        /*************************************의령*********************************************/

        /*************************************창녕*********************************************/
        else if(cafeName.equals("노리")){
            LatLng cl = new LatLng(35.387853, 128.621719);
            mMap.addMarker(new MarkerOptions().position(cl).title("노리"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("모다페")){
            LatLng cl = new LatLng(35.546939, 128.498216);
            mMap.addMarker(new MarkerOptions().position(cl).title("모다페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페89도씨")){
            LatLng cl = new LatLng(35.386626, 128.473373);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페89도씨"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("우포로와")){
            LatLng cl = new LatLng(35.386635, 128.473362);
            mMap.addMarker(new MarkerOptions().position(cl).title("우포로와"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("슈가파우더")){
            LatLng cl = new LatLng(35.542971, 128.490811);
            mMap.addMarker(new MarkerOptions().position(cl).title("슈가파우더"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피볶는집 프리모")){
            LatLng cl = new LatLng(35.543027, 128.488929);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피볶는집 프리모"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페파인")){
            LatLng cl = new LatLng(35.494965, 128.539002);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페파인"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************창녕*********************************************/

        /*************************************밀양*********************************************/
        else if(cafeName.equals("카페지디")){
            LatLng cl = new LatLng(35.524121, 128.899772);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페지디"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("마리옹")){
            LatLng cl = new LatLng(35.551172, 128.710375);
            mMap.addMarker(new MarkerOptions().position(cl).title("마리옹"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("햇살이머무는정원")){
            LatLng cl = new LatLng(35.484914, 128.755351);
            mMap.addMarker(new MarkerOptions().position(cl).title("햇살이머무는정원"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("트리인블루")){
            LatLng cl = new LatLng(35.512455, 128.858430);
            mMap.addMarker(new MarkerOptions().position(cl).title("트리인블루"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피명가 밀양아랑점")){
            LatLng cl = new LatLng(35.496281, 128.744825);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피명가 밀양아랑점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페하비비")){
            LatLng cl = new LatLng(35.484051, 128.752722);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페하비비"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("메모리아")){
            LatLng cl = new LatLng(35.484655, 128.756148);
            mMap.addMarker(new MarkerOptions().position(cl).title("메모리아"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("노을이쁜카페")){
            LatLng cl = new LatLng(35.484672, 128.756148);
            mMap.addMarker(new MarkerOptions().position(cl).title("노을이쁜카페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("홀릭")){
            LatLng cl = new LatLng(35.494417, 128.750504);
            mMap.addMarker(new MarkerOptions().position(cl).title("홀릭"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************밀양*********************************************/

        /*************************************양산*********************************************/
        else if(cafeName.equals("구름에반하다")){
            LatLng cl = new LatLng(35.334523, 129.000442);
            mMap.addMarker(new MarkerOptions().position(cl).title("구름에반하다"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("스페이스나무")){
            LatLng cl = new LatLng(35.487647, 129.084039);
            mMap.addMarker(new MarkerOptions().position(cl).title("스페이스나무"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("스트롤링커피")){
            LatLng cl = new LatLng(35.358380, 128.987524);
            mMap.addMarker(new MarkerOptions().position(cl).title("스트롤링커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페해바라기")){
            LatLng cl = new LatLng(35.371027, 129.129898);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페해바라기"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페잍")){
            LatLng cl = new LatLng(35.414480, 129.064449);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페잍"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페블루지앤")){
            LatLng cl = new LatLng(35.316532, 129.003132);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페블루지앤"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페오조")){
            LatLng cl = new LatLng(35.319730, 128.996366);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페오조"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************양산*********************************************/

        /*************************************김해*********************************************/
        else if(cafeName.equals("카페달리아")){
            LatLng cl = new LatLng(35.265844, 128.894033);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페달리아"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("낙도맨션")){
            LatLng cl = new LatLng(35.228857, 128.878624);
            mMap.addMarker(new MarkerOptions().position(cl).title("낙도맨션"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("달카페")){
            LatLng cl = new LatLng(35.219027, 128.924838);
            mMap.addMarker(new MarkerOptions().position(cl).title("달카페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("마일커피")){
            LatLng cl = new LatLng(35.231774, 128.888186);
            mMap.addMarker(new MarkerOptions().position(cl).title("마일커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("도로시플레이트")){
            LatLng cl = new LatLng(35.184650, 128.788236);
            mMap.addMarker(new MarkerOptions().position(cl).title("도로시플레이트"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("일루소")){
            LatLng cl = new LatLng(35.182962, 128.768409);
            mMap.addMarker(new MarkerOptions().position(cl).title("일루소"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페오닉스")){
            LatLng cl = new LatLng(35.175009, 128.815621);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페오닉스"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("솔렌더")){
            LatLng cl = new LatLng(35.177174, 128.813386);
            mMap.addMarker(new MarkerOptions().position(cl).title("솔렌더"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("필로")){
            LatLng cl = new LatLng(35.176122, 128.786565);
            mMap.addMarker(new MarkerOptions().position(cl).title("필로"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("폴인커피강")){
            LatLng cl = new LatLng(35.218595, 128.923585);
            mMap.addMarker(new MarkerOptions().position(cl).title("폴인커피강"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************김해*********************************************/

        /*************************************함안*********************************************/
        else if(cafeName.equals("그루브맨커피")){
            LatLng cl = new LatLng(35.286020, 128.541864);
            mMap.addMarker(new MarkerOptions().position(cl).title("그루브맨커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("멜로우")){
            LatLng cl = new LatLng(35.266351, 128.477312);
            mMap.addMarker(new MarkerOptions().position(cl).title("멜로우"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페타밀")){
            LatLng cl = new LatLng(35.322259, 128.542838);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페타밀"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("인터라켄")){
            LatLng cl = new LatLng(35.278256, 128.524189);
            mMap.addMarker(new MarkerOptions().position(cl).title("인터라켄"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("에이미스커피 경남함안점")){
            LatLng cl = new LatLng(35.278232, 128.410015);
            mMap.addMarker(new MarkerOptions().position(cl).title("에이미스커피 경남함안점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페드아라")){
            LatLng cl = new LatLng(35.279656, 128.393553);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페드아라"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************함안*********************************************/

        /*************************************함양*********************************************/
        else if(cafeName.equals("케빈커피로스터스")){
            LatLng cl = new LatLng(35.522895, 127.722826);
            mMap.addMarker(new MarkerOptions().position(cl).title("케빈커피로스터스"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("황금마차")){
            LatLng cl = new LatLng(35.525656, 127.722357);
            mMap.addMarker(new MarkerOptions().position(cl).title("황금마차"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("다소니")){
            LatLng cl = new LatLng(35.683243, 127.685440);
            mMap.addMarker(new MarkerOptions().position(cl).title("다소니"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페엔")){
            LatLng cl = new LatLng(35.623358, 127.781555);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페엔"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("작은카페테이블")){
            LatLng cl = new LatLng(35.629735, 127.812271);
            mMap.addMarker(new MarkerOptions().position(cl).title("작은카페테이블"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************함양*********************************************/

        /*************************************거제*********************************************/
        else if(cafeName.equals("바람의핫도그")){
            LatLng cl = new LatLng(34.734320, 128.630392);
            mMap.addMarker(new MarkerOptions().position(cl).title("바람의핫도그"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("포뷰")){
            LatLng cl = new LatLng(34.863046, 128.730137);
            mMap.addMarker(new MarkerOptions().position(cl).title("포뷰"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페상상")){
            LatLng cl = new LatLng(34.847532, 128.709842);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페상상"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("에버어뮤즈")){
            LatLng cl = new LatLng(34.859176, 128.657223);
            mMap.addMarker(new MarkerOptions().position(cl).title("에버어뮤즈"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("볼리에르")){
            LatLng cl = new LatLng(34.958543, 128.522439);
            mMap.addMarker(new MarkerOptions().position(cl).title("볼리에르"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("섬타임")){
            LatLng cl = new LatLng(34.843139, 128.700761);
            mMap.addMarker(new MarkerOptions().position(cl).title("섬타임"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("아나무라")){
            LatLng cl = new LatLng(34.912964, 128.715028);
            mMap.addMarker(new MarkerOptions().position(cl).title("아나무라"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("블루밍제이")){
            LatLng cl = new LatLng(34.874600, 128.628883);
            mMap.addMarker(new MarkerOptions().position(cl).title("블루밍제이"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("블랙업커피 거제점")){
            LatLng cl = new LatLng(34.892576, 128.625775);
            mMap.addMarker(new MarkerOptions().position(cl).title("블랙업커피 거제점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************거제*********************************************/

        /*************************************통영*********************************************/
        else if(cafeName.equals("카페울라봉")){
            LatLng cl = new LatLng(34.846387, 128.426093);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페울라봉"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("꿀단지")){
            LatLng cl = new LatLng(34.843164, 128.423298);
            mMap.addMarker(new MarkerOptions().position(cl).title("꿀단지"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페바다봄")){
            LatLng cl = new LatLng(34.842163, 128.424142);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페바다봄"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("헤이수오미")){
            LatLng cl = new LatLng(34.884774, 128.418291);
            mMap.addMarker(new MarkerOptions().position(cl).title("헤이수오미"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("까사베르데")){
            LatLng cl = new LatLng(34.862008, 128.427578);
            mMap.addMarker(new MarkerOptions().position(cl).title("까사베르데"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("안트워프커피")){
            LatLng cl = new LatLng(34.831539, 128.363345);
            mMap.addMarker(new MarkerOptions().position(cl).title("안트워프커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("바이사이드")){
            LatLng cl = new LatLng(34.842042, 128.422823);
            mMap.addMarker(new MarkerOptions().position(cl).title("바이사이드"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페이봄")){
            LatLng cl = new LatLng(34.830942, 128.415006);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페이봄"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("보다나은")){
            LatLng cl = new LatLng(34.832896, 128.414790);
            mMap.addMarker(new MarkerOptions().position(cl).title("보다나은"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************통영*********************************************/

        /*************************************사천*********************************************/
        else if(cafeName.equals("커피레")){
            LatLng cl = new LatLng(34.946818, 128.041177);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피레"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("모엘루")){
            LatLng cl = new LatLng(34.946516, 128.041438);
            mMap.addMarker(new MarkerOptions().position(cl).title("모엘루"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페코끼리")){
            LatLng cl = new LatLng(34.952461, 128.035506);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페코끼리"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페정미소")){
            LatLng cl = new LatLng(34.970098, 128.062827);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페정미소"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("타르팩토리")){
            LatLng cl = new LatLng(35.080505, 128.084865);
            mMap.addMarker(new MarkerOptions().position(cl).title("타르팩토리"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("더웨이닝커피 삼천포대교점")){
            LatLng cl = new LatLng(34.930466, 128.053749);
            mMap.addMarker(new MarkerOptions().position(cl).title("더웨이닝커피 삼천포대교점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피필라멘트")){
            LatLng cl = new LatLng(35.086009, 128.097576);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피필라멘트"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************사천*********************************************/

        /*************************************진주*********************************************/
        else if(cafeName.equals("마미니")){
            LatLng cl = new LatLng(35.192162, 128.082798);
            mMap.addMarker(new MarkerOptions().position(cl).title("마미니"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("펄디스트릭")){
            LatLng cl = new LatLng(35.188637, 128.114926);
            mMap.addMarker(new MarkerOptions().position(cl).title("펄디스트릭"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("블랙바닐라")){
            LatLng cl = new LatLng(35.181919, 128.108955);
            mMap.addMarker(new MarkerOptions().position(cl).title("블랙바닐라"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페아르볼")){
            LatLng cl = new LatLng(35.197986, 128.082375);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페아르볼"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("울트라블루")){
            LatLng cl = new LatLng(35.167534, 128.040143);
            mMap.addMarker(new MarkerOptions().position(cl).title("울트라블루"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("로스팅웨어")){
            LatLng cl = new LatLng(35.161842, 128.116026);
            mMap.addMarker(new MarkerOptions().position(cl).title("로스팅웨어"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("허니타임")){
            LatLng cl = new LatLng(35.192740, 128.080785);
            mMap.addMarker(new MarkerOptions().position(cl).title("허니타임"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("소확행")){
            LatLng cl = new LatLng(35.182922, 128.091730);
            mMap.addMarker(new MarkerOptions().position(cl).title("소확행"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************진주*********************************************/

        /*************************************하동*********************************************/
        else if(cafeName.equals("카페로드100")){
            LatLng cl = new LatLng(35.793957, 129.314389);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페로드100"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("블리스커피 보문점")){
            LatLng cl = new LatLng(35.727018, 129.321789);
            mMap.addMarker(new MarkerOptions().position(cl).title("블리스커피 보문점"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("품안")){
            LatLng cl = new LatLng(35.798390, 129.312194);
            mMap.addMarker(new MarkerOptions().position(cl).title("품안"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("누마루한옥커피")){
            LatLng cl = new LatLng(35.806409, 129.308147);
            mMap.addMarker(new MarkerOptions().position(cl).title("누마루한옥커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("소더비")){
            LatLng cl = new LatLng(35.800192, 129.313971);
            mMap.addMarker(new MarkerOptions().position(cl).title("소더비"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("커피앤크레마")){
            LatLng cl = new LatLng(35.808909, 129.306753);
            mMap.addMarker(new MarkerOptions().position(cl).title("커피앤크레마"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("한옥카페부연")){
            LatLng cl = new LatLng(35.792180, 129.314119);
            mMap.addMarker(new MarkerOptions().position(cl).title("한옥카페부연"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************하동*********************************************/

        /*************************************산청*********************************************/
        else if(cafeName.equals("카페아모르")){
            LatLng cl = new LatLng(35.419230, 127.870828);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페아모르"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페플래닛27")){
            LatLng cl = new LatLng(35.464230, 127.796116);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페플래닛27"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페솔직한곰")){
            LatLng cl = new LatLng(35.411172, 127.873682);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페솔직한곰"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페엘림")){
            LatLng cl = new LatLng(35.334362, 127.893622);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페엘림"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페모티")){
            LatLng cl = new LatLng(35.414293, 127.876041);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페모티"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************산청*********************************************/

        /*************************************남해*********************************************/
        else if(cafeName.equals("쿤스트라운지")){
            LatLng cl = new LatLng(34.798020, 128.043250);
            mMap.addMarker(new MarkerOptions().position(cl).title("쿤스트라운지"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("코나하우스")){
            LatLng cl = new LatLng(34.769616, 127.914161);
            mMap.addMarker(new MarkerOptions().position(cl).title("코나하우스"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("카페유자")){
            LatLng cl = new LatLng(34.819389, 128.036389);
            mMap.addMarker(new MarkerOptions().position(cl).title("카페유자"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("펠리스카페")){
            LatLng cl = new LatLng(34.793735, 128.052862);
            mMap.addMarker(new MarkerOptions().position(cl).title("펠리스카페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("크란츠러카페")){
            LatLng cl = new LatLng(34.798342, 128.042290);
            mMap.addMarker(new MarkerOptions().position(cl).title("크란츠러카페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("엘가커피")){
            LatLng cl = new LatLng(34.901865, 128.023041);
            mMap.addMarker(new MarkerOptions().position(cl).title("엘가커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("라 벨라")){
            LatLng cl = new LatLng(34.797668, 128.044487);
            mMap.addMarker(new MarkerOptions().position(cl).title("라 벨라"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************남해*********************************************/

        /*************************************고성*********************************************/
        else if(cafeName.equals("폴라리스")){
            LatLng cl = new LatLng(35.063729, 128.478156);
            mMap.addMarker(new MarkerOptions().position(cl).title("폴라리스"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("소담수목원카페")){
            LatLng cl = new LatLng(35.063870, 128.464841);
            mMap.addMarker(new MarkerOptions().position(cl).title("소담수목원카페"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("당동박씨네커피")){
            LatLng cl = new LatLng(34.990843, 128.405127);
            mMap.addMarker(new MarkerOptions().position(cl).title("당동박씨네커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("디노커피")){
            LatLng cl = new LatLng(35.055931, 128.366666);
            mMap.addMarker(new MarkerOptions().position(cl).title("디노커피"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        else if(cafeName.equals("선셋")){
            LatLng cl = new LatLng(34.953828, 128.333335);
            mMap.addMarker(new MarkerOptions().position(cl).title("선셋"));
            mMap.moveCamera(CameraUpdateFactory.newLatLng(cl));

            mMap.moveCamera(CameraUpdateFactory.zoomTo(16));
        }
        /*************************************고성*********************************************/
    }
}
