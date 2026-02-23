package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0254o;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Tianyi extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f108short = {2193, 2204, 2197, 2176, 1353, 1366, 1371, 1370, 1360, 2698, 2714, 31787, 2768, 3126, 3126, 3126, 2576, 2576, 2576, 1851, 1831, 1831, 1827, 1897, 1916, 1916, 877, 881, 881, 885, 886, 831, 810, 810, 632, 628, 628, 624, 626, 638, 612, 631, 628, 636, 626, 629, 612, 622, 616, 638, 617, 1026, 1141, 1026, 1141, 1105, 1115, 1110, 1104, 1037, 2541, 2529, 2529, 2533, 2535, 2539, 25156, 29461, 23099, 909, 980, 902, 919, 900, 901, 915, 980, 972, 966, 986, 980, 899, 900, 922, 980, 972, 980, 980, 986, 980, 923, 901, 913, 980, 972, 980, 23263, 31754, -28976, 20481, 23239, 26302, 25056, 25820, 30093, 23715, -774, -30719, -27973, 31896, 19931, 20950, -27246, 22520, -28101, 26182, -27973, 31896, 980, 986, 980, 915, 900, 900, 955, 901, 913, 980, 972, 980, 23263, 31754, -28976, 20481, 23239, 26302, 25056, 25820, 30093, 23715, -774, -30719, -27973, 31896, 19931, 20950, -27246, 22520, -28101, 26182, -27973, 31896, 980, 907};

    public static Object[] proxy(Map<String, String> map) {
        if (!C0007.m1815(C0012.m2973(m557(), 4, 5, 1343), (String) C0062.m9431(map, C0057.m8978(m557(), 0, 4, 2277)))) {
            return null;
        }
        C0047.m7777(C0034.m6004());
        return C0006.m1762(map);
    }

    /* renamed from: ۣۢۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m557() {
        if (C0040.m6582() >= 0) {
            return f108short;
        }
        return null;
    }

    /* renamed from: ۦۣۦ, reason: contains not printable characters */
    public static void m558(Object obj) {
        if (C0028.m5152() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        String strM2037 = C0009.m2037(m557(), 9, 4, 2803);
        ArrayList arrayList = new ArrayList();
        try {
            if (C0056.m8945(C0063.m9578())) {
                StringBuilder sb = new StringBuilder(strM2037);
                C0036.m6177(sb, i);
                C0004.m1532(arrayList, C0047.m7763(sb));
            }
            return C0036.m6194(C0003.m1398(m557(), 13, 3, 3090), arrayList);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            String str = (String) C0048.m7949(itM3109);
            try {
                int iM5416 = C0030.m5416(str, 47);
                if (iM5416 != -1) {
                    C0004.m1532(arrayList, C0028.m5180(C0063.m9578(), C0056.m8890(str, iM5416 + 1)));
                }
            } catch (Exception unused) {
                return C0007.m1840();
            }
        }
        return C0036.m6194(C0022.m4403(m557(), 16, 3, 2612), arrayList);
    }

    public void init(Context context, String str) {
        String strM5769 = str;
        if (C0058.m9127(strM5769, C0053.m8477(m557(), 19, 7, 1875)) || C0058.m9127(strM5769, C0054.m8574(m557(), 26, 8, 773))) {
            strM5769 = C0032.m5769(strM5769, null);
        }
        C0254o c0254oM9578 = C0063.m9578();
        C0047.m7777(c0254oM9578);
        if (C0040.m6623(new CharSequence[]{strM5769}) && C0058.m9127(strM5769, C0054.m8574(m557(), 34, 17, 571))) {
            c0254oM9578.b = strM5769;
            C0002.m1252(c0254oM9578);
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0002.m1252(C0063.m9578());
        C0254o c0254oM9578 = C0063.m9578();
        String strM8007 = C0049.m8007(m557(), 51, 4, 1118);
        String[] strArrM4752 = C0024.m4752(str2, strM8007);
        C0047.m7777(c0254oM9578);
        try {
            StringBuilder sb = new StringBuilder(C0001.m1189(m557(), 55, 5, 1079));
            C0018.m3933(sb, str);
            m558(C0047.m7763(sb));
            String str3 = C0024.m4752(C0038.m6472(c0254oM9578), strM8007)[0];
            String str4 = strArrM4752[0];
            String str5 = strArrM4752[1];
            String strM2827 = C0011.m2827(str4, C0002.m1316(C0035.m6110()), strArrM4752[2]);
            String strM4780 = C0025.m4780(c0254oM9578, str4, str5);
            HashMap mapM4465 = C0022.m4465();
            C0053.m8424(mapM4465, C0039.m6551(m557(), 60, 6, 2446), str3);
            if (C0057.m8953(strM4780)) {
                throw new RuntimeException(C0007.m1842(m557(), 66, 3, 1390));
            }
            g gVar = new g();
            C0017.m3667(gVar, strM4780);
            C0057.m9029(gVar, mapM4465);
            C0002.m1282(gVar, strM2827);
            return C0033.m5828(gVar);
        } catch (Exception unused) {
            return C0037.m6307(m557(), 69, 85, 1014);
        }
    }
}