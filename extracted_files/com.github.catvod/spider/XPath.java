package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.R.a;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class XPath extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f125short = {2611, 2603, 2601, 2620, 2605, 2561, 2604, 2613, 678, 702, 700, 681, 696, 653, 698, 672, 2530, 2496, 2517, 2502, 2499, 2499, 2510, 2432, 2458, 2433, 2463, 2447, 2439, 2552, 2502, 2497, 2507, 2496, 2520, 2524, 2447, 2529, 2555, 2447, 2462, 2463, 2433, 2463, 2452, 2447, 2552, 2502, 2497, 2457, 2459, 2452, 2447, 2519, 2457, 2459, 2438, 2447, 2542, 2527, 2527, 2499, 2506, 2552, 2506, 2509, 2532, 2502, 2523, 2432, 2458, 2460, 2456, 2433, 2460, 2457, 2447, 2439, 2532, 2535, 2555, 2530, 2531, 2435, 2447, 2499, 2502, 2500, 2506, 2447, 2536, 2506, 2508, 2500, 2496, 2438, 2447, 2540, 2503, 2525, 2496, 2498, 2506, 2432, 2462, 2461, 2461, 2433, 2463, 2433, 2463, 2433, 2463, 2447, 2556, 2510, 2505, 2510, 2525, 2502, 2432, 2458, 2460, 2456, 2433, 2460, 2457, 443, 413, 395, 412, 451, 431, 393, 395, 384, 410, 2571, 2583, 2583, 2579, 611, 622, 625, 636, 613, 481, 347, 1143, 1143, 1143, 2683, 2672, 2668, 2657, 2681, 2645, 2674, 2668, 2685, 2647, 2673, 2663, 2672, 2607, 2627, 2661, 2663, 2668, 2678, 3151, 3192, 3195, 3192, 3183, 3192, 3183, 720, 732, 719, 726, 2837, 2828, 2832, 2833, 2885, 2079};
    public String a = null;
    public a b = null;

    /* renamed from: ۟۠ۤۤۡ, reason: not valid java name and contains not printable characters */
    public static void m744(Object obj) {
        if (C0034.m6048() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣۢۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m745() {
        if (C0007.m1886() >= 0) {
            return f125short;
        }
        return null;
    }

    /* renamed from: ۦۢۧۢ, reason: contains not printable characters */
    public static void m746(Object obj) {
        if (C0048.m7971() > 0) {
            SpiderDebug.log((Throwable) obj);
        }
    }

    public String a(String str, String str2, boolean z, HashMap map) {
        return C0015.m3446(C0015.m3446(C0010.m2280(C0064.m9621(this)), C0013.m3106(m745(), 0, 8, 2632), str), C0041.m6779(m745(), 8, 8, 733), str2);
    }

    public final String b(String str) {
        m744(str);
        HashMap map = new HashMap();
        C0053.m8424(map, C0016.m3525(m745(), 127, 10, 494), C0057.m8953(C0051.m8195(C0064.m9621(this))) ? C0041.m6779(m745(), 16, 111, 2479) : C0051.m8195(C0064.m9621(this)));
        return C0032.m5769(str, map);
    }

    public final void c() {
        String strM5973;
        String strM59732;
        if (C0064.m9621(this) != null || (strM5973 = C0034.m5973(this)) == null) {
            return;
        }
        if (C0043.m7277(strM5973, C0025.m4795(m745(), 137, 4, 2659))) {
            strM59732 = C0032.m5769(C0034.m5973(this), null);
            this.b = C0041.m6782(strM59732);
        } else {
            this.b = C0041.m6782(C0034.m5973(this));
            strM59732 = C0034.m5973(this);
        }
        C0040.m6590(this, strM59732);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C0046.m7732(this);
        ArrayList arrayList = new ArrayList();
        String strM3087 = C0013.m3087(this, str, str2, z, map);
        LinkedList linkedListM8720 = C0055.m8720(new C0163u(C0065.m9765(C0016.m3577(C0060.m9356(this, strM3087)))), C0038.m6466(C0064.m9621(this)));
        for (int i = 0; i < C0036.m6191(linkedListM8720); i++) {
            String strM7634 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i), C0022.m4435(C0064.m9621(this))))), C0060.m9306(C0064.m9621(this)));
            String strM76342 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i), C0057.m9008(C0064.m9621(this))))), C0013.m3082(C0064.m9621(this)));
            String strM3591 = C0016.m3591(strM3087, C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i), C0054.m8618(C0064.m9621(this))))), C0021.m4358(C0064.m9621(this))));
            boolean zM8953 = C0057.m8953(C0031.m5564(C0064.m9621(this)));
            String strM1840 = C0007.m1840();
            if (!zM8953) {
                try {
                    strM1840 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i), C0031.m5564(C0064.m9621(this))))), C0060.m9306(C0064.m9621(this)));
                } catch (Exception e) {
                    m746(e);
                }
            }
            C0004.m1532(arrayList, new m(strM76342, strM7634, strM3591, strM1840));
        }
        return C0047.m7783(arrayList);
    }

    public void d(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0275 A[LOOP:0: B:84:0x026f->B:86:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String detailContent(java.util.List<java.lang.String> r68) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.XPath.detailContent(java.util.List):java.lang.String");
    }

    public String homeContent(boolean z) {
        C0046.m7732(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (C0058.m9073(C0028.m5110(C0064.m9621(this))) > 0) {
            Iterator itM5199 = C0029.m5199(C0014.m3352(C0028.m5110(C0064.m9621(this))));
            while (C0012.m2962(itM5199)) {
                String str = (String) C0048.m7949(itM5199);
                C0004.m1532(arrayList2, new b((String) C0038.m6401(C0028.m5110(C0064.m9621(this)), str), str, null));
            }
        }
        String strM8043 = C0049.m8043(C0064.m9621(this));
        C0163u c0163u = new C0163u(C0065.m9765(C0016.m3577(C0060.m9356(this, strM8043))));
        if (C0058.m9073(C0028.m5110(C0064.m9621(this))) == 0) {
            LinkedList linkedListM8720 = C0055.m8720(c0163u, C0001.m1221(C0064.m9621(this)));
            for (int i = 0; i < C0036.m6191(linkedListM8720); i++) {
                C0004.m1532(arrayList2, new b(C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i), C0040.m6610(C0064.m9621(this))))), C0053.m8459(C0064.m9621(this))), C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i), C0011.m2796(C0064.m9621(this))))), C0017.m3729(C0064.m9621(this))), null));
            }
        }
        if (!C0057.m8953(C0014.m3387(C0064.m9621(this)))) {
            LinkedList linkedListM87202 = C0055.m8720(c0163u, C0014.m3387(C0064.m9621(this)));
            for (int i2 = 0; i2 < C0036.m6191(linkedListM87202); i2++) {
                String strM7634 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM87202, i2), C0037.m6317(C0064.m9621(this))))), C0050.m8137(C0064.m9621(this)));
                String strM76342 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM87202, i2), C0027.m5102(C0064.m9621(this))))), C0049.m8013(C0064.m9621(this)));
                String strM3591 = C0016.m3591(strM8043, C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM87202, i2), C0001.m1145(C0064.m9621(this))))), C0055.m8718(C0064.m9621(this))));
                boolean zM8953 = C0057.m8953(C0039.m6574(C0064.m9621(this)));
                String strM1840 = C0007.m1840();
                if (!zM8953) {
                    try {
                        strM1840 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM87202, i2), C0039.m6574(C0064.m9621(this))))), C0033.m5804(C0064.m9621(this)));
                    } catch (Exception e) {
                        m746(e);
                    }
                }
                C0004.m1532(arrayList, new m(strM76342, strM7634, strM3591, strM1840));
            }
        }
        return C0062.m9423(arrayList2, arrayList, C0001.m1185(C0064.m9621(this)));
    }

    public void init(Context context, String str) {
        this.a = str;
    }

    public boolean isVideoFormat(String str) {
        return C0015.m3436(str);
    }

    public boolean manualVideoCheck() {
        return false;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM3446 = str2;
        C0046.m7732(this);
        if (!C0057.m8953(C0008.m1999(C0064.m9621(this)))) {
            strM3446 = C0015.m3446(C0008.m1999(C0064.m9621(this)), C0061.m9361(m745(), 151, 9, 2560), strM3446);
        }
        m744(strM3446);
        HashMap map = new HashMap();
        if (C0004.m1584(C0016.m3561(C0064.m9621(this))) > 0) {
            C0053.m8424(map, C0041.m6779(m745(), 160, 10, 2562), C0016.m3561(C0064.m9621(this)));
        }
        if (C0004.m1584(C0007.m1836(C0064.m9621(this))) > 0) {
            C0053.m8424(map, C0032.m5708(m745(), 170, 7, 3101), C0007.m1836(C0064.m9621(this)));
        }
        g gVar = new g();
        C0038.m6396(gVar);
        C0017.m3667(gVar, strM3446);
        C0057.m9029(gVar, map);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        String strM9640;
        C0046.m7732(this);
        boolean zM8953 = C0057.m8953(C0013.m3176(C0064.m9621(this)));
        String strM1840 = C0007.m1840();
        if (zM8953) {
            return strM1840;
        }
        String strM3446 = C0015.m3446(C0013.m3176(C0064.m9621(this)), C0060.m9352(m745(), 177, 4, 683), C0056.m8909(str));
        String strM9356 = C0060.m9356(this, strM3446);
        ArrayList arrayList = new ArrayList();
        if (C0043.m7277(C0051.m8247(C0064.m9621(this)), C0022.m4403(m745(), 181, 5, 2943))) {
            String[] strArrM4752 = C0024.m4752(C0056.m8890(C0051.m8247(C0064.m9621(this)), 5), C0034.m6001(m745(), 186, 1, 2081));
            JSONObject jSONObject = new JSONObject(strM9356);
            for (int i = 0; i < strArrM4752.length; i++) {
                if (i == strArrM4752.length - 1) {
                    JSONArray jSONArrayM4333 = C0021.m4333(jSONObject, strArrM4752[i]);
                    for (int i2 = 0; i2 < C0053.m8396(jSONArrayM4333); i2++) {
                        JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i2);
                        C0004.m1532(arrayList, new m(C0045.m7634(C0064.m9640(C0051.m8200(jSONObjectM3923, C0032.m5671(C0064.m9621(this)))), C0010.m2356(C0064.m9621(this))), C0045.m7634(C0064.m9640(C0051.m8200(jSONObjectM3923, C0000.m1064(C0064.m9621(this)))), C0062.m9444(C0064.m9621(this))), C0016.m3591(strM3446, C0045.m7634(C0064.m9640(C0051.m8200(jSONObjectM3923, C0008.m1988(C0064.m9621(this)))), C0026.m4882(C0064.m9621(this)))), C0045.m7634(C0064.m9640(C0051.m8200(jSONObjectM3923, C0013.m3132(C0064.m9621(this)))), C0044.m7447(C0064.m9621(this)))));
                    }
                } else {
                    jSONObject = C0003.m1370(jSONObject, strArrM4752[i]);
                }
            }
        } else {
            LinkedList linkedListM8720 = C0055.m8720(new C0163u(C0065.m9765(C0016.m3577(strM9356))), C0051.m8247(C0064.m9621(this)));
            for (int i3 = 0; i3 < C0036.m6191(linkedListM8720); i3++) {
                String strM7634 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i3), C0000.m1064(C0064.m9621(this))))), C0062.m9444(C0064.m9621(this)));
                String strM76342 = C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i3), C0032.m5671(C0064.m9621(this))))), C0010.m2356(C0064.m9621(this)));
                String strM3591 = C0016.m3591(strM3446, C0045.m7634(C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i3), C0008.m1988(C0064.m9621(this))))), C0026.m4882(C0064.m9621(this))));
                if (C0057.m8953(C0031.m5564(C0064.m9621(this)))) {
                    strM9640 = strM1840;
                } else {
                    try {
                        strM9640 = C0064.m9640(C0001.m1143(C0006.m1714((com.github.catvod.spider.merge.W0.a) C0034.m6019(linkedListM8720, i3), C0013.m3132(C0064.m9621(this)))));
                        try {
                            strM9640 = C0045.m7634(strM9640, C0044.m7447(C0064.m9621(this)));
                        } catch (Exception e) {
                            e = e;
                            m746(e);
                            C0004.m1532(arrayList, new m(strM76342, strM7634, strM3591, strM9640));
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strM9640 = strM1840;
                    }
                }
                C0004.m1532(arrayList, new m(strM76342, strM7634, strM3591, strM9640));
            }
        }
        return C0047.m7783(arrayList);
    }
}