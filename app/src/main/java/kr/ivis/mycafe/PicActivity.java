package kr.ivis.mycafe;

/**
 * Created by KimDongGle on 2017-12-11.
 */


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class PicActivity extends AppCompatActivity {

    //김도환
    ImageView pics, pics2, pics3, pics4, pics5;
    RelativeLayout pLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);

        pLayout = (RelativeLayout) findViewById(R.id.activity_pic);
        pLayout.setBackgroundColor(Color.rgb(255,217,236)); //레이아웃 색상 rgb값으로 설정

        pics = (ImageView) findViewById(R.id.cafePic); //첫번째 사진
        pics2 = (ImageView) findViewById(R.id.cafePic2); //두번째 사진
        pics3 = (ImageView) findViewById(R.id.cafePic3); //세번째 사진
        pics4 = (ImageView) findViewById(R.id.cafePic4); //네번째 사진
        pics5 = (ImageView) findViewById(R.id.cafePic5); //다섯번째 사진

        //앞서 넘겨받은 카페이름에 따라 아래 조건문에 적용
        String cafeName = getIntent().getStringExtra("CafeName");

        /*************************************창원*********************************************/
        if(cafeName.equals("1997영국집")) {

            //각 이미지들의 파일명에 따라 이미지뷰로 사진 보여주기
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ukhouse1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ukhouse2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ukhouse3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ukhouse4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ukhouse5));
        }
        else if(cafeName.equals("S9")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.s9_1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.s9_2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.s9_3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.s9_4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.s9_5));
        }
        else if(cafeName.equals("스페이스펀")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacefun1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacefun2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacefun3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacefun4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacefun5));
        }
        else if(cafeName.equals("가로수")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.garosu1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.garosu2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.garosu3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.garosu4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.garosu5));
        }
        else if(cafeName.equals("카페미뇽")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeminon1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeminon2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeminon3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeminon4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeminon5));
        }
        else if(cafeName.equals("스팀펑크")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.steampunk1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.steampunk2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.steampunk3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.steampunk4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.steampunk5));
        }
        else if(cafeName.equals("경성코페 귀곡점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kscofe1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kscofe2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kscofe3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kscofe4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kscofe5));
        }
        else if(cafeName.equals("타르타르 상남점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrtarr1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrtarr2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrtarr3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrtarr4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrtarr5));
        }
        else if(cafeName.equals("더 클라우드")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thecloud1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thecloud2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thecloud3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thecloud4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thecloud5));
        }
        else if(cafeName.equals("브라운핸즈")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.brownhands1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.brownhands2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.brownhands3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.brownhands4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.brownhands5));
        }
        else if(cafeName.equals("그래시헤이")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.grassyhay1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.grassyhay2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.grassyhay3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.grassyhay4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.grassyhay5));
        }
        else if(cafeName.equals("컴포즈 창원시청점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.compose1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.compose2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.compose3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.compose4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.compose5));
        }
        /*************************************창원*********************************************/

        /*************************************거창*********************************************/
        else if(cafeName.equals("카페외갓집")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeoegazip1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeoegazip2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeoegazip3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeoegazip4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeoegazip5));
        }
        else if(cafeName.equals("커피브라운")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebrown1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebrown2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebrown3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebrown4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebrown5));
        }
        else if(cafeName.equals("플래닛커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.planetcoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.planetcoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.planetcoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.planetcoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.planetcoffee5));
        }
        else if(cafeName.equals("뿌에블로젤라또")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pueblogelato1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pueblogelato2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pueblogelato3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pueblogelato4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pueblogelato5));
        }
        else if(cafeName.equals("코너131")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.corner131_1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.corner131_2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.corner131_3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.corner131_4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.corner131_5));
        }
        else if(cafeName.equals("더무그")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.themoog1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.themoog2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.themoog3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.themoog4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.themoog5));
        }
        else if(cafeName.equals("감성카페아메리카노")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamericano1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamericano2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamericano3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamericano4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamericano5));
        }
        else if(cafeName.equals("디애플스토리")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.theapplestory1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.theapplestory2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.theapplestory3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.theapplestory4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.theapplestory5));
        }
        else if(cafeName.equals("컵오브커피 거창점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cupofcoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cupofcoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cupofcoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cupofcoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cupofcoffee5));
        }
        else if(cafeName.equals("커피마루")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemaru1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemaru2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemaru3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemaru4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemaru5));
        }
        /*************************************거창*********************************************/

        /*************************************합천*********************************************/
        else if(cafeName.equals("님프")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nymph1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nymph2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nymph3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nymph4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nymph5));
        }
        else if(cafeName.equals("플로리안")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.florian1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.florian2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.florian3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.florian4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.florian5));
        }
        else if(cafeName.equals("카페리조트인더시티")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferesort1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferesort2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferesort3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferesort4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferesort5));
        }
        else if(cafeName.equals("인스커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.inscoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.inscoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.inscoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.inscoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.inscoffee5));
        }
        else if(cafeName.equals("커피베이 합천점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebay1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebay2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebay3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebay4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeebay5));
        }
        else if(cafeName.equals("이모하")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.imoha1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.imoha2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.imoha3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.imoha4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.imoha5));
        }
        else if(cafeName.equals("카페뮤즈")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemuse1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemuse2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemuse3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemuse4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemuse5));
        }
        else if(cafeName.equals("카페다온")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedaon1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedaon2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedaon3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedaon4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedaon5));
        }
        /*************************************합천*********************************************/

        /*************************************의령*********************************************/
        else if(cafeName.equals("그린프로그")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.greenfrog1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.greenfrog2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.greenfrog3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.greenfrog4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.greenfrog5));
        }
        else if(cafeName.equals("새콩커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.saecongcoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.saecongcoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.saecongcoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.saecongcoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.saecongcoffee5));
        }
        else if(cafeName.equals("카페세그루")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe3guru1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe3guru2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe3guru3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe3guru4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe3guru5));
        }
        else if(cafeName.equals("파인그로브")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pinegrove1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pinegrove2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pinegrove3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pinegrove4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pinegrove5));
        }
        else if(cafeName.equals("힐링카페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.healingcafe1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.healingcafe2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.healingcafe3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.healingcafe4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.healingcafe5));
        }
        /*************************************의령*********************************************/

        /*************************************창녕*********************************************/
        else if(cafeName.equals("노리")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nori1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nori2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nori3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nori4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nori5));
        }
        else if(cafeName.equals("모다페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.modafe1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.modafe2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.modafe3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.modafe4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.modafe5));
        }
        else if(cafeName.equals("카페89도씨")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe89c1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe89c2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe89c3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe89c4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe89c5));
        }
        else if(cafeName.equals("우포로와")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woopolowa1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woopolowa2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woopolowa3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woopolowa4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woopolowa5));
        }
        else if(cafeName.equals("슈가파우더")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sugarpouder1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sugarpouder2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sugarpouder3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sugarpouder4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sugarpouder5));
        }
        else if(cafeName.equals("커피볶는집 프리모")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.frimo1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.frimo2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.frimo3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.frimo4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.frimo5));
        }
        else if(cafeName.equals("카페파인")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafepine1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafepine2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafepine3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafepine4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafepine5));
        }
        /*************************************창녕*********************************************/

        /*************************************밀양*********************************************/
        else if(cafeName.equals("카페지디")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafegd1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafegd2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafegd3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafegd4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafegd5));
        }
        else if(cafeName.equals("마리옹")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.marion1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.marion2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.marion3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.marion4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.marion5));
        }
        else if(cafeName.equals("햇살이머무는정원")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunstaygarden1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunstaygarden2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunstaygarden3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunstaygarden4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunstaygarden5));
        }
        else if(cafeName.equals("트리인블루")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.treeinblue1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.treeinblue2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.treeinblue3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.treeinblue4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.treeinblue5));
        }
        else if(cafeName.equals("커피명가 밀양아랑점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemyungga1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemyungga2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemyungga3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemyungga4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeemyungga5));
        }
        else if(cafeName.equals("카페하비비")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.habibi1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.habibi2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.habibi3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.habibi4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.habibi5));
        }
        else if(cafeName.equals("메모리아")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.memoria1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.memoria2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.memoria3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.memoria4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.memoria5));
        }
        else if(cafeName.equals("노을이쁜카페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.noelcafe1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.noelcafe2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.noelcafe3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.noelcafe4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.noelcafe5));
        }
        else if(cafeName.equals("홀릭")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.holic1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.holic2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.holic3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.holic4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.holic5));
        }
        /*************************************밀양*********************************************/

        /*************************************양산*********************************************/
        else if(cafeName.equals("구름에반하다")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gureum1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gureum2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gureum3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gureum4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gureum5));
        }
        else if(cafeName.equals("스페이스나무")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacenamu1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacenamu2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacenamu3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacenamu4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.spacenamu5));
        }
        else if(cafeName.equals("스트롤링커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.strollingcoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.strollingcoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.strollingcoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.strollingcoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.strollingcoffee5));
        }
        else if(cafeName.equals("카페해바라기")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesunflower1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesunflower2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesunflower3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesunflower4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesunflower5));
        }
        else if(cafeName.equals("카페잍")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeit1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeit2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeit3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeit4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeit5));
        }
        else if(cafeName.equals("카페블루지앤")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafebluesien1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafebluesien2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafebluesien3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafebluesien4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafebluesien5));
        }
        else if(cafeName.equals("카페오조")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeojo1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeojo2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeojo3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeojo4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeojo5));
        }
        /*************************************양산*********************************************/

        /*************************************김해*********************************************/
        else if(cafeName.equals("카페달리아")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedalia1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedalia2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedalia3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedalia4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedalia5));
        }
        else if(cafeName.equals("낙도맨션")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nakdomansion1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nakdomansion2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nakdomansion3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nakdomansion4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.nakdomansion5));
        }
        else if(cafeName.equals("달카페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dalcafe1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dalcafe2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dalcafe3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dalcafe4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dalcafe5));
        }
        else if(cafeName.equals("마일커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.milecoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.milecoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.milecoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.milecoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.milecoffee5));
        }
        else if(cafeName.equals("도로시플레이트")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplate1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplate2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplate3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplate4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplate5));
        }
        else if(cafeName.equals("일루소")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.illuso1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.illuso2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.illuso3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.illuso4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.illuso5));
        }
        else if(cafeName.equals("솔렌더")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.solender1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.solender2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.solender3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.solender4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.solender5));
        }
        else if(cafeName.equals("필로")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pilo1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pilo2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pilo3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pilo4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pilo5));
        }
        else if(cafeName.equals("폴인커피강")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.fallincoffeekang1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.fallincoffeekang2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.fallincoffeekang3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.fallincoffeekang4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.fallincoffeekang5));
        }
        else if(cafeName.equals("카페오닉스")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeonyx1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeonyx2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeonyx3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeonyx4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeonyx5));
        }
        /*************************************김해*********************************************/

        /*************************************함안*********************************************/
        else if(cafeName.equals("그루브맨커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.groovemancoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.groovemancoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.groovemancoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.groovemancoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.groovemancoffee5));
        }
        else if(cafeName.equals("멜로우")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mellow1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mellow2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mellow3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mellow4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mellow5));
        }
        else if(cafeName.equals("카페타밀")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafetamil1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafetamil2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafetamil3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafetamil4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafetamil5));
        }
        else if(cafeName.equals("인터라켄")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.interlaken1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.interlaken2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.interlaken3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.interlaken4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.interlaken5));
        }
        else if(cafeName.equals("에이미스커피 경남함안점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.amyscoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.amyscoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.amyscoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.amyscoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.amyscoffee5));
        }
        else if(cafeName.equals("카페드아라")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedeara1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedeara2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedeara3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedeara4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafedeara5));
        }
        /*************************************함안*********************************************/

        /*************************************함양*********************************************/
        else if(cafeName.equals("케빈커피로스터스")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kevincoffeeroasters1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kevincoffeeroasters2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kevincoffeeroasters3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kevincoffeeroasters4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kevincoffeeroasters5));
        }
        else if(cafeName.equals("황금마차")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.goldenwagon1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.goldenwagon2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.goldenwagon3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.goldenwagon4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.goldenwagon5));
        }
        else if(cafeName.equals("다소니")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dasoni1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dasoni2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dasoni3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dasoni4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dasoni5));
        }
        else if(cafeName.equals("카페엔")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafen1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafen2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafen3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafen4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafen5));
        }
        else if(cafeName.equals("작은카페테이블")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.littlecafetable1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.littlecafetable2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.littlecafetable3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.littlecafetable4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.littlecafetable5));
        }
        /*************************************함양*********************************************/

        /*************************************거제*********************************************/
        else if(cafeName.equals("바람의핫도그")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.windshotdog1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.windshotdog2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.windshotdog3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.windshotdog4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.windshotdog5));
        }
        else if(cafeName.equals("포뷰")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.poview1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.poview2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.poview3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.poview4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.poview5));
        }
        else if(cafeName.equals("카페상상")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesangsang1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesangsang2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesangsang3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesangsang4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafesangsang5));
        }
        else if(cafeName.equals("에버어뮤즈")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamuse1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamuse2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamuse3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamuse4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamuse5));
        }
        else if(cafeName.equals("볼리에르")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.voriere1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.voriere2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.voriere3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.voriere4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.voriere5));
        }
        else if(cafeName.equals("섬타임")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sometime1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sometime2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sometime3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sometime4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sometime5));
        }
        else if(cafeName.equals("아나무라")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.anamura1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.anamura2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.anamura3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.anamura4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.anamura5));
        }
        else if(cafeName.equals("블루밍제이")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bloomingj1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bloomingj2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bloomingj3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bloomingj4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bloomingj5));
        }
        else if(cafeName.equals("블랙업커피 거제점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackupcoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackupcoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackupcoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackupcoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackupcoffee5));
        }
        /*************************************거제*********************************************/

        /*************************************통영*********************************************/
        else if(cafeName.equals("카페울라봉")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woolabong1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woolabong2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woolabong3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woolabong4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.woolabong5));
        }
        else if(cafeName.equals("꿀단지")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeyjar1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeyjar2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeyjar3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeyjar4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeyjar5));
        }
        else if(cafeName.equals("카페바다봄")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.badabom1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.badabom2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.badabom3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.badabom4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.badabom5));
        }
        else if(cafeName.equals("헤이수오미")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.heisuomi1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.heisuomi2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.heisuomi3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.heisuomi4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.heisuomi5));
        }
        else if(cafeName.equals("까사베르데")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.casaverde1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.casaverde2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.casaverde3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.casaverde4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.casaverde5));
        }
        else if(cafeName.equals("안트워프커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.antwarp1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.antwarp2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.antwarp3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.antwarp4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.antwarp5));
        }
        else if(cafeName.equals("바이사이드")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.byside1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.byside2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.byside3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.byside4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.byside5));
        }
        else if(cafeName.equals("카페이봄")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe2bom1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe2bom2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe2bom3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe2bom4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafe2bom5));
        }
        else if(cafeName.equals("보다나은")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bodanaeun1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bodanaeun2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bodanaeun3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bodanaeun4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.bodanaeun5));
        }
        /*************************************통영*********************************************/

        /*************************************사천*********************************************/
        else if(cafeName.equals("커피레")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeleh1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeleh2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeleh3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeleh4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeleh5));
        }
        else if(cafeName.equals("모엘루")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.moellu1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.moellu2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.moellu3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.moellu4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.moellu5));
        }
        else if(cafeName.equals("카페코끼리")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafekokkiri1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafekokkiri2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafekokkiri3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafekokkiri4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafekokkiri5));
        }
        else if(cafeName.equals("카페정미소")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafejungmiso1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafejungmiso2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafejungmiso3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafejungmiso4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafejungmiso5));
        }
        else if(cafeName.equals("타르팩토리")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrfactory1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrfactory2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrfactory3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrfactory4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.tarrfactory5));
        }
        else if(cafeName.equals("더웨이닝커피 삼천포대교점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thewainingcoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thewainingcoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thewainingcoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thewainingcoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.thewainingcoffee5));
        }
        else if(cafeName.equals("커피필라멘트")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeefilament1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeefilament2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeefilament3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeefilament4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeefilament5));
        }
        /*************************************사천*********************************************/

        /*************************************진주*********************************************/
        else if(cafeName.equals("마미니")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mamini1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mamini2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mamini3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mamini4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.mamini5));
        }
        else if(cafeName.equals("펄디스트릭")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pearldistrict1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pearldistrict2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pearldistrict3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pearldistrict4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pearldistrict5));
        }
        else if(cafeName.equals("블랙바닐라")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackvanilla1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackvanilla2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackvanilla3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackvanilla4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blackvanilla5));
        }
        else if(cafeName.equals("카페아르볼")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafearbol1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafearbol2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafearbol3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafearbol4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafearbol5));
        }
        else if(cafeName.equals("울트라블루")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ultrablue1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ultrablue2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ultrablue3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ultrablue4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.ultrablue5));
        }
        else if(cafeName.equals("로스팅웨어")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.roastingware1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.roastingware2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.roastingware3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.roastingware4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.roastingware5));
        }
        else if(cafeName.equals("허니타임")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeytime1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeytime2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeytime3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeytime4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.honeytime5));
        }
        else if(cafeName.equals("소확행")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sohwakhang1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sohwakhang2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sohwakhang3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sohwakhang4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sohwakhang5));
        }
        /*************************************진주*********************************************/

        /*************************************하동*********************************************/
        else if(cafeName.equals("카페로드100")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferoad100_1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferoad100_2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferoad100_3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferoad100_4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.caferoad100_5));
        }
        else if(cafeName.equals("블리스커피 보문점")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blisscoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blisscoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blisscoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blisscoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.blisscoffee5));
        }
        else if(cafeName.equals("품안")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pooman1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pooman2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pooman3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pooman4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.pooman5));
        }
        else if(cafeName.equals("누마루한옥커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.numaru1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.numaru2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.numaru3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.numaru4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.numaru5));
        }
        else if(cafeName.equals("소더비")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sotheby1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sotheby2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sotheby3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sotheby4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sotheby5));
        }
        else if(cafeName.equals("커피앤크레마")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeandcrema1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeandcrema2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeandcrema3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeandcrema4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.coffeeandcrema5));
        }
        else if(cafeName.equals("한옥카페부연")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.buyeon1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.buyeon2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.buyeon3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.buyeon4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.buyeon5));
        }
        /*************************************하동*********************************************/

        /*************************************산청*********************************************/
        else if(cafeName.equals("카페아모르")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamor1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamor2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamor3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamor4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeamor5));
        }
        else if(cafeName.equals("카페플래닛27")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplanet27_1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplanet27_2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplanet27_3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplanet27_4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeplanet27_5));
        }
        else if(cafeName.equals("카페솔직한곰")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gom1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gom2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gom3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gom4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.gom5));
        }
        else if(cafeName.equals("카페엘림")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeelim1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeelim2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeelim3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeelim4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeelim5));
        }
        else if(cafeName.equals("카페모티")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemotea1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemotea2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemotea3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemotea4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafemotea5));
        }
        /*************************************산청*********************************************/

        /*************************************남해*********************************************/
        else if(cafeName.equals("쿤스트라운지")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kunstlounge1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kunstlounge2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kunstlounge3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kunstlounge4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kunstlounge5));
        }
        else if(cafeName.equals("코나하우스")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.konahouse1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.konahouse2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.konahouse3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.konahouse4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.konahouse5));
        }
        else if(cafeName.equals("카페유자")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeyuja1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeyuja2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeyuja3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeyuja4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.cafeyuja5));
        }
        else if(cafeName.equals("펠리스카페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.felizcafe1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.felizcafe2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.felizcafe3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.felizcafe4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.felizcafe5));
        }
        else if(cafeName.equals("크란츠러카페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kranzler1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kranzler2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kranzler3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kranzler4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.kranzler5));
        }
        else if(cafeName.equals("엘가커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.lgacoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.lgacoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.lgacoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.lgacoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.lgacoffee5));
        }
        else if(cafeName.equals("라 벨라")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.labella1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.labella2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.labella3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.labella4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.labella5));
        }
        /*************************************남해*********************************************/

        /*************************************고성*********************************************/
        else if(cafeName.equals("폴라리스")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.polaris1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.polaris2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.polaris3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.polaris4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.polaris5));
        }
        else if(cafeName.equals("소담수목원카페")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sodam1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sodam2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sodam3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sodam4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sodam5));
        }
        else if(cafeName.equals("당동박씨네커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dangdong1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dangdong2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dangdong3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dangdong4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dangdong5));
        }
        else if(cafeName.equals("디노커피")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dinocoffee1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dinocoffee2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dinocoffee3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dinocoffee4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.dinocoffee5));
        }
        else if(cafeName.equals("선셋")) {
            pics.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunset1));
            pics2.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunset2));
            pics3.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunset3));
            pics4.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunset4));
            pics5.setImageDrawable(ContextCompat.getDrawable(PicActivity.this,
                    R.drawable.sunset5));
        }
        /*************************************고성*********************************************/


    }
}

