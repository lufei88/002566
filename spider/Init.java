package com.github.catvod.spider;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.D.g;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d0.b;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class Init {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f73short = {2723, 2729, 2751, 2749, 1941, 1978, 1983, 1974, 1948, 1955, 1974, 1953, 1970, 1959, 1978, 1980, 1981, 1947, 1937, 1927, 1925, 25172, 18725, 24298, 21960, 22825, 26051, 21836, 2760, 2791, 2786, 2795, 2753, 2814, 2795, 2812, 2799, 2810, 2791, 2785, 2784, 2758, 2764, 2778, 2776, 28425, 17528, 21431, 22677, 21620, 21439, -30805, 2973, 2994, 2999, 3006, 2964, 2987, 3006, 2985, 3002, 2991, 2994, 2996, 2997, 2963, 2969, 2959, 2957, 28252, 17709, 21218, 22057, 20611, 23795, 451, 492, 489, 480, 458, 501, 480, 503, 484, 497, 492, 490, 491, 461, 455, 465, 467, 25602, 20339, 22716, 21406, 24447, 25376, -27492, 2506, 2501, 2511, 2521, 2500, 2498, 2511, 2437, 2523, 2510, 2521, 2502, 2498, 2520, 2520, 2498, 2500, 2501, 2437, 2556, 2553, 2530, 2559, 2542, 2548, 2542, 2547, 2559, 2542, 2553, 2533, 2538, 2535, 2548, 2552, 2559, 2532, 2553, 2538, 2540, 2542, 2266, 2261, 2271, 2249, 2260, 2258, 2271, 2197, 2266, 2251, 2251, 2197, 2298, 2264, 2255, 2258, 2253, 2258, 2255, 2242, 2287, 2259, 2249, 2270, 2266, 2271, 2365, 2347, 2348, 2348, 2363, 2352, 2346, 2335, 2365, 2346, 2359, 2344, 2359, 2346, 2343, 2314, 2358, 2348, 2363, 2367, 2362, 814, 770, 800, 823, 810, 821, 810, 823, 810, 806, 816, 1185, 1200, 1188, 1186, 1204, 1205, 2595, 2593, 2614, 2603, 2612, 2603, 2614, 2619, 3143, 3163, 3163, 3167, 3093, 3072, 3072, 3102, 3101, 3096, 3073, 3103, 3073, 3103, 3073, 3102, 3093, 3094, 3094, 3094, 3096, 3072, 3164, 3163, 3136, 3167, 3167, 3142, 3137, 3144, -31203, 23661, 30814, 30171, -32763, 18708, 32587, -30466, 22162, 26087, 21864, -1802};
    public Application c;
    public final String d = C0007.m1840();
    public final Handler b = new Handler(C0063.m9553());
    public final ExecutorService a = C0021.m4370(5);

    class Loader {
        public static volatile Init a = new Init();
    }

    public static void CreatedHBTV() {
        try {
            File file = new File(C0049.m7985(), C0012.m2973(m443(), 0, 4, 2795));
            m441(!C0028.m5187(file) ? C0045.m7616(file) ? C0062.m9389(m443(), 4, 24, 2003) : C0048.m7902(m443(), 28, 24, 2702) : C0037.m6307(m443(), 52, 23, 3035));
        } catch (Exception unused) {
            m441(C0057.m8978(m443(), 75, 24, 389));
        }
    }

    public static void checkPermission() {
        try {
            Activity activityM4453 = C0022.m4453();
            if (activityM4453 == null || C0054.m8632() < 23 || C0006.m1721(activityM4453) == 0) {
                return;
            }
            C0025.m4869(activityM4453, new String[]{C0027.m5062(m443(), 99, 41, 2475)});
        } catch (Exception e) {
            C0049.m7975(e);
        }
    }

    public static Application context() {
        return C0002.m1332(C0000.m1050());
    }

    public static void execute(Runnable runnable) {
        C0058.m9122(C0008.m1982(C0000.m1050()), runnable);
    }

    public static Init get() {
        return m442();
    }

    public static Activity getActivity() {
        try {
            Class clsM4369 = C0021.m4369(C0030.m5362(m443(), 140, 26, 2235));
            Object objM8352 = C0052.m8352(C0065.m9803(clsM4369, C0038.m6452(m443(), 166, 21, 2398), null), null, null);
            Field fieldM8605 = C0054.m8605(clsM4369, C0035.m6131(m443(), 187, 11, 835));
            C0016.m3602(fieldM8605, true);
            Iterator itM1943 = C0008.m1943(C0024.m4688((Map) C0028.m5182(fieldM8605, objM8352)));
            while (C0012.m2962(itM1943)) {
                Object objM7949 = C0048.m7949(itM1943);
                Class clsM7777 = C0047.m7777(objM7949);
                Field fieldM86052 = C0054.m8605(clsM7777, C0042.m7151(m443(), 198, 6, 1233));
                C0016.m3602(fieldM86052, true);
                if (!C0048.m7887(fieldM86052, objM7949)) {
                    Field fieldM86053 = C0054.m8605(clsM7777, C0065.m9775(m443(), 204, 8, 2626));
                    C0016.m3602(fieldM86053, true);
                    Activity activity = (Activity) C0028.m5182(fieldM86053, objM7949);
                    m441(C0062.m9427(C0044.m7433(activity)));
                    return activity;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static void init(Context context) {
        C0000.m1050().c = (Application) context;
        C0050.m8082();
        C0029.m5229();
        C0051.m8275(C0035.m6110());
        try {
            C0024.m4682(new Thread(new b(1)));
            C0024.m4682(new Thread(new b(0)));
            C0032.m5769(C0011.m2805(m443(), 212, 30, 3119), null);
            C0017.m3665(new g(1), 2000);
        } catch (Exception unused) {
        }
        m441(C0031.m5565(m443(), 242, 12, 2039));
    }

    public static void run(Runnable runnable) {
        C0047.m7781(C0031.m5572(C0000.m1050()), runnable);
    }

    public static void run(Runnable runnable, int i) {
        C0041.m6820(C0031.m5572(C0000.m1050()), runnable, i);
    }

    /* renamed from: ۟ۡۨۦۥ, reason: not valid java name and contains not printable characters */
    public static void m441(Object obj) {
        if (C0019.m4065() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۢ۟۠۟, reason: not valid java name and contains not printable characters */
    public static Init m442() {
        if (C0064.m9659() < 0) {
            return Loader.a;
        }
        return null;
    }

    /* renamed from: ۦۣۣۧ, reason: contains not printable characters */
    public static short[] m443() {
        if (C0016.m3596() < 0) {
            return f73short;
        }
        return null;
    }
}