package com.github.catvod.spider.merge.T;

import com.github.catvod.crawler.Spider;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Mogg;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.T;
import com.github.catvod.spider.merge.a0.W;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.Printer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f497short = {1259, 1260, 1262, 1254, 1237, 1258, 1255, 1254, 1260, 1216, 1260, 1261, 1271, 1254, 1261, 1271, 2091, 2103, 2106, 2082, 2110, 2089, 2072, 2100, 2101, 2095, 2110, 2101, 2095, 2865, 32141, -27695, 2405, 2400, 2402, 2406, 2400, 2406, 2405, 2404, 2412, 2413, 2413, 2431, 2431, 2405, 2400, 2404, 2404, 2405, 2413, 2413, 2405, 2405, 2403, 2431, 2431, 2400, 2404, 2405, 2412, 2401, 2406, 2405, 2400, 2403, 2400, 2407, 2404, 2406, 2412, 2402, 2431, 2431, 2405, 2403, 2425, 2400, 2335, 2426, -27764, 29013, 31443, 2426, 2361, 2340, 2400, 2431, 2431, 2318, 2318, 2335, 2308, 2334, 2326, 2310, 2403, 2407, 2360, 2365, 2406, 2309, 2320, 2401, 2304, 2305, 2353, 2321, 2333, 2307, 2352, 2357, 2327, 2338, 2417, 2406, 2322, 2338, 2332, 2336, 2360, 2358, 2332, 2417, 2406, 2326, 2323, 2349, 2353, 2337, 2326, 2322, 2362, 2326, 2361, 2309, 2417, 2407, 2320};
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ b(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    /* renamed from: ۟۠۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static String m5301(Object obj) {
        if (C0002.m1242() > 0) {
            return ((Spider) obj).homeVideoContent();
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۡۤ, reason: not valid java name and contains not printable characters */
    public static Mogg m5302(Object obj) {
        if (C0036.m6252() > 0) {
            return ((MainActivity) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static int m5303() {
        if (C0040.m6582() >= 0) {
            return MainActivity.c;
        }
        return 0;
    }

    /* renamed from: ۣۤۤۥ, reason: not valid java name and contains not printable characters */
    public static Printer m5304(Object obj) {
        if (C0034.m6048() <= 0) {
            return Logger.t((String) obj);
        }
        return null;
    }

    /* renamed from: ۤۤ۟۟, reason: not valid java name and contains not printable characters */
    public static void m5305(Object obj, Object obj2) {
        if (C0012.m3024() > 0) {
            ((Printer) obj).d(obj2);
        }
    }

    /* renamed from: ۥۥۥۢ, reason: contains not printable characters */
    public static short[] m5306() {
        if (C0037.m6350() <= 0) {
            return f497short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0054.m8641(this)) {
            case 0:
                C0047.m7777(C0017.m3704(this));
                try {
                    C0002.m1252(C0055.m8709());
                    break;
                } catch (Throwable th) {
                    C0049.m7975(th);
                    return;
                }
            case 1:
                C0047.m7777(C0017.m3704(this));
                try {
                    C0016.m3542(C0028.m5111(C0022.m4453()), 0.87f, 0.73f, true);
                    break;
                } catch (Throwable th2) {
                    C0049.m7975(th2);
                    return;
                }
            case 2:
                C0047.m7777(C0017.m3704(this));
                try {
                    C0012.m2969(C0035.m6087(), C0011.m2789());
                    break;
                } catch (Throwable th3) {
                    C0049.m7975(th3);
                    return;
                }
            case 3:
                m5303();
                MainActivity mainActivityM3704 = C0017.m3704(this);
                C0047.m7777(mainActivityM3704);
                try {
                    C0011.m2804(C0035.m6101(mainActivityM3704));
                    mainActivityM3704.b = new Mogg();
                    break;
                } catch (Throwable th4) {
                    C0049.m7975(th4);
                    return;
                }
            case 4:
                MainActivity mainActivityM37042 = C0017.m3704(this);
                C0047.m7777(mainActivityM37042);
                try {
                    m5305(m5304(C0042.m7151(m5306(), 16, 13, 2139)), C0019.m4033(m5302(mainActivityM37042), C0018.m3917(m5306(), 29, 3, 2901), C0036.m6188(m5306(), 32, 107, 2388), new ArrayList()));
                    break;
                } catch (Throwable th5) {
                    C0049.m7975(th5);
                    return;
                }
            case 5:
                MainActivity mainActivityM37043 = C0017.m3704(this);
                C0047.m7777(mainActivityM37043);
                try {
                    W wM8046 = C0049.m8046();
                    C0047.m7777(wM8046);
                    C0016.m3575(new T(wM8046, 0));
                    m5305(m5304(C0014.m3332(m5306(), 0, 16, 1155)), m5301(m5302(mainActivityM37043)));
                    break;
                } catch (Throwable th6) {
                    C0045.m7608(C0036.m6261(th6));
                    C0049.m7975(th6);
                    return;
                }
            default:
                C0047.m7777(C0017.m3704(this));
                C0006.m1797(C0049.m8046());
                C0000.m1088(C0049.m8046());
                break;
        }
    }
}