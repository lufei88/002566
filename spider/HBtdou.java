package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBtdou extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f59short = {3269, 3299, 3317, 3298, 3261, 3281, 3319, 3317, 3326, 3300, 427, 424, 416, 431, 433, 424, 416, 431, 492, 416, 431, 421, 435, 430, 424, 421, 494, 498, 503, 497, 3323, 3297, 3312, 3300, 3301, 3321, 2003, 1944, 1948, 1947, 1989, 2013, 1949, 1985, 2028, 1944, 1998, 2014, 2000, 1990, 2002, 1986, 1947, 2029, 2041, 1939, 2031, 2024, 1938, 1988, 1992, 2046, 2002, 2020, 1991, 1995, 2017, 1925, 2043, 2043, 2019, 2027, 1984, 1993, 2014, 1990, 2017, 1987, 2031, 2012, 1393, 1404, 1379, 1339, 1379, 1404, 1393, 1392, 1402, 1336, 1404, 1400, 1396, 1394, 1392, 1333, 1323, 1333, 1404, 1400, 1394, 685, 672, 696, 1273, 1253, 1253, 1249, 1250, 1195, 1214, 1214, 1253, 1252, 1275, 1252, 1215, 1266, 1266, 546, 547, 562, 2297, 2286, 2287, 2287, 2292, 2293, 2229, 2283, 2295, 2298, 2274, 2295, 2290, 2280, 2287, 2230, 2287, 2298, 2297, 3295, 3282, 3277, 3221, 3275, 3287, 3290, 3266, 3287, 3282, 3272, 3279, 3222, 3292, 3273, 3284, 3278, 3275, 748, 748, 748, 2005, 503, 493, 506, 505, 581, 3307, 3302, 3321, 3233, 3321, 3302, 3307, 3306, 3296, 3234, 3302, 3297, 3305, 3296, 3247, 3249, 3247, 3327, 3144, 3198, 3198, 3198, 3198, 3182, 18119, 27678, 29984, 2174, 3285, 3282, 3276, 3205, 3219, 3300, 3208, 3323, 3326, 3206, 3325, 3210, 3209, 559, 628, 639, 557, 628, 625, 638, 637, 613, 566, 634, 613, 637, 633, 638, 631, 557, 752, 700, 703, 677, 702, 675, 747, 2769, 2765, 2765, 2761, 2762, 2691, 2710, 2710, 2765, 2764, 2771, 2764, 2711, 2778, 2778, 2710, 2762, 2780, 2776, 2763, 2778, 2769, 2711, 2761, 2769, 2761, 2694, 2760, 2764, 2780, 2763, 2752, 2692, 432, 486, 427, 2805, 2786, 2804, 2802, 2795, 2803, 2804, 2782, 2755, 2782, 2758, 2767, 2153, 2165, 2165, 2161, 2162, 2107, 2094, 2094, 2165, 2164, 2155, 2164, 2095, 2146, 2146, 2094, 2152, 2156, 2144, 2150, 2148, 2162, 2094, 1282, 1286, 1292, 1332, 1304, 1305, 1288, 650, 662, 662, 658, 657, 728, 717, 717, 662, 663, 648, 663, 716, 641, 641, 2353, 2347, 2364, 2367, 2107};
    public String a;

    public static HashMap a() {
        return C0019.m4127(C0032.m5708(m377(), 0, 10, 3216), C0049.m8007(m377(), 10, 20, 449), C0047.m7833(m377(), 30, 6, 3249), C0023.m4536(m377(), 36, 44, 1962));
    }

    /* renamed from: ۟ۤ۟ۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m377() {
        if (C0001.m1164() <= 0) {
            return f59short;
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0047.m7818(1, str2), C0011.m2808(20), C0054.m8556(str2, 1, 20), arrayList);
    }

    public String detailContent(List<String> list) {
        String strM8007;
        h hVarM3577 = C0016.m3577(C0032.m5769((String) C0048.m7915(list, 0), C0032.m5711()));
        String strM1645 = C0005.m1645(m377(), 80, 21, 1301);
        String strM8058 = C0049.m8058(C0030.m5333(hVarM3577, strM1645), C0014.m3332(m377(), 101, 3, 716));
        String strM7151 = C0042.m7151(m377(), 104, 15, 1169);
        StringBuilder sb = new StringBuilder(strM7151);
        C0018.m3933(sb, C0049.m8058(C0030.m5333(hVarM3577, strM1645), C0029.m5256(m377(), 119, 3, 593)));
        String strM7763 = C0047.m7763(sb);
        d dVarM5333 = C0030.m5333(hVarM3577, C0055.m8814(m377(), 122, 19, 2203));
        d dVarM53332 = C0030.m5333(hVarM3577, C0055.m8814(m377(), 141, 18, 3259));
        PrintStream printStreamM6087 = C0035.m6087();
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, strM8058);
        C0018.m3933(sb2, strM7763);
        C0012.m2969(printStreamM6087, C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (true) {
            boolean zM2962 = C0012.m2962(itM7807);
            strM8007 = C0049.m8007(m377(), 159, 3, 712);
            if (!zM2962) {
                break;
            }
            m mVar = (m) C0048.m7949(itM7807);
            C0018.m3933(sb3, C0016.m3579());
            C0018.m3933(sb3, C0064.m9669(mVar));
            C0018.m3933(sb3, strM8007);
        }
        StringBuilder sb4 = new StringBuilder(C0007.m1840());
        Iterator itM78072 = C0047.m7807(dVarM53332);
        while (C0012.m2962(itM78072)) {
            Iterator itM78073 = C0047.m7807(C0030.m5333((m) C0048.m7949(itM78072), C0065.m9775(m377(), 162, 1, 1972)));
            while (C0012.m2962(itM78073)) {
                m mVar2 = (m) C0048.m7949(itM78073);
                String strM9669 = C0064.m9669(mVar2);
                StringBuilder sb5 = new StringBuilder(strM7151);
                C0018.m3933(sb5, C0010.m2339(mVar2, C0045.m7657(m377(), 163, 4, 415)));
                String strM77632 = C0047.m7763(sb5);
                C0018.m3933(sb4, strM9669);
                C0062.m9399(sb4, '$');
                C0018.m3933(sb4, strM77632);
                String strM3917 = C0018.m3917(m377(), 167, 1, 571);
                C0018.m3933(sb4, strM3917);
                C0018.m3933(sb4, strM8058);
                C0018.m3933(sb4, strM3917);
                C0018.m3933(sb4, strM9669);
                C0062.m9399(sb4, '#');
            }
            C0018.m3933(sb4, strM8007);
        }
        String strM7290 = C0043.m7290(m377(), 168, 18, 3215);
        String strM96692 = C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, strM7290), 2));
        com.github.catvod.spider.merge.E.m mVar3 = new com.github.catvod.spider.merge.E.m();
        C0017.m3671(mVar3, strM96692);
        C0058.m9152(mVar3, C0064.m9669((m) C0028.m5161(C0030.m5333(hVarM3577, strM7290), 3)));
        C0027.m5000(mVar3, C0055.m8703());
        C0011.m2828(mVar3, (String) C0048.m7915(list, 0));
        C0026.m4947(mVar3, strM7763);
        C0005.m1628(mVar3, strM8058);
        C0054.m8596(mVar3, C0000.m1096(sb3));
        C0044.m7449(mVar3, C0000.m1096(sb4));
        return C0053.m8428(mVar3);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listM1203 = C0001.m1203(new String[]{C0028.m5109(m377(), 186, 6, 3133)});
        List listM12032 = C0001.m1203(new String[]{C0062.m9389(m377(), 192, 3, 2050)});
        for (int i = 0; i < C0064.m9636(listM1203); i++) {
            C0004.m1532(arrayList, new b((String) C0048.m7915(listM1203, i), (String) C0048.m7915(listM12032, i), null));
        }
        return C0003.m1448(C0007.m1857(this), null, arrayList);
    }

    public void init(Context context, String str) {
        C0051.m8194(C0035.m6110());
        if (str != null) {
            this.a = str;
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String[] strArrM4752 = C0024.m4752(str2, C0030.m5362(m377(), 195, 1, 2048));
        String str3 = null;
        String strM4952 = C0026.m4952(C0026.m4952(C0012.m3038(C0006.m1778(C0026.m4952((strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0]), C0055.m8814(m377(), 196, 13, 3232)))));
        String str4 = (strArrM4752.length <= 1 || C0057.m8953(strArrM4752[1])) ? null : strArrM4752[1];
        if (strArrM4752.length > 2 && !C0057.m8953(strArrM4752[2])) {
            str3 = strArrM4752[2];
        }
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0000.m1077(m377(), 209, 17, 528));
        C0018.m3933(sb, str4);
        C0018.m3933(sb, C0042.m7151(m377(), 226, 7, 726));
        C0018.m3933(sb, str3);
        String strM7763 = C0047.m7763(sb);
        g gVarM9311 = C0060.m9311(0, strM4952);
        C0057.m9029(gVarM9311, C0032.m5711());
        C0002.m1282(gVarM9311, strM7763);
        return C0033.m5828(gVarM9311);
    }

    public String searchContent(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(C0044.m7509(m377(), 233, 33, 2745));
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0011.m2805(m377(), 266, 3, 406));
        C0018.m3933(sb, str2);
        JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0032.m5769(C0047.m7763(sb), C0032.m5711())), C0054.m8574(m377(), 269, 7, 2695));
        for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
            String strM1212 = C0001.m1212(C0018.m3923(jSONArrayM4333, 0), C0039.m6551(m377(), 276, 5, 2730));
            StringBuilder sb2 = new StringBuilder(C0065.m9775(m377(), 281, 23, 2049));
            C0018.m3933(sb2, C0001.m1212(C0018.m3923(jSONArrayM4333, 0), C0014.m3332(m377(), 304, 7, 1387)));
            String strM7763 = C0047.m7763(sb2);
            StringBuilder sb3 = new StringBuilder(C0029.m5256(m377(), 311, 15, 738));
            C0018.m3933(sb3, C0001.m1212(C0018.m3923(jSONArrayM4333, 0), C0033.m5852(m377(), 326, 4, 2393)));
            C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.m(C0047.m7763(sb3), strM1212, strM7763));
        }
        return C0047.m7783(arrayList);
    }

    public String searchContent(String str, boolean z) {
        return C0008.m2016(this, str, C0061.m9361(m377(), 330, 1, 2058), true);
    }
}