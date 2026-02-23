package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class Xunlei extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f132short = {2076, 2065, 2072, 2061, 769, 798, 787, 786, 792, 1790, 1727, 1724, 1725, 21777, 1423, 1486, 1485, 1484, -25221, 1781, 1778, 1665, 1668, 1781, 1671, 1777, 1779, 1790, 771, 2969, 3028, 3024, 2969, 938, 938, 938, 518, 513, 626, 631, 518, 628, 514, 512, 525, 2248, 2248, 2248, 1364, 1315, 1364, 1315};

    public static Object[] proxy(Map<String, String> map) {
        if (!C0007.m1815(C0016.m3525(m769(), 4, 5, 887), (String) C0062.m9431(map, C0017.m3646(m769(), 0, 4, 2152)))) {
            return null;
        }
        C0047.m7777(C0034.m6004());
        return C0006.m1762(map);
    }

    /* renamed from: ۟ۥۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m769() {
        if (C0061.m9359() < 0) {
            return f132short;
        }
        return null;
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        String strM1840 = C0007.m1840();
        String strM6307 = C0037.m6307(m769(), 9, 5, 1678);
        String strM6188 = C0036.m6188(m769(), 14, 5, 1535);
        ArrayList arrayList = new ArrayList();
        C0022.m4462(C0034.m6004());
        try {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0010.m2300(m769(), 19, 9, 1754)), (String) C0048.m7915(list, 0));
            if (C0003.m1405(matcherM6026)) {
                String strM4306 = C0021.m4306(matcherM6026, 1);
                C0047.m7777(C0034.m6004());
                if (!C0058.m9127(C0033.m5823(strM4306, C0044.m7509(m769(), 28, 1, 819)), C0055.m8814(m769(), 29, 4, 3003))) {
                    return strM1840;
                }
                StringBuilder sb = new StringBuilder(strM6188);
                C0036.m6177(sb, i);
                C0004.m1532(arrayList, C0047.m7763(sb));
                StringBuilder sb2 = new StringBuilder(strM6307);
                C0036.m6177(sb2, i);
                C0004.m1532(arrayList, C0047.m7763(sb2));
            }
            return C0036.m6194(C0029.m5256(m769(), 33, 3, 910), arrayList);
        } catch (Exception unused) {
            return strM1840;
        }
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(list);
        while (C0012.m2962(itM3109)) {
            try {
                Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0031.m5565(m769(), 36, 9, 553)), (String) C0048.m7949(itM3109));
                if (C0003.m1405(matcherM6026)) {
                    String strM4306 = C0021.m4306(matcherM6026, 1);
                    C0047.m7777(C0034.m6004());
                    String strM7621 = C0045.m7621(strM4306);
                    C0004.m1532(arrayList, strM7621);
                    C0004.m1532(arrayList, strM7621);
                }
            } catch (Exception unused) {
                return C0007.m1840();
            }
        }
        return C0036.m6194(C0002.m1305(m769(), 45, 3, 2284), arrayList);
    }

    public void init(Context context, String str) {
        W wM8046 = C0049.m8046();
        C0047.m7777(wM8046);
        if (C0040.m6623(new CharSequence[]{str})) {
            return;
        }
        C0006.m1797(wM8046);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0022.m4462(C0034.m6004());
        return C0052.m8350(C0034.m6004(), str, C0024.m4752(str2, C0030.m5362(m769(), 48, 4, 1288)));
    }
}