package com.github.catvod.spider;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J.b;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.W.i;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.c;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.m;
import com.github.catvod.spider.merge.b0.n;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class Market extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f86short = {1207, 1179, 1178, 1152, 1169, 1178, 1152, 1241, 1208, 1169, 1178, 1171, 1152, 1180, 1832, 1705, 1789, 1774, 1783, 780, 788, 780, 32152, 19882, 19799, -29663, 22736, 24908, 18530, -30444, 24037, 25721, -29049, 25469, 1374, -29323, 24719, 1708, -30539, 25935, 20612, -30011, 26906, 24007, -30842, 25689, -302, 24219, 21381, 29568, 26340, -302, 446, 505, 508, 486, 510, 486, 496, 24818, 25526, 22790, 22389, 2498, 2496, 2507, 2498, 2525, 2508, 2507, 2510, 2506, 2507, 2498, 2527, 2509, 2508, 1186, 1192, 1184, 1208, 1184, 2592, 2594, 2601, 2592, 2623, 2606, 2601, 2604, 2600, 2601, 2592, 2621, 2607, 2606, 25038, 25226, 25834, 32256, 23240, 22586, 21269, 2949, 2951, 2956, 2949, 2970, 2955, 2956, 2953, 2957, 2956, 2949, 2968, 2954, 2955, 20948, -27248, 25060, 20843, -31913, 27432, 17960, -30769, 18006, -31909, 22841, 22536, 21496, 32292, 28643, -24848, 17266, 21871, 23773, -31798, 24755, 27419, -25249, 29564, -31787, -29112, 26167, 19255, -30000, 19273, 21783, 24295, 29499, 25340, -27665, 25270, -28591, -25305, -29112, 28031, 25178, 25172, 24848, 26480, 32154, 22866, 21971, -28339, 1379, 1359, 1358, 1364, 1349, 1358, 1364, 1293, 1388, 1349, 1358, 1351, 1364, 1352, 1379, 3101, 3145, 3162, 3139, -28817, 22516, -29259, 28266, 25927, 26115, 22591, 24995, -833, 896, 31329, 22461, -32167, 20763, 20868, 26115, 1466, 1525, 1508, 1535, 20404, -29002, 23091, 25519, 25734, 26562, 23038, 24674, 1296, 1340, 1341, 1319, 1334, 1341, 1319, 1406, 1311, 1334, 1341, 1332, 1319, 1339, 2049, 2703, 2779, 2760, 2769, 472, 464, 21311, -28288, -30596, 21012, 23059, 25487, 2031, 1952, 1969, 1962, 2773, 2781, 22578, -25971, 17561, -31249, 20766, 26754, 25389, 24681, 24149, 26569, 672, 687, 682, 691, 673, 684, 674, 689, 679, 723, 730, 731, 722, 728, 732, 20967, -31470, -31512, 3125, 2834, 2839, 2839, 2848, 2822, 2819, 2819, 2817, 2838, 2816, 2816, 2838, 2839, 2757, 2759, 2764, 2757, 2778, 2763, 2764, 2761, 2765, 2764, 2757, 2776, 2762, 2763, 24675, 25383, 25927, 32685, 22935, 21176, -1637, 22980, 21722, -1651, 1761, 1702, 1699, 1721, 1697, 1721, 1711, 25706, 26414, 24910, 31652, 21485, -26765, -622, 24013, 20691, -636, 744, 687, 682, 688, 680, 688, 678, 3020, 3045, 3071, 2973, 3022, 3045, 3040, 2971, 3041, 3028, 2965, 2969, 3042, 3065, 3044, 2973, 3041, 3008, 3033, 3031, 3017, 3050, 2964, 3028, 3063, 3070, 2968, 3031, 3022, 3050, 3051, 3015, 3063, 3070, 2964, 3033, 3060, 3061, 3047, 3039, 3041, 3008, 3037, 3031, 3023, 2975, 2969, 2960, 1986, 2014, 2014, 2010, 2514, 2555, 2529, 2435, 2512, 2555, 2558, 2437, 2559, 2506, 2443, 2439, 2556, 2535, 2554, 2435, 2559, 2526, 2503, 2505, 2519, 2548, 2442, 2506, 2537, 2528, 2438, 2505, 2512, 2548, 2549, 2521, 2537, 2528, 2442, 2503, 2538, 2539, 2553, 2497, 2559, 2526, 2499, 2505, 2513, 2433, 2439, 2446, 2386, 2382, 2382, 2378};
    public ProgressDialog a;
    public List b;
    public boolean c;

    public static void restartApp(Context context) {
        Intent intentM7715 = C0046.m7715(C0027.m5093(context), C0004.m1486(context));
        C0035.m6106(intentM7715, 335577088);
        C0032.m5680(context, intentM7715);
        C0047.m7823(C0004.m1484());
    }

    /* renamed from: ۟۟ۨۥۧ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m478(Object obj) {
        if (C0020.m4210() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static InputStream m479(Object obj) {
        if (C0064.m9659() < 0) {
            return ((ResponseBody) obj).byteStream();
        }
        return null;
    }

    /* renamed from: ۟ۥۦۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m480() {
        if (C0040.m6582() >= 0) {
            return f86short;
        }
        return null;
    }

    /* renamed from: ۥۡۥۨ, reason: contains not printable characters */
    public static String m481(Object obj, Object obj2, Object obj3) {
        if (C0005.m1599() < 0) {
            return ((Response) obj).header((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۨۦۤۢ, reason: not valid java name and contains not printable characters */
    public static Response m482(Object obj) {
        if (C0062.m9429() >= 0) {
            return c.f((String) obj);
        }
        return null;
    }

    public String actPhp(String str) {
        try {
            if (C0043.m7338(this)) {
                return C0007.m1840();
            }
            C0060.m9315(this, true);
            C0017.m3665(new m(this, 0), 500);
            Response responseM482 = m482(str);
            File file = new File(C0003.m1375(C0022.m4453()), C0011.m2746(C0022.m4422(str)));
            C0006.m1725(file);
            C0018.m3959(this, file, m479(m478(responseM482)), C0059.m9205(m481(responseM482, C0034.m6001(m480(), 0, 14, 1268), C0060.m9352(m480(), 14, 1, 1817))));
            C0030.m5394(this);
            if (C0060.m9349(C0038.m6412(file), C0010.m2300(m480(), 15, 4, 1671))) {
                C0019.m4082(file, C0003.m1375(C0022.m4453()));
                C0038.m6402(C0058.m9106(m480(), 19, 9, 860));
            }
            return C0061.m9361(m480(), 28, 4, 1641);
        } catch (Exception e) {
            C0030.m5394(this);
            return C0055.m8775(C0036.m6261(e));
        }
    }

    public String action(String str) throws InterruptedException {
        String strM6131;
        C cM9276;
        if (C0058.m9127(str, C0016.m3525(m480(), 32, 3, 1395))) {
            String strM3446 = C0015.m3446(str, C0057.m8978(m480(), 35, 3, 1665), C0007.m1840());
            try {
                Activity activityM4453 = C0022.m4453();
                C0010.m2332();
                synchronized (C.class) {
                    cM9276 = C0060.m9276(activityM4453);
                }
                try {
                    Activity activityM5022 = C0027.m5022(cM9276);
                    C0037.m6386(activityM5022, new i(4, strM3446, cM9276, activityM5022));
                } catch (Exception e) {
                    C0049.m7975(e);
                }
                return C0056.m8911(m480(), 38, 2, 833);
            } catch (Exception unused) {
                return C0007.m1840();
            }
        }
        if (C0058.m9127(str, C0021.m4340(m480(), 40, 3, 3211))) {
            C0038.m6402(C0015.m3484(m480(), 43, 16, 456));
            C0011.m2785(1000L);
        }
        if (C0058.m9127(str, C0054.m8574(m480(), 59, 4, 1542))) {
            try {
                if (C0057.m8953(C0045.m7609(C0015.m3484(m480(), 63, 14, 2469)))) {
                    C0042.m7162(C0037.m6307(m480(), 77, 5, 1225), C0009.m2037(m480(), 82, 14, 2631));
                    strM6131 = C0005.m1645(m480(), 96, 7, 1850);
                } else {
                    try {
                        File file = new File(C0003.m1375(C0022.m4453()), C0020.m4199(m480(), 103, 14, 3042));
                        C0038.m6402(C0028.m5187(file) ? C0046.m7663(file) ? C0053.m8477(m480(), 117, 4, 1012) : C0034.m6001(m480(), 121, 12, 2208) : C0016.m3525(m480(), 133, 9, 3090));
                    } catch (Exception unused2) {
                        C0038.m6402(C0061.m9361(m480(), 142, 16, 1471));
                    }
                    strM6131 = C0035.m6131(m480(), 158, 7, 1184);
                }
                C0038.m6402(strM6131);
                return C0007.m1840();
            } catch (Exception unused3) {
            }
        }
        try {
            if (C0043.m7338(this)) {
                return C0007.m1840();
            }
            C0060.m9315(this, true);
            C0017.m3665(new m(this, 0), 10);
            Response responseM482 = m482(str);
            File file2 = new File(C0028.m5194(C0055.m8731()), C0011.m2746(C0022.m4422(str)));
            C0006.m1725(file2);
            C0018.m3959(this, file2, m479(m478(responseM482)), C0059.m9205(m481(responseM482, C0011.m2805(m480(), 165, 14, 1312), C0033.m5852(m480(), 179, 1, 1362))));
            C0030.m5394(this);
            if (C0060.m9349(C0038.m6412(file2), C0032.m5708(m480(), 180, 4, 3123))) {
                if (C0058.m9127(C0038.m6412(file2), C0003.m1398(m480(), 184, 1, 2337))) {
                    C0019.m4082(file2, C0028.m5194(C0012.m2973(m480(), 185, 3, 3067)));
                    C0030.m5394(this);
                    C0038.m6402(C0065.m9775(m480(), 188, 12, 947));
                    C0041.m6820(new Handler(C0063.m9553()), new Runnable() { // from class: com.github.catvod.spider.Market.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                C0060.m9271(C0022.m4453());
                            } catch (Exception unused4) {
                            }
                        }
                    }, 3000L);
                } else {
                    C0019.m4082(file2, C0028.m5194(C0055.m8731()));
                }
            }
            if (C0060.m9349(C0038.m6412(file2), C0023.m4536(m480(), 200, 4, 1428))) {
                C0012.m2974(file2);
            } else {
                C0055.m8775(C0052.m8337(m480(), 204, 4, 447));
            }
            C0009.m2118(this, str);
            C0030.m5394(this);
            return C0008.m1970(m480(), 208, 4, 626);
        } catch (Exception e2) {
            C0030.m5394(this);
            return C0055.m8775(C0036.m6261(e2));
        }
    }

    public String actiongo(String str) {
        try {
            if (C0043.m7338(this)) {
                return C0007.m1840();
            }
            C0060.m9315(this, true);
            Response responseM482 = m482(str);
            File file = new File(C0003.m1375(C0022.m4453()), C0011.m2746(C0022.m4422(str)));
            C0006.m1725(file);
            C0018.m3959(this, file, m479(m478(responseM482)), C0059.m9205(m481(responseM482, C0063.m9585(m480(), 212, 14, 1363), C0014.m3332(m480(), 226, 1, 2096))));
            C0030.m5394(this);
            if (C0060.m9349(C0038.m6412(file), C0034.m6001(m480(), 227, 4, 2721))) {
                C0019.m4082(file, C0003.m1375(C0022.m4453()));
                C0038.m6402(C0030.m5362(m480(), 231, 8, 415));
            }
            if (C0060.m9349(C0038.m6412(file), C0006.m1774(m480(), 239, 4, 1985))) {
                C0012.m2974(file);
            } else {
                C0055.m8775(C0020.m4199(m480(), 243, 8, 2706));
            }
            C0009.m2118(this, str);
            C0030.m5394(this);
            return C0043.m7290(m480(), 251, 4, 1497);
        } catch (Exception e) {
            C0030.m5394(this);
            return C0055.m8775(C0036.m6261(e));
        }
    }

    public final void b(String str) {
        Iterator itM3109 = C0013.m3109(C0028.m5123(this));
        while (C0012.m2962(itM3109)) {
            b bVar = (b) C0048.m7949(itM3109);
            int iM3094 = C0013.m3094(C0058.m9049(bVar), new com.github.catvod.spider.merge.J.c(str));
            if (iM3094 != -1) {
                String strM6083 = C0035.m6083((com.github.catvod.spider.merge.J.c) C0048.m7915(C0058.m9049(bVar), iM3094));
                if (C0057.m8953(strM6083)) {
                    return;
                }
                C0062.m9425();
                C0065.m9748((ClipboardManager) C0011.m2781(C0031.m5652(), C0044.m7509(m480(), 255, 9, 707)), C0015.m3445(C0046.m7718(m480(), 264, 6, 693), strM6083));
                C0038.m6402(C0050.m8125(C0024.m4740(m480(), 270, 4, 3093), strM6083));
                return;
            }
        }
    }

    public final void c() {
        C0016.m3575(new m(this, 1));
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        Iterator itM3109 = C0013.m3109(C0028.m5123(this));
        while (C0012.m2962(itM3109)) {
            b bVar = (b) C0048.m7949(itM3109);
            if (C0007.m1815(C0004.m1582(bVar), str)) {
                g gVar = new g();
                C0049.m7974(gVar, 1, 1, 0, 1);
                ArrayList arrayList = new ArrayList();
                Iterator itM31092 = C0013.m3109(C0058.m9049(bVar));
                while (C0012.m2962(itM31092)) {
                    C0004.m1532(arrayList, C0009.m2102((com.github.catvod.spider.merge.J.c) C0048.m7949(itM31092)));
                }
                C0045.m7632(gVar, arrayList);
                return C0033.m5828(gVar);
            }
        }
        return super.categoryContent(str, str2, z, map);
    }

    public final void d(File file, InputStream inputStream, double d) {
        int i = 0;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            byte[] bArr = new byte[4096];
            long j = 0;
            while (true) {
                int iM9318 = C0060.m9318(bufferedInputStream, bArr);
                if (iM9318 == -1) {
                    C0018.m3970(bufferedInputStream);
                    return;
                }
                j += iM9318;
                C0034.m6047(fileOutputStream, bArr, 0, iM9318);
                double d2 = j;
                C0004.m1564(d2);
                C0016.m3575(new n(this, (int) ((d2 / d) * 100.0d), i));
            }
        } catch (Throwable th) {
            try {
                C0018.m3970(bufferedInputStream);
            } catch (Throwable th2) {
                try {
                    C0052.m8352(C0057.m8970(Throwable.class, C0060.m9352(m480(), 274, 13, 2931), new Class[]{Throwable.class}), th, new Object[]{th2});
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    public String homeContent(boolean z) {
        C0038.m6402(!C0057.m8953(C0045.m7609(C0042.m7151(m480(), 287, 14, 2722))) ? C0047.m7833(m480(), 301, 17, 1687) : C0046.m7718(m480(), 318, 17, 670));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (C0064.m9636(C0028.m5123(this)) > 1) {
            for (int i = 0; i < C0064.m9636(C0028.m5123(this)); i++) {
                b bVar = (b) C0048.m7915(C0028.m5123(this), i);
                C0004.m1532(arrayList, new com.github.catvod.spider.merge.E.b(C0004.m1582(bVar), C0004.m1582(bVar), null));
            }
        }
        return C0025.m4831(arrayList, arrayList2);
    }

    public void init(Context context) {
        String str = new String(C0007.m1882(C0049.m8007(m480(), 335, 48, 2989)));
        if (C0043.m7277(str, C0022.m4403(m480(), 383, 4, 1962))) {
            str = C0032.m5769(str, null);
        }
        this.b = C0050.m8119(str);
        C0050.m8082();
    }

    public void init(Context context, String str) {
        String str2 = new String(C0007.m1882(C0029.m5256(m480(), 387, 48, 2483)));
        if (C0043.m7277(str2, C0057.m8978(m480(), 435, 4, 2362))) {
            str2 = C0032.m5769(str2, null);
        }
        this.b = C0050.m8119(str2);
        C0050.m8082();
    }

    public boolean isBusy() {
        return C0007.m1859(this);
    }

    public void setBusy(boolean z) {
        this.c = z;
    }
}