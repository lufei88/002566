package com.github.catvod.spider;

import android.content.Context;
import android.graphics.Bitmap;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.h;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.l;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class Local extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f84short = {2234, 2195, 2194, 2203, 2225, 2197, 25070, 24701, 3075, 3199, 3182, 3195, 3175, 2182, 2181, 2199, 2177, 2258, 2256, 2248, 1892, 1909, 1909, 1897, 1900, 1894, 1892, 1905, 1900, 1898, 1899, 1834, 1898, 1894, 1905, 1888, 1905, 1832, 1910, 1905, 1911, 1888, 1892, 1896, 1634, 1593, 1586, 1632, 1585, 1586, 1598, 1596, 1585, 1659, 1581, 1596, 1577, 1589, 1632, 1342, 1335, 1332, 1340, 1341, 1322, 2654, 2641, 2644, 2653, 2953, 1343, 1315, 1315, 1319, 28213, 24105, 27806, 18415, 2162, 1553, 1613, 1610, 1617, 1612, 1631, 1625, 1627, 2169, 2161, 2153, 2160, 2173, 2152, 2169, 2168, 1400, 1391, 1384, 1386, 1401, 1391, 432, 422, 431, 421, 2214, 2214, 2214, 2214, 2288, 2194, 2194, 2288, 2235, 2235, 2303, 2199, 2199, 2277, 2226, 2226, 2277, 2220, 2220, 2968, 2948, 2948, 2944, 510, 497, 500, 509, 418, 439, 439};
    public SimpleDateFormat a;

    public static m b(String str, String str2) {
        m mVar = new m();
        C0058.m9085(mVar, C0031.m5565(m475(), 0, 6, 2300));
        C0011.m2828(mVar, str2);
        C0005.m1628(mVar, str);
        C0026.m4947(mVar, C0054.m8651());
        C0054.m8596(mVar, C0065.m9775(m475(), 6, 2, 1347));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, C0048.m7902(m475(), 8, 1, 3111));
        C0018.m3933(sb, str2);
        C0044.m7449(mVar, C0047.m7763(sb));
        return mVar;
    }

    public static Object[] proxy(Map<String, String> map) {
        byte[] bArrM4028;
        String str = new String(C0034.m5997((String) C0062.m9431(map, C0041.m6779(m475(), 9, 4, 3087)), 8));
        Integer numM2808 = C0011.m2808(200);
        Bitmap bitmapM2004 = C0008.m2004(str, 1);
        if (bitmapM2004 == null) {
            bArrM4028 = C0034.m5997(C0024.m4752(C0054.m8651(), C0006.m1774(m475(), 13, 7, 2276))[1], 0);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0002.m1271(bitmapM2004, C0054.m8584(), 100, byteArrayOutputStream);
            bArrM4028 = C0019.m4028(byteArrayOutputStream);
        }
        return new Object[]{numM2808, C0036.m6188(m475(), 20, 24, 1797), new ByteArrayInputStream(bArrM4028)};
    }

    /* renamed from: ۣۡۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m475() {
        if (C0030.m5375() >= 0) {
            return f84short;
        }
        return null;
    }

    public final m a(File file) {
        String strM8367;
        m mVar = new m();
        C0011.m2828(mVar, C0022.m4399(file));
        C0005.m1628(mVar, C0038.m6412(file));
        if (C0032.m5709(file)) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0051.m8217());
            C0018.m3933(sb, C0011.m2805(m475(), 44, 15, 1629));
            C0018.m3933(sb, C0052.m8364(C0050.m8115(C0022.m4399(file)), 8));
            strM8367 = C0047.m7763(sb);
        } else {
            strM8367 = C0052.m8367();
        }
        C0026.m4947(mVar, strM8367);
        C0019.m4073(mVar, C0004.m1506(C0058.m9084(this), C0004.m1568(C0013.m3135(file))));
        C0058.m9109(mVar, C0032.m5777(file) ? C0040.m6584(m475(), 59, 6, 1368) : C0027.m5062(m475(), 65, 4, 2616));
        return mVar;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        File[] fileArrM1265 = C0002.m1265(new File(str));
        if (fileArrM1265 == null) {
            return C0047.m7783(arrayList);
        }
        C0031.m5568(fileArrM1265, new l(1));
        for (File file : fileArrM1265) {
            if (!C0043.m7277(C0038.m6412(file), C0040.m6584(m475(), 69, 1, 2983))) {
                if (C0032.m5777(file)) {
                    C0004.m1532(arrayList3, C0033.m5880(this, file));
                } else {
                    if (C0021.m4355(C0017.m3692(), C0023.m4587(C0004.m1522(C0038.m6412(file))))) {
                        C0004.m1532(arrayList2, C0033.m5880(this, file));
                    }
                }
            }
        }
        C0034.m6012(arrayList, arrayList3);
        C0034.m6012(arrayList, arrayList2);
        g gVar = new g();
        C0045.m7632(gVar, arrayList);
        C0049.m7974(gVar, 1, 1, 0, 1);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        m mVarM9240;
        String str = (String) C0048.m7915(list, 0);
        if (C0043.m7277(str, C0000.m1077(m475(), 70, 4, 1367))) {
            mVarM9240 = C0059.m9240(C0011.m2746(C0022.m4422(str)), str);
        } else {
            File file = new File((String) C0048.m7915(list, 0));
            mVarM9240 = C0059.m9240(C0038.m6412(file), C0022.m4399(file));
        }
        return C0053.m8428(mVarM9240);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        String strM4399 = C0022.m4399(C0049.m7985());
        String strM9585 = C0063.m9585(m475(), 74, 4, 2329);
        String strM1077 = C0000.m1077(m475(), 78, 1, 2115);
        C0004.m1532(arrayList2, new b(strM4399, strM9585, strM1077));
        File[] fileArrM1265 = C0002.m1265(new File(C0040.m6584(m475(), 79, 8, 1598)));
        if (fileArrM1265 == null) {
            arrayList = new ArrayList();
        } else {
            List listM1203 = C0001.m1203(new String[]{C0057.m8978(m475(), 87, 8, 2076), C0004.m1549(m475(), 95, 6, 1291), C0051.m8259(m475(), 101, 4, 451)});
            for (File file : fileArrM1265) {
                if (!C0021.m4355(listM1203, C0038.m6412(file))) {
                    C0004.m1532(arrayList2, new b(C0022.m4399(file), C0038.m6412(file), strM1077));
                }
            }
            arrayList = new ArrayList();
        }
        return C0025.m4831(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        this.a = new SimpleDateFormat(C0041.m6779(m475(), 105, 19, 2271), C0045.m7549());
    }

    public String playerContent(String str, String str2, List<String> list) {
        Object objM1961;
        if (C0043.m7277(str2, C0046.m7718(m475(), 124, 4, 3056))) {
            g gVar = new g();
            C0017.m3667(gVar, str2);
            return C0033.m5828(gVar);
        }
        g gVar2 = new g();
        String strM4536 = C0023.m4536(m475(), 128, 7, 408);
        C0017.m3667(gVar2, C0050.m8125(strM4536, str2));
        File file = new File(str2);
        File[] fileArrM1265 = C0029.m5255(file) == null ? null : C0002.m1265(C0029.m5255(file));
        if (fileArrM1265 == null || fileArrM1265.length == 0) {
            objM1961 = C0008.m1961();
        } else {
            objM1961 = new ArrayList();
            for (File file2 : fileArrM1265) {
                String strM1522 = C0004.m1522(C0038.m6412(file2));
                if (C0021.m4355(C0027.m5030(), strM1522)) {
                    h hVar = new h();
                    C0020.m4249(hVar, C0009.m2056(C0038.m6412(file2)));
                    C0036.m6229(hVar, strM1522);
                    StringBuilder sb = new StringBuilder(strM4536);
                    C0018.m3933(sb, C0022.m4399(file2));
                    C0012.m3013(hVar, C0047.m7763(sb));
                    C0004.m1532(objM1961, hVar);
                }
            }
        }
        C0025.m4788(gVar2, objM1961);
        return C0033.m5828(gVar2);
    }
}