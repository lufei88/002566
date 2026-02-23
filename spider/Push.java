package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.h;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
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
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class Push extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f100short = {-28798, 27741, 2249, 2246, 2243, 2250, 2197, 2176, 2176, 1497, 1477, 1477, 1473, 2317, 1839, 1839, 1839, 2334, 2322, 2324, 2333, 2326, 2311, 2283, 2178, 2264, 2243, 2270, 2270, 2249, 2242, 2264, 1042, 29908, -28157, 1008, 1355, 1291, 1303, 1303, 1299, 1296, 1369, 1343, 1356, 1343, 1356, 1287, 1297, 1290, 1301, 1286, 1343, 1357, 1302, 1280, 1343, 1357, 1280, 1293, 1343, 1356, 1296, 1343, 1356, 1336, 1341, 1345, 1342, 1352, 1354, 689, 689, 689, 744, 759, 756, 757, 2978, 3042, 3070, 3070, 3066, 3065, 2992, 3030, 2981, 3030, 2981, 3066, 3051, 3044, 3030, 2980, 3067, 3071, 3051, 3064, 3041, 3030, 2980, 3049, 3044, 3030, 2981, 3065, 3030, 2981, 3025, 3028, 2984, 3031, 2977, 2979, 2830, 2829, 2821, 2824, 2841, 1838, 1825, 1826, 1848, 1833, 1891, 1916, 1909, 1908, 502, 507, 480, 482, 491, 487, 3112, 3112, 3112, 22230, 24753, -29140, 24671, -29841, -28067, 1327, 1331, 1331, 1335, 738, 738, 738, 1283, 29952, -27689, 1487, 1472, 1477, 1484, 1427, 1414, 1414, 3319, 3307, 3307, 3311, 3237, 3248, 3248, 1678, 1683, 1751, 2181, 2179, 2206, 423, 422, 416, 1097, 1115, 1115, 3209, -29971, 25758, 22397, 24858, -31517, -25135};
    public final Cloud a = new Cloud();

    /* renamed from: ۟ۧۧۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m537() {
        if (C0039.m6529() <= 0) {
            return f100short;
        }
        return null;
    }

    public String detailContent(List<String> list) {
        String strM9389;
        String strM3446 = (String) C0048.m7915(list, 0);
        m mVar = new m();
        C0011.m2828(mVar, strM3446);
        C0026.m4947(mVar, C0043.m7289());
        C0058.m9085(mVar, C0016.m3525(m537(), 0, 2, 2508));
        C0005.m1628(mVar, C0043.m7277(strM3446, C0052.m8337(m537(), 2, 7, 2223)) ? C0038.m6412(new File(strM3446)) : strM3446);
        boolean zM7277 = C0043.m7277(strM3446, C0011.m2805(m537(), 9, 4, 1457));
        String strM5708 = C0032.m5708(m537(), 13, 1, 2350);
        if (zM7277 && C0058.m9127(strM3446, strM5708)) {
            strM3446 = C0015.m3446(strM3446, strM5708, C0049.m8007(m537(), 14, 3, 1797));
        }
        if (C0003.m1405(C0034.m6026(C0044.m7501(), strM3446)) || (!C0043.m7277(strM3446, C0047.m7833(m537(), 17, 6, 2419)) && C0060.m9349(C0024.m4752(strM3446, C0006.m1774(m537(), 23, 1, 2256))[0], C0016.m3525(m537(), 24, 8, 2220)))) {
            C0044.m7449(mVar, strM3446);
            strM9389 = C0062.m9389(m537(), 141, 2, 1194);
        } else {
            boolean zM9127 = C0058.m9127(strM3446, C0001.m1189(m537(), 32, 1, 1078));
            String strM7290 = C0043.m7290(m537(), 33, 2, 544);
            if (zM9127) {
                C0054.m8596(mVar, strM7290);
                C0044.m7449(mVar, C0006.m1702(strM5708, C0024.m4752(strM3446, C0036.m6188(m537(), 35, 1, 1018))));
                return C0053.m8428(mVar);
            }
            if (C0064.m9686(strM3446, C0021.m4340(m537(), 36, 35, 1379)) || C0058.m9127(strM3446, C0010.m2300(m537(), 71, 7, 710)) || C0064.m9686(strM3446, C0018.m3917(m537(), 78, 36, 2954)) || C0058.m9127(strM3446, C0043.m7290(m537(), 114, 5, 2924)) || C0058.m9127(strM3446, C0063.m9585(m537(), 119, 9, 1869)) || C0058.m9127(strM3446, C0037.m6307(m537(), 128, 6, 398))) {
                ArrayList arrayList = new ArrayList();
                C0004.m1532(arrayList, strM3446);
                Cloud cloudM6635 = C0040.m6635(this);
                C0044.m7449(mVar, C0014.m3356(cloudM6635, arrayList));
                strM9389 = C0030.m5351(cloudM6635);
            } else {
                List listM1203 = C0001.m1203(new String[]{strM3446, strM3446, strM3446});
                String strM1774 = C0006.m1774(m537(), 134, 3, 3084);
                C0044.m7449(mVar, C0036.m6194(strM1774, listM1203));
                strM9389 = C0036.m6194(strM1774, C0001.m1203(new String[]{strM7290, C0035.m6131(m537(), 137, 2, 787), C0022.m4403(m537(), 139, 2, 1999)}));
            }
        }
        C0054.m8596(mVar, strM9389);
        return C0053.m8428(mVar);
    }

    public void init(Context context, String str) {
        C0056.m8901(C0040.m6635(this), context, str);
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM3446 = str2;
        if (C0043.m7277(strM3446, C0047.m7833(m537(), 143, 4, 1351))) {
            String strM7718 = C0046.m7718(m537(), 147, 3, 712);
            if (C0058.m9127(strM3446, strM7718)) {
                strM3446 = C0015.m3446(strM3446, strM7718, C0047.m7833(m537(), 150, 1, 1312));
            }
        }
        if (!C0007.m1815(str, C0033.m5852(m537(), 151, 2, 1012))) {
            if (C0007.m1815(str, C0042.m7151(m537(), 180, 2, 782))) {
                g gVar = new g();
                C0038.m6396(gVar);
                C0064.m9646(gVar);
                C0017.m3667(gVar, strM3446);
                return C0033.m5828(gVar);
            }
            if (C0007.m1815(str, C0009.m2037(m537(), 182, 2, 696))) {
                g gVar2 = new g();
                C0038.m6396(gVar2);
                C0017.m3667(gVar2, strM3446);
                return C0033.m5828(gVar2);
            }
            if (!C0007.m1815(str, C0049.m8007(m537(), 184, 2, 2854))) {
                return C0019.m4033(C0040.m6635(this), str, strM3446, list);
            }
            g gVar3 = new g();
            C0017.m3667(gVar3, strM3446);
            return C0033.m5828(gVar3);
        }
        g gVar4 = new g();
        C0017.m3667(gVar4, strM3446);
        ArrayList arrayList = new ArrayList();
        String strM5109 = C0028.m5109(m537(), 153, 7, 1449);
        if (C0043.m7277(strM3446, strM5109)) {
            File file = new File(C0015.m3446(strM3446, strM5109, C0007.m1840()));
            if (C0029.m5255(file) != null) {
                for (File file2 : C0002.m1265(C0029.m5255(file))) {
                    String strM1522 = C0004.m1522(C0038.m6412(file2));
                    if (C0021.m4355(C0027.m5030(), strM1522)) {
                        h hVar = new h();
                        C0020.m4249(hVar, C0009.m2056(C0038.m6412(file2)));
                        C0036.m6229(hVar, strM1522);
                        StringBuilder sb = new StringBuilder(strM5109);
                        C0018.m3933(sb, C0022.m4399(file2));
                        C0012.m3013(hVar, C0047.m7763(sb));
                        C0004.m1532(arrayList, hVar);
                    }
                }
            }
        }
        if (C0043.m7277(strM3446, C0010.m2300(m537(), 160, 7, 3231))) {
            List listM1203 = C0001.m1203(new String[]{C0013.m3106(m537(), 167, 3, 1763), C0030.m5362(m537(), 170, 3, 2280)});
            List listM12032 = C0001.m1203(new String[]{C0058.m9106(m537(), 173, 3, 468), C0029.m5256(m537(), 176, 3, 1064)});
            if (C0021.m4355(listM1203, C0004.m1522(strM3446))) {
                Iterator itM3109 = C0013.m3109(listM12032);
                while (C0012.m2962(itM3109)) {
                    String str3 = (String) C0048.m7949(itM3109);
                    String strM8125 = C0050.m8125(C0050.m8125(C0009.m2056(strM3446), C0043.m7290(m537(), 179, 1, 3239)), str3);
                    if (C0004.m1584(C0032.m5769(strM8125, null)) >= 100) {
                        String strM2746 = C0011.m2746(C0022.m4422(strM8125));
                        h hVar2 = new h();
                        C0020.m4249(hVar2, strM2746);
                        C0036.m6229(hVar2, str3);
                        C0012.m3013(hVar2, strM8125);
                        C0004.m1532(arrayList, hVar2);
                    }
                }
            }
        }
        C0025.m4788(gVar4, arrayList);
        return C0033.m5828(gVar4);
    }
}