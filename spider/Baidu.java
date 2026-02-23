package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class Baidu extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f6short = {683, 678, 687, 698, 1770, 1781, 1784, 1785, 1779, 2385, 32749, 2326, 2804, 2804, 2804, 1021, 1004, 995, 977, 931, 1007, 1004, 996, 1001, 1016, 977, 931, 1006, 994, 992, 930, 1022, 930, 933, 982, 979, 946, 976, 934, 932, 977, 946, 1021, 1018, 1001, 944, 933, 982, 979, 939, 976, 934, 932, 937, 963, 25582, 18591, 1609, 1568, 1581, 1619, 1609, 25120, 21030, 31217, 458, 464, 25706, 20601, -28147, 20848, 25673, 26120, 30148, 30014, 24038, 31761, 30104, 20806, 19947, -26690, 24805, 13122, 1622, 1622, 1622, 1120, 1148, 1148, 1144, 1074, 1063, 1063, 1917, 1889, 1889, 1893, 1894, 1839, 1850, 1850, 514, 629, 514, 629, 2114, 2120, 2117, 2115, 2078, 1302, 1338, 1338, 1342, 1340, 1328, 2043, 2013, 1995, 2012, 1923, 2031, 1993, 1995, 1984, 2010, 3299, 3304, 3321, 3305, 3300, 3326, 3302, 3254, 3260, 3235, 3257, 3235, 3263, 3254, 3263, 3263, 3261, 3263, 3260, 3263, 3260, 3260, 3295, 3278, 3254, 3308, 3299, 3305, 3327, 3298, 3300, 3305, 3232, 3308, 3299, 3305, 3327, 3298, 3300, 3305, 3254, 3260, 3263, 3254, 3271, 3294, 3311, 3327, 3300, 3305, 3306, 3304, 3257, 3235, 3257, 3235, 3261, 3254, 3303, 3298, 3300, 3299, 3321, 3279, 3327, 3300, 3305, 3306, 3304, 3254, 3260, 3235, 3260, 3235, 3261, 3254, 27937, 31856, 21854, 3111, 3198, 3116, 3133, 3118, 3119, 3129, 3198, 3174, 3180, 3184, 3198, 3113, 3118, 3120, 3198, 3174, 3198, 3198, 3184, 3198, 3121, 3119, 3131, 3198, 3174, 3198, 31266, 21242, -32390, 24491, 21869, 26900, 28234, 27510, 31271, 21257, -3248, -30805, -25327, 29490, 17009, 24188, -26056, 22610, -25199, 27116, -25327, 29490, 3198, 3184, 3198, 3129, 3118, 3118, 3089, 3119, 3131, 3198, 3174, 3198, 31266, 21242, -32390, 24491, 21869, 26900, 28234, 27510, 31271, 21257, -3248, -30805, -25327, 29490, 17009, 24188, -26056, 22610, -25199, 27116, -25327, 29490, 3198, 3105};

    public static Object[] proxy(Map<String, String> map) {
        if (!C0007.m1815(C0003.m1398(m63(), 4, 5, 1692), (String) C0062.m9431(map, C0056.m8911(m63(), 0, 4, 735)))) {
            return null;
        }
        C0047.m7777(C0034.m6004());
        return C0006.m1762(map);
    }

    /* renamed from: ۟۟ۦۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m63() {
        if (C0063.m9589() <= 0) {
            return f6short;
        }
        return null;
    }

    /* renamed from: ۟ۡۥۦ۠, reason: not valid java name and contains not printable characters */
    public static void m64(Object obj) {
        if (C0004.m1557() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        String strM9599 = C0064.m9599(m63(), 9, 3, 2357);
        ArrayList arrayList = new ArrayList();
        try {
            if (C0056.m8945(C0055.m8709())) {
                StringBuilder sb = new StringBuilder(strM9599);
                C0036.m6177(sb, i);
                C0004.m1532(arrayList, C0047.m7763(sb));
            }
            return C0036.m6194(C0052.m8337(m63(), 12, 3, 2768), arrayList);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String detailContentVodPlayUrl(List<String> list) {
        Matcher matcherM6026;
        String strM1840 = C0007.m1840();
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            String str = (String) C0048.m7949(itM3109);
            C0055.m8709().h = false;
            try {
                matcherM6026 = C0034.m6026(C0005.m1602(C0018.m3917(m63(), 15, 39, 909)), str);
            } catch (Exception unused) {
            }
            if (!C0003.m1405(matcherM6026)) {
                C0012.m2969(C0035.m6087(), C0016.m3525(m63(), 67, 16, 832));
                return strM1840;
            }
            String strM4306 = C0021.m4306(matcherM6026, 1);
            if (C0043.m7277(strM4306, C0007.m1842(m63(), 54, 1, 1010))) {
                strM4306 = C0056.m8890(strM4306, 1);
            }
            String strM43062 = C0021.m4306(matcherM6026, 2);
            PrintStream printStreamM6087 = C0035.m6087();
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0021.m4340(m63(), 55, 7, 1641));
            C0018.m3933(sb, strM4306);
            C0012.m2969(printStreamM6087, C0047.m7763(sb));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0051.m8259(m63(), 62, 5, 496));
            C0018.m3933(sb2, strM43062);
            C0012.m2969(printStreamM6087, C0047.m7763(sb2));
            String strM3566 = C0016.m3566(C0055.m8709(), strM4306, strM43062);
            if (C0056.m8945(C0055.m8709())) {
                C0004.m1532(arrayList, strM3566);
            }
        }
        return C0036.m6194(C0051.m8259(m63(), 83, 3, 1650), arrayList);
    }

    public void init(Context context, String str) {
        String strM5769 = str;
        if (C0058.m9127(strM5769, C0065.m9775(m63(), 86, 7, 1032)) || C0058.m9127(strM5769, C0050.m8131(m63(), 93, 8, 1813))) {
            strM5769 = C0032.m5769(strM5769, null);
        }
        C0054.m8595(C0055.m8709(), strM5769);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0002.m1252(C0055.m8709());
        C0254o c0254oM8709 = C0055.m8709();
        String[] strArrM4752 = C0024.m4752(str2, C0045.m7657(m63(), 101, 4, 606));
        C0047.m7777(c0254oM8709);
        try {
            StringBuilder sb = new StringBuilder(C0058.m9106(m63(), 105, 5, 2084));
            C0018.m3933(sb, str);
            m64(C0047.m7763(sb));
            String str3 = strArrM4752[1];
            String str4 = strArrM4752[2];
            String str5 = strArrM4752[3];
            String str6 = strArrM4752[0];
            String str7 = strArrM4752[4];
            String strM2827 = C0011.m2827(str3, C0002.m1316(C0035.m6110()), str5);
            String strM1962 = C0008.m1962(c0254oM8709, C0005.m1601(c0254oM8709, str6, str3, str4, str7));
            HashMap mapM1281 = C0002.m1281();
            C0053.m8424(mapM1281, C0030.m5362(m63(), 110, 6, 1365), C0038.m6472(c0254oM8709));
            C0053.m8424(mapM1281, C0036.m6188(m63(), 116, 10, 1966), C0017.m3646(m63(), 126, 76, 3213));
            if (C0057.m8953(strM1962)) {
                throw new RuntimeException(C0020.m4199(m63(), 202, 3, 2571));
            }
            g gVar = new g();
            C0017.m3667(gVar, strM1962);
            C0057.m9029(gVar, mapM1281);
            C0002.m1282(gVar, strM2827);
            return C0033.m5828(gVar);
        } catch (Exception unused) {
            return C0041.m6779(m63(), 205, 85, 3164);
        }
    }
}