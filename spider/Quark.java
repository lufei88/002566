package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0233B;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class Quark extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f102short = {1414, 1419, 1410, 1431, 709, 709, 709, 2346, 2386, 2346, 2386, 2346, 2386, 518, 518, 518, 2399, 2371, 2371, 2375, 2317, 2328, 2328, 2036, 2024, 2024, 2028, 2031, 1958, 1971, 1971, 2403, 2403, 2380, 2377, 2383, 1480, 1471, 1480, 1471, 1532, 1488, 1489, 1483, 1498, 1489, 1483, 1426, 1515, 1478, 1487, 1498, 2025, 1998, 2002, 2005, 2739, 2745, 22884, 23507, 32119, 27824, 32225, 21711, 864, 825, 875, 890, 873, 872, 894, 825, 801, 811, 823, 825, 878, 873, 887, 825, 801, 825, 825, 823, 825, 886, 872, 892, 825, 801, 825, 23075, 21072, -29123, 20716, 23082, 26195, 24845, 25649, 30048, 23630, -1001, -30484, -28074, 31861, 19766, 20795, -27265, 22293, -27946, 26283, -28074, 31861, 825, 823, 825, 894, 873, 873, 854, 872, 892, 825, 801, 825, 23075, 21072, -29123, 20716, 23082, 26195, 24845, 25649, 30048, 23630, -1001, -30484, -28074, 31861, 19766, 20795, -27265, 22293, -27946, 26283, -28074, 31861, 825, 870};
    public m a = null;

    public static Object[] proxy(Map<String, String> map) {
        return null;
    }

    /* renamed from: ۤۨۧۧ, reason: not valid java name and contains not printable characters */
    public static short[] m540() {
        if (C0051.m8216() < 0) {
            return f102short;
        }
        return null;
    }

    public String detailContent(List<String> list) {
        C0233B c0233bM6573 = C0039.m6573();
        String str = (String) C0048.m7915(list, 0);
        C0047.m7777(c0233bM6573);
        return C0053.m8428(C0060.m9346(C0039.m6573(), C0059.m9241(str)));
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        String strM8911 = C0056.m8911(m540(), 4, 3, 737);
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : C0024.m4752(C0024.m4710(C0064.m9613(this)), C0035.m6131(m540(), 7, 6, 2422))) {
                Locale localeM7549 = C0045.m7549();
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, str);
                C0036.m6177(sb, i);
                C0004.m1532(arrayList, C0029.m5240(localeM7549, C0047.m7763(sb), new Object[0]));
            }
            return C0036.m6194(strM8911, arrayList);
        } catch (Exception unused) {
            return C0036.m6194(strM8911, arrayList);
        }
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.a = new m();
        Iterator itM3109 = C0013.m3109(list);
        while (true) {
            boolean zM2962 = C0012.m2962(itM3109);
            String strM8814 = C0055.m8814(m540(), 13, 3, 546);
            if (!zM2962) {
                return C0036.m6194(strM8814, arrayList);
            }
            String str = (String) C0048.m7949(itM3109);
            C0047.m7777(C0039.m6573());
            try {
                m mVarM9346 = C0060.m9346(C0039.m6573(), C0059.m9241(str));
                this.a = mVarM9346;
                C0004.m1532(arrayList, C0035.m6167(mVarM9346));
            } catch (Exception unused) {
                return C0036.m6194(strM8814, arrayList);
            }
        }
    }

    public void init(Context context, String str) {
        String strM5769 = str;
        if (C0058.m9127(strM5769, C0063.m9585(m540(), 16, 7, 2359)) || C0058.m9127(strM5769, C0000.m1077(m540(), 23, 8, 1948))) {
            strM5769 = C0032.m5769(strM5769, null);
        }
        C0233B c0233bM6573 = C0039.m6573();
        C0047.m7777(c0233bM6573);
        if (C0040.m6623(new CharSequence[]{strM5769}) && C0058.m9127(strM5769, C0034.m6001(m540(), 31, 5, 2364))) {
            c0233bM6573.a = strM5769;
            C0001.m1188(c0233bM6573);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r60, java.lang.String r61, java.util.List<java.lang.String> r62) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.Quark.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }
}