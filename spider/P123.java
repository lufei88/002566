package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.C0259u;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class P123 extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f94short = {1905, 1916, 1909, 1888, 1270, 1257, 1252, 1253, 1263, 2621, 2684, 2687, 2686, -27959, 2670, 357, 354, 273, 276, 357, 279, 353, 355, 366, 465, 2844, 2897, 2901, 2844, 2747, 2780, 2774, 2752, 2754, 2747, 2746, 2725, 2726, 2727, 2786, 2813, 2788, 2395, 2330, 2329, 2328, 23220, 2312, 2554, 2554, 2554, 2006, 2001, 1954, 1959, 2006, 1956, 2002, 2000, 2013, 1107, 1076, 1086, 1064, 1066, 1107, 1106, 1101, 1102, 1103, 1034, 1045, 1036, 2015, 2015, 2015, 2091, 2103, 2103, 2099, 2169, 2156, 2156, 2847, 2819, 2819, 2823, 2820, 2893, 2904, 2904, 836, 1133, 1073, 1078, 1069, 1072, 1059, 1061, 1063, 2199, 2184, 2347, 2338, 2360, 2339, 2350, 3004, 3019, 3004, 3019};

    public static Object[] proxy(Map<String, String> map) {
        if (!C0007.m1815(C0029.m5256(m520(), 4, 5, 1152), (String) C0062.m9431(map, C0065.m9775(m520(), 0, 4, 1797)))) {
            return null;
        }
        C0047.m7777(C0034.m6004());
        return C0006.m1762(map);
    }

    /* renamed from: ۟ۤ۠ۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m520() {
        if (C0052.m8320() >= 0) {
            return f94short;
        }
        return null;
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        StringBuilder sb;
        String strM6551 = C0039.m6551(m520(), 9, 6, 2637);
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0036.m6188(m520(), 15, 9, 330)), (String) C0048.m7915(list, 0));
            if (C0003.m1405(matcherM6026)) {
                String strM4306 = C0021.m4306(matcherM6026, 1);
                C0047.m7777(C0034.m6004());
                if (C0058.m9127(C0033.m5823(strM4306, C0017.m3646(m520(), 24, 1, 481)), C0021.m4340(m520(), 25, 4, 2878))) {
                    boolean zM3650 = C0017.m3650(C0026.m4951(m520(), 29, 13, 2708));
                    String strM1645 = C0005.m1645(m520(), 42, 6, 2347);
                    if (zM3650) {
                        sb = new StringBuilder(strM1645);
                        C0036.m6177(sb, i);
                    } else {
                        StringBuilder sb2 = new StringBuilder(strM6551);
                        C0036.m6177(sb2, i);
                        C0004.m1532(arrayList, C0047.m7763(sb2));
                        sb = new StringBuilder(strM1645);
                        C0036.m6177(sb, i);
                    }
                    C0004.m1532(arrayList, C0047.m7763(sb));
                }
            }
        } catch (Exception unused) {
        }
        return C0036.m6194(C0045.m7657(m520(), 48, 3, 2526), arrayList);
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            try {
                Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0010.m2300(m520(), 51, 9, 2041)), (String) C0048.m7949(itM3109));
                if (C0003.m1405(matcherM6026)) {
                    String strM4306 = C0021.m4306(matcherM6026, 1);
                    C0047.m7777(C0034.m6004());
                    String strM7621 = C0045.m7621(strM4306);
                    if (!C0017.m3650(C0035.m6131(m520(), 60, 13, 1148))) {
                        C0004.m1532(arrayList, strM7621);
                    }
                    C0004.m1532(arrayList, strM7621);
                }
            } catch (Exception unused) {
            }
        }
        return C0036.m6194(C0017.m3646(m520(), 73, 3, 2043), arrayList);
    }

    public void init(Context context, String str) {
        String strM5769 = str;
        if (C0058.m9127(strM5769, C0017.m3646(m520(), 76, 7, 2115)) || C0058.m9127(strM5769, C0018.m3917(m520(), 83, 8, 2935))) {
            strM5769 = C0032.m5769(strM5769, null);
        }
        C0259u c0259uM6004 = C0034.m6004();
        C0047.m7777(c0259uM6004);
        if (!C0040.m6623(new CharSequence[]{strM5769}) || !C0058.m9127(strM5769, C0046.m7718(m520(), 91, 1, 874)) || C0058.m9127(strM5769, C0003.m1398(m520(), 92, 8, 1090)) || C0058.m9127(strM5769, C0013.m3106(m520(), 100, 2, 2232)) || C0058.m9127(strM5769, C0042.m7151(m520(), 102, 5, 2381))) {
            return;
        }
        c0259uM6004.a = strM5769;
        C0022.m4462(c0259uM6004);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0022.m4462(C0034.m6004());
        return C0052.m8350(C0034.m6004(), str, C0024.m4752(str2, C0018.m3917(m520(), 107, 4, 3040)));
    }
}