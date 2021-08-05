package com.example.doan.Data;

import android.content.Context;

import com.example.doan.Model.Category;
import com.example.doan.Model.Food;
import com.example.doan.R;

import java.util.ArrayList;

public class Input {
    private Context context;
    Food food = new Food();

    public Input(Context context)
    {
        this.context = context;
    }
    public ArrayList<Food> getMockData(){
        ArrayList<Food> tmp = new ArrayList<>();
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name1),context.getString(R.string.cach_lam1),R.drawable.bunbohue,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name2),context.getString(R.string.cach_lam2),R.drawable.bunrieucua,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name3),context.getString(R.string.cach_lam3),R.drawable.bunbanthaihaisan,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name4),context.getString(R.string.cach_lam4),R.drawable.bunmiquang,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name5),context.getString(R.string.cach_lam5),R.drawable.bunmangvit,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name6),context.getString(R.string.cach_lam6),R.drawable.buncha,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name7),context.getString(R.string.cach_lam7),R.drawable.canhbohamdaungu,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name8),context.getString(R.string.cach_lam8),R.drawable.canhvitnauchao,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name9),context.getString(R.string.cach_lam9),R.drawable.bongthapcam,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name10),context.getString(R.string.cach_lam10),R.drawable.canhrongbien,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name11),context.getString(R.string.cach_lam11),R.drawable.canhthitbo,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name12),context.getString(R.string.cach_lam12),R.drawable.chaoqin,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name13),context.getString(R.string.cach_lam13),R.drawable.chaobocau,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name14),context.getString(R.string.cach_lam14),R.drawable.chaosingapore,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name15),context.getString(R.string.cach_lam15),R.drawable.chaoga,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name16),context.getString(R.string.cach_lam16),R.drawable.chaoluon,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name17),context.getString(R.string.cach_lam17),R.drawable.chaotom,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name18),context.getString(R.string.cach_lam18),R.drawable.chebuoi,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name19),context.getString(R.string.cach_lam19),R.drawable.chechuoi,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name20),context.getString(R.string.cach_lam20),R.drawable.chehatdac,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name21),context.getString(R.string.cach_lam21),R.drawable.chehatke,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name22),context.getString(R.string.cach_lam22),R.drawable.chekhucbach,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name23),context.getString(R.string.cach_lam23),R.drawable.boluclac,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name24),context.getString(R.string.cach_lam24),R.drawable.canhgachienncmam,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name25),context.getString(R.string.cach_lam25),R.drawable.comchienhaisan,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name26),context.getString(R.string.cach_lam26),R.drawable.comchientrung,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name28),context.getString(R.string.cach_lam28),R.drawable.mucchienncmam,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name29),context.getString(R.string.cach_lam29),R.drawable.goibanhtrangcuon,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name30),context.getString(R.string.cach_lam30),R.drawable.goikimchi,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name31),context.getString(R.string.cach_lam31),R.drawable.goibocop,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name32),context.getString(R.string.cach_lam32),R.drawable.goimuc,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name33),context.getString(R.string.cach_lam33),R.drawable.goisua,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name34),context.getString(R.string.cach_lam34),R.drawable.hapcachephapbia,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name35),context.getString(R.string.cach_lam35),R.drawable.hapcalochap,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name36),context.getString(R.string.cach_lam36),R.drawable.hapcamehap,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name37),context.getString(R.string.cach_lam37),R.drawable.hapgahapmuoi,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name38),context.getString(R.string.cach_lam38),R.drawable.haptomhumhap,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name39),context.getString(R.string.cach_lam39),R.drawable.khocanuc,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name40),context.getString(R.string.cach_lam40),R.drawable.khobokho,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name41),context.getString(R.string.cach_lam41),R.drawable.khocalockhonghe,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name42),context.getString(R.string.cach_lam42),R.drawable.khocakhotop,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name43),context.getString(R.string.cach_lam43),R.drawable.khoheokho,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name44),context.getString(R.string.cach_lam44),R.drawable.khogakho,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name45),context.getString(R.string.cach_lam45),R.drawable.laugalagiang,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name46),context.getString(R.string.cach_lam46),R.drawable.laudeham,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name47),context.getString(R.string.cach_lam47),R.drawable.laugalae,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name48),context.getString(R.string.cach_lam48),R.drawable.lauthai,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name49),context.getString(R.string.cach_lam49),R.drawable.mutkhoaitay,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name50),context.getString(R.string.cach_lam50),R.drawable.muttao,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name51),context.getString(R.string.cach_lam51),R.drawable.mutbidao,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name52),context.getString(R.string.cach_lam52),R.drawable.mutkhoailang,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name53),context.getString(R.string.cach_lam53),R.drawable.chebuoi,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name54),context.getString(R.string.cach_lam54),R.drawable.chechuoi,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name55),context.getString(R.string.cach_lam55),R.drawable.nuongbobittet,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name56),context.getString(R.string.cach_lam56),R.drawable.nuongcagiaybac,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name57),context.getString(R.string.cach_lam57),R.drawable.nuongmuc,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name58),context.getString(R.string.cach_lam58),R.drawable.nuongsolong,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name59),context.getString(R.string.cach_lam59),R.drawable.nuongvit,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name60),context.getString(R.string.cach_lam60),R.drawable.nuongcaloc,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name61),context.getString(R.string.cach_lam61),R.drawable.xaolongheo,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name62),context.getString(R.string.cach_lam62),R.drawable.xaomiy,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name63),context.getString(R.string.cach_lam63),R.drawable.xaobachtuoc,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name64),context.getString(R.string.cach_lam64),R.drawable.xaocatim,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name65),context.getString(R.string.cach_lam65),R.drawable.xaomuc,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name66),context.getString(R.string.cach_lam66),R.drawable.xoiga,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name67),context.getString(R.string.cach_lam67),R.drawable.xoichienphong,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name68),context.getString(R.string.cach_lam68),R.drawable.xoikhoaimon,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name69),context.getString(R.string.cach_lam69),R.drawable.xoitraxanh,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name70),context.getString(R.string.cach_lam70),R.drawable.xoicaro,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name71),context.getString(R.string.cach_lam71),R.drawable.avbanhducman,0));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name72),context.getString(R.string.cach_lam72),R.drawable.avgoicuonthitheo,1));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name73),context.getString(R.string.cach_lam73),R.drawable.avkhoga,1));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name74),context.getString(R.string.cach_lam74),R.drawable.avnemchua,1));
        return  tmp;
    }
    public ArrayList<Category> getMockDataCategory(){
        ArrayList<Category> tmp = new ArrayList<>();
        tmp.add(new Category("Món Bún", R.drawable.bunbohue));
        tmp.add(new Category("Món Canh",R.drawable.canhthitbo));
        tmp.add(new Category("Món Chiên",R.drawable.canhgachienncmam));
        tmp.add(new Category("Món Cháo",R.drawable.chaosingapore));
        tmp.add(new Category("Món Ăn Vặt",R.drawable.avkhoga));
        tmp.add(new Category("Món Chè",R.drawable.chekhucbach));
        tmp.add(new Category("Món Gỏi",R.drawable.goisua));
        tmp.add(new Category("Món Hấp",R.drawable.hapgahapmuoi));
        tmp.add(new Category("Món Kho",R.drawable.khoheokho));
        tmp.add(new Category("Món Lẩu",R.drawable.laugalagiang));
        tmp.add(new Category("Món Mứt",R.drawable.mutbidao));
        tmp.add(new Category("Món Nướng",R.drawable.nuongsolong));
        tmp.add(new Category("Món Xào",R.drawable.xaolongheo));
        tmp.add(new Category("Món Xôi",R.drawable.xoiga));
        return tmp;

    }
    public ArrayList<Food> getFoodFromCategory(int pos)
    {
        ArrayList<Food> tmp = new ArrayList<>();
        switch (pos){
            case 0:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name1),context.getString(R.string.cach_lam1),R.drawable.bunbohue,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name2),context.getString(R.string.cach_lam2),R.drawable.bunrieucua,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name3),context.getString(R.string.cach_lam3),R.drawable.bunbanthaihaisan,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name4),context.getString(R.string.cach_lam4),R.drawable.bunmiquang,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name5),context.getString(R.string.cach_lam5),R.drawable.bunmangvit,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name6),context.getString(R.string.cach_lam6),R.drawable.buncha,0));
                break;
            case 1:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name7),context.getString(R.string.cach_lam7),R.drawable.canhbohamdaungu,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name8),context.getString(R.string.cach_lam8),R.drawable.canhvitnauchao,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name9),context.getString(R.string.cach_lam9),R.drawable.bongthapcam,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name10),context.getString(R.string.cach_lam10),R.drawable.canhrongbien,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name11),context.getString(R.string.cach_lam11),R.drawable.canhthitbo,0));

                break;
            case 2:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name23),context.getString(R.string.cach_lam23),R.drawable.boluclac,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name24),context.getString(R.string.cach_lam24),R.drawable.canhgachienncmam,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name25),context.getString(R.string.cach_lam25),R.drawable.comchienhaisan,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name26),context.getString(R.string.cach_lam26),R.drawable.comchientrung,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name28),context.getString(R.string.cach_lam28),R.drawable.mucchienncmam,0));
                break;
            case 3:


                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name13),context.getString(R.string.cach_lam13),R.drawable.chaobocau,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name14),context.getString(R.string.cach_lam14),R.drawable.chaosingapore,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name15),context.getString(R.string.cach_lam15),R.drawable.chaoga,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name16),context.getString(R.string.cach_lam16),R.drawable.chaoluon,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name17),context.getString(R.string.cach_lam17),R.drawable.chaotom,0));
                break;
            case 4:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name71),context.getString(R.string.cach_lam71),R.drawable.avbanhducman,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name72),context.getString(R.string.cach_lam72),R.drawable.avgoicuonthitheo,1));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name73),context.getString(R.string.cach_lam73),R.drawable.avkhoga,1));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name74),context.getString(R.string.cach_lam74),R.drawable.avnemchua,1));
                break;
            case 5:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name18),context.getString(R.string.cach_lam18),R.drawable.chebuoi,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name19),context.getString(R.string.cach_lam19),R.drawable.chechuoi,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name20),context.getString(R.string.cach_lam20),R.drawable.chehatdac,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name21),context.getString(R.string.cach_lam21),R.drawable.chehatke,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name22),context.getString(R.string.cach_lam22),R.drawable.chekhucbach,0));
                break;
            case 6:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name31),context.getString(R.string.cach_lam31),R.drawable.goibocop,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name32),context.getString(R.string.cach_lam32),R.drawable.goimuc,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name33),context.getString(R.string.cach_lam33),R.drawable.goisua,0));
                break;
            case 7:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name34),context.getString(R.string.cach_lam34),R.drawable.hapcachephapbia,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name35),context.getString(R.string.cach_lam35),R.drawable.hapcalochap,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name36),context.getString(R.string.cach_lam36),R.drawable.hapcamehap,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name37),context.getString(R.string.cach_lam37),R.drawable.hapgahapmuoi,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name38),context.getString(R.string.cach_lam38),R.drawable.haptomhumhap,0));

                break;
            case 8:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name40),context.getString(R.string.cach_lam40),R.drawable.khobokho,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name41),context.getString(R.string.cach_lam41),R.drawable.khocalockhonghe,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name42),context.getString(R.string.cach_lam42),R.drawable.khocakhotop,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name43),context.getString(R.string.cach_lam43),R.drawable.khoheokho,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name44),context.getString(R.string.cach_lam44),R.drawable.khogakho,0));
                break;
            case 9:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name45),context.getString(R.string.cach_lam45),R.drawable.laugalagiang,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name46),context.getString(R.string.cach_lam46),R.drawable.laudeham,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name47),context.getString(R.string.cach_lam47),R.drawable.laugalae,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name48),context.getString(R.string.cach_lam48),R.drawable.lauthai,0));
                break;
            case 10:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name49),context.getString(R.string.cach_lam49),R.drawable.mutkhoaitay,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name50),context.getString(R.string.cach_lam50),R.drawable.muttao,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name51),context.getString(R.string.cach_lam51),R.drawable.mutbidao,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name52),context.getString(R.string.cach_lam52),R.drawable.mutkhoailang,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name53),context.getString(R.string.cach_lam53),R.drawable.chebuoi,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name54),context.getString(R.string.cach_lam54),R.drawable.chechuoi,0));
                break;
            case 11:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name55),context.getString(R.string.cach_lam55),R.drawable.nuongbobittet,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name56),context.getString(R.string.cach_lam56),R.drawable.nuongcagiaybac,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name57),context.getString(R.string.cach_lam57),R.drawable.nuongmuc,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name58),context.getString(R.string.cach_lam58),R.drawable.nuongsolong,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name59),context.getString(R.string.cach_lam59),R.drawable.nuongvit,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name60),context.getString(R.string.cach_lam60),R.drawable.nuongcaloc,0));
                break;
            case 12:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name61),context.getString(R.string.cach_lam61),R.drawable.xaolongheo,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name62),context.getString(R.string.cach_lam62),R.drawable.xaomiy,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name63),context.getString(R.string.cach_lam63),R.drawable.xaobachtuoc,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name64),context.getString(R.string.cach_lam64),R.drawable.xaocatim,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name65),context.getString(R.string.cach_lam65),R.drawable.xaomuc,0));


                break;
            case 13:
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name66),context.getString(R.string.cach_lam66),R.drawable.xoiga,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name67),context.getString(R.string.cach_lam67),R.drawable.xoichienphong,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name68),context.getString(R.string.cach_lam68),R.drawable.xoikhoaimon,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name69),context.getString(R.string.cach_lam69),R.drawable.xoitraxanh,0));
                tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name70),context.getString(R.string.cach_lam70),R.drawable.xoicaro,0));
                break;
        }
        return  tmp;
    }
    public static ArrayList<Food> foodHistory = new ArrayList<>();


    public static ArrayList<Food> getFoodHistory() {
        return foodHistory;
    }

}
